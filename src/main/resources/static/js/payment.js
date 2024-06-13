function processPayment() {
    // Get the duration and amount from the query parameters
    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    const duration = urlParams.get('duration');
    const amount = urlParams.get('amount');
    

    // Update the payment details on the page
    document.getElementById('duration').textContent = duration;
    document.getElementById('amount').textContent = amount;

    // Perform any necessary payment processing logic
    // This could include integrating with a payment gateway or performing other payment-related tasks
    // Once the payment is processed, you can display a success message or redirect the user to a confirmation page
}

function slotProcess() {
    // Get the duration and amount from the query parameters
    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    const duration = urlParams.get('slot');
    document.getElementById('slot').textContent = slot;
  
}

/*function initiateRazorpayPayment() {
    var amount = document.getElementById('amount').innerText; // Get the payment amount from the HTML element
    var options = {
        key: 'rzp_test_uu1SRJmVtNqZPW',
        amount: amount * 100, // Amount in paise or the smallest currency unit
        currency: 'INR',
        name: 'Your Company Name',
        description: 'Payment for your service',
        handler: function(response) {
            // Handle the payment success response
            alert('Payment Successful! Payment ID: ' + response.razorpay_payment_id);
        },
        prefill: {
            name: 'John Doe',
            email: 'john@example.com',
            contact: '9876543210'
        },
        notes: {
            address: 'Razorpay Corporate Office'
        },
        theme: {
            color: '#F37254'
        }
    };
    var razorpayPayment = new Razorpay(options);
    razorpayPayment.open();
}*/

//first request - to server to create prder

const paymentStart = () => {
    console.log("payment started");
    let amount = $("#payment_field").text();
    console.log(amount);
    if(amount == "" || amount == null){
        //alert("amount is required");
        swal("Failed", "amount is required !!", "error");
        return;
    }

    //we will use ajax to send request to server to create order-jquery
    $.ajax(
      {
        url:'/user/create_order',
        data:JSON.stringify({amount:amount,info:'order_request'}),
        contentType:'application/json',
        type:'POST',
        dataType:'json',
        success:function(response){
            //invoke where success
            console.log(response)
            if(response.status=='created'){
               // open payment form
               let options={
                key:"rzp_test_uu1SRJmVtNqZPW",
                amount: response.amount,
                currency:"INR",
                name:"Parking Management",
                description:"Parking",
                image:"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIMAAACDCAMAAACZQ1hUAAAAmVBMVEX///8AAACioqL7+/t/f39VVVXq6ur09PT4+PgsLCzPz8/m5uaYmJjCwsLc3NyPj48lJSV4eHiIiIgNDQ1QUFAcHBysrKxnZ2deXl66urpwcHA6Ojp3weVKSkoXFxfN5vJBQUEgeJoAn9yr1eZ9orISqeQoHxmDxeRRs+IuJiFovuMdrN2d1euDzec/teJ1x+Pa8fe64vLO2uAhpD+vAAAEF0lEQVR4nO2aiXabOBRAkRC72I3YCnXdcZs2M206//9x84TwDrHL6s7RPQmOgSMuT+8hAVGUPw91bQHO5w+Cv0ISws9xcfrGZnf4utvvdvv9/tMXi2xqstWqMt1WmpUUWZzVaZgk0fwO+/135QUcvmV5jqOcedi2mWsVOM/swqX+Eg67/U/le+PAGAtdatuUebkW+QzbeR7Reok4vP6t/PMKDls/tPy00optlaZUI2EapGFUBgs4/Hh7+fny9vLpWxmmhKQkiyAhq8wnEYkgJTdLOLz+Aj7zOGBCMaaEMOxHYUQZ9SNKqgUcPuwaoC6CxLKS2goS+LRgUQeBFQTBAvnw9lHwr92HN7uDRCKRSCQSSScu7sZeTiFCfeClFPTjIesEJohJfHIojYUcHHE81/GcBs+zfUussxZ2uJyb0rUc3LzB1mEtW8nhkAkBhdXlOg7BMRmhKvHaDgV0zNoOmqnYazs8QxxyUZ0r1gXidZGs48D4QMXE9YGuf53Ea10nDYFj43K18cJCMeeYmevWhXSQDtLhaRxcR1/PQb8+8onF5vaK3+sw/3uiI09wr/cYpqHfxTBnFNBxFvf22BlxisemkKpBO+HNarP/rrgDOoEDuVmdiiLRiE/PwEWBz7/74UZMO8a9Vel28HjDhX0ZZMPRGdOdywQwbN4AGvVapduBdlUpEYG/eULBd86ndwgRSm52xVoGbNzr9UbdlVFjHcwtQtntribQ1QYkTzmdQ/vSX++MLjgYnWUInZGMqc8LB9UQEu4hy1TPMw4CfHN3HHgG3/TQQAc4T1iozXBSgY6KrSQJfL6yQYVtYsk/zhoZOc6cOUCkjeYYilbDKtMskJ+WDG0MEwIAW1WzpemWs0bS5pZ5Agc4P34QOFW9jHlsfeiPqFL0OlNMcf4Hh+vsZAjV0ziI8wQHG256dNXkVwJwUF3k8D5ogtF2icmHqpOFByPLiKS86Iu2s3MUQ2XaSFe8MnEVIznUiMoLp1nw37NIlKOS8jwnVVVUZ4jiDYwFKKLQduz7SQZDwwXt1+PAAfv50zgcSH5nzDyQTurwzmzzHSxnQgfXGuSAysHzwBsHd5gBZ+gAfu1gDowCZzvwf8yuHfLhCs2z3ikc+u88HmDgvPLagRwbfLhTTveLA68R1w6H+XTqGI7widwe2s264WizOFRNejWz695RuXnf0UziVGsOB3Fg912H5oGmd/pzagcxStmPOrA5HMQ8md53EFuzWXKSB8KNTyHpQJy8pxy7YmoHVJLqTk22aOGxiqd2GIJ0+N85kLsHevI4TDRuApu2xQdb0NvS1IYJTOLgtA4b6SAdJnFQ1qqLdMxF4A6PPgwJZ3R49CnhMzgUMzo82hd9b1CmYMxDQolEIpFIJBKJRCKR/Dn8B26HSaiDL/0/AAAAAElFTkSuQmCC",
                order_id: response.id,
                handler:function(response){
                    console.log(response.razorpay_payment_id);
                    console.log(response.razorpay_order_id);
                    console.log(response.razorpay_signature);
                    console.log('payment successful !!');
                   // alert("contrates !! Payment successful !!");
                   swal("Good job!", "contrates !! Payment successful !!", "success");

                },
                prefill: { 
                name: "", 
                email: "",
                contact: "",
                },

                notes: {
                address: "Parking slot",
                 },

                 theme: {
                 color: "#3399cc",
                  },

               };

               let rzp=new Razorpay(options);

               rzp.on("payment.failed", function (response){
                console.log(response.error.code);
                console.log(response.error.description);
                console.log(response.error.code.source);
                console.log(response.error.step);
                console.log(response.error.reason);
                console.log(response.error.metadata.order_id);
                console.log(response.error.metadata.payment_id);
                //alert("Oops payment failed !!")
                swal("Failed", "Oops payment failed !!", "error");
               });
               rzp.open();
            }
        },
        error:function(error){
            //invoke when error
            console.log(error)
            alert("somthing went wrong !!")
        }
      }
    )


};

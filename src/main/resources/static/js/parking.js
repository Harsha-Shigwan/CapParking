/*var w,h;
function setupparkingmanager(){
    w = document.getElementById('parkingspace').offsetWidth;
    h = document.getElementById('parkingspace').offsetHeight;

    //create animation
    var anim = document.createElement('style');
    var rule1 = document.createTextNode('@-webkit-keyframes car-park {'+'from { transform: rotate(270deg) }'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) }'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) }'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px)}'+
    '}');
    anim.appendChild(rule1);
    var rule2 = document.createTextNode('@-webkit-keyframes car-bottom  {'+'from { transform: rotate(270deg) }'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) }'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px)}'+
    '}');
    anim.appendChild(rule2);
    var rule3 = document.createTextNode('@-webkit-keyframes car-exit-top {'+
    'from { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px)}'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px)}'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px) rotate(90deg) translate(0px,-'+w+'px)}'+
    '}');
    anim.appendChild(rule3);
    var rule4 = document.createTextNode('@-webkit-keyframes car-exit-bottom {'+
    'from { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px)}'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px)}'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px) rotate(90deg) translate(0px,-'+w+'px)}'+
    '}');
    anim.appendChild(rule4);
    document.getElementById('parkingspace').appendChild(anim);
    
  /*  fetch('/user/getReservedSlots')  // Replace with the actual endpoint to fetch reserved slots
        .then(response => response.json())
        .then(data => {
            // Update the UI to display reserved slots
            displayReservedSlots(data);
        });*/
/*}

function carexit(slot){
    document.getElementById('slot'+(slot+1).toString()).style.background = 'rgb(27,118,19)';
    if(slot <= 4)
    document.getElementById('car'+(slot).toString()).style.animation = 'car-exit-top 2s both';
    else
    document.getElementById('car'+(slot).toString()).style.animation = 'car-exit-bottom 2s both';
    setTimeout(function(){document.getElementById('car'+(slot).toString()).remove()},2000)
    
}

function displayReservedSlots(reservedSlots) {
    // Update the UI to display reserved slots
    reservedSlots.forEach(slot => {
        var blockId = 'block' + (slot.slotNumber + 1);
        var spanId = 'dateTimeSpan' + (slot.slotNumber + 1);
        document.getElementById(blockId).style.display = 'block';
        document.getElementById(spanId).innerText = slot.reservationTime;
        console.log('Reserved slots:',reservedSlots);
    });
}

function generatenewcar(slot){ 
    var space = document.getElementById('parkingspace');
    let img = document.createElement('img');
    img.src = '/img/car.png';
    img.className = 'new-car-origin';
    img.style.width = (w*0.8) * 0.1 + 'px';
    img.id = 'car'+slot.toString();
    space.appendChild(img)
}

function reserveParkingSlot(slotNumber, userId) {
    // Assuming 'parkingData' is the key for storing parking information in localStorage
    var parkingData = JSON.parse(localStorage.getItem('parkingData')) || {};

    // Store the reservation information
    parkingData[slotNumber] = {
        userId: userId,
        reserved: true,
        // Add any other relevant information like reservation time, etc.
    };

    // Save the updated data back to localStorage
    localStorage.setItem('parkingData', JSON.stringify(parkingData));
}


function carenter(slot){
    if(!document.getElementById('car'+(slot).toString())){
    generatenewcar(slot);
    document.getElementById('slot'+(slot+1).toString()).style.background = 'rgb(146,18,18)';
    if(slot !=4 && slot!=9)
    document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+(((5 - (slot+1)%5))*((w*.8)*.2))+((w*.8)*.05))+'px';
    else
    document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+((w*.8)*.05))+'px';
    if(slot <= 4)
    document.getElementById('car'+(slot).toString()).style.animation = 'car-park 2s both';
    else
    document.getElementById('car'+(slot).toString()).style.animation = 'car-bottom 2s both';
    document.getElementById('slot' + (slot + 1).toString()).onclick = null;


        // Prompt the user for the timeout duration
       /* var hours = parseInt(prompt("Enter the number of hours:"));
        var minutes = parseInt(prompt("Enter the number of minutes:"));
        var seconds = parseInt(prompt("Enter the number of seconds:"));

        // Calculate the total timeout duration in milliseconds
        var timeout = (hours * 3600 + minutes * 60 + seconds) * 1000;

        // Get the current date and time
        var currentDate = new Date();
        var selectedDateTime = currentDate.toISOString().slice(0, 19).replace('T', ' ');

        // Update the booking-info section with the selected date, time, and timeout duration
        var bookingInfo = document.querySelector('.booking-info');
        bookingInfo.innerHTML = 
            '<p>Timeout Duration: <span>' + hours + ' hours, ' + minutes + ' minutes, ' + seconds + ' seconds</span></p>';*/
            
         /*var selectedDateTime = prompt("Enter the date and time (YYYY-MM-DD HH:MM):");
        // Update the selectedDateTimeArray with the selected date and time
        selectedDateTimeArray[slot] = selectedDateTime;
        // Update the corresponding block with the selected date and time
        var block = document.getElementById('block' + (slot + 1).toString());
        block.innerHTML = '<p>' + selectedDateTime + '</p>';
        localStorage.setItem('carPosition', slot);
        sessionStorage.setItem('carPosition', true); 
        // Save the car position in localStorage
         localStorage.setItem('carPosition', slot);
         console.log(localStorage.getItem('parkingData'));
          console.log('slotNumber:', slotNumber, 'userId:', userId);
        // Set timeout to release the car after the user-defined timeout
        setTimeout(function () {
            carexit(slot);
        }, timeout);
        
          fetch('/user/reserveParkingSlot?slotNumber=' + slot + '&userId=slotNumber')  // Replace 'yourUserId' with the actual user ID
        .then(response => {
            if (response.ok) {
                // Reservation successful, update UI or perform other actions
                console.log('Parking slot reserved successfully');
                reserveParkingSlot(slotNumber, userId);
                console.log(localStorage.getItem('parkingData'));
                console.log('slotNumber:', slotNumber, 'userId:', userId);
            } else {
                // Reservation failed, handle error
                console.error('Parking slot reservation failed');
            }
        });

    }
    else{
        carexit(slot);
    }
}

/*function carenter(slot){
    if (!document.getElementById('car'+(slot).toString())) {
        generatenewcar(slot);

        // Update the corresponding block with the selected date and time
        var block = document.getElementById('block' + (slot + 1).toString());
        block.innerHTML = '<p>Reserved</p>';

        document.getElementById('slot' + (slot + 1).toString()).style.background = 'rgb(146,18,18)';
        document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+(((5 - (slot+1)%5))*((w*.8)*.2))+((w*.8)*.05))+'px';

        if (slot <= 4)
            document.getElementById('car'+(slot).toString()).style.animation = 'car-park 2s both';
        else
            document.getElementById('car'+(slot).toString()).style.animation = 'car-bottom 2s both';

        document.getElementById('slot' + (slot + 1).toString()).onclick = null;

        // Set a timer to release the car after a certain duration
        setTimeout(function() {
            carexit(slot);
        }, timeout);
    } else {
        carexit(slot);
    }
}
*/


var w,h;
function setupparkingmanager(){
    w = document.getElementById('parkingspace').offsetWidth;
    h = document.getElementById('parkingspace').offsetHeight;

    //create animation
    var anim = document.createElement('style');
    var rule1 = document.createTextNode('@-webkit-keyframes car-park {'+'from { transform: rotate(270deg) }'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) }'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) }'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px)}'+
    '}');
    anim.appendChild(rule1);
    var rule2 = document.createTextNode('@-webkit-keyframes car-bottom  {'+'from { transform: rotate(270deg) }'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) }'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px)}'+
    '}');
    anim.appendChild(rule2);
    var rule3 = document.createTextNode('@-webkit-keyframes car-exit-top {'+
    'from { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px)}'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px)}'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,-'+h*.25+'px) translate(0px,'+h*.25+'px) rotate(90deg) translate(0px,-'+w+'px)}'+
    '}');
    anim.appendChild(rule3);
    var rule4 = document.createTextNode('@-webkit-keyframes car-exit-bottom {'+
    'from { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px)}'+
    '80% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px)}'+
    '90% { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px) rotate(90deg)}'+
    'to { transform: rotate(270deg) translate(0px,-'+w+'px) rotate(90deg) translate(0px,'+h*.25+'px) translate(0px,-'+h*.25+'px) rotate(90deg) translate(0px,-'+w+'px)}'+
    '}');
    anim.appendChild(rule4);
    document.getElementById('parkingspace').appendChild(anim);
    
  /*  fetch('/user/getReservedSlots')  // Replace with the actual endpoint to fetch reserved slots
        .then(response => response.json())
        .then(data => {
            // Update the UI to display reserved slots
            displayReservedSlots(data);
        });*/
}

function carexit(slot){
    document.getElementById('slot'+(slot+1).toString()).style.background = 'rgb(27,118,19)';
    if(slot <= 4)
    document.getElementById('car'+(slot).toString()).style.animation = 'car-exit-top 2s both';
    else
    document.getElementById('car'+(slot).toString()).style.animation = 'car-exit-bottom 2s both';
    setTimeout(function(){document.getElementById('car'+(slot).toString()).remove()},2000)
    
}

function displayReservedSlots(reservedSlots) {
    // Update the UI to display reserved slots
    reservedSlots.forEach(slot => {
        var blockId = 'block' + (slot.slotNumber + 1);
        var spanId = 'dateTimeSpan' + (slot.slotNumber + 1);
        document.getElementById(blockId).style.display = 'block';
        document.getElementById(spanId).innerText = slot.reservationTime;
        console.log('Reserved slots:',reservedSlots);
    });
}

function generatenewcar(slot){ 
    var space = document.getElementById('parkingspace');
    let img = document.createElement('img');
    img.src = '/img/car.png';
    img.className = 'new-car-origin';
    img.style.width = (w*0.8) * 0.1 + 'px';
    img.id = 'car'+slot.toString();
    space.appendChild(img)
}

function reserveParkingSlot(slotNumber, userId) {
    // Assuming 'parkingData' is the key for storing parking information in localStorage
    var parkingData = JSON.parse(localStorage.getItem('parkingData')) || {};

    // Store the reservation information
    parkingData[slotNumber] = {
        userId: userId,
        reserved: true,
        // Add any other relevant information like reservation time, etc.
    };

    // Save the updated data back to localStorage
    localStorage.setItem('parkingData', JSON.stringify(parkingData));
}


function carenter(slot){
    debugger;
    if(!document.getElementById('car'+(slot).toString())){
    generatenewcar(slot);
    document.getElementById('slot'+(slot+1).toString()).style.background = 'rgb(146,18,18)';
    if(slot !=4 && slot!=9)
    document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+(((5 - (slot+1)%5))*((w*.8)*.2))+((w*.8)*.05))+'px';
    else
    document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+((w*.8)*.05))+'px';
    if(slot <= 4)
    document.getElementById('car'+(slot).toString()).style.animation = 'car-park 2s both';
    else
    document.getElementById('car'+(slot).toString()).style.animation = 'car-bottom 2s both';
    document.getElementById('slot' + (slot + 1).toString()).onclick = null;


    
        // Prompt the user for the timeout duration
       /* var hours = parseInt(prompt("Enter the number of hours:"));
        var minutes = parseInt(prompt("Enter the number of minutes:"));
        var seconds = parseInt(prompt("Enter the number of seconds:"));

        // Calculate the total timeout duration in milliseconds
        var timeout = (hours * 3600 + minutes * 60 + seconds) * 1000;

        // Get the current date and time
        var currentDate = new Date();
        var selectedDateTime = currentDate.toISOString().slice(0, 19).replace('T', ' ');

        // Update the booking-info section with the selected date, time, and timeout duration
        var bookingInfo = document.querySelector('.booking-info');
        bookingInfo.innerHTML = 
            '<p>Timeout Duration: <span>' + hours + ' hours, ' + minutes + ' minutes, ' + seconds + ' seconds</span></p>';*/
            
         var selectedDateTime = prompt("Enter the date and time (YYYY-MM-DD HH:MM):");
        // Update the selectedDateTimeArray with the selected date and time
        selectedDateTimeArray[slot] = selectedDateTime;
        // Update the corresponding block with the selected date and time
        var block = document.getElementById('block' + (slot + 1).toString());
        block.innerHTML = '<p>' + selectedDateTime + '</p>';
        localStorage.setItem('carPosition', slot);
        sessionStorage.setItem('carPosition', true); 
        // Save the car position in localStorage
         localStorage.setItem('carPosition', slot);
         console.log(localStorage.getItem('parkingData'));
          //console.log('slotNumber:', slotNumber, 'userId:', userId);
        // Set timeout to release the car after the user-defined timeout
        setTimeout(function () {
            carexit(slot);
        }, 50000);
        
        //   fetch('/user/reserveParkingSlot?slotNumber=' + slot)  // Replace 'yourUserId' with the actual user ID
        // .then(response => {
        //     if (response.ok) {
        //         // Reservation successful, update UI or perform other actions
        //         console.log('Parking slot reserved successfully');
        //         reserveParkingSlot(slotNumber, userId);
        //         console.log(localStorage.getItem('parkingData'));
        //         console.log('slotNumber:', slotNumber, 'userId:', userId);
        //     } else {
        //         // Reservation failed, handle error
        //         console.error('Parking slot reservation failed');
        //     }
        // });

        $.ajax({
            url: '/user/reserveParkingSlot?slotNumber='+slot,
            type: 'POST',
            
            success: function(response) {
                // Handle successful reservation
                console.log('Parking slot reserved successfully');
                reserveParkingSlot(slot, response);
                console.log(localStorage.getItem('parkingData'));
                //console.log('slotNumber:', slot, 'userId:', userId);
            },
            error: function(xhr, status, error) {
                // Handle reservation failure
                console.error('Parking slot reservation failed');
            }
        });
        

    }
    else{
        carexit(slot);
    }
}

/*function carenter(slot){
    if (!document.getElementById('car'+(slot).toString())) {
        generatenewcar(slot);

        // Update the corresponding block with the selected date and time
        var block = document.getElementById('block' + (slot + 1).toString());
        block.innerHTML = '<p>Reserved</p>';

        document.getElementById('slot' + (slot + 1).toString()).style.background = 'rgb(146,18,18)';
        document.getElementById('car'+(slot).toString()).style.right = (-w+(w*.1)+(((5 - (slot+1)%5))*((w*.8)*.2))+((w*.8)*.05))+'px';

        if (slot <= 4)
            document.getElementById('car'+(slot).toString()).style.animation = 'car-park 2s both';
        else
            document.getElementById('car'+(slot).toString()).style.animation = 'car-bottom 2s both';

        document.getElementById('slot' + (slot + 1).toString()).onclick = null;

        // Set a timer to release the car after a certain duration
        setTimeout(function() {
            carexit(slot);
        }, timeout);
    } else {
        carexit(slot);
    }
}
*/


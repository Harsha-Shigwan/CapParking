console.log("this is script file")

const toggleSidebar = () => {

    if($(".sidebar").is(":visible"))
    {
        //true
        //band karichy
        $(".sidebar").css("display", "none");
        $(".content").css("margin-left", "0%");


    } else{
        //false
        //show karichy
        $(".sidebar").css("display", "block");
        $(".content").css("margin-left", "20%");

    }

};

/*document.addEventListener('DOMContentLoaded', function() {
  var formGroups = document.querySelectorAll('.form-group');
  formGroups.forEach(function(formGroup) {
    var formControl = formGroup.querySelector('.form-control');
    formControl.addEventListener('focus', function() {
      formGroup.classList.add('not-empty');
    });
    formControl.addEventListener('blur', function() {
      if (this.value === '') {
        formGroup.classList.remove('not-empty');
      }
    });
  });
});*/


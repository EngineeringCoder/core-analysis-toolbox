
 // var elem = document.querySelector('.collapsible');
 // var instance = M.Collapsible.init(elem, {accordion: true});

   // var elem = document.querySelectorAll('.dropdown-trigger');
   // var instance = M.Dropdown.init(elem, {hover:true,
    //                                    coverTrigger:false});


//Run code upon loaded page using JQuery
$(document).ready(function(){
    $('.collapsible').collapsible();
    $(".dropdown-trigger").dropdown({hover:true,coverTrigger:false});
  });


//Check that all code has been loaded properly
//alert("All JS loaded perfectly!");
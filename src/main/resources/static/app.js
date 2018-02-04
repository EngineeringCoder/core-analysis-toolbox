
//Run code upon loaded page using JQuery
$(document).ready(function(){
    $('.collapsible').collapsible();
    $(".dropdown-trigger").dropdown({hover:true,coverTrigger:false});
    $(".tabs").tabs();
    $(".fixed-action-btn").floatingActionButton();
  });


//Check that all code has been loaded properly
//alert("All JS loaded perfectly!");
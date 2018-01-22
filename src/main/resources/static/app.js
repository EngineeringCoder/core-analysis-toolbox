
 // var elem = document.querySelector('.collapsible');
 // var instance = M.Collapsible.init(elem, {accordion: true});

    var elem = document.querySelectorAll('.dropdown-trigger');
    var instance = M.Dropdown.init(elem, {hover:true,
                                        coverTrigger:false});


//Run code upon loaded page
$(document).ready(function(){
    $('.collapsible').collapsible();
    //$(".dropdown-trigger").dropdown().hover = true;
  });

alert("All JS loaded perfectly!");
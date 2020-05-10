document.addEventListener('DOMContentLoaded', function(){
  var $tab = $(".tab");
  var $tab__link = $(".tab__link");
  var $tab_body_item = $(".tab-body__item");
  $tab__link.on("click",function(e){
    var target = $(e.currentTarget);
    //タブの中身の表示非表示
    var num =　target.data("tab-body");
    $(".tab-body__item.in").addClass("out");
    $(".tab-body__item--"+num).addClass("in");
    //タブの表示非表示
    $tab.removeClass();
    $tab.addClass("tab tab--"+num);
  });
  $tab_body_item.on("transitionend",function(e){
    console.log(e);
    $(".tab-body__item.out").removeClass("in out");
  })

});
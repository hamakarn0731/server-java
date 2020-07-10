document.addEventListener('DOMContentLoaded', function(){
  var $tab = $(".tab");
  var $tab__link = $(".tab__link");
  var $tab_body_item = $(".tab-body__item");
  $tab__link.on("click",function(e){
    var target = $(e.currentTarget);
    //タブの中身の表示非表示
    var num =　target.data("tab-body");
    $(".tab-body__item.in").removeClass("in");
    $(".tab-body__item--"+num).addClass("in");
    //タブの表示非表示
    $tab.removeClass();
    $tab.addClass("tab tab--"+num);
  });
});
$(function () {
    $('.tab_btn').on('click', function () {
        $('.tab_btn').removeClass("active_btn");
        $('.box').removeClass("active_box");
        $(this).addClass("active_btn");
        $($(this).attr("href")).addClass("active_box");
    });
});
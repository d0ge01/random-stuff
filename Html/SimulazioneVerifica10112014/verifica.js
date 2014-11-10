var n = 1;
function nextImage() {
    $(".slideImage").hide("slow");
    $("#image"+n).show("slow");
    if ( n == 3 )
      n = 1;
    else
      n += 1;
}

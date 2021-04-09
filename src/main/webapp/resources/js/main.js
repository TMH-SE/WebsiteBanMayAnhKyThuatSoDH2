function changeQuantity() {
	document.getElementById("quantity_form").submit();
}
$("[type='number']").on("keypress keydown", function(evt) {
	if (evt.code == "Backspace" || evt.which == 8) {
		event.preventDefault();
	}
	if (evt.keyCode == 13) {
		$("#quantity_form").submit();
	}
	if (evt.keyCode < 37 || evt.keyCode > 40) {
		return false;
	}
	return true;
});
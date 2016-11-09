$(document).ready(function(){
	
	exportExcel();

});

var exportExcel = function(){
	$("#btnExport").click(function (e) {
	    window.open('data:application/vnd.ms-excel,' + $('#dvData').html());
	    e.preventDefault();
	});
}


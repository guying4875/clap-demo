$("#update").click(function(){
	var uid=$(this).before().val();
	var path = $("#_contextPath").val()
	$.ajax({
		type:"josn",
		url:path+"/manage/",
	
	});
	
});
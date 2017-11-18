$("#update").click(function(){
	var uid=$(this).before().val();
	var path = $("#_contextPath").val()
	var rname=$("#manager");
	$.ajax({
		type:"post",
		url:path+"/manage/updateUI.htm",
		datatype:"json",
		data:uid,
		success:function(manager){
			for(var i in manager){
				rname.append("<option value='"+$(this)[i][uid]+"'>"+$(this)[i][uname]+"</option>")
			}
		}
	});
	
});
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<base href="<%=basePath%>">
	<script type="text/javascript" src="resources/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="resources/js/ajaxfileupload.js"></script>
	<script type="text/javascript">
	function ajaxFileUpload() {
		alert("karry");
		$.ajaxFileUpload({
			url : 'uploadimg',//用于文件上传的服务器端请求地址
			secureuri : false,//一般设置为false
			fileElementId : 'file',//文件上传空间的id属性  <input type="file" id="file" name="file" />
			dataType : 'json',//返回值类型 一般设置为json
			success : function(data, status) //服务器成功响应处理函数
			{
				alert(data.imgurl);
				$("#filename").val(data.filename)//把文件上传到上边（转到数据库）<input type="text" id="filename"/>
				var imgObj = $("<img>");
				imgObj.attr("src",data.imgurl);
				$("#imgDiv").append(imgObj);
			},
			error: function (data, status, e)//服务器响应失败处理函数
            {
				alert(status);
                alert(e);
            }
		});
	}
	</script>
</head>
<body>
	<form action="uploadSubmit" method="post">
		<input type="text" name="username"><br>
		<input type="text" name="password">
		<input type="text" id="filename" name="picname"><br/>
		<input type="submit" value="上传">
	</form>
	<input type="file" id="file" name="file"><br/>
	<input type="button" value="上传" onclick="ajaxFileUpload();"><br/>
	<div id="imgDiv"></div>	
</body>
</html>

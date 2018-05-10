<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

  <head>
    <title>login_view</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="files/login_view/styles.css" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/login_view/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body onload="a()">
    <div id="base" class="" align="center">

      <!-- student_login (矩形) -->
      <div id="u0" class="ax_default box_2" data-label="student_login">
        <div id="u0_div" class=""></div>
        <div id="u0_text" class="text ">
          <p><span>学生登录</span></p>
        </div>
      </div>

      <!-- teacher_login (矩形) -->
      <div id="u1" class="ax_default box_2" data-label="teacher_login">
        <div id="u1_div" class=""></div>
        <div id="u1_text" class="text ">
          <p><span>老师登录</span></p>
        </div>
      </div>

      <!-- login (动态面板) -->
      <div id="u2" class="ax_default" data-label="login">
        <div id="u2_state0" class="panel_state" data-label="student" style="">
          <div id="u2_state0_content" class="panel_state_content">

            <!-- username1 (文本框) -->
            <form id="stu_form" name="stu_form"action="StuLoginController" method="post" >
            <div id="u3" class="ax_default text_field" data-label="username1">
              <input id="stu_id" name="stu_id"type="text" placeholder="学号/手机号码/邮箱"/>
            </div>

            <!-- password1 (文本框) -->
            <div id="u4" class="ax_default text_field" data-label="password1">
              <input id="stu_password" name="stu_password"type="password" placeholder="密码"/>
            </div>

            <!-- messag1 (矩形) -->
            <div id="u5" class="ax_default box_1" data-label="messag1">
              <div id="u5_div" class=""></div>
              <div id="u5_text" class="text" style="font-size:14px">
                <p><span>初始密码为身份证后六位${flag}</span></p>
              </div>
            </div>

            <!-- login_button1 (矩形) -->
            <div id="u6" class="ax_default button" data-label="login_button1">
              <div id="u6_div" class=""></div>
              <div id="u6_text" class="text">
                <p><span onMouseMove="this.style.color='#000'" style="cursor:pointer" onMouseOut="this.style.color='#FFF'" onClick="stu_submit()">登 &nbsp;&nbsp;录</span></p>
              </div>
            </div>
       </form>
          </div>
        </div>
        <div id="u2_state1" class="panel_state" data-label="teacher" style="visibility: hidden;">
          <div id="u2_state1_content" class="panel_state_content">

            <!-- username1 (文本框) -->
            <form id="teacher_form" name="teacher_form"action="TeacherLoginController" method="post">
            <div id="u7" class="ax_default text_field" data-label="username1">
              <input id="teacher_id" name="teacher_id"type="text" placeholder="教师号/手机号码/邮箱"/>
            </div>

            <!-- password1 (文本框) -->
            <div id="u8" class="ax_default text_field" data-label="password1">
              <input id="teacher_password" name="teacher_password"type="password" placeholder="密码"/>
            </div>

            <!-- messag1 (矩形) -->
            <div id="u9" class="ax_default box_1" data-label="messag1">
              <div id="u9_div" class=""></div>
              <div id="u9_text" class="text"  style="font-size:14px">
                <p><span>初始密码为身份证后六位</span></p>
              </div>
            </div>

            <!-- login_button1 (矩形) -->
            <div id="u10" class="ax_default button" data-label="login_button1">
              <div id="u10_div" class=""></div>
              <div id="u10_text" class="text ">
                <p><span span onMouseMove="this.style.color='#000'" style="cursor:pointer" onMouseOut="this.style.color='#FFF'" onClick="teacher_submit()">登 &nbsp;&nbsp; 录</span></p>
              </div>
            </div>
            </form>
          </div>
        </div>
      </div>

      <!-- Unnamed (图片) -->
      <div id="u11" class="ax_default image">
        <img id="u11_img" class="img " src="images/login_view/u11.jpg"/>
      </div>
    </div>
  </body>
<script type="text/javascript">
	//var flag=false;
function a(){
<%
	String a=(String)request.getAttribute("flag");
	if(a==null){}
else{
%>
alert("cuowu")
<%
}
%>
}

</script>
<script type="text/javascript">
function stu_check(form){
	with(form){
		if(stu_id.value==""||stu_password.value==""){
			alert("用户id或密码不能为空");
			return false;
		}
		else{
			return true;
		}
		
	}
}
function teacher_check(form){
	with(form){
		if(teacher_id.value==""||teacher_id.value==""){
			alert("用户id或密码不能为空");
			return false;
		}
		else{
			return true;
		}
		
	}
}
function stu_submit(){
	
	var aform=document.getElementById("stu_form");
	if(stu_check(aform)){
		aform.submit();
	}
	else{
		
	}
}
function teacher_submit(){
	var aform=document.getElementById("teacher_form");
	if(teacher_check(aform)){
		aform.submit();
	}
	else{
		
	}
}

</script>
</html>

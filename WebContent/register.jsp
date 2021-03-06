<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市进销存管理系统</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="ddaccordion.js"></script>
<script type="text/javascript" src="jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	
	$(document).ready(function() {
		$('.ask').jConfirmAction();
	});
	
</script>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	 /*$(function() {
		$("#username").blur(function(){
		alert()
	});
	});*/
	
	  function showErrMsg($obj, msg) {
	  	
        if($obj.next() != "undefined") {
        	
          $obj.next().remove();
        }
        var $newErrMsg = $("<span></span>");
        $newErrMsg.html("<font color='red'>" + msg + "</font>");
        //      $obj.after($newErrMsg);
        $obj.after($newErrMsg);
        
      }

      function check() {
        var errCode = 0; //如果有任何一个错误的时候，将错误代码增加1
        var firstNameVal = $("#username").val();
        var userPassVal = $("#password").val();
        var rePassVal = $("#repassword").val();
        var phoneVal = $("#phone").val();
        var addressVal = $("#address").val();
        var regexp3 = /^\d{11}$/;//手机号码验证
    
        if(firstNameVal == "") {
          showErrMsg($("#username"), "姓名不能为空！");
         
          errCode++;
        }
        else{
        	$("#username").next().remove();
        }
        if(userPassVal=="") {
          showErrMsg($("#password"), "密码不能为空！");
          
          errCode++;
        }else{
        	$("#password").next().remove();
        }
        if(rePassVal=="") {
          showErrMsg($("#repassword"), "确认密码不能为空！");
          
          errCode++;
        }else{
        	$("#repassword").next().remove();
        }
       if(phoneVal=="") {
          showErrMsg($("#phone"), "手机号码不能为空！");
          
          errCode++;
        }else{
        	$("#phone").next().remove();
        }
        if(addressVal=="") {
          showErrMsg($("#address"), "家庭地址不能为空！");
          
          errCode++;
        }else{
        	$("#address").next().remove();
        }
         if(userPassVal!=rePassVal) {
          showErrMsg($("#repassword"), "密码不一致！");
          
          errCode++;
        }else{
        	$("#repassword").next().remove();
        }
		if(userPassVal.length < 6) {
          showErrMsg($("#password"), "密码长度小于六位！");
          errCode++;
        }else{
        	$("#password").next().remove();
        }
		if(userPassVal.length < 6) {
          showErrMsg($("#password"), "密码长度小于六位！");
          errCode++;
        }else{
        	$("#password").next().remove();
        }
		/^\d{11}$/;//手机号码验证
		 //手机号码验证
          if(!regexp3.test($("#phone").val())) {
           showErrMsg($("#phone"), "手机号码为11位数字！");
           errCode++;
          } else {
           $("#phone").next().remove();
          }
		
        if(errCode > 0) {
          return false;
        } else {
        	
          return true;
        }
      }

      $(function() {
     
        $("#username").blur(check);
        $("#password").blur(check);
        $("#phone").blur(check);
        $("#address").blur(check);
        
        $("#form").submit(check);
       
      });
     
</script>

<script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />

</head>
<body>
<div id="main_container">

	<div class="header_login">
    <div class="logo"><a href="#"></a></div>
    
    </div>

     
         <div class="login_form" style="background: none;">
         
         <h3 style="padding-left: 250px;">超市进销存管理系统</h3>
         
        
         
         <form id="form" action="/Supermarket/reg" method="post" class="niceform">
         
                <fieldset>
                    <dl>
                        <dt><label for="email">姓名:</label></dt>
                        <dd><input type="text" name="UserName" id="username" size="40" /></dd>
                    </dl>
                    <dl>
                        <dt><label for="password">密码:</label></dt>
                        <dd><input type="password" name="Password" id="password" size="40" /></dd>
                    </dl>
                    <dl>
                        <dt><label for="password">确认密码:</label></dt>
                        <dd><input type="password" name="repassword" id="repassword" size="40" /></dd>
                    </dl>
                     <dl>
                        <dt><label for="email">性别:</label></dt>
                        <dd><input type="radio" name="sex" id="" checked="checked" value="女"/>&nbsp;&nbsp;<font style="color: white; font-size: 12px;">女</font>
                        	<input type="radio" name="sex" id="" value="男"/>&nbsp;&nbsp;<font style="color: white; font-size: 12px;">男</font>
                        </dd>
                    </dl>
                    <dl>
                        <dt><label for="email">联系电话:</label></dt>
                        <dd><input type="text" name="Phone" id="phone" size="40" /></dd>
                    </dl>
                    <dl>
                        <dt><label for="email">地址:</label></dt>
                        <dd><input type="text" name="Address" id="address" size="40" /></dd>
                    </dl>
                   
                    
                     <dl class="submit">
                     	 <input type="submit" name="submit" id="submit" value="注册" />
                         <a href="login.jsp" style="text-decoration: none;"><input type="button" name="cancel" id="cancel" value="取消" /></a>
                     </dl>
                    
                </fieldset>
                
         </form>
         </div>  
          
	
    
    <div class="footer_login">
    
    	
    	<div class="right_footer_login"></div>
    
    </div>

</div>		
</body>
</html>
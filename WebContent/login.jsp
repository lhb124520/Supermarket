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
       
    
        if(firstNameVal == "") {
          showErrMsg($("#username"), "名字不能为空！");
         
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
       

        if(errCode > 0) {
          return false;
        } else {
          return true;
        }
      }

      $(function() {
        $("#userID").blur(check);
        $("#username").blur(check);
        $("#password").blur(check);
       
        $("#userinfo").submit(check);
       
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

     
         <div class="login_form">
         
         <h3 style="padding-left: 250px;">超市进销存管理系统</h3>
         
        
         
         <form id="userinfo" action="/Supermarket/Customer" method="post" class="niceform" >
         
                <fieldset>                	
                    <dl>
                        <dt><label for="email">顾客姓名:</label></dt>
                        <dd><input type="text" name="UserName" id="username" size="40" /></dd>
                    </dl>
                    <dl>
                        <dt><label for="password">密码:</label></dt>
                        <dd><input type="password" name="Password" id="password" size="40" /></dd>
                    </dl>
                    
                    <dl>
                        <dt><label></label></dt>
                        <dd>
                    
                        </dd>
                    </dl>
                    
                     <dl class="submit">
                     	 <input type="submit" name="submit" id="submit" value="登录" />
                         <a href="register.jsp" style="text-decoration: none;">
                         	<input type="button" name="submit" id="submit" value="会员卡注册"/> </a>
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
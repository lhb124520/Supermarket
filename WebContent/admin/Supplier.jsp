<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!--placeholder="请输入部门名称"-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市进销存管理系统</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script type="text/javascript" src="clockp.js"></script>
<script type="text/javascript" src="clockh.js"></script> 
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="ddaccordion.js"></script>
<script type="text/javascript">
ddaccordion.init({
	headerclass: "submenuheader", //Shared CSS class name of headers group
	contentclass: "submenu", //Shared CSS class name of contents group
	revealtype: "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
	mouseoverdelay: 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
	collapseprev: true, //Collapse previous content (so only one open at any time)? true/false 
	defaultexpanded: [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
	onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
	animatedefault: false, //Should contents open by default be animated into view?
	persiststate: true, //persist state of opened contents within browser session?
	toggleclass: ["", ""], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
	togglehtml: ["suffix", "<img src='images/plus.gif' class='statusicon' />", "<img src='images/minus.gif' class='statusicon' />"], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
	animatespeed: "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
	oninit:function(headers, expandedindices){ //custom code to run when headers have initalized
		//do nothing
	},
	onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed
		//do nothing
	}
})
</script>
<script src="js/jquery-1.8.3.js" type="text/javascript"></script>
<script src="jquery.jclock-1.2.0.js.txt" type="text/javascript"></script>
<script type="text/javascript" src="jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	
	
	$(function($) {
    $('.jclock').jclock();
});


</script>
<script>
	 function doRemove() {
        if(confirm("确认删除？")) {
          $(this).parent().parent().parent().remove();
        }
      }
	$(function(){
		 $(".btnRemove").click(doRemove);
	})
	function doQuery() {
		document.forms[0].action = "/Supermarket/qbook";
		document.forms[0].submit();
	}
	function doUpdate(id) {
		document.getElementById('hidId').value = id;

		document.forms[0].action = "/Supermarket/gbook";

		document.forms[0].submit();
	}
	function doDelete(id) {
		if (confirm("你确定删除该部门以及该部门下的员工吗？")) {
			document.getElementById('hidId').value = id;
			document.forms[0].action = "/Supermarket/dbook";
			document.forms[0].submit();
		}

	}
	
	/*导航栏切换内容*/
function opens(obj){
	
	document.getElementById("bg").style.display="none";
for(var i = 1;i<=7;i++){
	/*alert("i="+i)
	alert("obj"+obj)*/
if(i == obj){	
	document.getElementById("dis"+i).style.display="block";
	doQuery();

	
	/* document.forms[0].submit(); */
	/* doQuery(${UserID }); */
	/* document.forms[0].action = "/Supermarket/gbook"; */
	
}
else{

document.getElementById("dis"+i).style.display="none";

}
}
}

/*右边修改信息切换内容*/
function opend(obj1){
	
for(var i = 1;i<=7;i++){
   
if(i == obj1){	
	
	document.getElementById("d"+i).style.display="block";
	
}
else{


document.getElementById("d"+i).style.display="none";
}
}
}

/*右边添加信息切换内容*/
function openddd(obj2){
	
for(var j = 2;j<=7;j++){	
if(j == obj2){		
	document.getElementById("dd"+j).style.display="block";	
}
else{	
	document.getElementById("dd"+j).style.display="none";
}
}
}
/*显示或者隐藏修改窗户切换内容*/
function opendd(){
	
alert("success");

for(var i = 1;i<=7;i++){

document.getElementById("d"+i).style.display="none";

}

}
/*显示或者隐藏修改窗户切换内容*/
function openaa(){
	
alert("success");

for(var i = 2;i<=7;i++){

document.getElementById("dd"+i).style.display="none";

}
}
function closes(){
	
for(var i = 1;i<=7;i++){

document.getElementById("d"+i).style.display="none";


}

}

function closeaa(){
	

for(var i = 2;i<=7;i++){

document.getElementById("dd"+i).style.display="none";

}
}
</script>
<script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />

</head>
<body>
<div id="main_container">

	<div class="header">
    
    
    <div class="right_header">欢迎 , <a href="#">${username}</a>| <a href="login_admin.jsp" class="logout">注销</a></div>
    
    <div class="jclock"></div>
    <div class="right_header" style="float: left; text-align: left;font-size: 22px;font-weight: bold;"><span>超市进销存管理系统</span></div>
    </div>
    
    <div class="main_content" style="height: 400px;padding-bottom: 0px;">
    
                    <div class="menu">
                    <ul>
                    <li><a href="#" onclick="opens(1)">系统管理员首页</a></li>
                    <li><a href="#" onclick="opens(2)">员工信息管理</a>
                    
                    </li>
                    <li><a href="#" onclick="opens(3)">供应商信息管理</a>
                   
                    </li>
                    <li><a href="#" onclick="opens(4)">库存商品管理</a>
                   
                    </li>
                    <li><a href="#" onclick="opens(5)">退货信息管理</a>
                    
                    </li>
                    <li><a href="#" onclick="opens(6)">进货信息查询</a></li>
                    
                     <li><a href="#" onclick="opens(7)">商品销售查询</a></li>
                    
                    </ul>
                    </div> 
                   <div id="bg" style="background-image:url(img/chaoshi.jpg) ;width: 900px;height: 400px;"></div>
                
    <div class="center_content" >
   
   <!-- 右边和左边互相换-->
    <div class="right_content" id="dis1" style="display: none;">            
        
    <h2>系统管理员</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">您的姓名</th>
            <th scope="col" class="rounded">密码</th>
            <th scope="col" class="rounded">性别</th>
            <th scope="col" class="rounded">手机号码</th>
            <th scope="col" class="rounded">家庭地址</th>
            <th scope="col" class="rounded">职位</th>
            
            
        </tr>
    </thead>
    
    <tbody>
    	<tr>
    	
    	        	    
        	<td>${username}</td>
            <td>${Password}</td>
            <td>${Sex}</td>
            <td>${Phone}</td>
            <td>${Address}</td>
			<td>${Position}</td>
            <!-- <td><a href="#" onclick="opend(1)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td> -->
            <%--  --%>
          
        </tr>
        
    
        
    </tbody>
    	
</table>

	 
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    <div class="left_content" id="d1" style="padding-top: 70px; display: none;width: 0px;padding-left: 0px;">
    		
    
            <div class="sidebarmenu">
               
                <a class="menuitem " style="text-align: center;">修改个人信息</a>                
                <a class="menuitem ">姓名：<input type="text" value='${Admin.UserName}' name="Admin.UserName"/></a>                
                <a class="menuitem ">密码：<input type="text" value='${Admin.password}' name="Admin.Password"/></a>                
                <a class="menuitem">性别：<input type="text" value='${Admin.Sex}' name="Admin.Sex"/></a>
                <a class="menuitem">手机号码：<input type="text" value='${Admin.Phone}' name="Admin.Phone" size="16"/></a>
                <a class="menuitem">家庭地址：<input type="text" value='${Admin.Address}' name="Admin.Address" size="16"/></a>
                <a class="menuitem">职位：<input type="text" value='${Admin.Position}' name="Admin.Position"/></a>
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" onclick="opendd();"/>
                	<input type="button" value="取消" onclick="closes()"/>
                </a>
                <%-- <input type="hidden" name="UserID" id="hidId" value='${UserID}'/> --%>
                
                    
            </div>
            
            
            
            
            
              
    
    </div>
    
    <div class="right_content" id="dis2" style="display: none;">            
        
    <h2>员工信息管理</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">姓名</th>
            <th scope="col" class="rounded">密码</th>
            <th scope="col" class="rounded">性别</th>
            <th scope="col" class="rounded">手机号码</th>
            <th scope="col" class="rounded">家庭地址</th>
            <th scope="col" class="rounded">职位</th>
            <th scope="col" class="rounded">编辑</th>
            <th scope="col" class="rounded">删除</th>
            
        </tr>
    </thead>
     
    <tbody>
  <!--  <a href="#" onclick="doQuery()" >jinru</a> -->
	<form action="/Supermarket/qbook" method="post">
	<c:forEach items="${result}" var="user">
<tr>
 
   <td>${user.userName}</td>
   <td>${user.password}</td>
   <td>${user.sex}</td>
   <td>${user.phone}</td>
   <td>${user.address}</td>
   <td>${user.position}</td>
   <td>
   <a href="#" onclick="opend(2)">
   <img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
   <td>
   <a href="#" class="ask" onclick="doDelete('${User.userID}')">
   <img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/>
   </a></td>
    <td><input type="hidden" value="${user.userID}" id="hidId"/></td>
    
    </tr>
	</c:forEach>
	</form>
	
    	</tbody>
</table>

	 <a href="#" onclick="openddd(2)" class="bt_green" ><span class="bt_green_lft"></span><strong>添加员工信息</strong><span class="bt_green_r"></span></a>
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    <div class="left_content"  style="padding-top: 70px;width: 0px;padding-left: 0px;">
    
    		
    
            <div class="sidebarmenu"  id="d2" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">修改员工信息</a>                
                <a class="menuitem ">姓名：<input type="text" placeholder="刘海波"/></a>                
                <a class="menuitem ">密码：<input type="text" placeholder="123"/></a>                
                <a class="menuitem">性别：<input type="text" placeholder="男"/></a>
                <a class="menuitem">手机号码：<input type="text" placeholder="15576073439" size="16"/></a>
                <a class="menuitem">家庭地址：<input type="text" placeholder="湖南理工学院" size="16"/></a>
                <a class="menuitem">职位：<input type="text" placeholder="系统管理员"/></a>
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="opendd()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closes()"/>
                </a>
                    
            </div>
            <div class="sidebarmenu"  id="dd2" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">添加员工信息</a>                
                <a class="menuitem ">姓名：<input type="text"/></a>                
                <a class="menuitem ">密码：<input type="text"/></a>                
                <a class="menuitem">性别：<input type="text"/></a>
                <a class="menuitem">手机号码：<input type="text" size="16"/></a>
                <a class="menuitem">家庭地址：<input type="text"  size="16"/></a>
                <a class="menuitem">职位：<input type="text" /></a>
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="openaa()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closeaa()"/>
                </a>
                    
            </div>
            
            
            
            
            
              
    
    </div>
    
      <div class="right_content" id="dis3" style="display: none;">            
        
    <h2>供应商信息管理</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">供应商编号</th>
            <th scope="col" class="rounded">供应商名称</th>
            <th scope="col" class="rounded">联系人名字</th>
            <th scope="col" class="rounded">联系人电话</th>
            <th scope="col" class="rounded">供应商地址</th>
            <th scope="col" class="rounded">备注</th>
            <th scope="col" class="rounded">编辑</th>
            <th scope="col" class="rounded">删除</th>
            
        </tr>
    </thead>
     
    <tbody>
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(3)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(3)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
    	
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(3)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(3)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
    </tbody>
</table>

	 <a href="#" onclick="openddd(3)" class="bt_green" ><span class="bt_green_lft"></span><strong>添加供应商信息</strong><span class="bt_green_r"></span></a>
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    <div class="left_content"  style="padding-top: 70px;width: 0px;padding-left: 0px;">
    
    		
    
            <div class="sidebarmenu"  id="d3" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">修改供应商信息</a>                
                <a class="menuitem ">供应商编号：<input type="text" placeholder="001" disabled="disabled" size="14"/></a>                
                <a class="menuitem ">供应商名称：<input type="text" placeholder="123" size="14"/></a>                
                <a class="menuitem">联系人名字：<input type="text" placeholder="男" size="14"/></a>
                <a class="menuitem">联系人电话：<input type="text" placeholder="15576073439" size="14"/></a>
                <a class="menuitem">供应商地址 ：<input type="text" placeholder="湖南理工学院" size="14"/></a>
                <a class="menuitem">备注：<input type="text" placeholder="系统管理员"/></a>
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="opendd()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closes()"/>
                </a>
                    
            </div>
            <div class="sidebarmenu"  id="dd3" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">添加供应商信息</a>                
                <a class="menuitem ">供应商编号：<input type="text" size="14"/></a>                
                <a class="menuitem ">供应商名称：<input type="text" size="14"/></a>                
                <a class="menuitem">联系人名字：<input type="text" size="14"/></a>
                <a class="menuitem">联系人电话：<input type="text" size="14"/></a>
                <a class="menuitem">供应商地址：<input type="text"  size="14"/></a>
                <a class="menuitem">备注：<input type="text" /></a>
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="openaa()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closeaa()"/>
                </a>
                    
            </div>
            
    </div>
    
    
   
    <div class="right_content" id="dis4" style="display: none;">            
        
    <h2>库存商品管理</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	
            <th scope="col" class="rounded">库存编号</th>
            <th scope="col" class="rounded">商品</th>
            <th scope="col" class="rounded">供应商</th>
            <th scope="col" class="rounded">仓库名称</th>
            <th scope="col" class="rounded">库存数量</th>
            <th scope="col" class="rounded">预警数量</th>
            <th scope="col" class="rounded">编辑</th>
            <th scope="col" class="rounded">删除</th>
        </tr>
    </thead>
     
   <tbody>
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(4)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(4)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
    	
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(4)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(4)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
    </tbody>
</table>

	 
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    <div class="left_content"  style="padding-top: 70px;width:0px; padding-left: 0px;">
    
    		
    
             <div class="sidebarmenu"  id="d4" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">修改库存信息</a>
                <a class="menuitem">仓库名称：<input type="text" placeholder="男" size="16"/></a>
                <a class="menuitem">预警数量：<input type="text" placeholder="15576073439" size="16"/></a>
                
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="opendd()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closes()"/>
                </a>
                    
            </div>
            
            
            
            
            
            
            
              
    
    </div>
    
    
    <div class="right_content" id="dis5" style="display: none;">            
        
    <h2>退货信息管理</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	
            <th scope="col" class="rounded">退货编号</th>
            <th scope="col" class="rounded">销售编号</th>
            <th scope="col" class="rounded">退货商品</th>
            <th scope="col" class="rounded">退货商品单价</th>
            <th scope="col" class="rounded">退货商品数量</th>
            <th scope="col" class="rounded">退货原因</th>
            <th scope="col" class="rounded">编辑</th>
            <th scope="col" class="rounded">删除</th>
        </tr>
    </thead>
     
    <tbody>
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(5)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(5)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
    	
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(5)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            <td><a href="#" onclick="opend(5)"><img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
            <td><a href="#" class="ask"><img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/></a></td>
        </tr>
        
    </tbody>
</table>

	
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    <div class="left_content"  style="padding-top: 70px;width:0px; padding-left: 0px;">
    
    		
    
             <div class="sidebarmenu"  id="d5" style="display: none;">
            
                <a class="menuitem " style="text-align: center;">退货信息审查</a>
                <a class="menuitem">退货金额：<input type="text" placeholder="100" size="16"/></a>
                <a class="menuitem">退货意见：<input name="advice" type="radio" size="16"/>同意
                							 <input name="advice" type="radio" size="16"/>不同意
                </a>
                
                <a class="menuitem" style="text-align: center;">
                	<input type="button" value="确定" style="margin-top: 3px;" id="input_sure" onclick="opendd()"/>
                	<input type="button" value="取消" id="input_cancel" onclick="closes()"/>
                </a>
                    
            </div>
    
    </div>
 
  
     <div class="right_content" id="dis6" style="display: none;">            
        
    <h2>进货信息查询</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">采购员</th>
            <th scope="col" class="rounded">供应商</th>
            <th scope="col" class="rounded">仓库名称</th>
            <th scope="col" class="rounded">商品名称</th>
            <th scope="col" class="rounded">商品进价</th>
            <th scope="col" class="rounded">商品进货数量</th>
           
            
        </tr>
    </thead>
     
    <tbody>
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
        
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
    	
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
           
        </tr>
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
        
    </tbody>
</table>

	 
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    
    <div class="right_content" id="dis7" style="display: none;">            
        
    <h2>商品销售查询</h2> 
                    
                    
<table id="rounded-corner">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">销售编号</th>
            <th scope="col" class="rounded">收银员</th>
            <th scope="col" class="rounded">商品</th>
            <th scope="col" class="rounded">商品售价</th>
            <th scope="col" class="rounded">销售商品数量</th>
            <th scope="col" class="rounded">销售时间</th>
            
        </tr>
    </thead>
     
    <tbody>
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
        
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
    	
    	<tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
           
        </tr>
        <tr>
        	<td>刘海波</td>
            <td>123</td>
            <td>男</td>
            <td>15576073439</td>
            <td>湖南理工学院</td>
			<td>系统管理员</td>
            
        </tr>
        
    </tbody>
</table>

	
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    
    
    </div>   <!--end of center content -->               
                    
                    
    
    
    <div class="clear"></div>
    </div> <!--end of main content-->
	
    
    

</div>		
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
function save(){
	  document.forms[1].submit();
	}
function select(){
	
	var s=document.getElementById("s");
	var index=s.selectedIndex ; 
	var s1=s.options[index].value;
	doQueryone()
	}
function doQueryone() {
	document.forms[0].action = "/Supermarket/queryGoods";
	/* document.forms[1].action = "/Supermarket/queryGoodsName"; */
	document.forms[0].submit();
	/* document.forms[1].submit(); */
}
function check() {
    
    var firstNameVal = $("#Num").val();
   
    var SecNameVal = $("#GoodsNum").val();
    var ThiNameVal=$("#Balance").val();

    if(SecNameVal == "") {
      alert( "请输入商品数量！");
     
      
    }
   
    ThiNameVal=parseInt(firstNameVal)-parseInt(SecNameVal);
   if(ThiNameVal>=0){
	   document.getElementById("Balance").value =ThiNameVal;
   }else{
	   document.getElementById("GoodsNum").value =document.getElementById("Num").value ;
	   document.getElementById("Balance").value =0;
	   alert( "超出库存数量！");
   }
  
   
  
  }

  $(function() {
   
	
	  $("#GoodsNum").blur(check);
   
  });
function save1(){
	  document.forms[2].submit();
	}

</script>
<script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />
<%
  String fmt="yyyy-MM-dd HH:mm:ss"; 
  java.util.Date date=new java.util.Date();
  java.text.SimpleDateFormat simpleDateFormat=new java.text.SimpleDateFormat(fmt);
  String str = simpleDateFormat.format(date);
  session.setAttribute("date", str);
  %>
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
                   <li><a href="Cashier.jsp">收银员首页</a></li>
                    <li><a href="#">添加商品订单信息</a>
                    
                    </li>
                    
                    </ul>
                    </div> 
                   <!-- <div id="bg" style="background-image:url(img/chaoshi.jpg) ;width: 900px;height: 400px;"></div> -->
                
    <div class="center_content" >
   
   <!-- 右边和左边互相换-->
   
    
    <div class="right_content" id="dis2">            
        
    <h2>添加商品订单信息</h2> 
                    
                    
<table id="rounded-corner" style="width:850px">
    <thead>
    	<tr>
        	<th scope="col" class="rounded">商品编号</th>
            <th scope="col" class="rounded">商品名称</th>
            <th scope="col" class="rounded">销售单价</th>           
            <th scope="col" class="rounded">库存数量</th>
            <th scope="col" class="rounded">销售数量</th>
            <th scope="col" class="rounded">库存余量</th>
            <th scope="col" class="rounded" colspan="2">销售时间</th>          
            
        </tr>
    </thead>
     
    <tbody>
  
	
	
<tr> 

   <td>请选择商品编号:<br>
   <form  method="post">
   <select name="GoodsId" onchange="select()" id="s">
   <option>商品编号</option>
          <c:forEach items="${result1}" var="move">
          
   			<option>${move.goodsID}</option>	
           </c:forEach>
                 </select>
   </form>
    </td> 

  
    <form action="/Supermarket/aCashier" method="post">
    <td><input type="text" value='${goodsInfo.goodsName }'  size="10" name="cashier.goodsName"/></td>   
   <td><input type="text" value='${goodsInfo.goodsInPrice }' size="15" name="cashier.goodsInPrice"/></td>   
   <td>  
    <input type="text"  size="10" value='${goodsInfo.goodsNum }' disabled="disabled" id="Num"/>
   </td>
   <td><input type="text" placeholder="请输入商品数量" id="GoodsNum"  size="15" name="cashier.goodsNum"/></td>
   <td><input type="text" id="Balance" value="" name="Balance" size="10" readonly="true"/></td>
   <td><input type="text"  value='${date}' size="20" name="cashier.goodsTime"/></td>
  <td><input type="hidden" size="10" name="cashier.userName" value='${username}' /></td>
   
    </form>
    </tr>
	
	
	<form action="/Supermarket/qCashier" method="post">
	</form>
    	</tbody>
</table>

	 <a href="#" onclick="save1()" class="bt_green" ><span class="bt_green_lft"></span><strong>取消</strong><span class="bt_green_r"></span></a>
      <a href="#" onclick="save()" class="bt_green" ><span class="bt_green_lft"></span><strong>确定</strong><span class="bt_green_r"></span></a>
     
     
     
     
    
     
     
        
      
    
    
     
     
        
      
     
     </div><!-- end of right content-->
    
    
    </div>   <!--end of center content -->               
                    
                    
    
    
    <div class="clear"></div>
    </div> <!--end of main content-->
	
    
    

</div>		
</body>
</html>
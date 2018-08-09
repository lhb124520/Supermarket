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
/* 	$(function(){
		
		var a=$(".storeNum").html();
		var b=$(".warnNum").html();
		var c=$(".state").html();
		alert($(".storeNum").html())
		
		if(a<b){
			 
			$(".state").css({color:"red"});
			$(".state").html("库存不足");
			
		}
		 
	
	}); */
	  
	   $(function(){
		   for(i=1;i<6;i++){
			   var a=$("tr").eq(i).children().eq(4).html();
			   var b=$("tr").eq(i).children().eq(5).html();
			   /* var c=$("tr").eq(i).children().eq(6).html(); */
			     /* alert(a)
			    alert(b) */
			   if(a<b){
				   $("tr").eq(i).children().eq(6).css({color:"red"});
				   $("tr").eq(i).children().eq(6).html("库存不足");
			   }
		   }
		  
	   });
	   
	$(function($) {
    $('.jclock').jclock();
});


</script>
<script>
	/*  function doRemove() {
        if(confirm("确认删除？")) {
          $(this).parent().parent().parent().remove();
        }
      }
	$(function(){
		 $(".btnRemove").click(doRemove);
	}) */
	
	function doQueryone() {
		document.forms[0].action = "/Supermarket/queryone";
		/* document.forms[1].action = "/Supermarket/queryGoodsName"; */
		document.forms[0].submit();
		/* document.forms[1].submit(); */
	}
	
	function fun() {
		doQueryone();
		doqueryGoodsName();
	}
	
	function doQuery() {
		document.forms[0].action = "/Supermarket/qStockInfo";
		document.forms[0].submit();
	}
	function doUpdate(id) {
		document.getElementById('hidId').value = id;

		document.forms[0].action = "/Supermarket/gStockInfo";

		document.forms[0].submit();
	}
	function doDelete(id) {
		if (confirm("你确定删除该库存信息吗？")) {
			document.getElementById('hidId').value = id;
			document.forms[0].action = "/Supermarket/dStockInfo";
			document.forms[0].submit();
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
                   <li><a href="index.jsp">系统管理员首页</a></li>
                    <li><a href="#" onclick="doQuery()">库存信息管理</a>
                    
                    </li>
                    
                    </ul>
                    </div> 
                   <!-- <div id="bg" style="background-image:url(img/chaoshi.jpg) ;width: 900px;height: 400px;"></div> -->
                
    <div class="center_content" >
   
   <!-- 右边和左边互相换-->
   
    
    <div class="right_content" id="dis2">            
        
    <h2>库存信息管理</h2> 
                    
                    
<table id="rounded-corner" style="width:800px">
    <thead>
    	<tr>
    		<th scope="col" class="rounded">库存号</th>
        	<th scope="col" class="rounded">商品名称</th>
            <th scope="col" class="rounded">供应商名称</th>
            <th scope="col" class="rounded">仓库名称</th>
            
            <th scope="col" class="rounded">库存数量</th>           
            <th scope="col" class="rounded">预警数量</th>
            <th scope="col" class="rounded">库存状态</th>
            <th scope="col" class="rounded">编辑</th>
            <th scope="col" class="rounded">删除</th>
            
        </tr>
    </thead>
     
    <tbody>
  
	<form action="/Supermarket/qStockInfo" method="post">
	 <input type="hidden" name="id"  id="hidId"/>
	</form>
	<form action="/Supermarket/queryGoodsName" method="post">
	<input type="hidden" name="id"  id="hidId"/>
	 </form>
	<c:forEach items="${result2}" var="stockInfo">
<tr>
   <td>${stockInfo.stockID}</td>
   <td>${stockInfo.goodsName}</td>
   <td>${stockInfo.supplierName}</td>
   <td>${stockInfo.storeName}</td>
   <td id="${stockInfo.storeNum}">${stockInfo.storeNum}</td>
   <td id="${stockInfo.storeNum}">${stockInfo.warnNum}</td>
   <td class="state"></td>
 
   <td>
   <a href="#" onclick="doUpdate('${stockInfo.stockID}')">
   <img src="images/user_edit.png" alt="" title="" border="0" /></a></td>
   <td>
   <a href="#" class="ask" onclick="doDelete('${stockInfo.stockID}')">
   <img src="images/trash.png" alt="" title="" border="0" class="btnRemove"/>
   </a></td>
   
    
    </tr>
	</c:forEach>
	
	
    	</tbody>
</table>

	 <a href="#" onclick="doQueryone()" class="bt_green" ><span class="bt_green_lft"></span><strong>添加库存信息</strong><span class="bt_green_r"></span></a>
     
     
     
     
     
    
     
     
        
      
     
     </div><!-- end of right content-->
    
    </div>
    
     
   
    
    
    
    </div>   <!--end of center content -->               
                    
                    
    
    
    <div class="clear"></div>
    </div> <!--end of main content-->
	
    
    

</div>		
</body>
</html>
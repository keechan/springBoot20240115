<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>     
<c:import url="/WEB-INF/view/include/top.jsp" /> 
  
<style>
table{
 width:800px;
}
.td1 {
 text-align : center; 
}
</style>
<section>
<div align="center">
<br>
<table border=1  >
<tr  align="center">
  <td>idx </td><td>productId </td>
  <td>productImg </td>
  <td>productName </td>
  <td>productPrice </td><td>productDate </td>
</tr>
<c:forEach  items="${li}" var="m"  varStatus="status">
 	  <tr align="center">	
	     <td >${status.count} </td>
	     <td >${m.productId} </td>
	     <td> <img src=/shop/img/${m.productImg} width=50  height=50 /> </td>
	     <td align="left">
	     <a href=getShopEdit.do?productId=${m.productId}>
	       ${m.productName} 
	     </a>
	     
	     </td>
	     <td  align="right">${m.productPrice} </td>	
	     <td >${m.productDate} </td>	
	  </tr>
</c:forEach>
</table>

</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" /> 
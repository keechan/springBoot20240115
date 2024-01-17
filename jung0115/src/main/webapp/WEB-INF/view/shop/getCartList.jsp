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
  <td>idx </td>
  <td>cartId </td>
  <td>productId </td>
  <td>productName </td>
  <td>productPrice </td>
  <td>amount </td>
</tr>
<c:if test="${not empty li}">
<c:forEach  items="${li}" var="m"  varStatus="status">
 	  <tr align="center">	
	     <td >${status.count} </td>
	     <td >${m.cartId} </td>
	     <td >${m.productId} </td>
	     <td align="left">
	     <a href=getShopEdit.do?productId=${m.productId}>
	       ${m.productName} 
	     </a>
	     
	     </td>
	     <td  align="right">${m.productPrice} </td>	
	     <td  >${m.amount} </td>	

	  </tr>
</c:forEach>
</c:if>

<c:if test="${ empty li}">

 	  <tr align="center">	
	     <td colspan=6> 장바구니가 비어 있습니다.!! </td>

	  </tr>

</c:if>

</table>

</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" /> 
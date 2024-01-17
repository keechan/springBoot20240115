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
  <td>번호</td><td>카트번호</td><td>상품번호 </td><td>상품명</td><td>상품가격</td><td>상품금액</td><td>세션ID</td>
</tr>
<c:forEach  items="${li}" var="m"  varStatus="status">
	  <tr>	
	  	 <td>${status.count}</td>
	     <td>${m.cartId}</td>
	     <td>${m.productId}</td>
	     <td>${m.productName}</td>
	     <td>${m.productPrice}</td>	     
	     <td>${m.amount}</td>
	     <td>${m.sessionId}</td>
	  </tr>
</c:forEach>
</table>

</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" /> 
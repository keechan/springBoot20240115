<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>     
<c:import url="/WEB-INF/frontend/include/top.jsp" /> 
  
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
   <td>번호 </td><td>이름</td><td>비밀번호</td>
</tr>
<c:forEach  items="${li}" var="m"  varStatus="status">
  
	  <tr>	 
	  <td >${m.idx1} </td>
	  <td >${m.name1} </td>
	  <td >${m.pwd1} </td>
	 </tr>
	 	
</c:forEach>
</table>

</div>
<br/>
</section>
<c:import url="/WEB-INF/frontend/include/bottom.jsp" /> 
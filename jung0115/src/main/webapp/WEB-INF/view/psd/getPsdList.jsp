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
  <td>idx </td><td>title </td><td>사진 </td><td>img </td>
</tr>
<c:forEach  items="${li}" var="m"  varStatus="status">
  
	  <tr>	
	     <td >${m.idx}</a> </td>
	     <td >${m.title}</a> </td>
	     <td ><img src=/psd/img/${m.img} width=50  height=50 /> </td>
	     <td >
	     <a href=deletePsd.do?idx=${m.idx}> 
	        ${m.img} 
	     </a>
	     </td>
	  </tr>
	 	
</c:forEach>
</table>

</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" /> 
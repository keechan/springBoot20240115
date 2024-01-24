<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>     
<c:import url="/include/top.jsp" /> 

<section>
<br>
<div align="center">

 <h1> 회원 목록보기 </h1>
 
 <table border=1  >
  <tr  align="center">
  <td>순번 </td>
  <td>idx </td>
  <td>아이디 </td>
  <td>암호 </td>
  <td>권한 </td>
  <td>이름 </td>
  <td>등급 </td>
</tr>
<c:if test="${not empty li}">
<c:forEach  items="${li}" var="m"  varStatus="status">
 	  <tr align="center">	
	     <td>${status.count} </td>
	     <td>${m.idx} </td>
	     <td>${m.username} </td>
	     <td>${m.password} </td>	
	     <td>${m.role} </td>	
	     <td>${m.name} </td>	
	     <td>${m.grade} </td>	
	  </tr>
</c:forEach>
</c:if>
 </table>
</div>
<br/>
</section>

<c:import url="/include/bottom.jsp" /> 
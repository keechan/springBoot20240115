<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>      
<c:import url="/include/top.jsp" />
<style>
table{
 width:500px;
}
.td1 {
 text-align : center; 
}
</style>

<section>
<br>
<div align="center">
	<form action="/admin/memberRegistOK.do">
	<table border=1>
		<tr><td>아이디</td><td><input type=text name=username></td></tr>
		<tr><td>암호</td><td><input type=text name=password></td></tr>
		<tr><td>권한</td>
		    <td>
		    	<select name=role>
		    		<option value=ROLE_MEMBER selected>ROLE_MEMBER</option>
		    		<option value=ROLE_MANAGER>ROLE_MANAGER</option>
		    		<option value=ROLE_ADMIN>ROLE_ADMIN</option>
		    	</select>
		    </td>
		</tr>
		<tr><td>이름</td><td><input type=text name=name></td></tr>
		<tr>
			<td>등급</td>
			<td>
		    	<select name=grade>
				    <option value="관리자" >관리자</option>
				    <option value="매니저" >매니저</option>
				    <option value="회원1" >일반회원1</option>
				    <option value="회원2" >일반회원2</option>
				    <option value="회원3" >일반회원3</option>
		    	</select>
		    </td>
		</tr>
		<tr><td colspan=2 align=center><input type=submit value=저장></td></tr>
	</table>
	</form>	
</div>
<br/>
</section>
<c:import url="/include/bottom.jsp" />
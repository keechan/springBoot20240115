<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>     
<c:import url="/WEB-INF/view/include/top.jsp" />      
<section>
<br>
<div align="center">
<h2>게시판 글등록</h2>
	<form action=BoardEditOK.do>
	    <input type=hidden name=seq value=${m.seq}>
		<table border=1>
			<tr><td>제목</td><td><input type=text name=title value=${m.title }></td></tr>
			<tr><td>저자</td><td><input type=text name=writer value=${m.writer }></td></tr>
			<tr><td>내용</td><td><textarea cols=50 rows=5 name=content placeholder="내용을 입력하세요" >${m.content}</textarea>
			    </td></tr>	
			<tr><td colspan=2 align=center><input type=submit value="저장하기"></td></tr>
		</table>
	</form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" />
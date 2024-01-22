<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2024 Spring Boot Security</title>

<link href="/include/top.css" rel="stylesheet" type="text/css"  />
<style type="text/css">

</style>

</head>
<body>
<header>
 Spring Boot Security
</header>
<nav>

&emsp;&emsp;<a href=/index.do>홈으로</a>

&emsp;&emsp;<a href=/admin/admin.do>관리자</a>
&emsp;&emsp;<a href=/manager/manager.do>매니저</a>

&emsp;&emsp;<a href=/member/member1.do>Member1</a>
&emsp;&emsp;<a href=/member/member2.do>Member2</a>
&emsp;&emsp;<a href=/member/memberBoard.do>Member 게시판</a>

&emsp;&emsp;<a href=/guest/guest.do>손님</a>
&emsp;&emsp;<a href=/guestBoard/guestBoard.do>손님게시판</a>

&emsp;&emsp;
<c:if test="${not empty session}">
  <a href=/logout> ${sessionID2} LOGOUT </a>
  &emsp;${session.name}${session.role}
</c:if>

</nav>
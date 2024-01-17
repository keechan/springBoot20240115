<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2024 Spring Boot ver1.0</title>

<link href="/include/top.css" rel="stylesheet" type="text/css"  />
<style type="text/css">

</style>

</head>
<body>
<header>
 Spring Boot ver1.0
</header>
<nav>
&emsp;&emsp;<a href=getBoardList.do>게시판목록</a>
&emsp;&emsp;<a href=BoardForm.do>글등록하기</a>

&emsp;&emsp;<a href=getPsdList.do>자료실목록</a>
&emsp;&emsp;<a href=PsdForm.do>자료실폼</a>

&emsp;&emsp;<a href=getShopList.do>상품목록</a>
&emsp;&emsp;<a href=ShopForm.do>상품등록</a>

&emsp;&emsp;<a href=getCartList.do>장바구니</a>

&emsp;&emsp;<a href=index.do>홈으로</a> 

<c:if test="${not empty  sessionID2}">
  아이디 : <a href=sessionLogOut.do> ${sessionID2} logout </a>
</c:if>

</nav>
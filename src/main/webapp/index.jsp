<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- 기본 JSP 파일: 톰캣 서버 실행시 보여지는 JSP 화면 코드--%>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<%--a 링크 클릭시 : hello 의 경로로 이동을 요청--%>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
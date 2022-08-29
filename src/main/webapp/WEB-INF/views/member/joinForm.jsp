<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
  <form action="/members/join" method="post">
		username : <input type="text" name="username">            
		password : <input type="password" name="password">            
		email : <input type="email" name="email">            
        <button type="submit">등록</button>
    </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Sieu Thi Thu Cung</title>
<jsp:include page="header.jsp"/>

</head>
<body id="body-login">
	<div id="body-flex-login">
		<div id="container-login">
		
			<div id="container-login-left">
			</div>
			
			<div id="container-login-right">
				<div id="header-top-right" style="cursor: pointer;">
					<span class="actived" id="dangnhap">Đăng nhập</span> / <span id="dangky">Đăng ký</span>
				</div>
				
				<div id="container-center-login-right">
				
					<div id="container-signin">
						<input id="tendangnhap" name="TENDANGNHAP" class="material-textinput input-icon-login" placeholder="Tài khoản" type="text"/><br/>
						<input id="matkhau" NAME="MATKHAU" class="material-textinput input-icon-pass" placeholder="Mật khẩu" type="text"/><br/>
						<input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG NHẬP"/><br/>
					</div>
					
					<div id="container-signup">
					  <form action="" method="post">
					    <input id="email" name="EMAIL" class="material-textinput input-icon-email" placeholder="Email" type="text"/><br/>
						<input id="tendangnhap" name="TENDANGNHAP" class="material-textinput input-icon-login" placeholder="Tài khoản" type="text"/><br/>
						<input id="matkhau" NAME="MATKHAU" class="material-textinput input-icon-pass" placeholder="Mật khẩu" type="password"/><br/>
						<input id="nhaplaimatkhau" NAME="NHAPLAIMATKHAU" class="material-textinput input-icon-pass" placeholder="Nhập lại mật khẩu" type="password"/><br/>
						<input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG KÝ"/><br/>
					  </form>
					</div>
					
					<span id="ketqua"></span>
					<span style="color: green; margin-left: 25px; font-size: 16px;">${kiemtradangnhap}</span>
				</div>
				
				<div id="container-social-login">
					<img alt="icon_oval" src='<c:url value="/resources/image/fb.png"/>'/>
					<img alt="icon_oval" src='<c:url value="/resources/image/gg.png"/>'/>
				</div>
				
			</div>
			
		</div>
	</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
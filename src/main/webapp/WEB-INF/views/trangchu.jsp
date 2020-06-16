<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<jsp:include page="header.jsp"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>SieuThiThuCung</title>
</head>
<body>
	<div id="header" class="container-fluid header">
		<nav class="navbar navbar-default none-nav">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#"><img src='<c:url value= "/resources/image/logo.png" />'/></a>
		    </div>
		
		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav navbar-center">
		        <li class="active"><a href="#">TRANG CHỦ</a></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
		          <ul class="dropdown-menu">
		            <li><a href="#">Action</a></li>
		            <li><a href="#">Another action</a></li>
		            <li><a href="#">Something else here</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="#">Separated link</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="#">One more separated link</a></li>
		          </ul>
		        </li>
		        <li><a href="#">DỊCH VỤ</a></li>
		        <li><a href="#">LIÊN HỆ</a></li>
		        
		      </ul>
		      
		      <ul class="nav navbar-nav navbar-right">
		      	<c:choose>
		      		<c:when test="${chucaidau != null}">
		      			<li><a class="avatar" href="dangnhap"><span id="ava">${chucaidau}</span></a></li>
		      		</c:when>
		      		<c:otherwise>
		      			<li><a href="dangnhap">ĐĂNG NHẬP</a></li>
		      		</c:otherwise>
		      	</c:choose>      	
		        <li><a href="#"><img src='<c:url value= "/resources/image/cart1.png" />'/><div class="soluongsp"><span>${soluongsp}</span></div></a></li>
		      </ul>
		      
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		<div class="even-header container wow tada" data-wow-duration="2s">		
			<span style="font-size: 24px">BLACK FRIDAY</span><br/>
			<span style="font-size: 60px">SALE UP TO 50%</span><br/>
			<span style="font-size: 16px">Từ ngày 20/11 đến ngày 29/11/2019</span><br/>
			<button style="font-size: 18px">XEM NGAY</button>
		</div>
		<div id= "info" class="container-fluid">
			<div class="row">
				<div class="col-sm-4 col-md-4 wow fadeInLeft" data-wow-duration="1.25s">
					<img class="icon" src='<c:url value= "/resources/image/freeship.png" />'/><br>
					<span style="font-size: 30px">MIỄN PHÍ GIAO HÀNG</span><br>
					<SPAN>Freeship tại TP.HCM cho đơn hàng >250k</SPAN>
				</div>
				<div class="col-sm-4 col-md-4 wow fadeInDown" data-wow-duration="1.2s" data-wow-delay="1.25s">
					<img class="icon" src='<c:url value= "/resources/image/tietkiem.png" />'/><br>
					<span style="font-size: 30px">TIẾT KIỆM</span><br>
					<SPAN>Giá cả hợp lí và luôn cập nhật sản phẩm khuyến mãi</SPAN>
				</div>
				<div class="col-sm-4 col-md-4  wow fadeInRight" data-wow-duration="1.1" data-wow-delay="2.45s">
					<img class="icon" src='<c:url value= "/resources/image/chatluong.png" />'/><br>
					<span style="font-size: 30px">ĐẢM BẢO HÀI LÒNG</span><br>
					<SPAN>Cam kết mang đến cho khách hàng chất lượng tốt nhất</SPAN>
				</div>
			</div>
		</div>
	</div>
	
	<div id="body" class="container">
		<span style="font-size: 32px; color: darkgreen; ">SẢN PHẨM MỚI NHẤT</span>
		<div class="row">
		  
			<c:forEach var="sanpham" items="${listsp}">
				<div class="col-md-3 col-sm-6">
					<a href="chitiet/${sanpham.getMASANPHAM()}">
						<div class="sanpham wow zoomIn" data-wow-duration="1.5s">
							<img alt="pic" src='<c:url value= "/resources/image/${sanpham.getHINHSANPHAM()}" />'/><br>
							<span style="font-size: 20px;">${sanpham.getTENSANPHAM()}</span><br>
							<span class="gia">${sanpham.getGIATIEN()}</span>
						</div>
					</a>
				</div>
			</c:forEach>

<!-- 			<div class="col-md-3 col-sm-6"> -->
<!-- 				<div class="sanpham wow zoomIn" data-wow-duration="1.5s"> -->
<%-- 					<img alt="pic" src='<c:url value= "/resources/image/balo1.jpg" />'/><br> --%>
<!-- 					<span style="font-size: 28px;">Balo</span><br> -->
<!-- 					<span class="gia">500.000đ</span> -->
<!-- 				</div> -->
<!-- 			</div> -->
		</div>
	</div>
	
	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-md-4 wow bounce">
				<p><span style="font-size: 30px;color: lightgreen">SIÊU THỊ THÚ CƯNG</span></p>
				<span>Địa điểm mua sắm đáng tin cậy của khách hàng!</span><br/>
				<span>Cung cấp các sản phẩm phục vụ chó mèo như phụ kiện, thức ăn, đồ chơi,...</span><br/>
				<span>Mang lại chất lượng đảm bảo và tuyệt vời nhất dành cho thú cưng của bạn!</span>
			</div>
			<div class="col-md-4 wow bounce">
				<p><span style="font-size: 30px;color: lightgreen">THÔNG TIN LIÊN HỆ</span></p>
				<span>Chi nhánh 1:</span><br/>
				<img src='<c:url value= "/resources/image/address.png" />'/>
				<span> Địa chỉ: 97 Man Thiện, Hiệp Phú, Q.9, TP.HCM</span><br>
				<img src='<c:url value= "/resources/image/phone.png" />'/>
				<span> SĐT: 0987654321</span><br/>
				<span>Chi nhánh 2:</span><br/>
				<img src='<c:url value= "/resources/image/address.png" />'/>
				<span> Địa chỉ: 11 Nguyễn Đình Chiểu, Quận 1, TP.HCM</span><br>
				<img src='<c:url value= "/resources/image/phone.png" />'/>
				<span> SĐT: 0908070605</span><br/>
				<span>Email: sieuthithucung@gmail.com</span><br>
			</div>
			<div class="col-md-4 wow bounce">
				<p><span style="font-size: 30px;color: lightgreen">GÓP Ý</span></p>
				<form action="" method="post">
					<input name="tenNhanVien" class="material-textinput" style="margin-bottom: 8px;color:black" type="text" placeholder="Email"/><br/>
					<textarea name="tuoi" rows="4" cols="50" style="margin-bottom: 8px;color:black" placeholder="Nội dung"></textarea>
					<button class="footer-button" style="font-weight: bold;color: darkgreen;" >ĐỒNG Ý</button>
				</form>
			</div>
		</div>
	</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
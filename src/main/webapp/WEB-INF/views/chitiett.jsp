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
	<div class="container-fluid" style="background-color: black; height: 160px;">
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
		        <li><a href="#"><img src='<c:url value= "/resources/image/cart1.png" />'/><div class="soluongspgiohang"><span>${soluongsp}</span></div></a></li>
		      </ul>
		      
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		
	</div>
	
	<div class="container">
		<div class="row" style="max-width: 100%; margin-top: 30px">
			<div class="col-sm-3 col-md-3">
				<h3>Danh mục sản phẩm</h3>
				<ul class="menu">
					<c:forEach var="danhmuc" items="${danhmucsp}">
						<li><a href="#">${danhmuc.getTENDANHMUC()}</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="col-sm-4 col-md-4" >
				<img style="width: 100%; height: 100%; margin-top: 25px;" src='<c:url value= "/resources/image/${sp.getHINHSANPHAM()}"/>'/>
			</div>
			<div class="col-sm-5 col-md-5">
				<h3 id="tensp">${sp.getTENSANPHAM()}</h3>
				<h4 id="giatien" data-value="${sp.getGIATIEN()}">${sp.getGIATIEN()}</h4>
				<table class="table">
					<br/><span>${sp.getMOTA()}</span><br/>
					<thead>
						<tr>
							<th>MÃ</th>
							<th>MÀU</th>
							<th>SIZE</th>
							<th>SỐ LƯỢNG</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="chitietsp" items="${sp.getChitietsanpham()}">
							<tr>
								<td class="masp">${sp.getMASANPHAM()}</td>
								<td class="mau" data-mamau="${chitietsp.getMausanpham().getMAMAU()}">${chitietsp.getMausanpham().getTENMAU()}</td>
								<td class="size" data-masize="${chitietsp.getSizesanpham().getMASIZE()}">${chitietsp.getSizesanpham().getSIZE()}</td>
								<td class="soluong">${chitietsp.getSOLUONG()}</td>
								<td><button class="btn-success mua">MUA</button></td>
							</tr>
						</c:forEach><br/>
					</tbody>
				</table>
			</div>
<!-- 			<div class="col-sm-2 col-md-2" style="margin-top: 25px" > -->
<%-- 				<span>${sp.getMOTA()}</span> --%>
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
$(document).ready(function(){
	$("#cot1").click(function(){
		var chuoi=$("#cot1").attr("data-text");
		alert(chuoi);
	});
	
	$("#btnDangNhap").click(function(){
		var tendangnhap= $("#tendangnhap").val();
		var matkhau= $("#matkhau").val();
		$.ajax({
			url:"/SieuThiThuCung/api/KiemTraDangNhap",
			type:"GET",
			data:{
				TENDANGNHAP:tendangnhap,
				MATKHAU:matkhau
			},
			success: function(value){
				if(value=="true"){
					duongdan=window.location.href;
					DuongDan=duongdan.replace("dangnhap","");
					window.location=DuongDan;
				}else{
					$("#ketqua").text("Dang nhap that bai!")				
				}
			}
		})
	});
	
	$("#dangnhap").click(function(){
		$(this).addClass("actived");
		$("#dangky").removeClass("actived");
		$("#container-signup").css("display","none");
		$("#container-signin").show();
	});
	
	$("#dangky").click(function(){
		$(this).addClass("actived");
		$("#dangnhap").removeClass("actived");
		$("#container-signin").hide();
		$("#container-signup").show();
	});
	
	$(".mua").click(function(){
		var masp = $(this).closest("tr").find(".masp").text();
		var tenmau = $(this).closest("tr").find(".mau").text();
		var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
		var tensize = $(this).closest("tr").find(".size").text();
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var soluong = $(this).closest("tr").find(".soluong").text();
		var tensp = $("#tensp").text();
		var giatien = $("#giatien").attr("data-value");
		$.ajax({
			url:"/SieuThiThuCung/api/GioHang",
			type:"GET",
			data:{
				masp:masp,
				tensp:tensp,
				mamau:mamau,
				tenmau:tenmau,
				masize:masize,
				tensize:tensize,
				giatien:giatien,
				soluong:soluong
			},
			success: function(value){
				
			}
		}).done(function(){
			$.ajax({
				url:"/SieuThiThuCung/api/ThemSoLuongGioHang",
				type:"GET",
				success: function(value){
					$(".soluongspgiohang").html("<span>"+value+"</span>");
				}
			})
		});
	});
}) 
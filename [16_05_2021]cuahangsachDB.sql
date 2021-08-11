
use `cuahangsach`;

CREATE TABLE `chitiethoadon` (
  `MaHoaDon` int(11) NOT NULL,
  `MaSach` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MaHoaDon`, `MaSach`, `SoLuong`) VALUES
(1, 1, 1),
(1, 2, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPhieuNhap` int(11) NOT NULL,
  `MaSach` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `Gia` int(11) NOT NULL,
  `HinhAnh` varchar(500)  NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaPhieuNhap`, `MaSach`, `SoLuong`, `Gia`, `HinhAnh`) VALUES
(1, 1, 100, 125000, 'Cha-giau-cha-ngheo.jpg'),
(1, 2, 125, 99000, 'dacnhantam.jpg'),
(1, 3, 200, 75000, 'docvibatkiai.jpg'),
(2, 1, 25, 135000, 'Cha-giau-cha-ngheo.jpg'),
(2, 4, 50, 175000, 'doingandungngudai.jpg'),
(2, 5, 35, 55000, 'dunghoaiphituoitre.jpg'),
(3, 6, 200, 45000, 'kheoannoi.jpg'),
(3, 7, 50, 355000, 'leduocmat.jpg'),
(3, 8, 35, 25000, 'neutoibietkhicon20.jpg'),
(3, 9, 120, 55000, 'nha-gia-kim.jpg'),
(4, 10, 121, 123000, 'quang-ganh-lo-di-va-vui-song.jpg'),
(4, 11, 87, 230000, 'tony-buoi-sang-tren-duong-bang.jpg'),
(4, 12, 30, 35000, 'tuoitre.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHoaDon` int(11) NOT NULL,
  `MaNhanVien` int(11) DEFAULT NULL,
  `MaKhachHang` int(11) NOT NULL,
  `MaKhuyenMai` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `GioLap` time NOT NULL,
  `TrangThai` int(11) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHoaDon`, `MaNhanVien`, `MaKhachHang`, `MaKhuyenMai`, `NgayLap`, `GioLap`, `TrangThai`) VALUES
(1, NULL, 1, 1, '2021-05-16', '10:15:53', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKhachHang` int(11) NOT NULL,
  `TenKhachHang` varchar(100)  NOT NULL,
  `NgaySinh` date NOT NULL,
  `DiaChi` text  NOT NULL,
  `SDT` varchar(10)  NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKhachHang`, `TenKhachHang`, `NgaySinh`, `DiaChi`, `SDT`, `TrangThai`) VALUES
(1, 'Khách đến mua trực tiếp', '2001-01-28', 'Mua tại cửa hàng', '0123456789', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `MaKhuyenMai` int(11) NOT NULL,
  `NgayApDung` date NOT NULL,
  `PhanTramGiam` int(11) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `khuyenmai`
--

INSERT INTO `khuyenmai` (`MaKhuyenMai`, `NgayApDung`, `PhanTramGiam`) VALUES
(1, '0001-01-01', 0),
(2, '0001-08-03', 10),
(3, '0001-04-30', 25),
(4, '0001-03-08', 8),
(5, '0001-05-09', 5),
(6, '0001-01-28', 70);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNhaCungCap` int(11) NOT NULL,
  `TenNhaCungCap` varchar(100)  NOT NULL,
  `SDT` varchar(10)  NOT NULL,
  `DiaChi` text  NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNhaCungCap`, `TenNhaCungCap`, `SDT`, `DiaChi`, `TrangThai`) VALUES
(1, 'Nhà cung cấp TPHCM', '0123456789', 'TPHCM', 1),
(2, 'Nhà cung cấp Hà Nội', '0812345769', 'Hà Nội', 1),
(3, 'Nhà cung cấp Đà Nẵng', '0124375612', 'Đà Nẵng', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` int(11) NOT NULL,
  `TenNhanVien` varchar(100)  NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` tinyint(1) NOT NULL,
  `SDT` varchar(10)  NOT NULL,
  `DiaChi` text  NOT NULL,
  `MaQuyen` int(11) NOT NULL,
  `TenDangNhap` varchar(100)  NOT NULL,
  `MatKhau` varchar(100)  NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `NgaySinh`, `GioiTinh`, `SDT`, `DiaChi`, `MaQuyen`, `TenDangNhap`, `MatKhau`, `TrangThai`) VALUES
(1, 'NhanVien1', '1995-05-03', 1, '0123456789', 'Dia Chi NV1', 1, 'admin1', 'admin1', 1),
(2, 'NV2', '2001-05-18', 0, '0123456788', 'Dia chi NV2', 2, 'admin2', 'admin2', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPhieuNhap` int(11) NOT NULL,
  `MaNhanVien` int(11) NOT NULL,
  `MaNhaCungCap` int(11) NOT NULL,
  `NgayNhap` date NOT NULL,
  `GioNhap` time NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPhieuNhap`, `MaNhanVien`, `MaNhaCungCap`, `NgayNhap`, `GioNhap`) VALUES
(1, 1, 1, '2021-02-13', '10:36:51'),
(2, 1, 2, '2021-03-13', '10:41:24'),
(3, 1, 3, '2021-04-13', '10:46:23'),
(4, 1, 1, '2021-05-13', '10:53:34');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyen`
--

CREATE TABLE `quyen` (
  `MaQuyen` int(11) NOT NULL,
  `TenQuyen` varchar(100)  NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `quyen`
--

INSERT INTO `quyen` (`MaQuyen`, `TenQuyen`) VALUES
(1, 'Admin'),
(2, 'Bán Hàng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `MaSach` int(11) NOT NULL,
  `MaPhieuNhap` int(11) NOT NULL,
  `TenSach` varchar(100)  NOT NULL,
  `Gia` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `NhaXuatBan` varchar(100)  NOT NULL,
  `MaTheLoai` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL,
  `HinhAnh` varchar(500)  NOT NULL,
  `PhanTramGiamGia` int(11) NOT NULL,
  `TacGia` varchar(200)  NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`MaSach`, `MaPhieuNhap`, `TenSach`, `Gia`, `SoLuong`, `NhaXuatBan`, `MaTheLoai`, `TrangThai`, `HinhAnh`, `PhanTramGiamGia`, `TacGia`) VALUES
(1, 1, 'Cha giàu cha nghèo', 185000, 29, 'NXB Lao Động Xã Hội', 3, 1, 'Cha-giau-cha-ngheo.jpg', 3, 'Robert T.Kiyosaki-Sharon L.Lechter'),
(1, 2, 'Cha giàu cha nghèo', 185000, 80, 'NXB Lao Động Xã Hội', 3, 1, 'Cha-giau-cha-ngheo.jpg', 3, 'Robert T.Kiyosaki-Sharon L.Lechter'),
(2, 1, 'Đắc Nhân Tâm', 149000, 124, 'NXB Tuổi Tre', 1, 1, 'dacnhantam.jpg', 0, 'Dale Carnegie'),
(3, 1, 'Đọc Vị Bất Kỳ Ai', 125000, 200, 'NXB Hà nội', 3, 1, 'docvibatkiai.jpg', 0, 'David'),
(4, 2, 'Đời ngắn đừng ngủ dài', 225000, 50, 'NXB Trẻ', 1, 1, 'doingandungngudai.jpg', 0, 'Robin Sharma'),
(5, 2, 'Đừng hoài phí tuổi Trẻ', 105000, 35, 'NXB Phụ Nữ', 1, 1, 'dunghoaiphituoitre.jpg', 0, 'Lư Tư Hạo'),
(6, 3, 'Khéo ăn nói sẽ có được thiên hạ', 95000, 200, 'NXB Văn Học', 1, 1, 'kheoannoi.jpg', 0, 'Trắc Nhã'),
(7, 3, 'Lẽ được mất', 405000, 50, 'NXB Tổng Hợp TPHCM', 1, 1, 'leduocmat.jpg', 0, 'Lya Luft'),
(8, 3, 'Nếu tôi biết được khi còn 20', 75000, 35, 'NXB Trẻ', 5, 1, 'neutoibietkhicon20.jpg', 0, 'Hồng Nhật'),
(9, 3, 'Nhà giả kim', 105000, 120, 'NXB Văn Học TPHCM', 3, 1, 'nha-gia-kim.jpg', 0, 'Paulo'),
(10, 4, 'Quẳng gánh lo đi & vui sống', 173000, 121, 'NXB Tổng Hợp TPHCM', 2, 1, 'quang-ganh-lo-di-va-vui-song.jpg', 0, 'Nguyễn Văn Phước'),
(11, 4, 'Trên đường băng', 280000, 87, 'NXB Trẻ', 1, 1, 'tony-buoi-sang-tren-duong-bang.jpg', 0, 'Tony'),
(12, 4, 'Tuổi trẻ đáng giá bao nhiêu ?', 85000, 30, 'NXB Hội Nhà Văn', 1, 1, 'tuoitre.jpg', 0, 'Rossie Nguyễn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `TenDangNhap` varchar(100)  NOT NULL,
  `MatKhau` varchar(100)  NOT NULL,
  `MaKhachHang` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`TenDangNhap`, `MatKhau`, `MaKhachHang`, `TrangThai`) VALUES
('kh1@gmail.com', '123', 1, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `theloai`
--

CREATE TABLE `theloai` (
  `MaTheLoai` int(11) NOT NULL,
  `TenTheLoai` varchar(100)  NOT NULL
) ;

--
-- Đang đổ dữ liệu cho bảng `theloai`
--

INSERT INTO `theloai` (`MaTheLoai`, `TenTheLoai`) VALUES
(1, 'Kỹ năng sống'),
(2, 'Văn Học Việt Nam'),
(3, 'Văn học nước ngoài'),
(4, 'Tiểu thuyết'),
(5, 'Truyện Ngắn - Tiểu thuyết'),
(6, 'Hello');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`MaHoaDon`,`MaSach`),
  ADD KEY `chitiethoadon_ibfk_2` (`MaSach`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`,`MaSach`),
  ADD KEY `chitietphieunhap_ibfk_2` (`MaSach`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHoaDon`),
  ADD KEY `MaNhanVien` (`MaNhanVien`),
  ADD KEY `MaKhachHang` (`MaKhachHang`),
  ADD KEY `MaKhuyenMai` (`MaKhuyenMai`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKhachHang`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`MaKhuyenMai`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNhaCungCap`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD KEY `MaQuyen` (`MaQuyen`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`),
  ADD KEY `MaNhaCungCap` (`MaNhaCungCap`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Chỉ mục cho bảng `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`MaQuyen`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MaSach`,`MaPhieuNhap`),
  ADD KEY `sach_ibfk_1` (`MaTheLoai`),
  ADD KEY `sach_ibfk_2` (`MaPhieuNhap`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`TenDangNhap`),
  ADD KEY `MaKhachHang` (`MaKhachHang`);

--
-- Chỉ mục cho bảng `theloai`
--
ALTER TABLE `theloai`
  ADD PRIMARY KEY (`MaTheLoai`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `chitiethoadon_ibfk_1` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoadon` (`MaHoaDon`),
  ADD CONSTRAINT `chitiethoadon_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`);

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`),
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`),
  ADD CONSTRAINT `hoadon_ibfk_3` FOREIGN KEY (`MaKhuyenMai`) REFERENCES `khuyenmai` (`MaKhuyenMai`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MaQuyen`) REFERENCES `quyen` (`MaQuyen`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNhaCungCap`) REFERENCES `nhacungcap` (`MaNhaCungCap`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Các ràng buộc cho bảng `sach`
--
ALTER TABLE `sach`
  ADD CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`MaTheLoai`) REFERENCES `theloai` (`MaTheLoai`),
  ADD CONSTRAINT `sach_ibfk_2` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`);

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`);

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHang;
import ProcessingFunction.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINHTHUAN
 */
public class KhachHangDAO {
    ConnectionDB conn = new ConnectionDB();
    public ArrayList<KhachHang> getAllData(){
        ArrayList<KhachHang> data = new ArrayList<>();
        ConnectionDB conn = new ConnectionDB();
        ResultSet rs = conn.sqlExcute("select * from khachhang");
        try {
            while(rs.next()){
                data.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return data;
    }
    
    public boolean Update(int makhachhang, boolean trangthai){
        String qry = "UPDATE `khachhang` SET `TrangThai`="+trangthai+" WHERE `MaKhachHang` = "+makhachhang+";";
        ConnectionDB conn = new ConnectionDB();
        return conn.sqlUpdate(qry);
        
    }
    
    public boolean addCustomer(KhachHang kh){
        String qry = "INSERT INTO `khachhang`(`MaKhachHang`, `TenKhachHang`, `NgaySinh`, `DiaChi`, `SDT`, `TenDangNhap`, `MatKhau`, `TrangThai`) "
                + "VALUES ("
                +kh.getMaKhachHang()+",'"
                +kh.getTenKhachHang()+"','"
                +kh.getNgaySinh().toString()+"','"
                +kh.getDiaChi()+"','"
                +kh.getSDT()+"','"
                +kh.getTenDangNhap()+"','"
                +kh.getMatKhau()+"',"
                +kh.isTrangThai()+");";
        
        return conn.sqlUpdate(qry);
    }
    
    public boolean updateKH(KhachHang kh){
        String qry ="UPDATE `khachhang` SET "
                + "`TenKhachHang`='"+kh.getTenKhachHang()+"',"
                + "`NgaySinh`='"+kh.getNgaySinh().toString()+"',"
                + "`DiaChi`='"+kh.getDiaChi()+"',"
                + "`SDT`='"+kh.getSDT() +"',"
                + "`MatKhau`='"+kh.getMatKhau()
                +"' WHERE `MaKhachHang`="+kh.getMaKhachHang()+"";
        //System.out.println(qry);
        return conn.sqlUpdate(qry);
    }
    
    public boolean updatePassword(String user, String password){
        String qry = "UPDATE `khachhang` SET `MatKhau`='"+password+"' WHERE `TenDangNhap` = '" + user + "';";
        return conn.sqlUpdate(qry);
    }
    
    public boolean changeStatus(int idCus,boolean status){
         String qry = "UPDATE `khachhang` SET `TrangThai`="+status+" WHERE `MaKhachHang` = "+idCus+";";
        return conn.sqlUpdate(qry);
     }
}

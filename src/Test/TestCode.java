/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.KhachHangDAO;
import DTO.KhachHang;
import java.time.LocalDate;

/**
 *
 * @author mthuan
 */
public class TestCode {
    public static void main(String[] args) {
        KhachHangDAO khdao = new KhachHangDAO();
        //boolean rs = khdao.addCustomer(new KhachHang(99, "Pham Thuan", LocalDate.parse("2001-01-08"), "Ben Tre", "0843739379", "Solo", "die", true));
        boolean rs = khdao.addCustomer(new KhachHang(98, "Phạm Nguyễn Minh Thuận", LocalDate.parse("2001-01-08"), "Ben Tre City", "0843739379", "Solo", "die", true));
        if(rs){
            System.out.println("Success");
        }
        else{
            System.out.println("fali");
        }
    }
}

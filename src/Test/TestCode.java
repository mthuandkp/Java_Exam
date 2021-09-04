/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import BUS.KhachHangBus;
import DAO.KhachHangDAO;
import DTO.KhachHang;
import ProcessingFunction.ConnectionDB;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mthuan
 */
public class TestCode {
    public static void main(String[] args) {
        KhachHangBus khbus = new KhachHangBus();
        ArrayList<String[]> arr = khbus.getChartData();
        for(String [] str : arr){
            for(String s : str){
                System.out.println(s);
            }
            System.out.println("\n\n");
        }
    }
}

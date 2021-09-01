/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHang;
import static ProcessingFunction.Other.convertTextToEnglish;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author MINHTHUAN
 */
public class KhachHangBus {
    KhachHangDAO khdao = new KhachHangDAO();
    
    
    public ArrayList<KhachHang> getAllData(){
        return khdao.getAllData();
    }
    
    public String getNameById(int id){
        ArrayList<KhachHang> data = getAllData();
        for(KhachHang kh : data){
            if(kh.getMaKhachHang() == id){
                return kh.getTenKhachHang();
            }
        }
        return "";
    }
    
    public KhachHang getKHById(int id)
    {
        ArrayList<KhachHang> data = getAllData();
        for(KhachHang kh : data){
            if(kh.getMaKhachHang() == id){
                return kh ;
            }
        }
        return null;
    }
    
    public boolean Update (int makhachhang, boolean trangthai)
    {
        return khdao.Update(makhachhang, trangthai);
    }

    public ArrayList<KhachHang> searchData(int id, String name, int status, String date, String phone, String address,String username) {
        ArrayList<KhachHang> data = getAllData();
        ArrayList<KhachHang> result = new ArrayList<>();
        for(KhachHang kh:data){
            if(id != -1 && id != kh.getMaKhachHang()) continue;
            if(name.compareTo("")!= 0 && convertTextToEnglish(kh.getTenKhachHang()).contains(convertTextToEnglish(name)) == false) continue;
            if(status != -1){
                boolean check = (status == 0) ? true:false;
                if(check != kh.isTrangThai()) continue;
            }
            if(date.compareTo("")!= 0 && date.compareTo(kh.getNgaySinh().toString()) != 0) continue;
            if(phone.compareTo("") != 0 && kh.getSDT().contains(phone) == false) continue;
            if(address.compareTo("") != 0 && convertTextToEnglish(kh.getDiaChi()).contains(convertTextToEnglish(address)) == false) continue;
            if(username.compareTo("") != 0 && convertTextToEnglish(kh.getTenDangNhap()).contains(convertTextToEnglish(username)) == false) continue;
            result.add(kh);
        }
        return result;
    }
    
    public ArrayList<String[]> getChartData() {
        ArrayList<String[]> result = new ArrayList<>();
        ArrayList<Integer[]> tmp = new ArrayList<>();
        ArrayList<KhachHang> data = getAllData();

        for (KhachHang kh : data) {
            int year = Integer.valueOf(LocalDate.now().toString().substring(0,4))- Integer.valueOf(kh.getNgaySinh().toString().substring(0, 4));
            boolean OK = true;
            for (Integer[] value : tmp) {
                if (value[0] == year) {
                    value[1]++;
                    OK = false;
                    break;
                }
            }
            if (OK) {
                Integer[] intmp = new Integer[2];
                intmp[0] = year;
                intmp[1] = 1;
                tmp.add(intmp);
                continue;
            }
            
        }
        
        for(Integer[] value : tmp){
            String []str = new String[3];
            str[0] = String.valueOf(value[0]);
            str[1] = "khachhang";
            str[2] = String.valueOf(value[1]);
            result.add(str);
        }
        
        return result;
    }
    
    public int createAutoId(){
        ArrayList<KhachHang> data = getAllData();
        if(data == null || data.isEmpty()){
            return 1;
        }
        return data.get(data.size()-1).getMaKhachHang() + 1;
    }
    
    public boolean addCustomer(KhachHang kh){
        return khdao.addCustomer(kh);
    }
    
     public ArrayList<KhachHang> gettAllData(){
        return khdao.getAllData();
    }
    
    public boolean addKh(KhachHang kh){
        return khdao.addCustomer(kh);
    }
    
    public boolean updateKH(KhachHang kh){
        return khdao.updateKH(kh);
    }

    public boolean isExistUser(String user) {
        ArrayList<KhachHang> data = getAllData();
        for(KhachHang kh : data){
            if(kh.getTenDangNhap().compareTo(user) == 0){
                return true;
            }
        }
        return false;
    }

    public KhachHang getAccountByUser(String user) {
        ArrayList<KhachHang> data = getAllData();
        for(KhachHang kh : data){
            if(kh.getTenDangNhap().compareTo(user) == 0){
                return kh;
            }
        }
        return null;
    }

    public boolean updatePassword(String text, String pass) {
        return khdao.updatePassword(text, pass);
    }
}

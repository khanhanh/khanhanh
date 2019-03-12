package session2;

import java.util.Scanner;

public class btvn {
  public int tuoi;
  public double diemtrungbinh;
  public String masinhvien,lop;
public void inputinfostudient()
    {
        Scanner scaner=new Scanner(System.in);

        System.out.println("mã sinh viên :");
        masinhvien = scaner.next();

        System.out.println("Điểm Trung Bình :");
        diemtrungbinh = scaner.nextInt();

        System.out.println("Tuổi :");
        tuoi = scaner.nextInt();

        System.out.println("Lớp :");
        lop = scaner.next();
        }
public void showinfo(){
    System.out.println("Thông tin sinh viên :");
    System.out.println("Mã sinh viên :" +masinhvien);
    System.out.println("Điểm trung bình :" +diemtrungbinh);
    System.out.println("Tuổi :" +tuoi);
    System.out.println("Lop :" +lop);
}
public void hocbong(){
    if(diemtrungbinh>=8)
        System.out.println("Đủ điều kiện nhận học bổng :");
    else
        System.out.println("Không đủ điều kiện nhận học bổng");
    }
}


package Assignment3;

import Session2.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        ArrayList<String> stringArray=new ArrayList<>();
        ArrayList<PhanSo> frArray=new ArrayList<>();
        frArray.add(new PhanSo(1,2));
        frArray.add(new PhanSo(2,3));
        frArray.add(new PhanSo(3,4));

        for (int i=0;i<=frArray.size();i++){
            frArray.get(i).inRaPhanSo();
        }
        for (PhanSo fr:frArray){
            fr.inRaPhanSo();
        }

    }
}

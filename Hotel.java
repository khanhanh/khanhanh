package baithi;


import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void EnterHotel(String name , String location, String ownerName){

    }
    public void InforHotel(){
        System.out.println(" Chi tiết khách sạn");
        System.out.println("Tên"+getName());
        System.out.println("Vị trí"+getLocation());
        System.out.println("Tên sở hữu"+getOwnerName());
    }

    public void EnterHotel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập thông tin");

        System.out.println(" Nhập tên");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println(" Vị trí");
        this.setLocation(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Tên sở hữu");
        this.setOwnerName(scanner.hasNext()?scanner.nextLine():"");



    }
}



package Assignment3;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class PhanSo {

    public int tu,mau;

    public ArrayList USC;

    public PhanSo(ArrayList USC) {
        this.USC = USC;
    }

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void NhapVaoPhanSo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập tử số:");
        this.setTu(scanner.hasNextInt()?scanner.nextInt():1);

        System.out.println("Mời bạn nhập mẫu số :");
        this.setMau(scanner.hasNextInt()?scanner.nextInt():1);
    }
    public void inRaPhanSo(){
        if (this.getMau()>0)
        {
            System.out.println(this.getTu()+"/"+this.getMau());
        }
        else
            System.out.println("Mời bạn nhập lại phân số");
    }

    public int USCLN()
    {
        int usc =1;
        int absTuSo=Math.abs(this.getTu());
        int absMauSo=Math.abs(this.getMau());

        for (int i=2;i<=Math.min(absTuSo,absMauSo);i++){
            if (absTuSo%i==0 && absMauSo%i==0){
                usc=i;
            }
        }
        return usc;
    }

    public void rutGon()
    {
        int usc=this.USCLN();
        this.setTu(this.getTu()/usc);
        this.setMau(this.getMau()/usc);
        System.out.println("Phân số sau khi được rút gọn: "+getTu()+"/"+getMau());
    }
    public void NghichDaoPS(){
        int tmp=this.getMau();
        this.setMau(this.getTu());
        this.setTu(tmp);
    }

    //cong PS
    public void CongPs(PhanSo ps2)
    {
        int AddTuSo=this.getTu()*ps2.getMau()+this.getMau()*ps2.getTu();
        int AddMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(AddTuSo,AddMauSo);
        result.rutGon();
        System.out.println("Tổng 2 phân số:" +result.getTu()+"/"+result.getMau());
    }
    public void truPs(PhanSo ps2)
    {
        int SubTuSo=this.getTu()*ps2.getMau()-this.getMau()*ps2.getTu();
        int SubMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(SubTuSo,SubMauSo);
        result.rutGon();
        System.out.println("Hiệu 2 Phân số:" +result.getTu()+"/"+result.getMau());
    }
    public void nhanPs(PhanSo ps2)
    {
        int MulTuSo=this.getTu()*ps2.getTu();
        int MulMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(MulTuSo,MulMauSo);
        result.rutGon();
        System.out.println("nhân 2 phân số: "+result.getTu()+"/"+result.getMau());
    }
    public void div(PhanSo ps2){
        if(ps2.getTu() == 0){
            System.out.println("Không thể chia ");
            return;
        }
        int DivTuSo = this.getTu()*ps2.getMau();
        int DivMauSo = this.getMau()*ps2.getTu();

        PhanSo result = new PhanSo();
        result.rutGon();

        System.out.println("nhân 2 phân số:" + result.getTu()
                +"/"+result.getMau());
    }


}

package Entity;

import java.io.Serializable;


public class bangDiem implements Serializable{
    public double diem;
    private sinhVien sv;
    private monHoc mh;

    public bangDiem() {
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }


    public monHoc getMh() {
        return mh;
    }

    public void setMh(monHoc mh) {
        this.mh = mh;
    }

    public sinhVien getSv() {
        return sv;
    }

    public void setSv(sinhVien sv) {
        this.sv = sv;
    }
    public String getDiemchu(){
        if(diem<5){
            return "D";
        }
        else if(diem<7){
            return "C";
        }
        else if(diem<7.8){
            return "B";
        }
        else if(diem<8.4){
            return "B+";
        }        
        return "A";
    }
    public String getDiembon(){
        if(diem<5){
            return "2";
        }
        else if(diem<7){
            return "2.5";
        }
        else if(diem<7.8){
            return "3";
        }
        else if(diem<8.4){
            return "3.5";
        }        
        return "4";
    }
    public bangDiem(double diem, sinhVien sv, monHoc mh) {
        this.diem = diem;
        this.sv = sv;
        this.mh = mh;
    }

//    public Object[] toArray()
//    {
//        return new Object[]{sv.getMaSV(),sv.getHo()+" "+sv.getTen(),mh.getTenMon()
//            ,diem};
//    }
    
}


package Entity;


public class sinhVien extends nguoi implements java.io.Serializable{
    public String maSV;
    public  String lop;

    public sinhVien(String maSV, String lop, String ho, String ten, String diaChi) {
        super(ho, ten, diaChi);
        this.maSV = maSV;
        this.lop = lop;
    }
    
    public sinhVien() {
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public Object[] toArray(){
        return new Object[]{maSV,ho,ten,diaChi,lop};
    }
    
}


package Entity;

public class monHoc implements java.io.Serializable{
   public String maMon;
   public String tenMon;
   public int soDonviht;

    public monHoc(String maMon, String tenMon, int soDonviht) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soDonviht = soDonviht;
    }

    public monHoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getSoDonviht() {
        return soDonviht;
    }

    public void setSoDonviht(int soDonviht) {
        this.soDonviht = soDonviht;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    
    public Object[] toArray()
    {
        return new Object[]{maMon,tenMon,soDonviht};
    }
}

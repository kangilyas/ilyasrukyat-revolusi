package dasar;

public class Rumah {
  
  String alamat_rumah;
  public void setAlamat (String x) {
    alamat_rumah=x;}
  }
  public class Rumah {
    public static void main (String args[]){
      Rumah r=new Rumah();
      r.setAlamat("Alamat saya di Jalan Masa Depan");
      System.out.println(r.alamat_rumah);
        }
  }

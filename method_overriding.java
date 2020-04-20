class Nama{
 public void Sapa(){
  System.out.println("Ilyas Rukyat");
 }
 public static void main(String [] args){
  Siapa ss;
  Nama nn;
  ss = new Siapa();
  nn = new Nama();
  
  ss.Sapa();//memanggil method Sapa() pada class Siapa
  nn.Sapa();//memanggil method Sapa() pada class Nama
 }
}
class Siapa extends Nama{
 //Method Sapa() pada class Nama di override
 public void Sapa(){
  System.out.println("Arif Fahmi");
 }
}


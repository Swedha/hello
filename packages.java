package weapons;
/* File name : arms.java */
public class arms implements Ammo{
public void sniper(){
   System.out.println("Magnum Sniper");
 }
  public void rifle(){
  System.out.println("Sub_Machinegun");
 }
  public int noOfBullets(){
 return 0;
}
public static void main(String args[]){
  arms m = new arms();
  m.sniper();
  m.rifle();
 }
}
//Author: yetkinsln
public class main {
    
public static void main(String[] args) {
        javelin jav = new javelin();
    
       long x = System.currentTimeMillis();
       
       jav.start();
       
       x = System.currentTimeMillis() - x;
       
       jav.situation();
       System.out.println("Ping: " + x + " ms");
}
 
}

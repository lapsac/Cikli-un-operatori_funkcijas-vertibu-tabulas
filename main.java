import java.util.Scanner;
public class Main {
// test 1 neizdevās jo sistēma uzrāda 0 kā negatīvu. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    double x, y, xs, xg, sol;
    try{
		System.out.println("from:");
		  xs=sc.nextDouble();
    System.out.println("To:");
    	xg=sc.nextDouble(); 
    System.out.println("solis:");
		  sol=sc.nextDouble();	
  sc.close();
      }
    catch(Exception ex){
      System.out.print("input-output error");
        return;
          }
   for(x=xs; x<=xg+sol/2; x=x+sol){
    if (Math.abs(3*x-6)<0.000001 || x<0){
      System.out.printf("%.2f\tnot defined%n", x);
        }
    else{
      y=Math.sqrt(x)/(3*x-6);
        System.out.printf("%.2f\t%.2f%n", x, y); 
          }
         }
	}
}

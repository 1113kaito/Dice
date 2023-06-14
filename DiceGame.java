import java.util.Random;
import java.util.Scanner;
class DiceGame{
    public static void main(String[] args){
        Random ran = new Random();
	Scanner scanner = new Scanner(System.in);
        int rani1 = ran.nextInt(5)+1;
        int rani2 = ran.nextInt(5)+1;
	System.out.println("What is your name?");
        System.out.print(">");
        String name = scanner.next();
	System.out.println("Hello,"+name+"!");
        System.out.println("Rolling dice...");
        System.out.println("Die 1:"+rani1);
        System.out.println("Die 2:"+rani2);
        System.out.println("Total value:"+(rani1+rani2));
	 if(rani1+rani2 >=7){
            System.out.println(name+" won!");
        }else{
            System.out.println(name+" lost!");
        }
    }
}

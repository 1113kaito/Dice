import java.util.Random;

class DiceGame{
    public static void main(String[] args){
        Random ran = new Random();
        int rani1 = ran.nextInt(5)+1;
        int rani2 = ran.nextInt(5)+1;
        System.out.println("Rolling dice...");
        System.out.println("Die 1:"+rani1);
        System.out.println("Die 2:"+rani2);
        System.out.println("Total value:"+(rani1+rani2));
	 if(rani1+rani2 >=7){
            System.out.println("You won");
        }else{
            System.out.println("You lost");
        }
    }
}

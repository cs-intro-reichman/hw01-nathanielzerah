import java.util.Random;

public class Gen3 {
    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a >= b) {
            System.out.println("Switch the numbers");
        }
        Random choose = new Random();
        int x1 = choose.nextInt(b - a) + a;
        int x2 = choose.nextInt(b - a) + a;
        int x3 = choose.nextInt(b - a) + a;
        int mini = Math.min(x1 , Math.min(x2 , x3));
	    //I didn't succeed with the method we saw in class
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println("The minimal generated number was " + mini);
    }
}

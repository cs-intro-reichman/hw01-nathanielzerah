public class Gen3 {
    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a > b) {
            System.out.println("Switch the numbers");
        }
        Double x1 = (Math.random());
        int r1 = (int) (x1 * (b - a) + a);
        Double x2 = (Math.random());
        int r2 = (int) (x2 * (b - a) + a);
        Double x3 = (Math.random());
        int r3 = (int) (x3 * (b - a) + a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        int mini = Math.min(r1 , Math.min(r2 , r3));
        System.out.println("The minimal generated number was " + mini);
    }
}

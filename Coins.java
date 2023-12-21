public class Coins {
    public static void main (String[] args){
        int x = Integer.parseInt(args[0]);
        int quarters;
        int remainingCents = x % 25;
        if (remainingCents == 0) {
           quarters = x/25;
            System.out.println("Use " + quarters + " quarters");
        }
        if (remainingCents > 0) {
            quarters = (x - remainingCents)/25;
            System.out.println("Use " + quarters + " quarters and " + remainingCents + " cents") ;
        }
    }
}

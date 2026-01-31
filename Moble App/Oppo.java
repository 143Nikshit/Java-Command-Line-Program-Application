public class Oppo{
    public void printThanks()
    {
        System.out.print("Thanks for Buying : ");
    }
}

class Reno9 extends Oppo{
    public void printThanks()
    {
        super.printThanks();
        System.out.println("Reno 9");
    }
}
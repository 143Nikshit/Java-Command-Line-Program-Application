import java.util.Scanner;
class CabDriver{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            OLA ola = new OLA();
             System.out.println("============================================");
             System.out.println("              Welcome to OLA");
             System.out.println("============================================");
             System.out.println("Press 1 : To Book Mini Cab");
             System.out.println("Press 2 : To Book Sedan Cab");
             System.out.println("Press 3 : To Book Luxry Cab");
             System.out.println("Choose your Ride...");

             Cab cab = null;
             while(cab == null)
             {
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1 : 
                    {
                        cab = ola.storeCabRef(new Mini());
                        ola.cab.printThanks();
                        break;
                    }
                    case 2 : 
                    {
                        cab = ola.storeCabRef(new Sedan());
                        ola.cab.printThanks();
                        break;
                    }
                    case 3 : 
                    {
                        cab = ola.storeCabRef(new Luxry());
                        ola.cab.printThanks();
                        break;
                    }
                    default :
                    {
                        System.err.print("Choose valid Ride... \n ");
                        System.out.println("============================================");
                        System.out.println("              Welcome to OLA");
                        System.out.println("============================================");
                        System.out.println("Press 1 : To Book Mini Cab");
                        System.out.println("Press 2 : To Book Sedan Cab");
                        System.out.println("Press 3 : To Book Luxry Cab");
                        System.out.println("Choose your Ride...");
                    }
                }
             }
        }
}
import java.util.Scanner;
public class MobileDriver {

    public static void getSwitch(String phone)
    {
        System.out.println("Select Brand Phone "+ phone);
    }
    public static void main(String[] args) {
        Mobile m = new Mobile();
        System.out.println("==========================================");
        System.out.println("         International Mobile Shop");
        System.out.println("==========================================");
        System.out.println("******** SELECT THE BRAND NAME ***********");
        System.out.println("Press Iphone : For Buying Iphone Mobile");
        System.out.println("Press Samsung : For Buying Samsung Mobile");
        System.out.println("Press Oppo : For Buying Oppo Mobile");
        System.out.println("Press Vivo : For Buying Vivo Mobile");
        
        Scanner r = new Scanner (System.in);
        Mobile  mobile = null;
        while(mobile == null)
        {
            String brandchoice = r.nextLine().toLowerCase();
            switch (brandchoice) 
            {
                case "iphone":{
                    System.out.println("---------------------------------");
                    System.out.println("        Choose the model");
                    System.out.println("---------------------------------");
                    System.out.println("=> Iphone 17pro Max ");
                    System.out.println("=> Iphone 18pro Max ");
                    System.out.println("=> Iphone 16pro  ");
                    
                    mobile = m.storePhoneRef(new Iphone());
                    mobile.iphone.printThanks();
                    // System.out.println("Thanks for buying Iphone");

                    break;
                }
                case "samsung":{
                    System.out.println("Thanks for buying Samsung");
                    break;
                }
                case "oppo":{
                    System.out.println("Thanks for buying Oppo");
                    break;
                }
                case "vivo":{
                    System.out.println("Thanks for buying Vivo");
                    break;
                }
    
                default:{
                    System.err.println("Choose valid Model... ");
                    break;
                }

            }break;
        }
    }
}

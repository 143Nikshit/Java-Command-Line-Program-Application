import java.util.Scanner;
public class MobileDriver {
    static Oppo createOppo(Oppo oppo)
	    {
		return oppo;
	    }
    static Vivo createVivo(Vivo vivo)
	    {
		return vivo;
	    }
    static Samsung createSamsung(Samsung samsung)
	    {
		return samsung;
	    }
    static Iphone createIphone(Iphone iphone)
	    {
		return iphone;
	    }
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("    Welcome To International Mobile Shop");
        System.out.println("================================================");
        System.out.println("Press Oppo : To By New Oppo Phone");
        System.out.println("Press Samsung : To By New Samsung Phone");
        System.out.println("Press Vivo : To By New Vivo Phone");
        System.out.println("Press Iphone : To By New Iphone Phone");

        Mobile ms = null;
        while(ms == null)
        {
            String brandchoice = sc.nextLine().toLowerCase();
            switch(brandchoice)
            {
                case "oppo":
                    {
                        System.out.println("-------------------------------------");
                        System.out.println(".....Choose Your Model.....");
                        System.out.println(" => Oppo Reno 9");
    		            System.out.println(" => Oppo Reno 10");
    		            System.out.println(" => Oppo Reno 11");
    		            System.out.println("Type Your Oppo Model: ");
    		            System.out.println("-------------------------------------");

                        Oppo oppo = null;
                        while (oppo == null) 
                        {
                            String choice1 = sc.nextLine().toLowerCase();
                            switch(choice1)
                            {
                                case "oppo reno 9":
                                    {
                                        oppo = createOppo(new OppoReno9());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        break;
                                    }
                                case "oppo reno 10":
                                    {
                                        oppo = createOppo(new OppoReno10());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        break;
                                    }
                                case "oppo reno 11":
                                    {
                                        oppo = createOppo(new OppoReno11());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        break;
                                    }
                                
                            
                                default:
                                     System.out.println("-------------------------------------");
                                     System.out.println(".....Choose Your Model.....");
                                     System.out.println(" => Oppo Reno 9");
                                     System.out.println(" => Oppo Reno 10");
                                     System.out.println(" => Oppo Reno 11");
                                     System.out.println("Type Your Oppo Model: ");
                                     System.out.println("-------------------------------------");
                                    break;
                                }
                            }

                    }
                case "vivo" :
                    {
                       System.out.println("-------------------------------------");
                        System.out.println(".....Choose Your Model.....");
                        System.out.println(" => Vivo T1");
    		            System.out.println(" => Vivoplus");
    		            System.out.println(" => Vivox200");
    		            System.out.println("Type Your Vivo Model: ");
    		            System.out.println("-------------------------------------");

                        Vivo vivo = null;
                        while (vivo == null) 
                        {
                            String choice1 = sc.nextLine().toLowerCase();
                            switch(choice1)
                            {
                                case "vivoT1":
                                    {
                                        vivo = createVivo(new VivoT1());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        break;
                                    }
                                case "Vivoplus":
                                    {
                                        vivo = createVivo(new Vivovplus());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        break;
                                    }
                                case "Vivox200":
                                    {
                                        vivo = createVivo(new Vivox200());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        break;
                                    }
                                
                            
                                default:
                                     System.out.println("-------------------------------------");
                                     System.out.println(".....Choose Your Model.....");
                                     System.out.println(" => Vivo T1");
                                     System.out.println(" => Vivoplus");
                                     System.out.println(" => Vivox200");
                                     System.out.println("Type Your Vivo Model: ");
                                     System.out.println("-------------------------------------");
                                    break;
                                }
                            }

                    }
                case "samsung" :
                    {
                        System.out.println("-------------------------------------");
                        System.out.println(".....Choose Your Model.....");
                        System.out.println(" => Samsung s23");
    		            System.out.println(" => Samsung s24");
    		            System.out.println(" => Samsung s25");
    		            System.out.println("Type Your Samsung Model: ");
    		            System.out.println("-------------------------------------");

                        Samsung samsung = null;
                        while (samsung == null) 
                        {
                            String choice1 = sc.nextLine().toLowerCase();
                            switch(choice1)
                            {
                                case "s23":
                                    {
                                        samsung = createSamsung(new s23());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                case "s24":
                                    {
                                        samsung = createSamsung(new s24());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                case "s25":
                                    {
                                        samsung = createSamsung(new s25());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                
                            
                                default:
                                     System.out.println("-------------------------------------");
                                     System.out.println(".....Choose Your Model.....");
                                     System.out.println(" => Samsung s23");
    		                         System.out.println(" => Samsung s24");
    		                         System.out.println(" => Samsung s25");
    		                         System.out.println("Type Your Samsung Model: ");
    		                         System.out.println("-------------------------------------");
                                    break;
                                }
                            }

                    }
                case "iphone" :
                    {
                        System.out.println("-------------------------------------");
                        System.out.println(".....Choose Your Model.....");
                        System.out.println(" => Samsung s23");
    		            System.out.println(" => Samsung s24");
    		            System.out.println(" => Samsung s25");
    		            System.out.println("Type Your Samsung Model: ");
    		            System.out.println("-------------------------------------");

                        Samsung samsung = null;
                        while (samsung == null) 
                        {
                            String choice1 = sc.nextLine().toLowerCase();
                            switch(choice1)
                            {
                                case "s23":
                                    {
                                        samsung = createSamsung(new s23());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                case "s24":
                                    {
                                        samsung = createSamsung(new s24());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                case "s25":
                                    {
                                        samsung = createSamsung(new s25());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        break;
                                    }
                                
                            
                                default:
                                     System.out.println("-------------------------------------");
                                     System.out.println(".....Choose Your Model.....");
                                     System.out.println(" => Samsung s23");
    		                         System.out.println(" => Samsung s24");
    		                         System.out.println(" => Samsung s25");
    		                         System.out.println("Type Your Samsung Model: ");
    		                         System.out.println("-------------------------------------");
                                    break;
                                }
                            }

                    }
                default :
                {
                    System.err.println("Please Enter a valid Input ");
                    break;
                }
            }
        }

    }
}

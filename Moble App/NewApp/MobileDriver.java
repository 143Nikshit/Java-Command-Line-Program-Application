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
    static String readLine(Scanner sc) {
        if (!sc.hasNextLine()) {
            System.err.println("No input available. Exiting.");
            System.exit(1);
        }
        return sc.nextLine();
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
            String brandchoice = readLine(sc).toLowerCase();
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
                            String choice1 = readLine(sc).toLowerCase();
                            switch(choice1)
                            {
                                case "oppo reno 9":
                                    {
                                        oppo = createOppo(new OppoReno9());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "oppo reno 10":
                                    {
                                        oppo = createOppo(new OppoReno10());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "oppo reno 11":
                                    {
                                        oppo = createOppo(new OppoReno11());
                                        mobile.storeOppoRef(oppo);
                                        mobile.oppo.printThanks();
                                        ms = mobile;
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
                            }break;
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
                            String choice2 = readLine(sc).toLowerCase();
                            switch(choice2)
                            {
                                case "vivo t1":
                                    {
                                        vivo = createVivo(new VivoT1());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "vivoplus":
                                    {
                                        vivo = createVivo(new Vivovplus());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "vivox200":
                                    {
                                        vivo = createVivo(new Vivox200());
                                        mobile.storeVivoRef(vivo);
                                        mobile.vivo.printThanks();
                                        ms = mobile;
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

                    }break;

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
                            String choice3 = readLine(sc).toLowerCase();
                            switch(choice3)
                            {
                                case "s23":
                                    {
                                        samsung = createSamsung(new s23());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "s24":
                                    {
                                        samsung = createSamsung(new s24());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "s25":
                                    {
                                        samsung = createSamsung(new s25());
                                        mobile.storeSamsungRef(samsung);
                                        mobile.samsung.printThanks();
                                        ms = mobile;
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

                    }break;
                case "iphone" :
                    {
                        System.out.println("-------------------------------------");
                        System.out.println(".....Choose Your Model.....");
                        System.out.println(" => I15pro");
    		            System.out.println(" => Iphone 16pro");
    		            System.out.println(" => Iphone 17pro");
    		            System.out.println("Type Your Iphone Model: ");
    		            System.out.println("-------------------------------------");

                        Iphone iphone = null;
                        while (iphone == null) 
                        {
                            String choice4 = readLine(sc).toLowerCase();
                            switch(choice4)
                            {
                                case "i15pro":
                                    {
                                        iphone = createIphone(new I15pro());
                                        mobile.storeIphoneRef(iphone);
                                        mobile.iphone.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "i16pro":
                                    {
                                        iphone = createIphone(new I16pro());
                                        mobile.storeIphoneRef(iphone);
                                        mobile.iphone.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                case "s25":
                                    {
                                        iphone = createIphone(new I17pro());
                                        mobile.storeIphoneRef(iphone);
                                        mobile.iphone.printThanks();
                                        ms = mobile;
                                        break;
                                    }
                                
                            
                                default:
                                     System.out.println("-------------------------------------");
                                     System.out.println(".....Choose Your Model.....");
                                     System.out.println(" => I15pro");
    		                         System.out.println(" => Iphone 16pro");
    		                         System.out.println(" => Iphone 17pro");
    		                         System.out.println("Type Your Iphone Model: ");
    		                         System.out.println("-------------------------------------");
                                    break;
                                }
                            }break;
                    }
                
                default :
                {
                    System.err.println("Please Enter a valid Input ");
                    System.out.println("================================================");
                    System.out.println("    Welcome To International Mobile Shop");
                    System.out.println("================================================");
                    System.out.println("Press Oppo : To By New Oppo Phone");
                    System.out.println("Press Samsung : To By New Samsung Phone");
                    System.out.println("Press Vivo : To By New Vivo Phone");
                    System.out.println("Press Iphone : To By New Iphone Phone");
                    break;
                }
            }
        }

    }
}

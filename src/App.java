import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        int[]array = new int[20];
        int Val = 0;
        
    

        // Start loop villkor för att köra är användaren inte väljer 4
        while(Val != 4){
            System.out.println("-------MENY-------");
            System.out.println("1.Boka Plats");
            System.out.println("2.Visa lediga platser");
            System.out.println("3.Visa Vinst");
            System.out.println("4.avsluta");
            Val = tb.nextInt();
            if (Val==1){
                System.out.println("Ange födelsedatum");
                int pnr = tb.nextInt();
                System.out.println("Ange sittplats (0-19)");

                int plats = tb.nextInt();
                System.out.println("------------------");
                System.out.println("Du har bokad plats "+plats);
                
            if(array[plats]==0){
            array[plats] = pnr;
            

            }
            else if(array [plats]!=0){
                System.out.println("------------------");
                System.out.println("Platsen är tyvär bokad");
                
            }

            }
            else if (Val==2) {

                for(int i = 0;i<array.length;i++){
                   
                    
                    // OM element på plats i är 0 skriv att den är inte tagen 
                    if (array==0){
                        System.out.println("------------------");
                        System.out.println("Plats "+ i +" är inte tagen");
                    }
                    else if(0){
                        System.out.println("platsen är tagen");
                    }

                }

            }
            else if (Val==3){


            }

            else if (Val==4){


            }

        // Slut loop
        }
    }
}

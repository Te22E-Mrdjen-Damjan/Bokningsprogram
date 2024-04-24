
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

            else if(array[plats]!=0){
                System.out.println("------------------");
                System.out.println("Platsen är tyvär bokad");
                
            }

            }
            //Se lediga platser
            else if (Val==2) {


                for(int i = 0;i<array.length;i++)
                {
               
                    if(array[i]==0){
                    System.out.println("Platsen "+i+" är inte tagen");
                    }
                    else if(array[i]!= 0){

                    System.out.println("platsen "+i+" är tagen");

                    }
                }
        // Slut loop
        }
        //Beräkning av vinst
        else if (Val==3){

            int Vinst = 0;
            int biljettpris = 300;

                for(int i = 0;i<array.length;i++){

                    if (array[i]!=0){

                    Vinst = Vinst + biljettpris;
                    }
                
                }

            System.out.println("------------------");
            System.out.println("vinsten är "+Vinst+"kr");
            }
        }
    }
}

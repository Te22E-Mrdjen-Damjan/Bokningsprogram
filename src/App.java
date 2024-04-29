//Import scanner
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        int[]array = new int[20];
        int Val = 0;
        int ValBokaAvboka = 0;

        // Start loop villkor för att köra är användaren inte väljer 4
        while(Val != 4){
            //meny
            System.out.println("-------MENY-------");
            System.out.println("1.Boka Plats/Avboka Plats");
            System.out.println("2.Visa lediga platser");
            System.out.println("3.Visa Vinst");
            System.out.println("4.avsluta");
            Val = tb.nextInt();
                //If sats för att boka eller avboka
                if (Val==1){
                    //Meny för att antingen boka eller avboka
                    System.out.println("------------------");
                    System.out.println("Vänligen välj ett av alternativen");
                    System.out.println("1.Boka");
                    System.out.println("2.Avboka");
                    ValBokaAvboka = tb.nextInt();
                    //Val för att boka
                    if (ValBokaAvboka == 1){ 
                        System.out.println("------------------");
                    System.out.println("Ange födelsedatum");
                    int pnr = tb.nextInt();
                    System.out.println("------------------");
                    System.out.println("Ange sittplats (0-19)");

                    int plats = tb.nextInt();
                    
                    //kodblock för att boka plats eller skriva ut att platsen är bokad
                    if(array[plats]==0){
                    array[plats] = pnr;
                    System.out.println("------------------");
                    System.out.println("Du har bokad plats "+plats);
                    }

                    else if(array[plats]!=0){
                        System.out.println("------------------");
                        System.out.println("Platsen är tyvär bokad");
                        }
                    }

                    
                    //Val för att avboka
                    else if(ValBokaAvboka == 2){
                        System.out.println("------------------");
                        System.out.println("Ange födelsedatum");
                        int födelsedatum = tb.nextInt();

                        for(int i = 0;i<array.length;i++){

                            if (födelsedatum == array[i]) {
                                
                                array[i]=0;
                                System.out.println("------------------");
                                System.out.println("Platsen är avbokad");
                            }

                        }

                    }
                    

                }
            //Se lediga platser
            else if (Val==2) {


                for(int i = 0;i<array.length;i++)
                {
                    //Kodblock för att se om platsen är ledig eller bokad
                    if(array[i]==0){
                        System.out.println("------------------");
                    System.out.println("Platsen "+i+" är ledig");
                    }
                    else if(array[i]!= 0){
                        System.out.println("------------------");
                    System.out.println("Platsen "+i+" är bokad");


                    }
                }
        // Slut loop
        }
        //Beräkning av vinst
        else if (Val==3){

            Double Vinst = 0.;
            Double biljettpris = 299.90;
                
                for(int i = 0;i<array.length;i++){

                    if (array[i]!=0){

                    Vinst = Vinst + biljettpris;
                    }
                
                }
                //skriver ut vinst
            System.out.println("------------------");
            System.out.println("vinsten är "+Vinst+"kr");
            }
        }
    }
}

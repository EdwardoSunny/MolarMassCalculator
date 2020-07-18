package MMC;
import java.util.Scanner;

public class MMCRunner {
    public static void main(String args[]){
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter your chemical compound here(ex. H2O): ");
        String inputtedChem = inputs.nextLine();
        MMC test = new MMC(inputtedChem);

        System.out.print(test);


    }
    
}
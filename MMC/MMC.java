import java.util.*;
public class MMC {
    private String Chem;

    public MMC(String chem) {
        Chem = chem;
    }

    public double getTotalMM() {
        double totalMolarMass = 0;
        int i = 0;
        while (i < Chem.length()) {
            List<Character> ChemSymbols = new ArrayList<>();
            for (char ch : Chem.toCharArray()) {
                ChemSymbols.add(ch);
            }


            int j = 0;
            while(j < Chem.length()){
                Chemical c = new Chemical(String.valueOf(Chem.charAt(j)));
                Character current = Chem.charAt(j);
                if (Character.isUpperCase(j)){
                    if (j == Chem.length()-2 && Character.isLowerCase(ChemSymbols.get(j + 1))){
                        Chemical twoLetters = new Chemical(Chem.substring(j,j+1));
                        totalMolarMass += twoLetters.findMolarMass();
                        Chem = Chem.replace(String.valueOf(Chem.charAt(j)), "");
                    }
                    else if (j != Chem.length()-2 && Character.islowerCase)
                }
            }


        }

    }

    @Override
    public String toString() {
        return "Your Chemical " + Chem +
                " has a net molar mass of " + getTotalMM();
    }
}

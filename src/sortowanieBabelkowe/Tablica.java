package sortowanieBabelkowe;

import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {
        //int[] tab = {10,9,8,7,6,5,4,3,2,1};
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int licznik = 0;
        boolean isSorted = true;
        System.out.println("Przed pętlą: ");

        System.out.println(Arrays.toString(tab));


        for(int i = 0; i < tab.length - 1 && isSorted; i++){

            isSorted = false;

            for(int j = 0; j < tab.length - i - 1; j++){
                if(tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                    licznik++;
                    isSorted = true;
                }

                licznik++;
            }
            licznik++;
        }


        System.out.println("\nPo przejściu pętli: ");
        System.out.println(Arrays.toString(tab));
        System.out.println("liczba operacji: " + licznik);
    }
}

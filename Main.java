import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        System.out.println("Lütfen Dizinin Boyutunu Giriniz: ");

        n = input.nextInt();

        int [] dizi= new  int[n];

        for(int i =0; i<dizi.length; i++){
            System.out.print((i+1)+". elemanı giriniz:");
            dizi[i]=input.nextInt();
        }

        Arrays.sort(dizi);

        for (int i:dizi){
            System.out.print(i+" ");
        }

    }
}
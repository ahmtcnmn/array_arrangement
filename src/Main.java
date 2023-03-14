import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int a=input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz.");
        int[] array=new int[a];
        for (int i=0;i<+a;i++){
            System.out.print((i+1)+". Eleman : ");
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        System.out.printf("Dizinin Sıralama :");
        for (int i: array){
            System.out.printf(i+" ");
        }


    }
}
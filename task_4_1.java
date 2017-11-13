import java.util.*;
public class task_4_1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Įveskite pirmojo masyvo ilgį");

        int n = scan.nextInt();

        System.out.println("Įveskite antrojo masyvo ilgį");

        int k = scan.nextInt();

        int[] arr_1 = new int[n];
        int[] arr_2 = new int[k];

        System.out.println("įveskite pirmojo masyvo elementus");

        for (int i = 0; i < n; i++)
        {                                   //masyvo užpildymas
            arr_1[i] = scan.nextInt();
        }

        System.out.println("įveskite antrojo masyvo elementus");

        for (int i = 0; i < k; i++)
        {                                   //masyvo užpildymas
            arr_2[i] = scan.nextInt();
        }

        System.out.println("Jūsų pirmasis masyvas: " + Arrays.toString(arr_1));
        System.out.println("Jūsų antrasis masyvas: " + Arrays.toString(arr_2));

        double sum_1 = 0;
        double sum_2 = 0;


        for(int i=0; i<arr_1.length; i++)
        {
            sum_1=sum_1+arr_1[i];
        }
        for(int i=0; i<arr_2.length; i++)
        {
            sum_2=sum_2+arr_2[i];
        }
        double avg_1 = sum_1/arr_1.length;
        double avg_2 = sum_2/arr_2.length;
        System.out.println("Pirmojo masyvo vidurkis " + avg_1);
        System.out.println("Antrojo masyvo vidurkis " + avg_2);
        System.out.println("Masyvų skirtumas" + (avg_1 - avg_2));

    }

}


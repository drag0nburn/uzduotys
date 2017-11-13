import java.util.*;
public class task_3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Įveskite masyvo ilgį");

        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("įveskite masyvo elementus");
        int temp;
        boolean sorted = false;

        for (int i = 0; i < n; i++)
        {                                   //masyvo užpildymas
            arr[i] = scan.nextInt();
        }

        System.out.println("Jūsų masyvas: " + Arrays.toString(arr));


        while (sorted == false) {
            sorted = true;


            for (int i = 0; i < arr.length - 1; i++) //praeiname kiekvieną masyvo elementą ir palyginame jį su kitu priekyje esančiu, jei jis didesnis sukeičiame vietomis
            {
                if (arr[i] > arr[i + 1])
                {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;

                }
            }


        }
        System.out.println("Surušiuotas masyvas: " + Arrays.toString(arr));
        }

    }


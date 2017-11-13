import java.util.Scanner;
public class task_3_1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dėmesio, c kintamasis turi būti didžiausias");
        System.out.println("Įveskite a");
        int a = scan.nextInt();
        System.out.println("Įveskite b");
        int b = scan.nextInt();
        System.out.println("Įveskite c");
        int c = scan.nextInt();

        if (a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Duotos kraštinės sudaro trikampį");
            if (a*a+b*b==c*c && a*a+b*b>c*c)
            {
                if (a*a+b*b==c*c)
                {
                    System.out.println("Duotosios kraštinės sudaro statųjį trikampį");
                }
                else
                    {
                        System.out.println("Duotosios kraštinės sudaro bukajį trikampį");
                    }
            }
            else
                {
                    System.out.println("Duotosios kraštinės sudaro smailųjį trikampį");
                }

        }
        else
            {
                System.out.println("Duotos kraštinės nesudaro trikampio");
            }

    }


}

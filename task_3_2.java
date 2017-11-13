import java.util.Scanner;
public class task_3_2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dėmesio, c kintamasis turi būti didžiausias");
        System.out.println("Įveskite a");
        double a = scan.nextInt();
        System.out.println("Įveskite b");
        double b = scan.nextInt();
        System.out.println("Įveskite c");
        double c = scan.nextInt();
        double p=(a+b+c)/2;
        double S=(p*(p-a)*(p-b)*(p-c));

        // Herono formulė rasti trikampio plotą S=kvadratinė šaknis iš (p(p-a)(p-b)(p-c)) //p=(a+b+c)/2

        if (a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Duotos kraštinės sudaro trikampį");
            if (a*a+b*b==c*c && a*a+b*b>c*c)
            {


                if (a*a+b*b==c*c)
                {
                    System.out.println("Duotosios kraštinės sudaro statųjį trikampį " + Math.sqrt(S));
                }
                else
                {
                    System.out.println("Duotosios kraštinės sudaro bukajį trikampį " + Math.sqrt(S));
                }
            }
            else
            {
                System.out.println("Duotosios kraštinės sudaro smailųjį trikampį " + Math.sqrt(S));
            }

        }
        else
        {
            System.out.println("Duotos kraštinės nesudaro trikampio");
        }

    }


}

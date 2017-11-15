public class Zmogus
{

       String vardas;
       Zmogus(String vardas)
        {
            this.vardas = vardas;
        }

        public static void main(String[] args)
        {
            Zmogus a[]=new Zmogus[3];
            Zmogus zmogus1 = new Zmogus("Lukas");
            Zmogus zmogus2 = new Zmogus("Matas");
            Zmogus zmogus3 = new Zmogus("Vidas");
            a[0]=zmogus1;
            a[1]=zmogus2;
            a[2]=zmogus3;

            for(int i=0; i<3; i++)
            {
                System.out.println(a[i].vardas);
            }

        }

}
//sukurti masyva kuriame butu bent trys zogus klases objektai ir atspausdinkite visus sukurtus zmones

//int[]c=[1,2,3,4]
//for(int x:c) {
    //print(x)
    //    }  x- yra elementas masyvo, c yra masyvas is c masyvo imam x ir su juo kazka darome
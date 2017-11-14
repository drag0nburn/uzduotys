public class task_4_2
{
    public static void main(String[] args)
    {
       for(int i=1; i<=1000; i++)//prasuka visus skaičius nuo 1-1000
       {
           if(i>1)
           {
               int sum=0;
               for(int a=i; a!=0; a--)//kiekvieną skaičių suka atgal ieskodamas daliklių kurie yra be liekanos (jei i=6, tai a=6,5,4,3,2,1)
               {

                   if(i%a==0 && a!=i)//jei skaičius dalinasi be liekanos ir nera lygus sau pačiam pridedame jį prie sum

                   {
                       sum=sum+a;

                   }
                   if(sum==i && a==1)//jeigu suma yra lygi i gaunam tobulą skaičių, a==1 reikalingas kad prasuktume visus a.
                   {
                       System.out.println("perfect "+sum);
                   }

               }

           }
       }
    }


}

package Uzduotis_11;

import java.util.*;

public class Main {



        static private boolean addPerson(Zmogus zmogus,Map<String,Set<Zmogus>> map)
        {
            if(map.containsKey(zmogus.getIdNo()))
            {
                Set<Zmogus> temp = map.get(zmogus.getIdNo());

                if(temp.contains(zmogus))
                {
                    System.out.println("Zmogus su tokiais duomenismis jau egzistuoja!");
                    return false;
                }
                else
                {
                    temp.add(zmogus);
                    return true;
                }
                //temp.add(zmogus);
                //return true;
            }
            else
            {
                Set<Zmogus> temp = new HashSet<>();
                temp.add(zmogus);
                map.put(zmogus.getIdNo(),temp);
                return true;
            }
        }

        static private void getPerson(String ssc,Map<String,Set<Zmogus>> map)
        {
            if(map.containsKey(ssc))
            {
                for(Zmogus i:map.get(ssc))
                {
                    System.out.println(i.FullName());
                }
            }
            else
            {
                System.out.println("Žmogus su tokiais duomenimis neegzistuoja.");
            }
        }

        static private void getAll(Map<String,Set<Zmogus>> map)
        {
            for (Set<Zmogus> i: map.values())
            {
                for(Zmogus j:i)
                {
                    System.out.println(j.FullName());
                }
            }
        }

        public static void main(String[] args)
        {
            Map <String,Set<Zmogus>> sarasas = new TreeMap<>();// vietoj set gal reiktu naudoti irgi map su pilnu vardu, ar gimimo metais, ar kokiais nors kitais dupmenimis kaip raktu.



        addPerson(new Zmogus("Antanas","Jonaitis","2514"),sarasas);
        addPerson(new Zmogus("Antanas","Lukaitis","2582"),sarasas);
        addPerson(new Zmogus("Jonas","Jonaitis","4564"),sarasas);
        addPerson(new Zmogus("Lukas","Pirmasis","4585"),sarasas);
        addPerson(new Zmogus("Lukas","Antrasis","4585"),sarasas);
        addPerson(new Zmogus("Povilas","Jonaitis","4454"),sarasas);
        addPerson(new Zmogus("Jonas","Aukstaitis","4568"),sarasas);
        for(Set<Zmogus> i:sarasas.values())
        {
            for(Zmogus j:i)
            {
                System.out.println(j.FullName());
            }
            System.out.println("********************************");
        }







        }
}



public class FindManyGene
{
   public String  findGeneSimple(String dna){

       String result = "";
       int startIndex = dna.indexOf("ATG");

       int currenIndex = dna.indexOf("TAA",startIndex+3);

       while(currenIndex !=-1)
       {
           if((startIndex - currenIndex) % 3 == 0)
           {
               return dna.substring(startIndex , currenIndex + 3);

           }
            else
                currenIndex = dna.indexOf("TAA",currenIndex + 3);
      }
      return "";

    }

      void  findSimpleGene()
   {
     String dna = "AATGCGTAATATGGT";
     System.out.println("DNA started is " +dna);
     String gene = findGeneSimple(dna);
     System.out.println(" Gene  is " +gene);

     String dna1 = "AATGCTAGGGTAATATGGT";
     System.out.println("DNA started is " +dna1);
     String gene1 = findGeneSimple(dna1);
     System.out.println(" Gene  is " +gene1);

     String dna2 = "ATCCTATGCTTCGGTGCTCTAATATGGT";
     System.out.println("DNA started is " +dna2);
     String gene2 = findGeneSimple(dna2);
     System.out.println(" Gene  is " +gene2);

     String dna3 = "TGTAA";
     System.out.println("DNA started is " +dna3);
     String gene3 = findGeneSimple(dna3);
     System.out.println(" Gene  is " +gene3);

    }
}


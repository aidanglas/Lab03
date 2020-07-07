
/**
 *
 * @author Aidan Glas
 */
public class app 
{

    public static void main(String[] args)
    {
        GenEdData gened = new GenEdData();
        
        //gened.contains("Writing");
        
        //System.out.println(gened.contains("Writing")); 
        //System.out.println(gened.contains("writing")); 

        if(gened.contains("Writing"))
        {
            System.out.println("Writing is on the GenEd table");
        }
        else 
        {
            System.out.println("Writing is not on the GenEd table");
        }
            
        if (gened.contains("writing"))
        {
            System.out.println("writing is not on the GenEd table");
        }
        else 
        {
            System.out.println("writing is not on the GenEd table");
        }
        
        GenEd gen = gened.find("abcd");
        if(gen == null) 
        {
            System.out.println("abcd is NOT on the GenEd table");  
        }
        else
        {
            System.out.println(gened);
        }
        
        GenEd gen1 = gened.find("GHW");
        if(gen1 == null)
        {
            System.out.println("GHW is not on the GenEd table");
        }
        else
        {
            System.out.println(gen1.toString());
        }
        
        GenEd gen2 = gened.find("International Cultures");
        if(gen2 == null)
        {
            System.out.println("International CUltures is not on the GenEd table");
        }
        else
        {
            System.out.println(gen2 .toString());
        }
    }
}

  
//        for(int i = 0; i < geneds.size(); i++)
//        {
//            GenEd ge = geneds.get(i);
//            System.out.println(geneds.get(i).getCode());
//        }
//    }
//    
//    public void requiredCreditsList(double minrequiredCredits)
//    {
//        for (int i = 0; i < geneds.size(); i++)
//        {
//            if (geneds.get(i).getRequiredCredits() > minrequiredCredits)
//            {
//                System.out.println(geneds.get(i).getRequiredCredits() + "has a higher credits then " + minrequiredCredits);
//            }
//        }
//    }
//    
//    public GenEd findCode(int tempcode)
//    {
//         for (int i = 0; i < geneds.size(); i++)
//        {
//            if(geneds.get(i).getCode() == tempcode)
//            {
//                return geneds.get(i);
//            }
//        }
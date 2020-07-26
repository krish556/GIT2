class CalculateInterests 
 {
     public void test()
     {
         Interest i=new Interest();
         //calculate simple interest
         double simple_interest=i.calculateSimpleInterest(2000,6,2);
         //calculate compound interest
         double compound_interest=i.calculateCompoundInterest(2000,6,2);
        
         
     }
 }
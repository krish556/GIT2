class Interest {
   
	 public double calculateSimpleInterest(float pat,float ri,float tp)
	{
		return (pat*ri*tp)/100;
	}

	  public double calculateCompoundInterest(double pat,double ri,double tp)
 {
	 return (pat*(Math.pow(1+ri/100,tp)));
 }
}
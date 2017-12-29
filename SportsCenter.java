public class SportsCenter implements SportCenter,Building{
	private double superface;
	private String intallationType;
	
	public SportsCenter(double superface,String intallationType){
		this.superface=superface;
		this.intallationType=intallationType;
	}
	public String getFacilitiesType(){return intallationType;}

	public double getSuperface(){return superface;}
}


	

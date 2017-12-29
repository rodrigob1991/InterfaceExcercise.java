public class OfficeBuilding implements Building{
	private int officesNumber;
	private double superface;
	
	public OfficeBuilding(int officesNumber,double superface){
		this.officesNumber=officesNumber;
		this.superface=superface;
	}
	
	public int getOfficesNumber(){return officesNumber;}
	
	public double getSuperface(){return superface;}
}

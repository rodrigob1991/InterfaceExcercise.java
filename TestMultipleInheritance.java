import java.util.ArrayList;
import java.util.Iterator;

public class TestMultipleInheritance{
	
	public static void main(String[]args){
		ArrayList<Building> arrayBuilding=new ArrayList<Building>();
		SportsCenter peñarol=new SportsCenter(42445.432,"Football");
		SportsCenter nacional=new SportsCenter(455646.2,"Football");
		OfficeBuilding globant=new OfficeBuilding(14,54546.4);
		Building danubio=new SportsCenter(8765.2,"Football");
		arrayBuilding.add(danubio);
		arrayBuilding.add(peñarol);
		arrayBuilding.add(globant);
		arrayBuilding.add(nacional);
		Iterator iterList=arrayBuilding.iterator();
		
		while(iterList.hasNext()){
			Building assis=(Building)iterList.next();

			if(assis instanceof SportsCenter){SportsCenter assis1=(SportsCenter)assis;
				System.out.println(assis1.getSuperface()+" "+assis1.getFacilitiesType());
			}
			else {OfficeBuilding assis2=(OfficeBuilding)assis; System.out.println(assis2.getSuperface()+" "+ assis2.getOfficesNumber());
			}
		}
			
	}
}
		
		
		

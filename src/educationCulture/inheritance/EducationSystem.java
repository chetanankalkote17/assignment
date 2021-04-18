package educationCulture.inheritance;

public class EducationSystem {

	public static void main(String[] args) {
		
		Graduation gd=new Graduation();
		gd.streams();
		gd.hscPercentage();
		gd.ageCriteria();
		
		System.out.println("************************************************************************************");
		
		Engineering eg=new Engineering();
		eg.streams();
		eg.ageCriteria();
		eg.hscPercentage();
		eg.typeOfEngineering();
		
		System.out.println("**************************************************************************************");
		
		ComputerScienceEngg cse=new ComputerScienceEngg();
		cse.streams();
		cse.hscPercentage();
		cse.ageCriteria();
		cse.typeOfEngineering();
		cse.subjects();
		

	}

}

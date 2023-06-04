package interfaceconcepts;

public class BGSCollege extends stateWise implements USUniversity,UKUniversity,IndiaUniversity  {

	@Override
	public void courseDuration() {
		System.out.println("BGS-MasterEducation method");
		
	}

//	@Override
//	public void arts() {
//
//		System.out.println("BGS-IndianEducation method");
//	}

	@Override
	public void science() {
		
		System.out.println("BGS-IndianEducation method");
	}

	@Override
	public void dentalCourse() {
		
		System.out.println("BGS-UKEducation method");
	}

	@Override
	public void computerScience() {
		System.out.println("BGS-USEducation method");
		
	}

	@Override
	public void informationTechnology() {
		System.out.println("BGS-USEducation method");
		
	}

	@Override
	public void businessManagement() {
		System.out.println("BGS-USEducation method");
		
	}

}
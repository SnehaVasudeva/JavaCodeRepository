package interfaceconcepts;

public class ChristCollege extends stateWise implements USUniversity,UKUniversity,IndiaUniversity {

	
@Override
public void courseDuration() {
	System.out.println("MasterEducation method");
	
}


@Override
public  static void arts() {

	System.out.println("Class Education method");
}

@Override
public void science() {
	
	System.out.println("IndianEducation method");
}

@Override
public void dentalCourse() {
	
	System.out.println("UKEducation method");
}

@Override
public void computerScience() {
	System.out.println("USEducation method");
	
}

@Override
public void informationTechnology() {
	System.out.println("USEducation method");
	
}

@Override
public void businessManagement() {
	System.out.println("USEducation method");
	
}

}


package interfaceconcepts;

public class TestMain {

	public static void main(String[] args) {
	ChristCollege ch=new ChristCollege();
	ch.courseDuration();
	//ch.arts();
	ch.science();
	ch.dentalCourse();
	ch.computerScience();
	ch.businessManagement();
	ch.informationTechnology();
	ch.courseMaterials();
ch.arts();
	
	BGSCollege bgs=new BGSCollege();
	bgs.courseDuration();
	//bgs.arts();
	bgs.science();
	bgs.dentalCourse();
	bgs.computerScience();
	bgs.businessManagement();
	bgs.informationTechnology();
	bgs.courseMaterials();
	
	stateWise st=new stateWise();
	st.courseMaterials();
	
	USUniversity us=new BGSCollege();
	us.businessManagement();
	us.informationTechnology();
	us.computerScience();
	us.courseDuration();

	}

}

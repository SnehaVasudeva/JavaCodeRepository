package assignments.strings;

public class Assignment8 {

	public static int stringVerify(String sName,String searchEle) {
		if(sName.contains(searchEle))
		{
			return 	sName.indexOf(searchEle);
		}
		else
			return -1;
		
				}

	public static void main(String[] args) {
String word="Hello Welcome";
String searchWord="come";
int num=stringVerify(word,searchWord);
System.out.println(num);
	}

}

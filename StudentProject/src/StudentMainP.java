import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMainP{

	public static void main(String[] args) {
		
		StudentP[] student= new StudentP[100];
		Map <Integer, Student> sDetails=new HashMap <Integer, Student>();
				 while(true) {
				 System.out.println("Hello! Let us know what would you like to do");
				 System.out.println("Enter 1 to see all the details, 2 to add, 3 to update and 4 to delete");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
			 switch (option) {
			 case 1:{
		System.out.println(sDetails);
		break;
			}
			 case 2:{
				 System.out.println("please enter the number of students to be added");
				 int num=scan.nextInt();
for(int i=1; i<=num;i++) {
	student[i]= new StudentP();
}
for(int i=1;i<=num;i++) {
				 System.out.println("please enter the id of student "+i);
				 student[i].setId(scan.nextInt());
				 System.out.println("please enter the name of student "+i);
				 student[i].setName(scan.next());
				 System.out.println("please enter the age of student "+i);
				 student[i].setAge(scan.nextInt());
				 System.out.println(student[i]);
				 //sDetails.put(1, student[i]);


}  
System.out.println(sDetails);

		break;
			 }
			 
	}
		}
	}}

	
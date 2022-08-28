import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
			
				Student s1=new Student();
				 Student s2=new Student();
				 Student s3=new Student();
				 HashMap <Integer, Student> sDetails=new HashMap <Integer, Student>();
				 s1.setName("Sarika");
				 s1.setAge(25);
				 s2.setName("Mokshan");
				 s2.setAge(30);
				 s3.setName("Disha");
				 s3.setAge(22);
				 sDetails.put(1, s1);
				 sDetails.put(2, s2);
				 sDetails.put(3, s3);
				 System.out.println("Hello! Let us know what would you like to do");
				 System.out.println("Enter 1 to see all the details, 2 to add, 3 to update and 4 to delete");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		int id;
			 switch (option) {
			 case 1:{

		System.out.println(sDetails);
		break;
			}
			 case 2:{
//				 System.out.println("please enter the id");
//				 id=scan.nextInt();
//				 System.out.println("please enter the name");
//				 name=scan.next();
//				 System.out.println("please enter the age");
//				 age=scan.nextInt();
//				 System.out.println("student details entered are id "+id+" name: "+name+" age: "+age);
		break;
			 }
			 case 3:{
				 System.out.println("please enter the id you want make changes to");
				 id=scan.nextInt();
		if(sDetails.containsValue(id)) {
			 System.out.println("yes");

		}break;

			 }
			 case 4:{
				 System.out.println("please enter the id which you want to delete");
				 id=scan.nextInt();

				 sDetails.remove(id);
				 System.out.println(sDetails);
				 break;

			 }
		}

		}
		}

	
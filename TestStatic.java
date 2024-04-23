//WAP to find no of objects created out of a class using static modifier

class Student{
	int rollNo;
	String name;
	static String university_Name = "KIIT University";
	static String section = "CSE 48";
	static int count = 0;
	
	Student (int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
}
class TestStatic{
	public static void main(String[] args){
		Student s1 = new Student(101, "Vikas");
		Student s2 = new Student(102, "Avinash");
		Student s3 = new Student(103, "Saira");
	
		System.out.println("Number of objects created = " + Student.count);

	}
}
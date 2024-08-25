package assignments;

public class This_Keyword {

	int age;
	double salary;
	String name;
	void employee_details(int age,double salary, String name)
	{
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
This_Keyword t1=new This_Keyword();
           t1. employee_details(45,7565.56, "sham");
System.out.println(t1.age);
System.out.println(t1.name);
System.out.println(t1.salary);
	}

}

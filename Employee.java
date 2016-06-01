import java.io.*;

public class Employee{
	
	private String eName;
	private int age;
	private int sal;
	
	public void setName() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee Name : ");
		eName = br.readLine();
		
	}
	
	public void setAge() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee Age : ");
		age = Integer.parseInt(br.readLine());
		
	}
	
	public void setSal() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee Salary : ");
		sal = Integer.parseInt(br.readLine());
		
	}
	
	public String getName(){
		
		return eName;
		
	}
	
	public int getAge(){
		
		return age;
		
	}
	
	public int getSal(){
		
		return sal;
		
	}
	
}

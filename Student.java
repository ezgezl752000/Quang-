package Student;
import java.util.Scanner;

public class Student {
	private String lastname , firstname;
	private String ID;
	private int d1, d2 , d3;
	private int tc1, tc2, tc3;
	private String grade;
	
	public Student(String lastname, String firstname, String iD, int d1,
			int d2, int d3, int tc1, int tc2, int tc3, String grade) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		ID = iD;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.tc1 = tc1;
		this.tc2 = tc2;
		this.tc3 = tc3;
		this.grade = grade;
	}

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public int getD1() {
		return d1;
	}



	public void setD1(int d1) {
		this.d1 = d1;
	}



	public int getD2() {
		return d2;
	}



	public void setD2(int d2) {
		this.d2 = d2;
	}



	public int getD3() {
		return d3;
	}



	public void setD3(int d3) {
		this.d3 = d3;
	}



	public int getTc1() {
		return tc1;
	}



	public void setTc1(int tc1) {
		this.tc1 = tc1;
	}



	public int getTc2() {
		return tc2;
	}



	public void setTc2(int tc2) {
		this.tc2 = tc2;
	}



	public int getTc3() {
		return tc3;
	}



	public void setTc3(int tc3) {
		this.tc3 = tc3;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void input(/*String lastname , String firstname, String ID,int d1,int d2 ,int d3,int tc1,int tc2,int tc3,String grade*/) {
		Scanner sc = new Scanner(System.in);
		lastname = sc.nextLine();
		firstname = sc.nextLine(); 
//		sc.nextLine();
		ID = sc.nextLine();
		d1 = sc.nextInt();
		d2 = sc.nextInt();
		d3 = sc.nextInt();
		tc1 = sc.nextInt();
		tc2 = sc.nextInt();
		tc3 = sc.nextInt();
		sc.nextLine();
		grade = sc.nextLine();
		sc.close();
	}
	
	public double average(){
		double x =  (double)(d1*tc1 + d2*tc2 +d3*tc3)/(tc1+tc2+tc3);
		return x;
	}
	
	public void xeploai(){
		double d  = average();
		if( d>= 8 ) 		System.out.println("Gioi");
		else if( d>= 7.5 )		System.out.println("Kha");
		else if( d>=6 )		System.out.println("Trung binh");
		else 		System.out.println("Yeu");

	}
	
//	public void output(/*String lastname , String firstname, String ID,int d1,int d2 ,int d3,int tc1,int tc2,int tc3,String grade*/) {
//		System.out.println(lastname);
//		System.out.println(firstname);
//		System.out.println(ID);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		System.out.println(tc1);
//		System.out.println(tc2);
//		System.out.println(tc3);
//		System.out.println(grade);
//
//	}
	
}
class Student {
	
	int roll;
	 int phone;
	String address;

	Student(int roll,int phone,String address){
	this.roll=roll;
	this.phone=phone;
	this.address =address;

	}
	void sam(){
	System.out.println("sam roll number is :" + roll + " "+ "Phone :" + " "+ "Address:" + address);
	}
	void John(){
	System.out.println("sam roll number is :" + roll + " "+ "Phone :" + " "+ "Address:" + address);
	}
}
class Stest{
	public static void main(String args[]){
	Student s = new Student(2,01755,"tmss");
	Student ss = new Student(3,017555,"bogra");
	s.sam();
	ss.John();
	}
}

	
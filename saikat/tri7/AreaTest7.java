import java.util.*;

class Area{
	
	int a;
	 int b;
	int result;


	void SetDim(){
	Scanner s,ss;
	s = new Scanner(System.in);
	a = s.nextInt();
	ss = new Scanner(System.in);
	b = ss.nextInt();

	
	}
	void getArea(){
	result = a*b;
	System.out.println("The area is :" + result);
	
	}
	
	
	
	
}
class AreaTest{
	public static void main(String args[]){
	Area a  = new  Area();
	a. SetDim();
	a.getArea();
	
	
	}
}

	
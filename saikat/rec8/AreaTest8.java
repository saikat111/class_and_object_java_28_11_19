import java.util.*;

class Area{
	
	int a;
	 int b;
	int area;
	Area(int a,int b){
	this.a = a;
	this.b= b;

	}

	
	int returnArea(){
	area = a*b;
	return area;

	
	}
	void print(){
	System.out.println("Area is "+ area);
	}
	
	
	
}
class AreaTest{
	public static void main(String args[]){

	Scanner s,ss;
	s = new Scanner(System.in);
	int aa = s.nextInt();
	ss = new Scanner(System.in);
	int bb = ss.nextInt();

	Area a  = new  Area(aa,bb);

	a.returnArea();
	a.print();
	
	
	}
}

	
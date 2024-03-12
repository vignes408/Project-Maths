import java.util.*;
class Maths{
  //addition
  public void add(int a,int b)
  {
    int sum=a+b;
    System.out.println("The Addtion is:"+sum);
  }
  
  //subtraction
  public static int sub(int a, int b){
    int res = Math.abs(a-b);
    return res;
  } 
  //multiply
  static int mul(int a,int b){
	  int c = a*b;
	return c;
   }
  //division
  Static double division(int a ,int b){
     return a/b;
  } 
  //modulus
  static int modu(int a, int b){
	  int modulo = a%b;
	  return modulo;
}
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
	static void menu(){
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		System.out.println("5.Mod");
		System.out.println("Enter Ur choice:");
  }

  do{
	  menu();
	  int m;
	  int a =sc.nextInt();
	  int b =sc.nextInt();
	  int ch = sc.nextInt();
	  switch(ch){
		  case 1:
			  add();
			  break;
		  case 2:
			  int s = sub(a,b);
			  System.out.println("Sub ="+s);
			  break;
		 case 3:
			  int s = mul(a,b);
			  System.out.println("Mul ="+s);
			  break;
		 case 4:
			  int s = division(a,b);
			  System.out.println("Div ="+s);
			  break;
	         case 5:
			  int s = modu(a,b);
			  System.out.println("mod ="+s);
			  break;
	}
	System.out.println("Do u want to continue say 0 or 1);
	int m = sc.nextInt();
  }while(m==1);


}

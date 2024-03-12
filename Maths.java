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

  public static void main(String args[]){
  }
}
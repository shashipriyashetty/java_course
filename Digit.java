import java.util.Scanner;
class Digit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for n");
int n=sc.nextInt();
if(0<=n&&n<=9){
  System.out.println("one");
  }
if(10<=n&&n<=99){
  System.out.println("two");
  }
if(100<=n&&n<=999){
  System.out.println("three");
  }
if(1000<=n&&n<=9999){
  System.out.println("four");
  }
if(10000<=n&&n<=99999){
  System.out.println("five");
  }
if(n>=100000){
  System.out.println("More than five");
  }
}
}

 
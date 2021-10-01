import java.util.Scanner;
class Month{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for n");
int n=sc.nextInt();
if(n>0&&n<=12){
  if(n==1){
  System.out.println("January");
  }
  if(n==2){
  System.out.println("February");
  }
  if(n==3){
  System.out.println("March");
  }
  if(n==4){
  System.out.println("April");
  }
  if(n==5){
  System.out.println("May");
  }
  if(n==6){
  System.out.println("June");
  }
  if(n==7){
  System.out.println("July");
  }
  if(n==8){
  System.out.println("August");
  }
  if(n==9){
  System.out.println("September");
  }
  if(n==10){
  System.out.println("October");
  }
  if(n==11){
  System.out.println("November");
  }
  if(n==12){
  System.out.println("December");
  }
}
else{
  System.out.println("Please enter number between 1 to 12");
}
}
}

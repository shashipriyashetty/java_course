import java.util.Scanner;
class Days{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for n");
int n=sc.nextInt();
if(n>0&&n<=7){
  if(n==1){
  System.out.println("Monday");
  }
  if(n==2){
  System.out.println("Sunday");
  }
  if(n==3){
  System.out.println("Saturday");
  }
  if(n==4){
  System.out.println("Friday");
  }
  if(n==5){
  System.out.println("Thursday");
  }
  if(n==6){
  System.out.println("Wednesday");
  }
  if(n==7){
  System.out.println("Tuesday");
  }
}
else{
  System.out.println("Please enter number between 1 to 7");
}
}
}

 
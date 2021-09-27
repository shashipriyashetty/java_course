class TernaryOperatorAssignment{
public static void main(String[] args){
int a=50;
int b=100;
int c=150;
int result=a>b?(a>c?a:c):(b>c?b:c);
System.out.println("Greatest of "+a+" " +b+ " and " + c +" is: "+result);
int result1=a<b?(a<c?a:c):(b<c?b:c);
System.out.println("Smallest of "+a+" " +b+ " and " + c +" is: "+result1);
}
}
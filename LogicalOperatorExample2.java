class LogicalOperatorExample2{
public static void main(String args[]){
int a=100;
int b=200;
System.out.println(a<b&&a++>b);
System.out.println("a:"+a);
System.out.println(a<b||++b!=a);
System.out.println("b:"+b);
}
}
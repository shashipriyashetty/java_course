class BitwiseOperatorExample1{
public static void main(String[] args){
int p=300;
int q=500;
System.out.println(p>q&&p++>q);
System.out.println("p:"+p);
System.out.println(p<=q&++p<q);
System.out.println("p:"+p);

System.out.println(p==q||++q<=p);
System.out.println("q:"+q);
System.out.println(p<=q|q++!=p);
System.out.println("q:"+q);

}
}
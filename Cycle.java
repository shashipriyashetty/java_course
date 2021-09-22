class Cycle{
String brand;
String color;
int price;

void riding(){
System.out.println(brand+" cycle is best for casual riding around the neighborhood");
}

public static void main(String args[]){
Cycle hero=new Cycle();
hero.brand="hero";
hero.color="red";
hero.price=15000;

hero.riding();
}
}

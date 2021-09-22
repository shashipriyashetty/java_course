
class Refrigerator{
String brand;
String DoorStyle;
int price;

void KeepFoodCold(){
System.out.println(brand+" "+DoorStyle+ " Refrigerator has all the goodness of a modish appliance, which keeps food cold and safe.");
}

public static void main(String args[]){
Refrigerator Samsung= new Refrigerator();
Samsung.brand="Samsung";
Samsung.DoorStyle="Single Door";
Samsung.price=18000;

Samsung.KeepFoodCold();
}
}
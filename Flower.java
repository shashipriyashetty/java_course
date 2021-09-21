class Flower{
String name;
String color;
int noOfPetals;

void bloom(){
System.out.println(color+" " +name+ " is blooming!!!");
}
void shedFragrance(){
System.out.println(color+" "+name+ " is shedding fragrance!!!");
}

public static void main(String args[]){
Flower rose=new Flower();
rose.name="rose";
rose.color="red";
rose.noOfPetals=18;

rose.bloom();
rose.shedFragrance();
}
}
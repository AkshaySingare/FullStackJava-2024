public class Circle{

public static void main(String x[]){

int radius,circum;

radius=Integer.parseInt(x[0]);
circum=2*radius;
float di=(radius*radius)*3.14f;

System.out.println("Circumference is " +circum);
System.out.println("Diameter is " +di);
}
}
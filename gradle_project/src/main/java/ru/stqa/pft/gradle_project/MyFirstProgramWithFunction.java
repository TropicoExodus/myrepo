package ru.stqa.pft.gradle_project;

public class MyFirstProgramWithFunction {

   public static void main (String [] args) {
      hello("world");
      hello("User Artem");

      double len = 5;
      System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

      double a = 5;
      double b = 7;
      System.out.println("Площадь прямуогольника со стороной " + a + " и " + b + " = " + area(a,b));

   }
   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
      }

   public  static  double area (double l) {
      return l * l;
   }

   public static double area (double a, double b) {
      return b * a;
   }

}

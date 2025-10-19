package classespackage;

public class Main {

     public static void main (String[] args) {

          Car first_car = new Car();
          first_car.makeBeBe(1990, "W220");
          first_car.model = "W220";
          first_car.year = 1990;
          System.out.println(first_car.model + " " + first_car.year);

          Car second_car = new Car();
          second_car.makeBeBe(1993,"W223");
          second_car.model = "W223";
          second_car.year = 1993;
          System.out.println(second_car.model + " " + second_car.year);

          Car third_car = new Car();
          third_car.makeBeBe(1982,"W123");
          third_car.model = "W123";
          third_car.year = 1982;
          System.out.println(third_car.model + " " + third_car.year);

          Car fourth_car = new Car();
          fourth_car.makeBeBe(1995,"W140");
          fourth_car.model = "W140";
          fourth_car.year = 1995;
          System.out.print(fourth_car.model + " " + fourth_car.year);

     }
}

package myapp.core;

public class Main1 {

    public static void main(String[] args) {
       // Instantiate a car
          Car myCar = new Car();
          myCar.setColour("red");
        //  myCar.colour = "red";
        //  myCar.make = "honda";
         // myCar.engineCapacity =2000;

          myCar.start();

          System.out.printf("The colour of my car is %S\n", myCar.getColour());

          myCar.setColour("bue")
          System.out.printf("changed of my car is %S\n", myCar.getColour());


          //instantiate another car
          Car myothercar = new Car();
          myothercar.colour = "silver";
          myothercar.make = "subaru";
          myothercar.engineCapacity =2500;

          myothercar.stop()


;




    }
    
}

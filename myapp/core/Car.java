package myapp.core;

//Class
public class Car implements Controllable{

  //propeties , memebers of the class
  private String colour;
  protected String make;
  private Integer engineCapacity;
  private Boolean started = false;
  private Integer startedSince;

  //constructor default
  public Car(){

    System.out.println("hello its me");
    this.colour = "red";
  }
  public Car(Integer Capacity){

    this.engineCapacity = Capacity;


  }

  public Car(String colour, String make){



  }


// Getter and setter , command shift p , source action

public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    if(!colour.equals("red"))
    this.colour = colour;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Integer getEngineCapacity() {
    return engineCapacity;
  }

  public void setEngineCapacity(Integer engineCapacity) {
    this.engineCapacity = engineCapacity;
  }

  public Boolean getStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }

  public Long getDrivingDuration(){
    if (this.isStarted())
         return (System.currentTimeMillis() - this.startedSince) / 1000;
         
         return (long) 1;

  }


  //Bheaviour method

public void start(){
  if(this.started){
    System.out.println("your car is running");
  }
  else {
    System.out.println("Vroom...");
    this.started  = true; 
    //since 0000 jan 1 1970
    this.startedSince = System.currentTimeMillis();

  }
}

public void stop(){
    if(!this.started){
        System.out.println("your car is not running");
      }
      else {
        System.out.println("Vroom...");
        this.started  = true; 


}






}

}
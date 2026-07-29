import org.junit.jupiter.api.Test;

public class CarTest {
    String color;
    String brand;
    boolean isDoorOpen=false;
    boolean isCarOff=false;

    @Test
    void move(){
        if (!isDoorOpen && !isCarOff){
            System.out.println("Car is moving...");
        }else{
            System.out.println("first close the door and turn on the car");
        }
    }

    @Test
    void turnOn(){
        this.isCarOff=false;
    }

    @Test
    void turnOff(){
        this.isCarOff=true;
    }

    @Test
    void openTheDoor(){
        this.isDoorOpen=true;
    }
}

package transport.road;
import transport.transport;
import transport.social;

public class trolleybus extends transport implements social{
    public trolleybus(String engine_type) {
        super(engine_type);
    }
    public void popularity(){
        System.out.println("Has middle popularity");
    }
}

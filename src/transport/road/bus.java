package transport.road;
import transport.transport;
import transport.social;

public class bus extends transport implements social{
    public bus(String engine_type) {
        super(engine_type);
    }
    public void popularity(){
        System.out.println("Has high popularity");
    }
}

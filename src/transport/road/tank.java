package transport.road;
import transport.transport;
import transport.military;

public class tank extends transport implements military{
    public tank(String engine_type) {
        super(engine_type);
    }
    public void weapon_type(){
        System.out.println("Armed with missiles");
    }
}

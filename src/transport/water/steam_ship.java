package transport.water;
import transport.transport;
import transport.social;
import transport.steam;

public class steam_ship extends transport implements social, steam{
    public steam_ship(String engine_type) {
        super(engine_type);
    }
    public void popularity(){
        System.out.println("Has low popularity");
    }
    public void steam_power(){
        System.out.println("Produces 3000 cubic meters per minute");
    }
}

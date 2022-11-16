package transport.railway;
import transport.transport;
import transport.steam;

public class steam_train extends transport implements steam{
    public steam_train(String engine_type) {
        super(engine_type);
    }
    public void steam_power(){
        System.out.println("Produces 5000 cubic meters per minute");
    }
}

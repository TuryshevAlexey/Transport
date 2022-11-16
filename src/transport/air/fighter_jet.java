package transport.air;
import transport.transport;
import transport.military;

public class fighter_jet extends transport implements military {
    public fighter_jet(String engine_type){
        super(engine_type);
    }
    public void weapon_type(){
        System.out.println("Armed with rockets");
    }
}

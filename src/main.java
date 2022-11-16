import transport.air.fighter_jet;
import transport.railway.steam_train;
import transport.road.bus;
import transport.road.tank;
import transport.road.trolleybus;
import transport.transport;
import transport.water.steam_ship;

public class main {
    public static void main(String[] args) {
        transport f = new fighter_jet("reactive");
        f.description();
        transport st = new steam_train("steam");
        st.description();
        transport b = new bus("gasoline");
        b.description();
        transport t = new tank("diesel");
        t.description();
        transport tr = new trolleybus("electric");
        tr.description();
        transport ss = new steam_ship("steam");
        ss.description();
    }
}

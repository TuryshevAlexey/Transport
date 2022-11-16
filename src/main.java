import transport.air.fighter_jet;
import transport.railway.steam_train;
import transport.road.bus;
import transport.road.tank;
import transport.road.trolleybus;
import transport.transport;
import transport.water.steam_ship;

public class main {
    public static void main(String[] args) {
        fighter_jet f = new fighter_jet("reactive");
        f.description();
        f.weapon_type();
        steam_train st = new steam_train("steam");
        st.description();
        st.steam_power();
        bus b = new bus("gasoline");
        b.description();
        b.popularity();
        tank t = new tank("diesel");
        t.description();
        t.weapon_type();
        trolleybus tr = new trolleybus("electric");
        tr.description();
        tr.popularity();
        steam_ship ss = new steam_ship("steam");
        ss.description();
        ss.popularity();
        ss.steam_power();
    }
}

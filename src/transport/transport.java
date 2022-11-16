package transport;

public class transport {
    String engine_type;

    public transport(String engine_type){
        this.engine_type = engine_type;
    }

    public void description(){
        System.out.println(this.getClass().getSimpleName() + " has " + this.engine_type + " engine");
    }
}

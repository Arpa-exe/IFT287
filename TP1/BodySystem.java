package tp1;

import java.util.ArrayList;

public class BodySystem {
    private String id, name, type;
    private ArrayList<BodyFlow> flows;

    public BodySystem(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.flows = new ArrayList<BodyFlow>();
    }
    public BodySystem(String id, String name, String type, ArrayList<BodyFlow> flows) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.flows = new ArrayList<BodyFlow>(flows);
    }
}

package tp1;

import java.util.ArrayList;

public class BodyFlow {
    private String id, name;
    private ArrayList<Connectible> connectibles;
    private ArrayList<BodyConnection> connections;

    public BodyFlow(String id, String name) {
        this.id = id;
        this.name = name;
        this.connectibles = new ArrayList<Connectible>();
        this.connections = new ArrayList<BodyConnection>();
    }
    public BodyFlow(String id, String name, ArrayList<Connectible> connectibles, ArrayList<BodyConnection> connections) {
        this.id = id;
        this.name = name;
        this.connectibles = new ArrayList<Connectible>(connectibles);
        this.connections = new ArrayList<BodyConnection>(connections);
    }
}
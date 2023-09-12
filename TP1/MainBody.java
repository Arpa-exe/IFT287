package tp1;

import java.util.ArrayList;

public class MainBody {
    private String bodyName, bodyID;
    private ArrayList<BodySystem> systems;
    private ArrayList<Organ> organs;

    public MainBody(String bodyName, String bodyID) {
        this.bodyName = bodyName;
        this.bodyID = bodyID;
        this.systems = new ArrayList<BodySystem>();
        this.organs = new ArrayList<Organ>();
    }

    public MainBody(String bodyName, String bodyID, ArrayList<BodySystem> systems, ArrayList<Organ> organs) {
        this.bodyName = bodyName;
        this.bodyID = bodyID;
        this.systems = new ArrayList<BodySystem>(systems);
        this.organs = new ArrayList<Organ>(organs);
    }
}

package tp1;

public class Connectible_lr extends Connectible {
    private String length, startRadius, endRadius;
    public Connectible_lr(String type, String id, String name, String length, String startRadius, String endRadius) {
        super(type, id, name);
        this.length = length;
        this.startRadius = startRadius;
        this.endRadius = endRadius;
    }
}

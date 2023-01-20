package Module5;

public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf("ROBOT");
        GearBox gB1 = new GearBox(type);
        gB1.getCurrentGear();
        gB1.shiftDown();
        System.out.println(gB1.getType());
    }
}

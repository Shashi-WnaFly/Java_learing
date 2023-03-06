class Cylinder {
    private int radius;
    private int height;

    public int getRad() {
        return radius;
    }

    public void setRad(int n) {
        radius = n;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int m) {
        height = m;
    }

}

public class My_13_Pra {
    public static void main(String[] arg) {
        Cylinder sc = new Cylinder();
//        sc.radius = 12;
//        sc.height = 17;
        sc.setRad(12);
        sc.setHeight(17);
        System.out.println(sc.getRad());
        System.out.println(sc.getHeight());
        float surarea = 2 * 22 / 7f * (sc.getRad() * sc.getHeight() + (sc.getRad() * sc.getRad()));
        float volume = 22 / 7f * sc.getRad() * sc.getRad() * sc.getHeight();
        System.out.println("The area of Cylinder is " + surarea);
        System.out.println("The volume of Cylinder is " + volume);

    }
}

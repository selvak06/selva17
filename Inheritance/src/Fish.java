public class Fish extends Animal{
    private int fin;
    private int gills;

    public Fish(String type, double weight, int fin, int gills) {
        super(type, "small", weight);
        this.fin = fin;
        this.gills = gills;
    }

    public void moveMuscels (){
        System.out.print("Muscels moving");
    }
    public void moveBackFins (){
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscels();
        if (speed == "fast") {
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fin=" + fin +
                ", gills=" + gills +
                "} " + super.toString();
    }
}

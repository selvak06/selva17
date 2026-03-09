package dev.tpa;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks =new Park[] {
                new Park("Yellow Stone" ,"44.4000, -110.5000"),
                new Park("Grand Canyon" ,"36.1000, -112.0900"),
                new Park("Yosemitte" ,"37.8000, -119.5900")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
               new River("Mississippi" ,"47.2000, -95.2000", "29.2000, -89.2000", "35.2000, -90.2000" ),
               new River("Missouri" ,"45.9000, -111.0900", "38.9000, -90.0900")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorodo" ,"47.2000, -95.2000", "29.2000, -89.2000"),
                new River("Delaware" ,"45.9000, -111.0900", "38.9000, -90.0900")
        );
        riverLayer.renderLayer();

    }
}

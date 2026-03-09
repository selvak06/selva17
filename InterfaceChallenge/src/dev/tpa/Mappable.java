package dev.tpa;

enum Geometry {LINE, POINT,POLYGON};
enum Color {BLACK, BLUE, GREEN, ORANGE, RED};
enum POINTMARKER {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE};
enum LINEMARKER {DASHED, DOTTED, SOLID};

public interface Mappable {
    String JSON_PROPERTY = """            
            "properties": {%s}""";

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type" : "%s", "label" : "%s", "marker" : "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}

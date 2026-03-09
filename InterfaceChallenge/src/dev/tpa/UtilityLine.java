package dev.tpa;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER};

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + "( "+ type + " )";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch(type){
            case ELECTRICAL -> Color.RED + " " + LINEMARKER.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LINEMARKER.DOTTED;
            case GAS -> Color.ORANGE + " " + LINEMARKER.SOLID;
            case WATER -> Color.BLUE + " " + LINEMARKER.SOLID;
            default -> Color.BLACK + " " + LINEMARKER.DASHED;
        };

    }


    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name" : "%s", "utility" :"%s" """ .formatted(name, type);
    }
}

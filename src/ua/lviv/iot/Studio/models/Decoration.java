package ua.lviv.iot.Studio.models;

public class Decoration extends StudioEquipment {
    private double height;
    private double width;
    private double weight;

    public Decoration() {

    }

    public Decoration(final double heightObj, final double widthObj,
                      final double weightObj) {
        this.height = heightObj;
        this.width = widthObj;
        this.weight = weightObj;
    }

    public final double getHeight() {
        return height;
    }

    public final void setHeight(final double heightObj) {
        this.height = heightObj;
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(final double widthObj) {
        this.width = widthObj;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weightObj) {
        this.weight = weightObj;
    }

    @Override
    public final String toString() {
        return "Decoration{"
                + "height="
                + height
                + ", width="
                + width
                + ", weight="
                + weight
                + '}';
    }
}

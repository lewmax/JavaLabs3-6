package ua.lviv.iot.Studio.models;

public class Decoration extends StudioEquipment {
    private double height;
    private double width;
    private double weight;

    public Decoration() {

    }

    public Decoration(double height, double width, double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Decoration(String nameObj, int idObj, int priceObj,
                      Position positionObj, TypeOfMovie typeOfMovieObj,
                      double height, double width, double weight) {
        super(nameObj, idObj, priceObj, positionObj, typeOfMovieObj);
        this.height = height;
        this.width = width;
        this.weight = weight;
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

    public String getHeaders() {
        return super.getHeaders() + ","
                + "height" + ","
                + "width" + ","
                + "weight";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + height + ","
                + width + ","
                + weight;
    }
}

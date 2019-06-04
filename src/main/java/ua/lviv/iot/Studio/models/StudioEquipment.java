package ua.lviv.iot.Studio.models;

public class StudioEquipment {
    private String name;
    private int id;
    private int price;
    private Position currentPosition;
    private TypeOfMovie typeOfMovie;

    public StudioEquipment() {

    }

    public StudioEquipment(final String nameObj, final int idObj,
                           final int priceObj, final Position positionObj,
                           final TypeOfMovie typeOfMovieObj) {
        this.name = nameObj;
        this.id = idObj;
        this.price = priceObj;
        this.currentPosition = positionObj;
        this.typeOfMovie = typeOfMovieObj;
    }

    public final void changePosition(final Position positionObj) {
        this.currentPosition = positionObj;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameObj) {
        this.name = nameObj;
    }

    public final int getId() {
        return id;
    }

    public final void setId(final int idObj) {
        this.id = idObj;
    }

    public final int getPrice() {
        return price;
    }

    public final void setPrice(final int priceObj) {
        this.price = priceObj;
    }

    public final TypeOfMovie getTypeOfMovie() {
        return typeOfMovie;
    }

    public final void setTypeOfMovie(final TypeOfMovie typeOfMovieObj) {
        this.typeOfMovie = typeOfMovieObj;
    }

    public final Position getCurrentPosition() {
        return currentPosition;
    }

    public final void setCurrentPosition(final Position currentPositionObj) {
        this.currentPosition = currentPositionObj;
    }

    @Override
    public String toString() {
        return "StudioEquipment{"
                + "name='"
                + name
                + '\''
                + ", id="
                + id
                + ", price="
                + price
                + ", currentPosition="
                + currentPosition
                + ", typeOfMovie="
                + typeOfMovie
                + '}';
    }

    public String getHeaders() {
        return "name" + ","
                + "id" + ","
                + "price" + ","
                + "currentPosition" + ","
                + "typeOfMovie";
    }

    public String toCSV() {
        return name + ","
                + id + ","
                + price + ","
                + currentPosition + ","
                + typeOfMovie;
    }
}

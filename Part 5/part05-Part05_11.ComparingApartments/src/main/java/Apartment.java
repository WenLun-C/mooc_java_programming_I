
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compare) {
        return (compare.squares < this.squares);
    }

    public int priceDifference(Apartment compare) {
        int price = (compare.princePerSquare * compare.squares) - (this.princePerSquare * this.squares);
        if (price < 0) price *= -1;
        return price;
    }

    public boolean moreExpensiveThan(Apartment compare) {
        return ((compare.princePerSquare * compare.squares) < (this.princePerSquare * this.squares));
    }

}

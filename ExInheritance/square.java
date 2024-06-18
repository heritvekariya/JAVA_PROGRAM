package inheritance;

public class square extends rectangle {
    public square(double side) {
        super(side, side); // Calling both length and breadth side
    }
}

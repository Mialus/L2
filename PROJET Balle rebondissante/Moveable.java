public interface Moveable {
    void move();
    void moveTo(Position newPos);
    void changeDirection(Direction newDir);
}

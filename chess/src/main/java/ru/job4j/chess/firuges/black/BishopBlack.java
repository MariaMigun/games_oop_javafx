package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        int size = Math.abs(dest.getX() - this.position.getX());
        Cell[] steps = new Cell[size];
        int deltaX = (dest.getX() - this.position.getX()) / size;
        int deltaY = (dest.getY() - this.position.getY()) / size;
        if (isDiagonal(this.position(), dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        for (int index = 0; index < size; index++) {
            int x = index + deltaX;/* вычислить ячейку через index + deltaX */
            int y = index + deltaY;/* вычистить ячейку через index + deltaY */
                    steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        int deltaX = dest.getX() - source.getX();
        int deltaY = dest.getY() - source.getY();
        boolean diagonal = Math.abs(deltaX) != Math.abs(deltaY);
            return diagonal;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}

package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopRight = new BishopBlack(Cell.B1);
        bishopRight.position();
    }

    public void testWay() {
        BishopBlack bishopRight = new BishopBlack(Cell.C1);
        bishopRight.way(Cell.G5);
    }


    public void testCopy() {
        BishopBlack bishopRight = new BishopBlack(Cell.B1);
        bishopRight.copy(Cell.F5);
    }
}
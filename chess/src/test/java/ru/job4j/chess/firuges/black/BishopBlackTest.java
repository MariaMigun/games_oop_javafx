package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopRight = new BishopBlack(Cell.B1);
        bishopRight.position();
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is (new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }


    public void testCopy() {
        BishopBlack bishopRight = new BishopBlack(Cell.B1);
        bishopRight.copy(Cell.F5);
    }
}
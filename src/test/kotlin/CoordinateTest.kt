import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CoordinateTest {

    @Test
    fun testCoordinateShift() {
        val coordinate = Coordinate(1, 2)

        assertEquals(Coordinate(1, 3), coordinate.shift(Direction.N))
        assertEquals(Coordinate(1, 1), coordinate.shift(Direction.S))
        assertEquals(Coordinate(2, 2), coordinate.shift(Direction.E))
        assertEquals(Coordinate(0, 2), coordinate.shift(Direction.W))
    }

    @Test
    fun testIsValidCoordinate() {
        val upperBound = Coordinate(5, 5)

        assertTrue(Coordinate(1, 2).isValidCoordinate(upperBound))
        assertFalse(Coordinate(6, 2).isValidCoordinate(upperBound))
        assertFalse(Coordinate(-1, 2).isValidCoordinate(upperBound))
    }
}
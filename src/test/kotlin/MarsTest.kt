import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MarsTest {

    @Test
    fun testIsValidCoordinate() {
        val coordinate = Coordinate(5, 5)

        val mars = Mars(coordinate)

        assertTrue(mars.isValidCoordinate(Coordinate(1, 2)))
        assertTrue(mars.isValidCoordinate(Coordinate(5, 5)))

        assertFalse(mars.isValidCoordinate(Coordinate(6, 2)))
        assertFalse(mars.isValidCoordinate(Coordinate(-1, 2)))
    }

}
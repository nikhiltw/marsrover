import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DirectionTest {

    @Nested
    inner class TestRotate {

        @Test
        fun testRotateFromNorth() {
            assertEquals(Direction.E, Direction.N.rotate(true))
            assertEquals(Direction.W, Direction.N.rotate(false))
        }

        @Test
        fun testRotateFromSouth() {
            assertEquals(Direction.W, Direction.S.rotate(true))
            assertEquals(Direction.E, Direction.S.rotate(false))
        }

        @Test
        fun testRotateFromEast() {
            assertEquals(Direction.S, Direction.E.rotate(true))
            assertEquals(Direction.N, Direction.E.rotate(false))
        }

        @Test
        fun testRotateFromWest() {
            assertEquals(Direction.N, Direction.W.rotate(true))
            assertEquals(Direction.S, Direction.W.rotate(false))
        }

    }


}
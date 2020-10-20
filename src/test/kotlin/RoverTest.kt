import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RoverTest {

    @Test
    fun testRoverRotateRight() {
        val rover = Rover(Coordinate(1, 2), Direction.N)

        rover.rotateRight()
        assertEquals(Rover(Coordinate(1, 2), Direction.E), rover)

        rover.rotateRight()
        assertEquals(Rover(Coordinate(1, 2), Direction.S), rover)

        rover.rotateRight()
        assertEquals(Rover(Coordinate(1, 2), Direction.W), rover)

        rover.rotateRight()
        assertEquals(Rover(Coordinate(1, 2), Direction.N), rover)
    }

    @Test
    fun testRoverRotateLeft() {
        val rover = Rover(Coordinate(1, 2), Direction.N)

        rover.rotateLeft()
        assertEquals(Rover(Coordinate(1, 2), Direction.W), rover)

        rover.rotateLeft()
        assertEquals(Rover(Coordinate(1, 2), Direction.S), rover)

        rover.rotateLeft()
        assertEquals(Rover(Coordinate(1, 2), Direction.E), rover)

        rover.rotateLeft()
        assertEquals(Rover(Coordinate(1, 2), Direction.N), rover)
    }

    @Test
    fun testRoverMove() {
        val rover = Rover(Coordinate(1, 2), Direction.N)

        rover.move()
        assertEquals(Rover(Coordinate(1, 3), Direction.N), rover)

        rover.rotateLeft()
        rover.move()
        assertEquals(Rover(Coordinate(0, 3), Direction.W), rover)

        rover.rotateRight()
        rover.move()
        assertEquals(Rover(Coordinate(0, 4), Direction.N), rover)
    }

}


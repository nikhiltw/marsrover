import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@Nested
class TestControllerExecuteSuccess {

    private class TestCase(
        val ex: Int,
        val ey: Int,
        val ed: Direction,
        val rx: Int,
        val ry: Int,
        val rd: Direction,
        val mx: Int,
        val my: Int,
        val insStr: String
    )

    @Test
    fun testControllerExecute() {
        val testCases = listOf(
            TestCase(1, 3, Direction.N, 1, 2, Direction.N, 5, 5, "LMLMLMLMM"),
            TestCase(5, 1, Direction.E, 3, 3, Direction.E, 5, 5, "MMRMMRMRRM")
        )

        testCases.forEach {
            testMoveRover(it)
        }
    }

    private fun testMoveRover(tc: TestCase) {
        val rover = Rover(Coordinate(tc.rx, tc.ry), tc.rd)

        val mars = Mars(Coordinate(tc.mx, tc.my))

        val controller = Controller(mars, rover)

        val instructions = Instructions(tc.insStr)

        val (nc, nd) = controller.execute(instructions)

        assertEquals(Coordinate(tc.ex, tc.ey), nc)
        assertEquals(tc.ed, nd)
    }

}

@Nested
class TestControllerExecuteFailure {

    @Test
    fun testControllerExecuteFailureWhenRobotOvershoots() {
        val rover = Rover(Coordinate(4, 4), Direction.N)

        val mars = Mars(Coordinate(5, 5))

        val controller = Controller(mars, rover)

        val instructions = Instructions("MMMM")

        assertThrows(UnsupportedOperationException::class.java) { controller.execute(instructions) }
    }

}
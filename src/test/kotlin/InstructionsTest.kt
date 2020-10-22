import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class InstructionsTest {

    @Test
    fun parseInstructionsSuccessfully() {
        val insStr = "LMLMLMLMM"
        val ins = Instructions(insStr)

        val expectedIns = listOf(
            Instruction.L,
            Instruction.M,
            Instruction.L,
            Instruction.M,
            Instruction.L,
            Instruction.M,
            Instruction.L,
            Instruction.M,
            Instruction.M
        )

        expectedIns.forEach {
            assertEquals(it, ins.next())
        }

    }

    @Test
    fun parseInstructionsFailure() {
        val insStr = "LMLDD"

        assertThrows(IllegalArgumentException::class.java) { Instructions(insStr) }
    }

    @Nested
    inner class TestExecute {

        @Test
        fun testExecuteL() {
            val rover = Rover(Coordinate(1, 2), Direction.N)
            Instruction.L.execute(rover)

            assertEquals(Direction.W, rover.getDirection())
        }

        @Test
        fun testExecuteR() {
            val rover = Rover(Coordinate(1, 2), Direction.N)
            Instruction.R.execute(rover)

            assertEquals(Direction.E, rover.getDirection())
        }

        @Test
        fun testExecuteM() {
            val rover = Rover(Coordinate(1, 2), Direction.N)
            Instruction.M.execute(rover)

            assertEquals(Coordinate(1, 3), rover.getCoordinate())
        }

    }
}
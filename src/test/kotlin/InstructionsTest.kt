import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

@Nested
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

}
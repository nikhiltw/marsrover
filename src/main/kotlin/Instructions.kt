class Instructions(instructions: String) : Iterator<Instruction> {

    private var curr = 0
    private val sz = instructions.length
    private var ins: MutableList<Instruction> = mutableListOf()

    init {
        instructions.forEach {
            ins.add(Instruction.valueOf(it.toString()))
        }
    }

    override fun hasNext(): Boolean {
        return curr < sz
    }

    override fun next(): Instruction {
        return ins[curr++]
    }

}

enum class Instruction {
    L {
        override fun execute(rover: Rover) = rover.rotateLeft()
    },

    R {
        override fun execute(rover: Rover) = rover.rotateRight()
    },

    M {
        override fun execute(rover: Rover) = rover.move()
    };

    abstract fun execute(rover: Rover)
}



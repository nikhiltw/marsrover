class Controller(private val mars: Mars, private val rover: Rover) {

    fun execute(instructions: Instructions): Pair<Coordinate, Direction> {
        while (instructions.hasNext()) {
            when (instructions.next()) {
                Instruction.L -> rover.rotateLeft()
                Instruction.R -> rover.rotateRight()
                Instruction.M -> {
                    rover.move()

                    if (!mars.isValidCoordinate(rover.getCoordinate())) {
                        throw UnsupportedOperationException("rover outside the available range")
                    }
                }
            }
        }

        return Pair(rover.getCoordinate(), rover.getDirection())
    }

}

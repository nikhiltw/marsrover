class Controller(private val mars: Mars, private val rover: Rover) {

    fun execute(instructions: Instructions): Pair<Coordinate, Direction> {

        while (instructions.hasNext()) {

            val instruction = instructions.next()
            instruction.execute(rover)

            if (!mars.isValidCoordinate(rover.getCoordinate())) {
                throw UnsupportedOperationException("rover out of bound")
            }

        }

        return Pair(rover.getCoordinate(), rover.getDirection())
    }

}

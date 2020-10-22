data class Coordinate(private val x: Int, private val y: Int) {

    fun shift(direction: Direction): Coordinate {
        return when (direction) {
            Direction.N -> Coordinate(x, y + 1)
            Direction.S -> Coordinate(x, y - 1)
            Direction.E -> Coordinate(x + 1, y)
            Direction.W -> Coordinate(x - 1, y)
        }
    }

    fun isValidCoordinate(upperBound: Coordinate): Boolean {
        return x >= 0 && y >= 0 && upperBound.x >= x && upperBound.y >= y
    }

}

data class Rover(private var coordinate: Coordinate, private var direction: Direction) {

    fun getCoordinate() = this.coordinate

    fun getDirection() = this.direction

    fun rotateRight() = rotate(true)

    fun rotateLeft() = rotate(false)

    private fun rotate(right: Boolean) {
        direction = when (direction) {
            Direction.N -> if (right) Direction.E else Direction.W
            Direction.S -> if (right) Direction.W else Direction.E
            Direction.E -> if (right) Direction.S else Direction.N
            Direction.W -> if (right) Direction.N else Direction.S
        }
    }

    fun move() {
        coordinate = when (direction) {
            Direction.N -> Coordinate(coordinate.x, coordinate.y + 1)
            Direction.S -> Coordinate(coordinate.x, coordinate.y - 1)
            Direction.E -> Coordinate(coordinate.x + 1, coordinate.y)
            Direction.W -> Coordinate(coordinate.x - 1, coordinate.y)
        }
    }

}

data class Rover(private var coordinate: Coordinate, private var direction: Direction) {

    fun getCoordinate() = this.coordinate

    fun getDirection() = this.direction

    fun rotateRight() = rotate(true)

    fun rotateLeft() = rotate(false)

    private fun rotate(right: Boolean) {
        direction = direction.rotate(right)
    }

    fun move() {
        coordinate = coordinate.shift(direction)
    }

}

class Mars(private val topRightCoordinate: Coordinate) {

    fun isValidCoordinate(coordinate: Coordinate): Boolean {
        return coordinate.isValidCoordinate(topRightCoordinate)
    }

}

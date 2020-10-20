class Mars(private val topRightCoordinate: Coordinate) {

    fun isValidCoordinate(coordinate: Coordinate): Boolean {
        return coordinate.x >= 0 &&
                coordinate.y >= 0 &&
                topRightCoordinate.x >= coordinate.x &&
                topRightCoordinate.y >= coordinate.y
    }

}

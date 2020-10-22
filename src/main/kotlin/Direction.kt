enum class Direction {
    N {
        override fun rotate(right: Boolean) = if (right) E else W
    },

    S {
        override fun rotate(right: Boolean) = if (right) W else E
    },

    E {
        override fun rotate(right: Boolean) = if (right) S else N
    },

    W {
        override fun rotate(right: Boolean) = if (right) N else S
    };

    abstract fun rotate(right: Boolean): Direction
}

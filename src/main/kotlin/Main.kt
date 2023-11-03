fun main(args: Array<String>) {
    val likes = 1
    val likesStr = likes.toString();

    println(
        "Понравилось $likes "
                + if ((!likesStr.endsWith("1")) || likesStr.endsWith("11"))
            "людям"
        else
            "человеку"
    );
}
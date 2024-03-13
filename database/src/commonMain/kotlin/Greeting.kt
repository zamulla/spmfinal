class Database {
    private val platform = getDatabasePlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}
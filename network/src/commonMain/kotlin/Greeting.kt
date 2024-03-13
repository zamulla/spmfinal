class Network {
    private val platform = getNetworkPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}
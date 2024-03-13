interface NetworkPlatform {
    val name: String
}

expect fun getNetworkPlatform(): NetworkPlatform
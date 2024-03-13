import platform.UIKit.UIDevice

class NetworkIOSPlatform: NetworkPlatform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getNetworkPlatform(): NetworkPlatform = NetworkIOSPlatform()
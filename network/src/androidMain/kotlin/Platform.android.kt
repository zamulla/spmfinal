import android.os.Build

class NetworkAndroidPlatform : NetworkPlatform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getNetworkPlatform(): NetworkPlatform = NetworkAndroidPlatform()
import platform.UIKit.UIDevice

class DatabaseIOSPlatform: DatabasePlatform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getDatabasePlatform(): DatabasePlatform = DatabaseIOSPlatform()
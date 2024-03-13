import android.os.Build

class DatabaseAndroidPlatform : DatabasePlatform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getDatabasePlatform(): DatabasePlatform = DatabaseAndroidPlatform()
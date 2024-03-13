interface DatabasePlatform {
    val name: String
}

expect fun getDatabasePlatform(): DatabasePlatform
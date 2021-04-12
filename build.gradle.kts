plugins {
    java
    kotlin("jvm") version "1.4.31"
}

group = "com.samuel"
version = "1.0-beta01"

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}

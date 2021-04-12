plugins {
    java
    maven
    kotlin("jvm") version "1.4.31"
}

group = "com.github.samuelprince77"
version = "1.0-beta02"

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib"))
}

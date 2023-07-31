plugins {
    kotlin("jvm") version "1.9.0"
}

group = "studio.hcmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.4.0")

    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}

kotlin {
    jvmToolchain(17)
}
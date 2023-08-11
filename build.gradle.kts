plugins {
    kotlin("jvm") version "1.9.0"
    id("maven-publish")
}

group = "studio.hcmc"
version = "0.0.9"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "studio.hcmc"
            artifactId = "jpa-converter-extension"
            version = "0.0.9"
            from(components["java"])
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.4.0")

    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}
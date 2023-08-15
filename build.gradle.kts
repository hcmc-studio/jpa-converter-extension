val project_version: String by project
val jdk_version: String by project
val kotlinx_datetime_version: String by project
val jakarta_persistence_api_version: String by project

plugins {
    kotlin("jvm")
    id("maven-publish")
}

group = "studio.hcmc"
version = project_version

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(jdk_version.toInt())
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "studio.hcmc"
            artifactId = project.name
            version = project_version
            from(components["java"])
        }
        create<MavenPublication>("jitpack") {
            groupId = "com.github.hcmc-studio"
            artifactId = project.name
            version = project_version
            from(components["java"])
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime-jvm:$kotlinx_datetime_version")

    implementation("jakarta.persistence:jakarta.persistence-api:$jakarta_persistence_api_version")
}
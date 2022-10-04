plugins {
    id("java")
}

group = "uk.protonull.minestom"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.Minestom:Minestom:-SNAPSHOT") {
        isChanging = true
    }

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks {
    processResources {
        filesMatching("extension.json") {
            expand(project.properties)
        }
    }
    test {
        useJUnitPlatform()
    }
}
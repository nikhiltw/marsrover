import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.nikhilsoni"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}
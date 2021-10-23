plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:13.0")
    implementation("com.google.inject:guice:4.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
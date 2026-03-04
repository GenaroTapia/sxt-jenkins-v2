plugins {
    id("java")
    id("sxt-plugin") version "1.0.2-SNAPSHOT"
}

group = "com.sicarx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.sicarx:sxt-plugin:1.0.2-SNAPSHOT")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
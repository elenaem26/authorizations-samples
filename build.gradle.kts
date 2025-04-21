plugins {
    id("org.springframework.boot") version "3.2.4" apply false
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22" apply false
    kotlin("plugin.spring") version "1.9.22" apply false
}

allprojects {
    group = "com.example"
    version = "0.0.1"
    repositories {
        mavenCentral()
    }
}
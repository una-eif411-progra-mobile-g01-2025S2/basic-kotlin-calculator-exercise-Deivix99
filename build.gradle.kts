plugins {
    kotlin("jvm") version "1.9.22" // Versión más reciente estable
}

repositories {
    mavenCentral()
}

// Configuración unificada para Java y Kotlin
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Usamos JDK 21 (LTS)
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "21" // Debe coincidir con la versión de Java
        apiVersion = "1.9" // Versión de Kotlin
        languageVersion = "1.9" // Versión de Kotlin
    }
}

tasks.withType<JavaCompile> {
    options.release.set(21) // Asegura que Java también use la misma versión
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}
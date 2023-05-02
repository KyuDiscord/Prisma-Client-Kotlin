plugins {
    groovy
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())

    /* kotlin */
    implementation(kotlin("gradle-plugin", version = "1.8.20"))
    implementation(kotlin("serialization", version = "1.8.20"))
    implementation("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.20.2")
}

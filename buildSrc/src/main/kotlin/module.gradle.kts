plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

group = "app.kyubot.prisma"
version = "1.0.0-rc.1"

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()

    jvm()

    linuxX64()

    sourceSets.all {
        languageSettings.languageVersion = "1.9"
    }

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib"))
    }
}

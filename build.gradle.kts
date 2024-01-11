buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.serialization) apply false
    alias(libs.plugins.compose) apply false
}


tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}

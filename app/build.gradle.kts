plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.claudis.practicomaquina2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.claudis.practicomaquina2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    compileOnly ("org.projectlombok:lombok:1.18.24")//lombok usar get,set autamiticos o asistencia para constructores
    annotationProcessor("org.projectlombok:lombok:1.18.24")// soprte de lombok con anotation
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0") // serializar el json, mapear
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
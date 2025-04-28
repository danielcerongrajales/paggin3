plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt.plugin)
    alias(libs.plugins.ksp)

}

android {
    compileSdk =35
    namespace = "com.example.androidpagging"

    defaultConfig {
        applicationId = "com.example.androidpagging"
        minSdk =24
        targetSdk = 35
        versionCode =1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled= false
            proguardFiles (
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation (libs.core.ktx)
    implementation (libs.appcompat)
    implementation (libs.material)
    implementation (libs.constraintlayout)


    implementation (libs.hilt)
    ksp(libs.hilt.compiler)

   implementation (libs.retrofit)
   implementation (libs.retrofit.converter)

    implementation (libs.room.runtime)
   implementation (libs.room.ktx)
   ksp (libs.room.compiler)

   implementation (libs.coroutines.core)
   implementation (libs.coroutines.android)
    implementation (libs.paging.runtime)

    //lifecycle
    implementation (libs.lifecycle.viewmodel.ktx)
    implementation (libs.lifecycle.runtime.ktx)
    implementation (libs.lifecycle.livedata.ktx)
    implementation (libs.fragment.ktx)

}
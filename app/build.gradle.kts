plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.eshopping"
    compileSdk = 34

    buildFeatures{
        viewBinding=true
    }

    defaultConfig {
        applicationId = "com.example.eshopping"
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

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    /*loadingImages*/
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    /*rounded image view*/
    implementation("com.makeramen:roundedimageview:2.3.0")
    /*searchBar*/
    implementation("com.github.mancj:MaterialSearchBar:0.8.5")
    /*for slider*/
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("me.relex:circleindicator:2.1.6")
    implementation ("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0")
    implementation ("com.android.volley:volley:1.2.1")
}
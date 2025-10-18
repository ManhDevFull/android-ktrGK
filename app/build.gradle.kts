plugins { id("com.android.application") version "8.6.1" }
android {
  namespace = "com.example.giuaki"
  compileSdk = 34
  defaultConfig {
    applicationId = "com.example.giuaki"
    minSdk = 21
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
    vectorDrawables { useSupportLibrary = true }
  }
  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
  buildFeatures { viewBinding = false }
}
dependencies {
  implementation("androidx.core:core:1.13.1")
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("com.google.android.material:material:1.12.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}

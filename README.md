# Android PDF Reader #

## An example to open pdf files from asset and display it. It is written in Kotlin. ##
Under settings.gradle script, include the following line
```
android.enableJetifier=true
```
Under app level gradle file, add plugins as shown below
```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-android-extensions'
}
```
Change the SDK version to 30 as shown below
```
compileSdkVersion 30
   buildToolsVersion "30.0.3"
defaultConfig {
        applicationId "com.example.myapplication"
        minSdkVersion 21
        targetSdkVersion 30
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
```
Under dependencies section, include barteksc android pdf viewer.
```
dependencies {

    implementation 'com.github.barteksc:android-pdf-viewer:3.2.0-beta.1'
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.5.0'
    implementation 'androidx.appcompat:appcompat:1.3.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

}
```




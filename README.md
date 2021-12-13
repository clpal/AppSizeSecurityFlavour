
https://developer.android.com/studio/build/shrink-code

https://developer.android.com/studio/build/configure-apk-splits

# AppSize 
1: app:build.gradle

buildTypes {
        release {
        
            minifyEnabled true
            shrinkResources true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

# Security
2. proguard-rules.pro

-keep class  example.clpal.proguard.MainActivity
-keep class model.User
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule {
 <init>(...);
}
    
    3:gradle.properties
android.enableR8.fullMode=true
            
4. ProGuard makes the following impact on our project    

1. Minify(reduce,decrease,shorten)the code  It reduces the size of the application.
2. Obfuscate(shade ,black out) It removes the unused classes and methods that contribute to the 64K method counts limit of an Android application.
3.Optimize the code  It makes the application difficult to reverse engineer by obfuscating the code.
 # Flavour
    <product-flavor><Build-Type>
demoDebug
            
demoRelease
            
fullDebug
            
fullRelease

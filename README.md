# Proguard
https://developer.android.com/studio/build/shrink-code


https://developer.android.com/studio/build/configure-apk-splits

1: app:build.gradle

buildTypes {
        release {
            minifyEnabled true
            shrinkResources true

            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

2:gradle.properties
android.enableR8.fullMode=true

3. proguard-rules.pro

-keep class  example.clpal.proguard.MainActivity

-keep class model.User


-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule {
 <init>(...);
}
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
-keep class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder {
  *** rewind();
}
        
        
        
        
        
        
        
4. ProGuard makes the following impact on our project    

1. Minify(reduce,decrease,shorten)the code  It reduces the size of the application.
2. Obfuscate(shade ,black out) It removes the unused classes and methods that contribute to the 64K method counts limit of an Android application.
3.Optimize the code  It makes the application difficult to reverse engineer by obfuscating the code.
    

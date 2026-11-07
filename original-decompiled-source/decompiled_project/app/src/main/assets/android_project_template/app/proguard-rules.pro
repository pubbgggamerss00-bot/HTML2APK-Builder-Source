# Keep all classes and members in {{packageName}} intact (No obfuscation of our shell)
-keep class {{packageName}}.** { *; }
-keepclassmembers class {{packageName}}.** { *; }

# Preserve JavascriptInterface annotations and methods for HTML/JS bridge
-keepattributes JavascriptInterface, *Annotation*, EnclosingMethod, InnerClasses, Signature
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# Preserve standard Android components used in manifest
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider

# Preserve UI custom views used in layout XML
-keep class androidx.swiperefreshlayout.widget.** { *; }
-keep class androidx.camera.view.PreviewView { *; }

# Preserve FileProvider
-keep class androidx.core.content.FileProvider { *; }

# AdMob & Google Play Services rules
-keep public class com.google.android.gms.ads.** { *; }
-keep public class com.google.ads.** { *; }

# Keep the UMP entry point inspectable in repackaged release shells. Internal SDK
# implementation classes remain eligible for shrinking/obfuscation/optimization.
-keep,allowoptimization class com.google.android.ump.UserMessagingPlatform { public *; }
-keep,allowoptimization interface com.google.android.ump.ConsentInformation { public *; }

# CameraX rules
-keep class androidx.camera.core.** { *; }
-keep class androidx.camera.lifecycle.** { *; }
-keep class androidx.camera.camera2.** { *; }

# Don't warn on unused library references
-dontwarn **

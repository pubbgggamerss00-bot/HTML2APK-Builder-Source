package androidx.camera.core.internal.compat;

import android.os.Build;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class MediaActionSoundCompat {
    private MediaActionSoundCompat() {
    }

    public static boolean mustPlayShutterSound() {
        return Build.VERSION.SDK_INT >= 33 ? MediaActionSoundCompatApi33Impl.mustPlayShutterSound() : MediaActionSoundCompatBaseImpl.mustPlayShutterSound();
    }
}

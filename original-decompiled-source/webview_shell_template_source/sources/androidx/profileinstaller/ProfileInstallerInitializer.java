package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b2.b<a> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
    }

    @Override // b2.b
    public final List<Class<? extends b2.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // b2.b
    public final a b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: s1.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new androidx.activity.d(5, applicationContext), new Random().nextInt(Math.max(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 1)) + 5000);
            }
        });
        return new a();
    }
}

package androidx.camera.camera2.internal.compat;

import android.app.NotificationChannel;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel a() {
        return new NotificationChannel("htmltoapk_channel", "HTML to APK", 3);
    }

    public static /* synthetic */ OutputConfiguration c(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }
}

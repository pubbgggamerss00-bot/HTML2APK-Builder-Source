package androidx.camera.core.impl;

import android.os.Build;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class DeviceProperties {
    public static DeviceProperties create() {
        return create(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    public abstract String manufacturer();

    public abstract String model();

    public abstract int sdkVersion();

    public static DeviceProperties create(String str, String str2, int i6) {
        return new AutoValue_DeviceProperties(str, str2, i6);
    }
}

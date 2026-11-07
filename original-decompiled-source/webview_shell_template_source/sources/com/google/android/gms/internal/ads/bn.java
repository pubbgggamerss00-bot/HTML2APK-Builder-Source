package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public enum bn implements l52 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);

    public final int s;

    bn(int i6) {
        this.s = i6;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }

    @Override // com.google.android.gms.internal.ads.l52
    public final int zza() {
        return this.s;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class en1 {
    public static void a(int i6, String str) {
        if (i6 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i6);
    }

    public static void b(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(androidx.camera.camera2.internal.v0.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}

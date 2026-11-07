package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d52 implements k62 {
    public static final d52 s = new d52();

    @Override // com.google.android.gms.internal.ads.k62
    public final i62 a(Class cls) {
        if (!j52.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (i62) j52.s(cls.asSubclass(j52.class)).x(3, null);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final boolean c(Class cls) {
        return j52.class.isAssignableFrom(cls);
    }
}

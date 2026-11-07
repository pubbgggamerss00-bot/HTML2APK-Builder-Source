package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v6 implements u7 {

    /* renamed from: a, reason: collision with root package name */
    public static final v6 f11917a = new v6();

    @Override // com.google.android.gms.internal.consent_sdk.u7
    public final t7 a(Class cls) {
        if (!z6.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (t7) z6.h(cls.asSubclass(z6.class)).f(3);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.u7
    public final boolean c(Class cls) {
        return z6.class.isAssignableFrom(cls);
    }
}

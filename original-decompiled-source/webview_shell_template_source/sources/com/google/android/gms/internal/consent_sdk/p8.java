package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p8 extends r8 {
    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final double a(long j6, Object obj) {
        return Double.longBitsToDouble(this.f11880a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final float b(long j6, Object obj) {
        return Float.intBitsToFloat(this.f11880a.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final void c(Object obj, long j6, boolean z6) {
        if (s8.f11894g) {
            s8.c(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            s8.d(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final void d(Object obj, long j6, byte b7) {
        if (s8.f11894g) {
            s8.c(obj, j6, b7);
        } else {
            s8.d(obj, j6, b7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final void e(Object obj, long j6, double d7) {
        this.f11880a.putLong(obj, j6, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final void f(Object obj, long j6, float f6) {
        this.f11880a.putInt(obj, j6, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.r8
    public final boolean g(long j6, Object obj) {
        return s8.f11894g ? s8.n(j6, obj) : s8.o(j6, obj);
    }
}

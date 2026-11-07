package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o72 extends q72 {
    @Override // com.google.android.gms.internal.ads.q72
    public final byte a(long j6) {
        return Memory.peekByte((int) j6);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final double d(long j6, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.s).getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final float f(long j6, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.s).getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void i(long j6, byte[] bArr, long j7, long j8) {
        Memory.peekByteArray((int) j6, bArr, (int) j7, (int) j8);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void k(Object obj, long j6, boolean z6) {
        if (r72.h) {
            r72.d(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            r72.e(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void m(Object obj, long j6, byte b7) {
        if (r72.h) {
            r72.d(obj, j6, b7);
        } else {
            r72.e(obj, j6, b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void o(Object obj, long j6, double d7) {
        ((Unsafe) this.s).putLong(obj, j6, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void q(Object obj, long j6, float f6) {
        ((Unsafe) this.s).putInt(obj, j6, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final boolean r(long j6, Object obj) {
        return r72.h ? r72.p(j6, obj) : r72.q(j6, obj);
    }
}

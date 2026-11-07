package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k42 {

    /* renamed from: a, reason: collision with root package name */
    public int f6237a;

    /* renamed from: b, reason: collision with root package name */
    public l42 f6238b;

    public static int c(int i6) {
        return (i6 >>> 1) ^ (-(i6 & 1));
    }

    public static long d(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public static h42 e(int i6, int i7, byte[] bArr) {
        h42 h42Var = new h42(bArr, i6, i7);
        try {
            h42Var.i(i7);
            return h42Var;
        } catch (u52 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract double f();

    public abstract float g();

    public abstract int h();

    public abstract int i(int i6);

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract e42 v();

    public abstract String w();

    public abstract String x();

    public abstract void y();

    public abstract void z(int i6);
}

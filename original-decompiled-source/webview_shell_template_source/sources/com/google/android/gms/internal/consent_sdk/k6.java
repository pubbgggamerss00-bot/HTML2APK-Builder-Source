package com.google.android.gms.internal.consent_sdk;

import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k6 extends c6 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f11798b = Logger.getLogger(k6.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11799c = s8.f11892e;

    /* renamed from: a, reason: collision with root package name */
    public l6 f11800a;

    public k6() {
        throw null;
    }

    public static int b(String str) {
        int length;
        try {
            length = u8.b(str);
        } catch (t8 unused) {
            length = str.getBytes(e7.f11716a).length;
        }
        return c(length) + length;
    }

    public static int c(int i6) {
        return (352 - (Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int d(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public abstract void e(byte b7);

    public abstract void f(int i6, boolean z6);

    public abstract void g(int i6, byte[] bArr);

    public abstract void h(int i6, h6 h6Var);

    public abstract void i(h6 h6Var);

    public abstract void j(int i6, int i7);

    public abstract void k(int i6);

    public abstract void l(int i6, long j6);

    public abstract void m(long j6);

    public abstract void n(int i6, int i7);

    public abstract void o(int i6);

    public abstract void p(v7 v7Var);

    public abstract void q(int i6, String str);

    public abstract void r(String str);

    public abstract void s(int i6, int i7);

    public abstract void t(int i6, int i7);

    public abstract void u(int i6);

    public abstract void v(int i6, long j6);

    public abstract void w(long j6);
}

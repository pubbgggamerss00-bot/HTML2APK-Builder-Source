package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class p42 extends me {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f7933u = Logger.getLogger(p42.class.getName());

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f7934v = r72.f8576e;

    /* renamed from: t, reason: collision with root package name */
    public q42 f7935t;

    public p42() {
        throw null;
    }

    public static int q(String str) {
        int length;
        try {
            length = v72.c(str);
        } catch (u72 unused) {
            length = str.getBytes(s52.f8801a).length;
        }
        return r(length) + length;
    }

    public static int r(int i6) {
        return (352 - (Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int s(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public abstract void A(long j6);

    public abstract void B(int i6, int i7);

    public abstract void C(int i6);

    public abstract void D(int i6, m62 m62Var, b72 b72Var);

    public abstract void E(int i6, m62 m62Var);

    public abstract void F(int i6, g42 g42Var);

    public abstract void G(int i6, String str);

    public abstract void H(int i6, int i7);

    public abstract void I(int i6, int i7);

    public abstract void J(int i6);

    public abstract void K(int i6, long j6);

    public abstract void L(long j6);

    public final void t(String str, u72 u72Var) throws n42 {
        f7933u.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) u72Var);
        byte[] bytes = str.getBytes(s52.f8801a);
        try {
            int length = bytes.length;
            J(length);
            e(0, length, bytes);
        } catch (IndexOutOfBoundsException e6) {
            throw new n42(e6);
        }
    }

    public abstract void u(byte b7);

    public abstract void v(int i6, boolean z6);

    public abstract void w(int i6, g42 g42Var);

    public abstract void x(int i6, int i7);

    public abstract void y(int i6);

    public abstract void z(int i6, long j6);
}

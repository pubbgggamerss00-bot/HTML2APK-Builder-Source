package com.google.android.gms.internal.consent_sdk;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class h6 implements Iterable, Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final g6 f11768t = new g6(e7.f11717b);
    public int s = 0;

    static {
        int i6 = a6.f11630a;
    }

    public static void j(int i6) {
        if (((i6 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "End index: 47 >= "));
        }
    }

    public abstract byte c(int i6);

    public abstract byte d(int i6);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        int iE = e();
        if (iE != h6Var.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i6 = this.s;
        int i7 = h6Var.s;
        if (i6 == 0 || i7 == 0 || i6 == i7) {
            return i(h6Var);
        }
        return false;
    }

    public abstract int f(int i6, int i7);

    public abstract e6 g();

    public abstract void h(k6 k6Var);

    public final int hashCode() {
        int iF = this.s;
        if (iF == 0) {
            int iE = e();
            iF = f(iE, iE);
            if (iF == 0) {
                iF = 1;
            }
            this.s = iF;
        }
        return iF;
    }

    public abstract boolean i(h6 h6Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new d6(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        String strA = e() <= 50 ? m3.a(this) : m3.a(g()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iE);
        sb.append(" contents=\"");
        return androidx.activity.m.e(sb, strA, "\">");
    }
}

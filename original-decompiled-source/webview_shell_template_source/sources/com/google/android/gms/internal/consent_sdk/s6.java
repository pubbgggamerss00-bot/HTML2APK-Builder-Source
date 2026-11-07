package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s6 {

    /* renamed from: d, reason: collision with root package name */
    public static final s6 f11883d = new s6(0);

    /* renamed from: a, reason: collision with root package name */
    public final g8 f11884a = new g8();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11885b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11886c;

    public s6() {
    }

    public static int a(v8 v8Var, int i6, Object obj) {
        int iE;
        int iC;
        int iC2 = k6.c(i6 << 3);
        if (v8Var == v8.f11920w) {
            iC2 += iC2;
        }
        v8 v8Var2 = v8.f11918u;
        w8 w8Var = w8.s;
        int iD = 4;
        switch (v8Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = k6.f11798b;
                iD = 8;
                return iD + iC2;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = k6.f11798b;
                return iD + iC2;
            case 2:
                iD = k6.d(((Long) obj).longValue());
                return iD + iC2;
            case 3:
                iD = k6.d(((Long) obj).longValue());
                return iD + iC2;
            case 4:
                iD = k6.d(((Integer) obj).intValue());
                return iD + iC2;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = k6.f11798b;
                iD = 8;
                return iD + iC2;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = k6.f11798b;
                return iD + iC2;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = k6.f11798b;
                iD = 1;
                return iD + iC2;
            case 8:
                if (!(obj instanceof h6)) {
                    iD = k6.b((String) obj);
                    return iD + iC2;
                }
                Logger logger6 = k6.f11798b;
                iE = ((h6) obj).e();
                iC = k6.c(iE);
                iD = iC + iE;
                return iD + iC2;
            case 9:
                iD = ((v7) obj).zzn();
                return iD + iC2;
            case 10:
                if (obj instanceof i7) {
                    iE = ((i7) obj).a();
                    iC = k6.c(iE);
                } else {
                    Logger logger7 = k6.f11798b;
                    iE = ((v7) obj).zzn();
                    iC = k6.c(iE);
                }
                iD = iC + iE;
                return iD + iC2;
            case 11:
                if (obj instanceof h6) {
                    Logger logger8 = k6.f11798b;
                    iE = ((h6) obj).e();
                    iC = k6.c(iE);
                } else {
                    Logger logger9 = k6.f11798b;
                    iE = ((byte[]) obj).length;
                    iC = k6.c(iE);
                }
                iD = iC + iE;
                return iD + iC2;
            case 12:
                iD = k6.c(((Integer) obj).intValue());
                return iD + iC2;
            case 13:
                iD = obj instanceof b7 ? k6.d(((b7) obj).zza()) : k6.d(((Integer) obj).intValue());
                return iD + iC2;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = k6.f11798b;
                return iD + iC2;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = k6.f11798b;
                iD = 8;
                return iD + iC2;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iD = k6.c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iD + iC2;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iD = k6.d((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iD + iC2;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void d(k6 k6Var, v8 v8Var, int i6, Object obj) {
        if (v8Var == v8.f11920w) {
            k6Var.s(i6, 3);
            ((v7) obj).a(k6Var);
            k6Var.s(i6, 4);
            return;
        }
        k6Var.s(i6, v8Var.f11922t);
        w8 w8Var = w8.s;
        switch (v8Var.ordinal()) {
            case 0:
                k6Var.m(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                k6Var.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                k6Var.w(((Long) obj).longValue());
                break;
            case 3:
                k6Var.w(((Long) obj).longValue());
                break;
            case 4:
                k6Var.o(((Integer) obj).intValue());
                break;
            case 5:
                k6Var.m(((Long) obj).longValue());
                break;
            case 6:
                k6Var.k(((Integer) obj).intValue());
                break;
            case 7:
                k6Var.e(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof h6)) {
                    k6Var.r((String) obj);
                    break;
                } else {
                    k6Var.i((h6) obj);
                    break;
                }
            case 9:
                ((v7) obj).a(k6Var);
                break;
            case 10:
                k6Var.p((v7) obj);
                break;
            case 11:
                if (!(obj instanceof h6)) {
                    byte[] bArr = (byte[]) obj;
                    k6Var.g(bArr.length, bArr);
                    break;
                } else {
                    k6Var.i((h6) obj);
                    break;
                }
            case 12:
                k6Var.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof b7)) {
                    k6Var.o(((Integer) obj).intValue());
                    break;
                } else {
                    k6Var.o(((b7) obj).zza());
                    break;
                }
            case 14:
                k6Var.k(((Integer) obj).intValue());
                break;
            case 15:
                k6Var.m(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                k6Var.u((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                k6Var.w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static boolean f(Map.Entry entry) {
        ((r6) entry.getKey()).zzc();
        throw null;
    }

    public static final int g(Map.Entry entry) {
        r6 r6Var = (r6) entry.getKey();
        entry.getValue();
        r6Var.zzc();
        throw null;
    }

    public final Iterator b() {
        g8 g8Var = this.f11884a;
        return g8Var.isEmpty() ? Collections.emptyIterator() : this.f11886c ? new h7(((j8) g8Var.entrySet()).iterator()) : ((j8) g8Var.entrySet()).iterator();
    }

    public final void c() {
        if (this.f11885b) {
            return;
        }
        g8 g8Var = this.f11884a;
        int i6 = g8Var.f11802t;
        for (int i7 = 0; i7 < i6; i7++) {
            Object obj = g8Var.d(i7).f11769t;
            if (obj instanceof z6) {
                ((z6) obj).j();
            }
        }
        Iterator it = g8Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof z6) {
                ((z6) value).j();
            }
        }
        g8Var.a();
        this.f11885b = true;
    }

    public final Object clone() {
        s6 s6Var = new s6();
        g8 g8Var = this.f11884a;
        if (g8Var.f11802t > 0) {
            ((r6) g8Var.d(0).s).zze();
            throw null;
        }
        Iterator it = g8Var.b().iterator();
        if (!it.hasNext()) {
            s6Var.f11886c = this.f11886c;
            return s6Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        r6 r6Var = (r6) entry.getKey();
        entry.getValue();
        r6Var.zze();
        throw null;
    }

    public final boolean e() {
        g8 g8Var = this.f11884a;
        if (g8Var.f11802t > 0) {
            f(g8Var.d(0));
            throw null;
        }
        Iterator it = g8Var.b().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s6) {
            return this.f11884a.equals(((s6) obj).f11884a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11884a.hashCode();
    }

    public s6(int i6) {
        c();
        c();
    }
}

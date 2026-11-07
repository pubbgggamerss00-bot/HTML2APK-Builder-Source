package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z42 {

    /* renamed from: d, reason: collision with root package name */
    public static final z42 f11174d = new z42(0);

    /* renamed from: a, reason: collision with root package name */
    public final d72 f11175a = new d72();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11176b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11177c;

    public z42() {
    }

    public static int a(y42 y42Var, Object obj) {
        int iG;
        int iR;
        y42Var.getClass();
        int iR2 = p42.r(0 << 3);
        Enum r12 = null;
        if (w72.s == null) {
            Charset charset = s52.f8801a;
            if (((m62) obj) instanceof u32) {
                throw null;
            }
            iR2 += iR2;
        }
        w72 w72Var = w72.s;
        x72 x72Var = x72.s;
        int iOrdinal = r12.ordinal();
        int iS = 4;
        switch (iOrdinal) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = p42.f7933u;
                iS = 8;
                return iS + iR2;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = p42.f7933u;
                return iS + iR2;
            case 2:
                iS = p42.s(((Long) obj).longValue());
                return iS + iR2;
            case 3:
                iS = p42.s(((Long) obj).longValue());
                return iS + iR2;
            case 4:
                iS = p42.s(((Integer) obj).intValue());
                return iS + iR2;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = p42.f7933u;
                iS = 8;
                return iS + iR2;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = p42.f7933u;
                return iS + iR2;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = p42.f7933u;
                iS = 1;
                return iS + iR2;
            case 8:
                if (!(obj instanceof g42)) {
                    iS = p42.q((String) obj);
                    return iS + iR2;
                }
                Logger logger6 = p42.f7933u;
                iG = ((g42) obj).g();
                iR = p42.r(iG);
                iS = iR + iG;
                return iS + iR2;
            case 9:
                Logger logger7 = p42.f7933u;
                iS = ((m62) obj).c();
                return iS + iR2;
            case 10:
                if (obj instanceof z52) {
                    Logger logger8 = p42.f7933u;
                    iG = ((z52) obj).a();
                    iR = p42.r(iG);
                } else {
                    Logger logger9 = p42.f7933u;
                    iG = ((m62) obj).c();
                    iR = p42.r(iG);
                }
                iS = iR + iG;
                return iS + iR2;
            case 11:
                if (obj instanceof g42) {
                    Logger logger10 = p42.f7933u;
                    iG = ((g42) obj).g();
                    iR = p42.r(iG);
                } else {
                    Logger logger11 = p42.f7933u;
                    iG = ((byte[]) obj).length;
                    iR = p42.r(iG);
                }
                iS = iR + iG;
                return iS + iR2;
            case 12:
                iS = p42.r(((Integer) obj).intValue());
                return iS + iR2;
            case 13:
                iS = obj instanceof l52 ? p42.s(((l52) obj).zza()) : p42.s(((Integer) obj).intValue());
                return iS + iR2;
            case 14:
                ((Integer) obj).getClass();
                Logger logger12 = p42.f7933u;
                return iS + iR2;
            case 15:
                ((Long) obj).getClass();
                Logger logger13 = p42.f7933u;
                iS = 8;
                return iS + iR2;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iS = p42.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iS + iR2;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iS = p42.s((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iS + iR2;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean f(Map.Entry entry) {
        ((y42) entry.getKey()).zzc();
        throw null;
    }

    public static final int g(Map.Entry entry) {
        y42 y42Var = (y42) entry.getKey();
        entry.getValue();
        y42Var.zzc();
        throw null;
    }

    public final Iterator b() {
        d72 d72Var = this.f11175a;
        return d72Var.isEmpty() ? Collections.emptyIterator() : this.f11177c ? new y52(((i72) d72Var.entrySet()).iterator()) : ((i72) d72Var.entrySet()).iterator();
    }

    public final void c() {
        if (this.f11176b) {
            return;
        }
        d72 d72Var = this.f11175a;
        int i6 = d72Var.f5963t;
        for (int i7 = 0; i7 < i6; i7++) {
            Object obj = d72Var.d(i7).f4151t;
            if (obj instanceof j52) {
                ((j52) obj).o();
            }
        }
        Iterator it = d72Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof j52) {
                ((j52) value).o();
            }
        }
        d72Var.a();
        this.f11176b = true;
    }

    public final Object clone() {
        z42 z42Var = new z42();
        d72 d72Var = this.f11175a;
        if (d72Var.f5963t > 0) {
            e72 e72VarD = d72Var.d(0);
            z42Var.d((y42) e72VarD.s, e72VarD.f4151t);
            throw null;
        }
        Iterator it = d72Var.b().iterator();
        if (!it.hasNext()) {
            z42Var.f11177c = this.f11177c;
            return z42Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        z42Var.d((y42) entry.getKey(), entry.getValue());
        throw null;
    }

    public final void d(y42 y42Var, Object obj) {
        y42Var.getClass();
        y42Var.getClass();
        Charset charset = s52.f8801a;
        obj.getClass();
        w72 w72Var = w72.s;
        x72 x72Var = x72.s;
        throw null;
    }

    public final boolean e() {
        d72 d72Var = this.f11175a;
        if (d72Var.f5963t > 0) {
            f(d72Var.d(0));
            throw null;
        }
        Iterator it = d72Var.b().iterator();
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
        if (obj instanceof z42) {
            return this.f11175a.equals(((z42) obj).f11175a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11175a.hashCode();
    }

    public z42(int i6) {
        c();
        c();
    }
}

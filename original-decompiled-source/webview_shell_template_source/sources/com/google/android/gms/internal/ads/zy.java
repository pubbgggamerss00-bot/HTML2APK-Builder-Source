package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zy {

    /* renamed from: a, reason: collision with root package name */
    public static final uw f11601a = new uw();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract jx d(int i6, jx jxVar, boolean z6);

    public abstract cy e(int i6, cy cyVar, long j6);

    public final boolean equals(Object obj) {
        int iH;
        if (this != obj) {
            if (obj instanceof zy) {
                zy zyVar = (zy) obj;
                if (zyVar.c() == c() && zyVar.b() == b()) {
                    cy cyVar = new cy();
                    jx jxVar = new jx();
                    cy cyVar2 = new cy();
                    jx jxVar2 = new jx();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= c()) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= b()) {
                                    int iG = g(true);
                                    if (iG == zyVar.g(true) && (iH = h(true)) == zyVar.h(true)) {
                                        while (iG != iH) {
                                            int iJ = j(iG, 0, true);
                                            if (iJ == zyVar.j(iG, 0, true)) {
                                                iG = iJ;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i7, jxVar, true).equals(zyVar.d(i7, jxVar2, true))) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                        } else {
                            if (!e(i6, cyVar, 0L).equals(zyVar.e(i6, cyVar2, 0L))) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i6);

    public int g(boolean z6) {
        return o() ? -1 : 0;
    }

    public int h(boolean z6) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i6;
        cy cyVar = new cy();
        jx jxVar = new jx();
        int iC = c() + 217;
        int i7 = 0;
        while (true) {
            i6 = iC * 31;
            if (i7 >= c()) {
                break;
            }
            iC = i6 + e(i7, cyVar, 0L).hashCode();
            i7++;
        }
        int iB = b() + i6;
        for (int i8 = 0; i8 < b(); i8++) {
            iB = (iB * 31) + d(i8, jxVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i6, jx jxVar, cy cyVar, int i7, boolean z6) {
        int i8 = d(i6, jxVar, false).f6182c;
        if (e(i8, cyVar, 0L).f3698l != i6) {
            return i6 + 1;
        }
        int iJ = j(i8, i7, z6);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, cyVar, 0L).f3697k;
    }

    public int j(int i6, int i7, boolean z6) {
        if (i7 == 0) {
            if (i6 == h(z6)) {
                return -1;
            }
            return i6 + 1;
        }
        if (i7 == 1) {
            return i6;
        }
        if (i7 == 2) {
            return i6 == h(z6) ? g(z6) : i6 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i6) {
        if (i6 == g(false)) {
            return -1;
        }
        return i6 - 1;
    }

    public final Pair l(cy cyVar, jx jxVar, int i6, long j6) {
        Pair pairM = m(cyVar, jxVar, i6, j6, 0L);
        pairM.getClass();
        return pairM;
    }

    public final Pair m(cy cyVar, jx jxVar, int i6, long j6, long j7) {
        y5.f(i6, c());
        e(i6, cyVar, j7);
        if (j6 == -9223372036854775807L) {
            cyVar.getClass();
            j6 = 0;
        }
        int i7 = cyVar.f3697k;
        d(i7, jxVar, false);
        while (i7 < cyVar.f3698l) {
            jxVar.getClass();
            if (j6 == 0) {
                break;
            }
            int i8 = i7 + 1;
            d(i8, jxVar, false).getClass();
            if (j6 < 0) {
                break;
            }
            i7 = i8;
        }
        d(i7, jxVar, true);
        jxVar.getClass();
        long j8 = jxVar.f6183d;
        if (j8 != -9223372036854775807L) {
            j6 = Math.min(j6, j8 - 1);
        }
        long jMax = Math.max(0L, j6);
        Object obj = jxVar.f6181b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public jx n(Object obj, jx jxVar) {
        return d(a(obj), jxVar, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}

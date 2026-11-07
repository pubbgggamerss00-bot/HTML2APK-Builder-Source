package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w50 {

    /* renamed from: b, reason: collision with root package name */
    public static final w50 f10048b;

    /* renamed from: a, reason: collision with root package name */
    public final bo1 f10049a;

    static {
        zn1 zn1Var = bo1.f3236t;
        f10048b = new w50(cp1.f3636w);
        Integer.toString(0, 36);
    }

    public w50(cp1 cp1Var) {
        this.f10049a = bo1.l(cp1Var);
    }

    public final boolean a(int i6) {
        int i7 = 0;
        while (true) {
            bo1 bo1Var = this.f10049a;
            if (i7 >= bo1Var.size()) {
                return false;
            }
            b50 b50Var = (b50) bo1Var.get(i7);
            boolean[] zArr = b50Var.f2924e;
            int length = zArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (!zArr[i8]) {
                    i8++;
                } else if (b50Var.f2921b.f2533c == i6) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w50.class != obj.getClass()) {
            return false;
        }
        return this.f10049a.equals(((w50) obj).f10049a);
    }

    public final int hashCode() {
        return this.f10049a.hashCode();
    }
}

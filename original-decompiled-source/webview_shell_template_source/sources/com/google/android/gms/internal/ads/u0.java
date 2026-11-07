package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9416a;

    public u0(String str) {
        this.f9416a = str;
    }

    public static u0 a(ex0 ex0Var) {
        String str;
        ex0Var.k(2);
        int iV = ex0Var.v();
        int i6 = iV >> 1;
        int i7 = iV & 1;
        int iV2 = ex0Var.v() >> 3;
        if (i6 == 4 || i6 == 5 || i6 == 7) {
            str = "dvhe";
        } else if (i6 == 8) {
            str = "hev1";
        } else {
            if (i6 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i8 = iV2 | (i7 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i6);
        sb.append(i8 >= 10 ? "." : ".0");
        sb.append(i8);
        return new u0(sb.toString());
    }
}

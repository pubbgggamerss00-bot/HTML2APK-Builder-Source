package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o9 {
    public static int a(l42 l42Var, int i6, int i7, int i8) {
        y5.n(Math.max(Math.max(i6, i7), i8) <= 31);
        int i9 = (1 << i6) - 1;
        int i10 = (1 << i7) - 1;
        iq1.a(iq1.a(i9, i10), 1 << i8);
        if (l42Var.t() >= i6) {
            int iW = l42Var.w(i6);
            if (iW == i9) {
                if (l42Var.t() >= i7) {
                    int iW2 = l42Var.w(i7);
                    iW += iW2;
                    if (iW2 == i10) {
                        if (l42Var.t() >= i8) {
                            return l42Var.w(i8) + iW;
                        }
                    }
                }
            }
            return iW;
        }
        return -1;
    }

    public static void b(l42 l42Var) {
        l42Var.D(3);
        l42Var.D(8);
        boolean zG = l42Var.G();
        boolean zG2 = l42Var.G();
        if (zG) {
            l42Var.D(5);
        }
        if (zG2) {
            l42Var.D(6);
        }
    }

    public static void c(l42 l42Var) {
        int iW;
        int iW2 = l42Var.w(2);
        if (iW2 == 0) {
            l42Var.D(6);
            return;
        }
        int iA = a(l42Var, 5, 8, 16) + 1;
        if (iW2 == 1) {
            l42Var.D(iA * 7);
            return;
        }
        if (iW2 == 2) {
            boolean zG = l42Var.G();
            int i6 = true != zG ? 5 : 1;
            int i7 = true == zG ? 7 : 5;
            int i8 = true == zG ? 8 : 6;
            int i9 = 0;
            while (i9 < iA) {
                if (l42Var.G()) {
                    l42Var.D(7);
                    iW = 0;
                } else {
                    if (l42Var.w(2) == 3 && l42Var.w(i7) * i6 != 0) {
                        l42Var.C();
                    }
                    iW = l42Var.w(i8) * i6;
                    if (iW != 0 && iW != 180) {
                        l42Var.C();
                    }
                    l42Var.C();
                }
                if (iW != 0 && iW != 180 && l42Var.G()) {
                    i9++;
                }
                i9++;
            }
        }
    }
}

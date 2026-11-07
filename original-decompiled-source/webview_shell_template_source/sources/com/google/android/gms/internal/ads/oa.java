package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oa {
    public static boolean a(y0 y0Var) {
        ex0 ex0Var = new ex0(8);
        int i6 = na.a(y0Var, ex0Var).f7361a;
        if (i6 != 1380533830 && i6 != 1380333108) {
            return false;
        }
        y0Var.h(0, 4, ex0Var.f4416a);
        ex0Var.j(0);
        int iQ = ex0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        qs0.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static na b(int i6, y0 y0Var, ex0 ex0Var) throws rn {
        na naVarA = na.a(y0Var, ex0Var);
        while (true) {
            int i7 = naVarA.f7361a;
            if (i7 == i6) {
                return naVarA;
            }
            androidx.activity.m.g(i7, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j6 = naVarA.f7362b;
            long j7 = 8 + j6;
            if ((1 & j6) != 0) {
                j7 = 9 + j6;
            }
            if (j7 > 2147483647L) {
                throw rn.b("Chunk is too large (~2GB+) to skip; id: " + i7);
            }
            y0Var.b((int) j7);
            naVarA = na.a(y0Var, ex0Var);
        }
    }
}

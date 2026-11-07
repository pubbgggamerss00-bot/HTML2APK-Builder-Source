package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z5 {
    public static int a(ex0 ex0Var) {
        int iQ = ex0Var.q();
        if (ex0Var.q() == 1684108385) {
            ex0Var.k(8);
            int i6 = iQ - 16;
            if (i6 == 1) {
                return ex0Var.v();
            }
            if (i6 == 2) {
                return ex0Var.z();
            }
            if (i6 == 3) {
                return ex0Var.x();
            }
            if (i6 == 4 && (ex0Var.f4416a[ex0Var.f4417b] & 128) == 0) {
                return ex0Var.y();
            }
        }
        qs0.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static z3 b(int i6, String str, ex0 ex0Var, boolean z6, boolean z7) {
        int iA = a(ex0Var);
        if (z7) {
            iA = Math.min(1, iA);
        }
        if (iA >= 0) {
            return z6 ? new i4(str, null, bo1.n(Integer.toString(iA))) : new u3("und", str, Integer.toString(iA));
        }
        qs0.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(v61.a(i6)));
        return null;
    }

    public static i4 c(int i6, String str, ex0 ex0Var) {
        int iQ = ex0Var.q();
        if (ex0Var.q() == 1684108385 && iQ >= 22) {
            ex0Var.k(10);
            int iZ = ex0Var.z();
            if (iZ > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZ);
                String string = sb.toString();
                int iZ2 = ex0Var.z();
                if (iZ2 > 0) {
                    string = string + "/" + iZ2;
                }
                return new i4(str, null, bo1.n(string));
            }
        }
        qs0.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(v61.a(i6)));
        return null;
    }

    public static i4 d(int i6, String str, ex0 ex0Var) {
        int iQ = ex0Var.q();
        if (ex0Var.q() == 1684108385) {
            ex0Var.k(8);
            return new i4(str, null, bo1.n(ex0Var.a(iQ - 16)));
        }
        qs0.f("MetadataUtil", "Failed to parse text attribute: ".concat(v61.a(i6)));
        return null;
    }
}

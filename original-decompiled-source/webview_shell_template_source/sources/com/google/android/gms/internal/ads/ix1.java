package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ix1 extends lt1 {

    /* renamed from: a, reason: collision with root package name */
    public final py1 f5876a;

    public ix1(py1 py1Var) {
        this.f5876a = py1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f5876a.f8181b.F() != q22.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ix1)) {
            return false;
        }
        py1 py1Var = ((ix1) obj).f5876a;
        py1 py1Var2 = this.f5876a;
        q22 q22VarF = py1Var2.f8181b.F();
        x12 x12Var = py1Var.f8181b;
        x12 x12Var2 = py1Var.f8181b;
        return q22VarF.equals(x12Var.F()) && py1Var2.f8181b.H().equals(x12Var2.H()) && py1Var2.f8181b.G().equals(x12Var2.G());
    }

    public final int hashCode() {
        py1 py1Var = this.f5876a;
        return Objects.hash(py1Var.f8181b, py1Var.f8180a);
    }

    public final String toString() {
        py1 py1Var = this.f5876a;
        String strH = py1Var.f8181b.H();
        int iOrdinal = py1Var.f8181b.F().ordinal();
        return "(typeUrl=" + strH + ", outputPrefixType=" + (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}

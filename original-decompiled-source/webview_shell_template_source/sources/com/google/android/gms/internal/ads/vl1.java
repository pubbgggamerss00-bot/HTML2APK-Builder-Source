package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vl1 extends rl1 {
    public final Object s;

    public vl1(Object obj) {
        this.s = obj;
    }

    @Override // com.google.android.gms.internal.ads.rl1
    public final rl1 a(pl1 pl1Var) {
        Object objApply = pl1Var.apply(this.s);
        sl1.c("the Function passed to Optional.transform() must not return null.", objApply);
        return new vl1(objApply);
    }

    @Override // com.google.android.gms.internal.ads.rl1
    public final Object b() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl1) {
            return this.s.equals(((vl1) obj).s);
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode() + 1502476572;
    }

    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("Optional.of(", this.s.toString(), ")");
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hf implements rn1 {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5373t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5374u;

    public /* synthetic */ hf(ja0 ja0Var, String str, boolean z6) {
        this.f5374u = ja0Var;
        this.s = str;
        this.f5373t = z6;
    }

    @Override // com.google.android.gms.internal.ads.rn1
    public lo1 zza() {
        ja0 ja0Var = (ja0) this.f5374u;
        ja0 ja0Var2 = true != this.f5373t ? null : ja0Var;
        o80 o80Var = ja0Var.f5991x;
        return new ma0(this.s, ja0Var2, o80Var.f7634d, o80Var.f7635e, o80Var.f7642m, o80Var.f7643n);
    }

    public hf(yc ycVar) {
        this.s = ycVar.E();
        this.f5373t = ycVar.H();
        this.f5374u = ycVar.C();
        ycVar.D();
    }

    @Deprecated
    public hf(String str) {
        this.s = str;
        this.f5373t = false;
        this.f5374u = gd.C();
        int i6 = jd.zza;
    }
}

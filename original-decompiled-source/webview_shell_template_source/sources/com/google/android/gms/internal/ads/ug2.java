package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ug2 implements mi2 {

    /* renamed from: a, reason: collision with root package name */
    public final mi2 f9559a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vg2 f9561c;

    public ug2(vg2 vg2Var, mi2 mi2Var) {
        this.f9561c = vg2Var;
        this.f9559a = mi2Var;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int a(long j6) {
        if (this.f9561c.g()) {
            return -3;
        }
        return this.f9559a.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int b(ro0 ro0Var, ja2 ja2Var, int i6) {
        vg2 vg2Var = this.f9561c;
        if (vg2Var.g()) {
            return -3;
        }
        if (this.f9560b) {
            ja2Var.f2614a = 4;
            return -4;
        }
        long jZzb = vg2Var.zzb();
        int iB = this.f9559a.b(ro0Var, ja2Var, i6);
        if (iB != -5) {
            long j6 = vg2Var.f9865w;
            if (j6 == Long.MIN_VALUE || ((iB != -4 || ja2Var.f6005f < j6) && !(iB == -3 && jZzb == Long.MIN_VALUE && !ja2Var.f6004e))) {
                return iB;
            }
            ja2Var.c();
            ja2Var.f2614a = 4;
            this.f9560b = true;
            return -4;
        }
        w wVar = (w) ro0Var.s;
        wVar.getClass();
        int i7 = wVar.F;
        int i8 = wVar.E;
        if (i8 == 0) {
            if (i7 == 0) {
                return -5;
            }
            i8 = 0;
        }
        if (vg2Var.f9865w != Long.MIN_VALUE) {
            i7 = 0;
        }
        tk2 tk2Var = new tk2(wVar);
        tk2Var.D = i8;
        tk2Var.E = i7;
        ro0Var.s = new w(tk2Var);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void zzd() {
        this.f9559a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final boolean zze() {
        return !this.f9561c.g() && this.f9559a.zze();
    }
}

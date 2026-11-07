package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xg2 implements th2, df2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10584a;

    /* renamed from: b, reason: collision with root package name */
    public sh2 f10585b;

    /* renamed from: c, reason: collision with root package name */
    public cf2 f10586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg2 f10587d;

    public xg2(zg2 zg2Var, Object obj) {
        this.f10587d = zg2Var;
        this.f10585b = new sh2(zg2Var.f8930c.f8939b, null);
        this.f10586c = new cf2(zg2Var.f8931d.f3560b, null);
        this.f10584a = obj;
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void a(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        if (j(oh2Var)) {
            sh2 sh2Var = this.f10585b;
            lh2 lh2VarI = i(lh2Var, oh2Var);
            sh2Var.getClass();
            sh2Var.a(new k00(sh2Var, fh2Var, lh2VarI));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void d(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        if (j(oh2Var)) {
            sh2 sh2Var = this.f10585b;
            lh2 lh2VarI = i(lh2Var, oh2Var);
            sh2Var.getClass();
            sh2Var.a(new com.google.android.gms.ads.mediation.customevent.b(sh2Var, fh2Var, lh2VarI));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void f(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        if (j(oh2Var)) {
            sh2 sh2Var = this.f10585b;
            lh2 lh2VarI = i(lh2Var, oh2Var);
            sh2Var.getClass();
            sh2Var.a(new wv0(sh2Var, fh2Var, lh2VarI));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void g(int i6, oh2 oh2Var, lh2 lh2Var) {
        if (j(oh2Var)) {
            sh2 sh2Var = this.f10585b;
            lh2 lh2VarI = i(lh2Var, oh2Var);
            sh2Var.getClass();
            sh2Var.a(new com.google.android.gms.ads.mediation.customevent.a(11, sh2Var, lh2VarI));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void h(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var, IOException iOException, boolean z6) {
        if (j(oh2Var)) {
            sh2 sh2Var = this.f10585b;
            lh2 lh2VarI = i(lh2Var, oh2Var);
            sh2Var.getClass();
            sh2Var.a(new py0(sh2Var, fh2Var, lh2VarI, iOException, z6));
        }
    }

    public final lh2 i(lh2 lh2Var, oh2 oh2Var) {
        long j6 = lh2Var.f6746c;
        zg2 zg2Var = this.f10587d;
        Object obj = this.f10584a;
        zg2Var.u(j6, obj);
        long j7 = lh2Var.f6747d;
        zg2Var.u(j7, obj);
        return (j6 == lh2Var.f6746c && j7 == lh2Var.f6747d) ? lh2Var : new lh2(lh2Var.f6744a, lh2Var.f6745b, j6, j7);
    }

    public final boolean j(oh2 oh2Var) {
        oh2 oh2VarV;
        Object obj = this.f10584a;
        zg2 zg2Var = this.f10587d;
        if (oh2Var != null) {
            oh2VarV = zg2Var.v(obj, oh2Var);
            if (oh2VarV == null) {
                return false;
            }
        } else {
            oh2VarV = null;
        }
        zg2Var.t(obj);
        sh2 sh2Var = this.f10585b;
        sh2Var.getClass();
        if (!Objects.equals(sh2Var.f8938a, oh2VarV)) {
            this.f10585b = new sh2(zg2Var.f8930c.f8939b, oh2VarV);
        }
        cf2 cf2Var = this.f10586c;
        cf2Var.getClass();
        if (Objects.equals(cf2Var.f3559a, oh2VarV)) {
            return true;
        }
        this.f10586c = new cf2(zg2Var.f8931d.f3560b, oh2VarV);
        return true;
    }
}

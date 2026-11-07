package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7558b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7559c;

    /* renamed from: d, reason: collision with root package name */
    public int f7560d;

    /* renamed from: e, reason: collision with root package name */
    public int f7561e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f7562f;

    /* renamed from: g, reason: collision with root package name */
    public s1 f7563g;

    public o1(int i6, int i7, String str) {
        this.f7557a = i6;
        this.f7558b = i7;
        this.f7559c = str;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        if (j6 == 0 || this.f7561e == 1) {
            this.f7561e = 1;
            this.f7560d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        int i6 = this.f7558b;
        int i7 = this.f7557a;
        y5.r((i7 == -1 || i6 == -1) ? false : true);
        ex0 ex0Var = new ex0(i6);
        ((p0) y0Var).g(ex0Var.f4416a, 0, i6, false);
        return ex0Var.z() == i7;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        int i6 = this.f7561e;
        if (i6 != 1) {
            if (i6 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        s1 s1Var = this.f7563g;
        s1Var.getClass();
        int iD = s1Var.d(y0Var, 1024, true);
        if (iD != -1) {
            this.f7560d += iD;
            return 0;
        }
        this.f7561e = 2;
        this.f7563g.a(0L, 1, this.f7560d, 0, null);
        this.f7560d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f7562f = z0Var;
        s1 s1VarG = z0Var.g(1024, 4);
        this.f7563g = s1VarG;
        tk2 tk2Var = new tk2();
        tk2Var.c(this.f7559c);
        s1VarG.b(new w(tk2Var));
        this.f7562f.d();
        this.f7562f.f(new p1());
        this.f7561e = 1;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}

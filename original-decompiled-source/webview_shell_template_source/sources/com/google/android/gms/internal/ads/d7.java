package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d7 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f3773a;

    /* renamed from: b, reason: collision with root package name */
    public final z6 f3774b;

    /* renamed from: g, reason: collision with root package name */
    public a7 f3779g;
    public w h;

    /* renamed from: d, reason: collision with root package name */
    public int f3776d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3777e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3778f = j31.f5919f;

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f3775c = new ex0();

    public d7(s1 s1Var, z6 z6Var) {
        this.f3773a = s1Var;
        this.f3774b = z6Var;
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void a(long j6, int i6, int i7, int i8, r1 r1Var) {
        if (this.f3779g == null) {
            this.f3773a.a(j6, i6, i7, i8, r1Var);
            return;
        }
        y5.p("DRM on subtitles is not supported", r1Var == null);
        int i9 = (this.f3777e - i8) - i7;
        this.f3779g.b(this.f3778f, i9, i7, new c7(this, j6, i6));
        int i10 = i9 + i7;
        this.f3776d = i10;
        if (i10 == this.f3777e) {
            this.f3776d = 0;
            this.f3777e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void b(w wVar) {
        String str = wVar.f9978m;
        str.getClass();
        y5.n(bk.b(str) == 3);
        boolean zEquals = wVar.equals(this.h);
        z6 z6Var = this.f3774b;
        if (!zEquals) {
            this.h = wVar;
            this.f3779g = z6Var.a(wVar) ? z6Var.c(wVar) : null;
        }
        a7 a7Var = this.f3779g;
        s1 s1Var = this.f3773a;
        if (a7Var == null) {
            s1Var.b(wVar);
            return;
        }
        tk2 tk2Var = new tk2(wVar);
        tk2Var.c("application/x-media3-cues");
        tk2Var.f9327i = wVar.f9978m;
        tk2Var.f9335q = Long.MAX_VALUE;
        tk2Var.G = z6Var.e(wVar);
        s1Var.b(new w(tk2Var));
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final int c(gc2 gc2Var, int i6, boolean z6) throws EOFException {
        if (this.f3779g == null) {
            return this.f3773a.c(gc2Var, i6, z6);
        }
        g(i6);
        int iJ = gc2Var.j(this.f3777e, i6, this.f3778f);
        if (iJ != -1) {
            this.f3777e += iJ;
            return iJ;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final int d(gc2 gc2Var, int i6, boolean z6) {
        return c(gc2Var, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void e(int i6, ex0 ex0Var) {
        f(ex0Var, i6, 0);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void f(ex0 ex0Var, int i6, int i7) {
        if (this.f3779g == null) {
            this.f3773a.f(ex0Var, i6, i7);
            return;
        }
        g(i6);
        ex0Var.f(this.f3777e, i6, this.f3778f);
        this.f3777e += i6;
    }

    public final void g(int i6) {
        int length = this.f3778f.length;
        int i7 = this.f3777e;
        if (length - i7 >= i6) {
            return;
        }
        int i8 = i7 - this.f3776d;
        int iMax = Math.max(i8 + i8, i6 + i8);
        byte[] bArr = this.f3778f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f3776d, bArr2, 0, i8);
        this.f3776d = 0;
        this.f3777e = i8;
        this.f3778f = bArr2;
    }
}

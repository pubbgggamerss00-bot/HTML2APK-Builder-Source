package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w9 implements fa {

    /* renamed from: a, reason: collision with root package name */
    public final v9 f10120a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f10121b = new ex0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f10122c;

    /* renamed from: d, reason: collision with root package name */
    public int f10123d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10124e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10125f;

    public w9(v9 v9Var) {
        this.f10120a = v9Var;
    }

    @Override // com.google.android.gms.internal.ads.fa
    public final void a(int i6, ex0 ex0Var) {
        int i7 = i6 & 1;
        int iV = i7 != 0 ? ex0Var.f4417b + ex0Var.v() : -1;
        if (this.f10125f) {
            if (i7 == 0) {
                return;
            }
            this.f10125f = false;
            ex0Var.j(iV);
            this.f10123d = 0;
        }
        while (ex0Var.o() > 0) {
            int i8 = this.f10123d;
            ex0 ex0Var2 = this.f10121b;
            if (i8 < 3) {
                if (i8 == 0) {
                    int iV2 = ex0Var.v();
                    ex0Var.j(ex0Var.f4417b - 1);
                    if (iV2 == 255) {
                        this.f10125f = true;
                        return;
                    }
                }
                int iMin = Math.min(ex0Var.o(), 3 - this.f10123d);
                ex0Var.f(this.f10123d, iMin, ex0Var2.f4416a);
                int i9 = this.f10123d + iMin;
                this.f10123d = i9;
                if (i9 == 3) {
                    ex0Var2.j(0);
                    ex0Var2.i(3);
                    ex0Var2.k(1);
                    int iV3 = ex0Var2.v();
                    boolean z6 = (iV3 & 128) != 0;
                    int iV4 = ex0Var2.v();
                    this.f10124e = z6;
                    int i10 = (((iV3 & 15) << 8) | iV4) + 3;
                    this.f10122c = i10;
                    byte[] bArr = ex0Var2.f4416a;
                    if (bArr.length < i10) {
                        int length = bArr.length;
                        ex0Var2.e(Math.min(4098, Math.max(i10, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(ex0Var.o(), this.f10122c - i8);
                ex0Var.f(this.f10123d, iMin2, ex0Var2.f4416a);
                int i11 = this.f10123d + iMin2;
                this.f10123d = i11;
                int i12 = this.f10122c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f10124e) {
                        ex0Var2.i(i12);
                    } else {
                        if (j31.k(0, ex0Var2.f4416a, i12, -1) != 0) {
                            this.f10125f = true;
                            return;
                        }
                        ex0Var2.i(this.f10122c - 4);
                    }
                    ex0Var2.j(0);
                    this.f10120a.c(ex0Var2);
                    this.f10123d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fa
    public final void b(m11 m11Var, z0 z0Var, ea eaVar) {
        this.f10120a.b(m11Var, z0Var, eaVar);
        this.f10125f = true;
    }

    @Override // com.google.android.gms.internal.ads.fa
    public final void zzc() {
        this.f10125f = true;
    }
}

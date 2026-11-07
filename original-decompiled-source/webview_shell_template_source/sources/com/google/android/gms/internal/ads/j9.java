package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j9 implements z8 {

    /* renamed from: b, reason: collision with root package name */
    public s1 f5978b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5979c;

    /* renamed from: e, reason: collision with root package name */
    public int f5981e;

    /* renamed from: f, reason: collision with root package name */
    public int f5982f;

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f5977a = new ex0(10);

    /* renamed from: d, reason: collision with root package name */
    public long f5980d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        int i6;
        y5.k(this.f5978b);
        if (this.f5979c && (i6 = this.f5981e) != 0 && this.f5982f == i6) {
            y5.r(this.f5980d != -9223372036854775807L);
            this.f5978b.a(this.f5980d, 1, this.f5981e, 0, null);
            this.f5979c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void c(ex0 ex0Var) {
        y5.k(this.f5978b);
        if (this.f5979c) {
            int iO = ex0Var.o();
            int i6 = this.f5982f;
            if (i6 < 10) {
                int iMin = Math.min(iO, 10 - i6);
                byte[] bArr = ex0Var.f4416a;
                int i7 = ex0Var.f4417b;
                ex0 ex0Var2 = this.f5977a;
                System.arraycopy(bArr, i7, ex0Var2.f4416a, this.f5982f, iMin);
                if (this.f5982f + iMin == 10) {
                    ex0Var2.j(0);
                    if (ex0Var2.v() != 73 || ex0Var2.v() != 68 || ex0Var2.v() != 51) {
                        qs0.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5979c = false;
                        return;
                    } else {
                        ex0Var2.k(3);
                        this.f5981e = ex0Var2.u() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iO, this.f5981e - this.f5982f);
            this.f5978b.e(iMin2, ex0Var);
            this.f5982f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 5);
        this.f5978b = s1VarG;
        tk2 tk2Var = new tk2();
        eaVar.b();
        tk2Var.f9320a = eaVar.f4182e;
        tk2Var.c("application/id3");
        s1VarG.b(new w(tk2Var));
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f5979c = true;
        this.f5980d = j6;
        this.f5981e = 0;
        this.f5982f = 0;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f5979c = false;
        this.f5980d = -9223372036854775807L;
    }
}

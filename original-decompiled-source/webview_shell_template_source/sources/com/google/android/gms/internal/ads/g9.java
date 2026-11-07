package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g9 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final x9 f4941a;

    /* renamed from: e, reason: collision with root package name */
    public long f4945e;

    /* renamed from: g, reason: collision with root package name */
    public String f4947g;
    public s1 h;

    /* renamed from: i, reason: collision with root package name */
    public f9 f4948i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4949j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4951l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f4946f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final p9 f4942b = new p9(7);

    /* renamed from: c, reason: collision with root package name */
    public final p9 f4943c = new p9(8);

    /* renamed from: d, reason: collision with root package name */
    public final p9 f4944d = new p9(6);

    /* renamed from: k, reason: collision with root package name */
    public long f4950k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final ex0 f4952m = new ex0();

    public g9(x9 x9Var) {
        this.f4941a = x9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        y5.k(this.h);
        int i6 = j31.f5914a;
        if (z6) {
            char c7 = 0;
            this.f4941a.f10444c.d(0);
            f9 f9Var = this.f4948i;
            long j6 = this.f4945e;
            boolean z7 = f9Var.f4563k;
            boolean z8 = f9Var.f4562j;
            int i7 = f9Var.f4557d;
            if (i7 == 5 || (z7 && i7 == 1)) {
                c7 = 1;
            }
            boolean z9 = (z8 ? 1 : 0) | c7;
            f9Var.f4562j = z9;
            f9Var.f4558e = j6;
            long j7 = f9Var.f4561i;
            if (j7 != -9223372036854775807L) {
                f9Var.f4554a.a(j7, z9 ? 1 : 0, (int) (j6 - f9Var.h), 0, null);
            }
            f9Var.f4560g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020c  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        p9 p9Var;
        p9 p9Var2;
        p9 p9Var3;
        int i6;
        byte[] bArr;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        long j6;
        ba baVar;
        boolean z6;
        int i10;
        ba baVar2 = this.f4941a.f10444c;
        y5.k(this.h);
        int i11 = j31.f5914a;
        int i12 = ex0Var.f4417b;
        int i13 = ex0Var.f4418c;
        byte[] bArr3 = ex0Var.f4416a;
        this.f4945e += ex0Var.o();
        this.h.e(ex0Var.o(), ex0Var);
        while (true) {
            int iA = uf1.a(bArr3, i12, i13, this.f4946f);
            p9Var = this.f4944d;
            p9Var2 = this.f4943c;
            p9Var3 = this.f4942b;
            if (iA == i13) {
                break;
            }
            int i14 = iA + 3;
            int i15 = bArr3[i14] & 31;
            int i16 = iA - i12;
            if (i16 > 0) {
                if (!this.f4949j) {
                    p9Var3.b(i12, iA, bArr3);
                    p9Var2.b(i12, iA, bArr3);
                }
                p9Var.b(i12, iA, bArr3);
            }
            int i17 = i13 - iA;
            long j7 = this.f4945e - i17;
            int i18 = i16 < 0 ? -i16 : 0;
            long j8 = this.f4950k;
            if (this.f4949j) {
                i7 = i13;
                bArr2 = bArr3;
                i8 = i14;
                i9 = i15;
                j6 = j7;
            } else {
                p9Var3.e(i18);
                p9Var2.e(i18);
                if (this.f4949j) {
                    i7 = i13;
                    bArr2 = bArr3;
                    i8 = i14;
                    i9 = i15;
                    j6 = j7;
                    if (p9Var3.f7994c) {
                        bf1 bf1VarE = uf1.e(4, p9Var3.f7995d, (byte[]) p9Var3.f7996e);
                        int i19 = bf1VarE.f3166m;
                        baVar2.getClass();
                        y5.r(i19 >= 0);
                        baVar2.s = i19;
                        baVar2.d(i19);
                        this.f4948i.f4555b.append(bf1VarE.f3158d, bf1VarE);
                        p9Var3.c();
                    } else if (p9Var2.f7994c) {
                        lg1 lg1Var = new lg1((byte[]) p9Var2.f7996e, 4, p9Var2.f7995d);
                        int iG = lg1Var.g();
                        lg1Var.g();
                        lg1Var.c();
                        lg1Var.f();
                        this.f4948i.f4556c.append(iG, new bq(iG));
                        p9Var2.c();
                    }
                } else if (p9Var3.f7994c && p9Var2.f7994c) {
                    ArrayList arrayList = new ArrayList();
                    i8 = i14;
                    arrayList.add(Arrays.copyOf((byte[]) p9Var3.f7996e, p9Var3.f7995d));
                    arrayList.add(Arrays.copyOf((byte[]) p9Var2.f7996e, p9Var2.f7995d));
                    i7 = i13;
                    bf1 bf1VarE2 = uf1.e(4, p9Var3.f7995d, (byte[]) p9Var3.f7996e);
                    bArr2 = bArr3;
                    j6 = j7;
                    lg1 lg1Var2 = new lg1((byte[]) p9Var2.f7996e, 4, p9Var2.f7995d);
                    int iG2 = lg1Var2.g();
                    lg1Var2.g();
                    lg1Var2.c();
                    lg1Var2.f();
                    bq bqVar = new bq(iG2);
                    int i20 = bf1VarE2.f3155a;
                    int i21 = bf1VarE2.f3156b;
                    int i22 = bf1VarE2.f3157c;
                    byte[] bArr4 = sl0.f8977a;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i20), Integer.valueOf(i21), Integer.valueOf(i22));
                    s1 s1Var = this.h;
                    tk2 tk2Var = new tk2();
                    i9 = i15;
                    tk2Var.f9320a = this.f4947g;
                    tk2Var.c("video/avc");
                    tk2Var.f9327i = str;
                    tk2Var.s = bf1VarE2.f3159e;
                    tk2Var.f9337t = bf1VarE2.f3160f;
                    tk2Var.f9343z = new mb2(bf1VarE2.f3163j, bf1VarE2.f3164k, bf1VarE2.f3165l, bf1VarE2.h + 8, bf1VarE2.f3162i + 8, null);
                    tk2Var.f9340w = bf1VarE2.f3161g;
                    tk2Var.f9333o = arrayList;
                    tk2Var.f9332n = bf1VarE2.f3166m;
                    s1Var.b(new w(tk2Var));
                    this.f4949j = true;
                    this.f4948i.f4555b.append(bf1VarE2.f3158d, bf1VarE2);
                    this.f4948i.f4556c.append(iG2, bqVar);
                    p9Var3.c();
                    p9Var2.c();
                }
            }
            if (p9Var.e(i18)) {
                int iB = uf1.b(p9Var.f7995d, (byte[]) p9Var.f7996e);
                byte[] bArr5 = (byte[]) p9Var.f7996e;
                ex0 ex0Var2 = this.f4952m;
                ex0Var2.h(iB, bArr5);
                ex0Var2.j(4);
                baVar2.a(j8, ex0Var2);
            }
            f9 f9Var = this.f4948i;
            boolean z7 = this.f4949j;
            if (f9Var.f4557d != 9) {
                baVar = baVar2;
                z6 = true;
            } else if (z7 && f9Var.f4560g) {
                long j9 = f9Var.f4558e;
                int i23 = i17 + ((int) (j6 - j9));
                long j10 = f9Var.f4561i;
                if (j10 != -9223372036854775807L) {
                    baVar = baVar2;
                    f9Var.f4554a.a(j10, f9Var.f4562j ? 1 : 0, (int) (j9 - f9Var.h), i23, null);
                }
                f9Var.h = f9Var.f4558e;
                f9Var.f4561i = f9Var.f4559f;
                f9Var.f4562j = false;
                z6 = true;
                f9Var.f4560g = true;
            } else {
                baVar = baVar2;
                f9Var.h = f9Var.f4558e;
                f9Var.f4561i = f9Var.f4559f;
                f9Var.f4562j = false;
                z6 = true;
                f9Var.f4560g = true;
            }
            boolean z8 = f9Var.f4563k;
            boolean z9 = f9Var.f4562j;
            int i24 = f9Var.f4557d;
            if (i24 != 5 && (!z8 || i24 != z6)) {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            f9Var.f4562j = z10;
            if (z10) {
                this.f4951l = false;
            }
            long j11 = this.f4950k;
            if (this.f4949j) {
                i10 = i9;
            } else {
                i10 = i9;
                p9Var3.d(i10);
                p9Var2.d(i10);
            }
            p9Var.d(i10);
            f9 f9Var2 = this.f4948i;
            boolean z11 = this.f4951l;
            f9Var2.f4557d = i10;
            f9Var2.f4559f = j11;
            f9Var2.f4558e = j6;
            f9Var2.f4563k = z11;
            baVar2 = baVar;
            i12 = i8;
            i13 = i7;
            bArr3 = bArr2;
        }
        int i25 = i13;
        byte[] bArr6 = bArr3;
        if (this.f4949j) {
            i6 = i25;
            bArr = bArr6;
        } else {
            i6 = i25;
            bArr = bArr6;
            p9Var3.b(i12, i6, bArr);
            p9Var2.b(i12, i6, bArr);
        }
        p9Var.b(i12, i6, bArr);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f4947g = eaVar.f4182e;
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 2);
        this.h = s1VarG;
        this.f4948i = new f9(s1VarG);
        this.f4941a.a(z0Var, eaVar);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f4950k = j6;
        int i7 = i6 & 2;
        this.f4951l = (i7 != 0) | this.f4951l;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f4945e = 0L;
        this.f4951l = false;
        this.f4950k = -9223372036854775807L;
        uf1.f(this.f4946f);
        this.f4942b.c();
        this.f4943c.c();
        this.f4944d.c();
        this.f4941a.f10444c.d(0);
        f9 f9Var = this.f4948i;
        if (f9Var != null) {
            f9Var.f4560g = false;
        }
    }
}

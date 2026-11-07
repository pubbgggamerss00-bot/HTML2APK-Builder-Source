package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f10037a;

    /* renamed from: d, reason: collision with root package name */
    public i6 f10040d;

    /* renamed from: e, reason: collision with root package name */
    public t5 f10041e;

    /* renamed from: f, reason: collision with root package name */
    public int f10042f;

    /* renamed from: g, reason: collision with root package name */
    public int f10043g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f10044i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10047l;

    /* renamed from: b, reason: collision with root package name */
    public final h6 f10038b = new h6();

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f10039c = new ex0();

    /* renamed from: j, reason: collision with root package name */
    public final ex0 f10045j = new ex0(1);

    /* renamed from: k, reason: collision with root package name */
    public final ex0 f10046k = new ex0();

    public w5(s1 s1Var, i6 i6Var, t5 t5Var) {
        this.f10037a = s1Var;
        this.f10040d = i6Var;
        this.f10041e = t5Var;
        this.f10040d = i6Var;
        this.f10041e = t5Var;
        s1Var.b(i6Var.f5568a.f4497g);
        d();
    }

    public final int a() {
        int i6 = !this.f10047l ? this.f10040d.f5574g[this.f10042f] : this.f10038b.f5275j[this.f10042f] ? 1 : 0;
        return c() != null ? i6 | 1073741824 : i6;
    }

    public final int b(int i6, int i7) {
        ex0 ex0Var;
        g6 g6VarC = c();
        if (g6VarC == null) {
            return 0;
        }
        int length = g6VarC.f4905d;
        h6 h6Var = this.f10038b;
        if (length != 0) {
            ex0Var = h6Var.f5279n;
        } else {
            byte[] bArr = g6VarC.f4906e;
            int i8 = j31.f5914a;
            length = bArr.length;
            ex0 ex0Var2 = this.f10046k;
            ex0Var2.h(length, bArr);
            ex0Var = ex0Var2;
        }
        boolean z6 = h6Var.f5276k && h6Var.f5277l[this.f10042f];
        boolean z7 = z6 || i7 != 0;
        int i9 = true != z7 ? 0 : 128;
        ex0 ex0Var3 = this.f10045j;
        ex0Var3.f4416a[0] = (byte) (i9 | length);
        ex0Var3.j(0);
        s1 s1Var = this.f10037a;
        s1Var.f(ex0Var3, 1, 1);
        s1Var.f(ex0Var, length, 1);
        if (!z7) {
            return length + 1;
        }
        ex0 ex0Var4 = this.f10039c;
        if (!z6) {
            ex0Var4.g(8);
            byte[] bArr2 = ex0Var4.f4416a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i7;
            bArr2[4] = (byte) ((i6 >> 24) & 255);
            bArr2[5] = (byte) ((i6 >> 16) & 255);
            bArr2[6] = (byte) ((i6 >> 8) & 255);
            bArr2[7] = (byte) (i6 & 255);
            s1Var.f(ex0Var4, 8, 1);
            return length + 9;
        }
        int i10 = length + 1;
        ex0 ex0Var5 = h6Var.f5279n;
        int iZ = ex0Var5.z();
        ex0Var5.k(-2);
        int i11 = (iZ * 6) + 2;
        if (i7 != 0) {
            ex0Var4.g(i11);
            byte[] bArr3 = ex0Var4.f4416a;
            ex0Var5.f(0, i11, bArr3);
            int i12 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i7;
            bArr3[2] = (byte) ((i12 >> 8) & 255);
            bArr3[3] = (byte) (i12 & 255);
        } else {
            ex0Var4 = ex0Var5;
        }
        s1Var.f(ex0Var4, i11, 1);
        return i10 + i11;
    }

    public final g6 c() {
        if (!this.f10047l) {
            return null;
        }
        h6 h6Var = this.f10038b;
        t5 t5Var = h6Var.f5267a;
        int i6 = j31.f5914a;
        int i7 = t5Var.f9104a;
        g6 g6Var = h6Var.f5278m;
        if (g6Var == null) {
            g6Var = this.f10040d.f5568a.f4501l[i7];
        }
        if (g6Var == null || !g6Var.f4902a) {
            return null;
        }
        return g6Var;
    }

    public final void d() {
        h6 h6Var = this.f10038b;
        h6Var.f5270d = 0;
        h6Var.f5281p = 0L;
        h6Var.f5282q = false;
        h6Var.f5276k = false;
        h6Var.f5280o = false;
        h6Var.f5278m = null;
        this.f10042f = 0;
        this.h = 0;
        this.f10043g = 0;
        this.f10044i = 0;
        this.f10047l = false;
    }

    public final boolean e() {
        this.f10042f++;
        if (!this.f10047l) {
            return false;
        }
        int i6 = this.f10043g + 1;
        this.f10043g = i6;
        int[] iArr = this.f10038b.f5273g;
        int i7 = this.h;
        if (i6 != iArr[i7]) {
            return true;
        }
        this.h = i7 + 1;
        this.f10043g = 0;
        return false;
    }
}

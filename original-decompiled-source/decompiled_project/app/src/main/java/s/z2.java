package s;

import s.s;
import s.u;

/* loaded from: classes.dex */
public final class z2<V extends s> implements t2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final p.x f24078a;

    /* renamed from: b, reason: collision with root package name */
    public final p.y f24079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24080c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f24081d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f24082e = s2.f23919a;

    /* renamed from: f, reason: collision with root package name */
    public float[] f24083f;

    /* renamed from: g, reason: collision with root package name */
    public V f24084g;

    /* renamed from: h, reason: collision with root package name */
    public V f24085h;

    /* renamed from: i, reason: collision with root package name */
    public V f24086i;

    /* renamed from: j, reason: collision with root package name */
    public V f24087j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f24088k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f24089l;

    /* renamed from: m, reason: collision with root package name */
    public u f24090m;

    public z2(p.x xVar, p.y yVar, int i10, b0 b0Var) {
        this.f24078a = xVar;
        this.f24079b = yVar;
        this.f24080c = i10;
        this.f24081d = b0Var;
        float[] fArr = s2.f23920b;
        this.f24083f = fArr;
        this.f24088k = fArr;
        this.f24089l = fArr;
        this.f24090m = s2.f23921c;
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        int[] iArr = s2.f23919a;
        int i10 = 0;
        long j11 = (j10 / 1000000) - 0;
        long j12 = this.f24080c;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 < 0) {
            return v12;
        }
        j(v10, v11, v12);
        V v13 = this.f24085h;
        kotlin.jvm.internal.r.b(v13);
        if (this.f24090m != s2.f23921c) {
            int i11 = (int) j13;
            float fI = i(h(i11), i11, false);
            float[] fArr = this.f24089l;
            u.a[][] aVarArr = this.f24090m.f23929a;
            float f10 = aVarArr[0][0].f23930a;
            float f11 = aVarArr[aVarArr.length - 1][0].f23931b;
            if (fI < f10) {
                fI = f10;
            }
            if (fI <= f11) {
                f11 = fI;
            }
            int length = fArr.length;
            boolean z10 = false;
            for (u.a[] aVarArr2 : aVarArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    u.a aVar = aVarArr2[i13];
                    if (f11 <= aVar.f23931b) {
                        if (aVar.f23945p) {
                            fArr[i12] = aVar.f23946q;
                            fArr[i12 + 1] = aVar.f23947r;
                        } else {
                            aVar.c(f11);
                            fArr[i12] = aVar.a();
                            fArr[i12 + 1] = aVar.b();
                        }
                        z10 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z10) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                v13.e(fArr[i10], i10);
                i10++;
            }
        } else {
            s sVarD = d((j13 - 1) * 1000000, v10, v11, v12);
            s sVarD2 = d(j13 * 1000000, v10, v11, v12);
            int iB = sVarD.b();
            while (i10 < iB) {
                v13.e((sVarD.a(i10) - sVarD2.a(i10)) * 1000.0f, i10);
                i10++;
            }
        }
        return v13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        V v13;
        V v14;
        float f10;
        u.a[][] aVarArr;
        boolean z10;
        V v15 = v10;
        V v16 = v11;
        int[] iArr = s2.f23919a;
        int i10 = 0;
        long j11 = (j10 / 1000000) - 0;
        int i11 = this.f24080c;
        long j12 = i11;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 <= j12) {
            j12 = j11;
        }
        int i12 = (int) j12;
        p.y yVar = this.f24079b;
        y2 y2Var = (y2) yVar.b(i12);
        if (y2Var != null) {
            return y2Var.f24043a;
        }
        if (i12 >= i11) {
            return v16;
        }
        if (i12 <= 0) {
            return v15;
        }
        j(v15, v16, v12);
        V v17 = this.f24084g;
        kotlin.jvm.internal.r.b(v17);
        boolean z11 = true;
        if (this.f24090m != s2.f23921c) {
            float fI = i(h(i12), i12, false);
            float[] fArr = this.f24088k;
            u.a[][] aVarArr2 = this.f24090m.f23929a;
            int length = aVarArr2.length - 1;
            float f11 = aVarArr2[0][0].f23930a;
            float f12 = aVarArr2[length][0].f23931b;
            int length2 = fArr.length;
            if (fI < f11 || fI > f12) {
                if (fI > f12) {
                    f11 = f12;
                } else {
                    length = 0;
                }
                float f13 = fI - f11;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 - 1) {
                    u.a aVar = aVarArr2[length][i14];
                    boolean z12 = aVar.f23945p;
                    float f14 = aVar.f23947r;
                    float f15 = aVar.f23946q;
                    if (z12) {
                        float f16 = aVar.f23930a;
                        float f17 = aVar.f23940k;
                        f10 = f13;
                        float f18 = aVar.f23932c;
                        aVarArr = aVarArr2;
                        fArr[i13] = (f10 * f15) + org.bouncycastle.jcajce.provider.digest.c.a(aVar.f23934e, f18, (f11 - f16) * f17, f18);
                        float f19 = (f11 - f16) * f17;
                        float f20 = aVar.f23933d;
                        fArr[i13 + 1] = (f10 * f14) + org.bouncycastle.jcajce.provider.digest.c.a(aVar.f23935f, f20, f19, f20);
                    } else {
                        f10 = f13;
                        aVarArr = aVarArr2;
                        aVar.c(f11);
                        fArr[i13] = (aVar.a() * f10) + (aVar.f23943n * aVar.f23937h) + f15;
                        fArr[i13 + 1] = (aVar.b() * f10) + (aVar.f23944o * aVar.f23938i) + f14;
                    }
                    i13 += 2;
                    i14++;
                    f13 = f10;
                    aVarArr2 = aVarArr;
                }
            } else {
                int length3 = aVarArr2.length;
                int i15 = 0;
                boolean z13 = false;
                while (i15 < length3) {
                    int i16 = i10;
                    int i17 = i16;
                    while (i16 < length2 - 1) {
                        u.a aVar2 = aVarArr2[i15][i17];
                        if (fI <= aVar2.f23931b) {
                            if (aVar2.f23945p) {
                                float f21 = aVar2.f23930a;
                                float f22 = aVar2.f23940k;
                                float f23 = aVar2.f23932c;
                                z10 = z11;
                                fArr[i16] = org.bouncycastle.jcajce.provider.digest.c.a(aVar2.f23934e, f23, (fI - f21) * f22, f23);
                                float f24 = aVar2.f23933d;
                                fArr[i16 + 1] = org.bouncycastle.jcajce.provider.digest.c.a(aVar2.f23935f, f24, (fI - f21) * f22, f24);
                            } else {
                                z10 = z11;
                                aVar2.c(fI);
                                fArr[i16] = (aVar2.f23943n * aVar2.f23937h) + aVar2.f23946q;
                                fArr[i16 + 1] = (aVar2.f23944o * aVar2.f23938i) + aVar2.f23947r;
                            }
                            z13 = z10;
                        } else {
                            z10 = z11;
                        }
                        i16 += 2;
                        i17++;
                        z11 = z10;
                    }
                    boolean z14 = z11;
                    if (z13) {
                        break;
                    }
                    i15++;
                    z11 = z14;
                    i10 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i18 = 0; i18 < length4; i18++) {
                v17.e(fArr[i18], i18);
            }
        } else {
            int iH = h(i12);
            float fI2 = i(iH, i12, true);
            p.x xVar = this.f24078a;
            y2 y2Var2 = (y2) yVar.b(xVar.c(iH));
            if (y2Var2 != null && (v14 = y2Var2.f24043a) != null) {
                v15 = v14;
            }
            y2 y2Var3 = (y2) yVar.b(xVar.c(iH + 1));
            if (y2Var3 != null && (v13 = y2Var3.f24043a) != null) {
                v16 = v13;
            }
            int iB = v17.b();
            for (int i19 = 0; i19 < iB; i19++) {
                v17.e((v16.a(i19) * fI2) + ((1 - fI2) * v15.a(i19)), i19);
            }
        }
        return v17;
    }

    @Override // s.t2
    public final int e() {
        return 0;
    }

    @Override // s.t2
    public final int f() {
        return this.f24080c;
    }

    public final int h(int i10) {
        int i11;
        p.x xVar = this.f24078a;
        int i12 = xVar.f20751b;
        if (i12 <= 0) {
            q.d.b("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = xVar.f20750a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i(int i10, int i11, boolean z10) {
        b0 b0Var;
        float f10;
        p.x xVar = this.f24078a;
        if (i10 >= xVar.f20751b - 1) {
            f10 = i11;
        } else {
            int iC = xVar.c(i10);
            int iC2 = xVar.c(i10 + 1);
            if (i11 == iC) {
                f10 = iC;
            } else {
                int i12 = iC2 - iC;
                y2 y2Var = (y2) this.f24079b.b(iC);
                if (y2Var == null || (b0Var = y2Var.f24044b) == null) {
                    b0Var = this.f24081d;
                }
                float f11 = i12;
                float fA = b0Var.a((i11 - iC) / f11);
                if (z10) {
                    return fA;
                }
                f10 = (f11 * fA) + iC;
            }
        }
        return f10 / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(V v10, V v11, V v12) {
        float[] fArr;
        boolean z10 = this.f24090m != s2.f23921c;
        V v13 = this.f24084g;
        p.y yVar = this.f24079b;
        p.x xVar = this.f24078a;
        if (v13 == null) {
            this.f24084g = (V) v10.c();
            this.f24085h = (V) v12.c();
            int i10 = xVar.f20751b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = xVar.c(i11) / 1000;
            }
            this.f24083f = fArr2;
            int i12 = xVar.f20751b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f24082e = iArr;
        }
        if (z10) {
            if (this.f24090m != s2.f23921c && kotlin.jvm.internal.r.a(this.f24086i, v10) && kotlin.jvm.internal.r.a(this.f24087j, v11)) {
                return;
            }
            this.f24086i = v10;
            this.f24087j = v11;
            int iB = v10.b() + (v10.b() % 2);
            this.f24088k = new float[iB];
            this.f24089l = new float[iB];
            int i14 = xVar.f20751b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iC = xVar.c(i15);
                y2 y2Var = (y2) yVar.b(iC);
                if (iC == 0 && y2Var == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = v10.a(i16);
                    }
                } else if (iC == this.f24080c && y2Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = v11.a(i17);
                    }
                } else {
                    kotlin.jvm.internal.r.b(y2Var);
                    V v14 = y2Var.f24043a;
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = v14.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f24090m = new u(this.f24082e, this.f24083f, fArr3);
        }
    }
}

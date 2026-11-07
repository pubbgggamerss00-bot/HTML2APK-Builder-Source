package b0;

import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class f0 implements z, g2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3321c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3322d;

    /* renamed from: e, reason: collision with root package name */
    public final g2.m0 f3323e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3324f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3325g;

    /* renamed from: h, reason: collision with root package name */
    public final ph.i0 f3326h;

    /* renamed from: i, reason: collision with root package name */
    public final f3.d f3327i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3328j;

    /* renamed from: k, reason: collision with root package name */
    public final List<g0> f3329k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3330l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3331m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3332n;

    /* renamed from: o, reason: collision with root package name */
    public final v.t0 f3333o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3334p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3335q;

    public f0() {
        throw null;
    }

    public f0(g0 g0Var, int i10, boolean z10, float f10, g2.m0 m0Var, float f11, boolean z11, ph.i0 i0Var, f3.d dVar, long j10, List list, int i11, int i12, int i13, v.t0 t0Var, int i14, int i15) {
        this.f3319a = g0Var;
        this.f3320b = i10;
        this.f3321c = z10;
        this.f3322d = f10;
        this.f3323e = m0Var;
        this.f3324f = f11;
        this.f3325g = z11;
        this.f3326h = i0Var;
        this.f3327i = dVar;
        this.f3328j = j10;
        this.f3329k = list;
        this.f3330l = i11;
        this.f3331m = i12;
        this.f3332n = i13;
        this.f3333o = t0Var;
        this.f3334p = i14;
        this.f3335q = i15;
    }

    @Override // g2.m0
    public final int a() {
        return this.f3323e.a();
    }

    @Override // b0.z
    public final long b() {
        g2.m0 m0Var = this.f3323e;
        return (m0Var.a() << 32) | (m0Var.getHeight() & BodyPartID.bodyIdMax);
    }

    @Override // b0.z
    public final int c() {
        return this.f3334p;
    }

    @Override // b0.z
    public final int d() {
        return -this.f3330l;
    }

    @Override // b0.z
    public final int e() {
        return this.f3331m;
    }

    @Override // b0.z
    public final int f() {
        return this.f3332n;
    }

    @Override // b0.z
    public final int g() {
        return this.f3335q;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f3323e.getHeight();
    }

    @Override // b0.z
    public final v.t0 getOrientation() {
        return this.f3333o;
    }

    @Override // b0.z
    public final int h() {
        return this.f3330l;
    }

    @Override // b0.z
    public final List<g0> i() {
        return this.f3329k;
    }

    public final f0 j(int i10, boolean z10) {
        g0 g0Var;
        int i11;
        int i12;
        int i13;
        if (this.f3325g) {
            return null;
        }
        List<g0> list = this.f3329k;
        if (list.isEmpty() || (g0Var = this.f3319a) == null) {
            return null;
        }
        int i14 = g0Var.f3355r;
        int i15 = this.f3320b - i10;
        if (i15 < 0 || i15 >= i14) {
            return null;
        }
        g0 g0Var2 = (g0) qg.x.B(list);
        g0 g0Var3 = (g0) qg.x.J(list);
        if (g0Var2.f3357t || g0Var3.f3357t) {
            return null;
        }
        int i16 = this.f3331m;
        int i17 = this.f3330l;
        if (i10 < 0) {
            if (Math.min((g0Var2.f3352o + g0Var2.f3355r) - i17, (g0Var3.f3352o + g0Var3.f3355r) - i16) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i17 - g0Var2.f3352o, i16 - g0Var3.f3352o) <= i10) {
            return null;
        }
        int size = list.size();
        int i18 = 0;
        while (i18 < size) {
            g0 g0Var4 = list.get(i18);
            boolean z11 = g0Var4.f3340c;
            int[] iArr = g0Var4.f3361x;
            if (!g0Var4.f3357t) {
                g0Var4.f3352o += i10;
                int length = iArr.length;
                for (int i19 = 0; i19 < length; i19++) {
                    int i20 = i19 & 1;
                    if ((z11 && i20 != 0) || (!z11 && i20 == 0)) {
                        iArr[i19] = iArr[i19] + i10;
                    }
                }
                if (z10) {
                    int size2 = g0Var4.f3339b.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        d0.p pVarA = g0Var4.f3350m.a(i21, g0Var4.f3348k);
                        if (pVarA != null) {
                            long j10 = pVarA.f7227l;
                            if (z11) {
                                i11 = i18;
                                i12 = (int) (j10 >> 32);
                                i13 = ((int) (j10 & BodyPartID.bodyIdMax)) + i10;
                            } else {
                                i11 = i18;
                                i12 = ((int) (j10 >> 32)) + i10;
                                i13 = (int) (j10 & BodyPartID.bodyIdMax);
                            }
                            pVarA.f7227l = (i13 & BodyPartID.bodyIdMax) | (i12 << 32);
                        } else {
                            i11 = i18;
                        }
                        i21++;
                        i18 = i11;
                    }
                }
            }
            i18++;
        }
        return new f0(this.f3319a, i15, this.f3321c || i10 > 0, i10, this.f3323e, this.f3324f, this.f3325g, this.f3326h, this.f3327i, this.f3328j, this.f3329k, this.f3330l, this.f3331m, this.f3332n, this.f3333o, this.f3334p, this.f3335q);
    }

    @Override // g2.m0
    public final Map<g2.a, Integer> r() {
        return this.f3323e.r();
    }

    @Override // g2.m0
    public final void s() {
        this.f3323e.s();
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return this.f3323e.t();
    }
}

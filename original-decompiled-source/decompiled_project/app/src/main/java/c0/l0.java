package c0;

import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l0 implements f0, g2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4414b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4415c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4416d;

    /* renamed from: e, reason: collision with root package name */
    public final g2.m0 f4417e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4418f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4419g;

    /* renamed from: h, reason: collision with root package name */
    public final ph.i0 f4420h;

    /* renamed from: i, reason: collision with root package name */
    public final f3.d f4421i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4422j;

    /* renamed from: k, reason: collision with root package name */
    public final eh.l<Integer, List<pg.n<Integer, f3.b>>> f4423k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4424l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4425m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4426n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4427o;

    /* renamed from: p, reason: collision with root package name */
    public final v.t0 f4428p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4429q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4430r;

    public l0(n0 n0Var, int i10, boolean z10, float f10, g2.m0 m0Var, float f11, boolean z11, ph.i0 i0Var, f3.d dVar, int i11, eh.l lVar, List list, int i12, int i13, int i14, v.t0 t0Var, int i15, int i16) {
        this.f4413a = n0Var;
        this.f4414b = i10;
        this.f4415c = z10;
        this.f4416d = f10;
        this.f4417e = m0Var;
        this.f4418f = f11;
        this.f4419g = z11;
        this.f4420h = i0Var;
        this.f4421i = dVar;
        this.f4422j = i11;
        this.f4423k = lVar;
        this.f4424l = list;
        this.f4425m = i12;
        this.f4426n = i13;
        this.f4427o = i14;
        this.f4428p = t0Var;
        this.f4429q = i15;
        this.f4430r = i16;
    }

    @Override // g2.m0
    public final int a() {
        return this.f4417e.a();
    }

    @Override // c0.f0
    public final long b() {
        g2.m0 m0Var = this.f4417e;
        return (m0Var.a() << 32) | (m0Var.getHeight() & BodyPartID.bodyIdMax);
    }

    @Override // c0.f0
    public final int c() {
        return this.f4429q;
    }

    @Override // c0.f0
    public final int d() {
        return -this.f4425m;
    }

    @Override // c0.f0
    public final int e() {
        return this.f4426n;
    }

    @Override // c0.f0
    public final int f() {
        return this.f4427o;
    }

    @Override // c0.f0
    public final int g() {
        return this.f4430r;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f4417e.getHeight();
    }

    @Override // c0.f0
    public final v.t0 getOrientation() {
        return this.f4428p;
    }

    @Override // c0.f0
    public final int h() {
        return this.f4425m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<c0.m0>] */
    @Override // c0.f0
    public final List<m0> i() {
        return this.f4424l;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final l0 j(int i10, boolean z10) {
        n0 n0Var;
        int i11;
        long j10;
        List list;
        char c10;
        int i12;
        if (this.f4419g) {
            return null;
        }
        ?? r15 = this.f4424l;
        if (r15.isEmpty() || (n0Var = this.f4413a) == null) {
            return null;
        }
        int i13 = n0Var.f4462g;
        int i14 = this.f4414b - i10;
        if (i14 < 0 || i14 >= i13) {
            return null;
        }
        m0 m0Var = (m0) qg.x.B(r15);
        m0 m0Var2 = (m0) qg.x.J(r15);
        if (m0Var.f4454x || m0Var2.f4454x) {
            return null;
        }
        int i15 = this.f4426n;
        int i16 = this.f4425m;
        v.t0 t0Var = this.f4428p;
        if (i10 < 0) {
            if (Math.min((p5.o.c(m0Var, t0Var) + m0Var.f4446p) - i16, (p5.o.c(m0Var2, t0Var) + m0Var2.f4446p) - i15) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i16 - p5.o.c(m0Var, t0Var), i15 - p5.o.c(m0Var2, t0Var)) <= i10) {
            return null;
        }
        int size = r15.size();
        int i17 = 0;
        List list2 = r15;
        while (i17 < size) {
            m0 m0Var3 = (m0) list2.get(i17);
            boolean z11 = m0Var3.f4433c;
            if (m0Var3.f4454x) {
                i11 = i17;
            } else {
                long j11 = m0Var3.f4451u;
                int i18 = z11 ? (int) (j11 >> 32) : ((int) (j11 >> 32)) + i10;
                long j12 = BodyPartID.bodyIdMax;
                i11 = i17;
                long j13 = i18 << 32;
                char c11 = ' ';
                m0Var3.f4451u = j13 | ((z11 ? ((int) (j11 & BodyPartID.bodyIdMax)) + i10 : (int) (j11 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                if (z10) {
                    int size2 = m0Var3.f4438h.size();
                    int i19 = 0;
                    list2 = list2;
                    while (i19 < size2) {
                        d0.p pVarA = m0Var3.f4441k.a(i19, m0Var3.f4432b);
                        if (pVarA != null) {
                            long j14 = pVarA.f7227l;
                            if (z11) {
                                j10 = j12;
                                c10 = c11;
                                i12 = (int) (j14 >> c10);
                            } else {
                                j10 = j12;
                                c10 = c11;
                                i12 = ((int) (j14 >> c10)) + i10;
                            }
                            list = list2;
                            pVarA.f7227l = (i12 << c10) | ((z11 ? ((int) (j14 & j10)) + i10 : (int) (j14 & j10)) & j10);
                        } else {
                            j10 = j12;
                            list = list2;
                        }
                        i19++;
                        list2 = list;
                        j12 = j10;
                        c11 = ' ';
                    }
                }
            }
            i17 = i11 + 1;
            list2 = list2;
        }
        return new l0(this.f4413a, i14, this.f4415c || i10 > 0, i10, this.f4417e, this.f4418f, this.f4419g, this.f4420h, this.f4421i, this.f4422j, this.f4423k, list2, this.f4425m, this.f4426n, this.f4427o, t0Var, this.f4429q, this.f4430r);
    }

    @Override // g2.m0
    public final Map<g2.a, Integer> r() {
        return this.f4417e.r();
    }

    @Override // g2.m0
    public final void s() {
        this.f4417e.s();
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return this.f4417e.t();
    }
}

package c0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class m0 implements o, d0.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4431a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4433c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4434d;

    /* renamed from: e, reason: collision with root package name */
    public final f3.r f4435e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4436f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4437g;

    /* renamed from: h, reason: collision with root package name */
    public final List<g2.g1> f4438h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4439i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4440j;

    /* renamed from: k, reason: collision with root package name */
    public final LazyLayoutItemAnimator<m0> f4441k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4442l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4443m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4444n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4445o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4446p;

    /* renamed from: q, reason: collision with root package name */
    public int f4447q;

    /* renamed from: r, reason: collision with root package name */
    public int f4448r;

    /* renamed from: s, reason: collision with root package name */
    public int f4449s;

    /* renamed from: t, reason: collision with root package name */
    public final long f4450t;

    /* renamed from: u, reason: collision with root package name */
    public long f4451u;

    /* renamed from: v, reason: collision with root package name */
    public int f4452v;

    /* renamed from: w, reason: collision with root package name */
    public int f4453w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4454x;

    public m0() {
        throw null;
    }

    public m0(int i10, Object obj, int i11, int i12, f3.r rVar, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.f4431a = i10;
        this.f4432b = obj;
        this.f4433c = true;
        this.f4434d = i11;
        this.f4435e = rVar;
        this.f4436f = i13;
        this.f4437g = i14;
        this.f4438h = list;
        this.f4439i = j10;
        this.f4440j = obj2;
        this.f4441k = lazyLayoutItemAnimator;
        this.f4442l = j11;
        this.f4443m = i15;
        this.f4444n = i16;
        this.f4447q = PKIFailureInfo.systemUnavail;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            g2.g1 g1Var = (g2.g1) list.get(i17);
            iMax = Math.max(iMax, this.f4433c ? g1Var.f11383b : g1Var.f11382a);
        }
        this.f4445o = iMax;
        int i18 = i12 + iMax;
        this.f4446p = i18 >= 0 ? i18 : 0;
        this.f4450t = this.f4433c ? (iMax & BodyPartID.bodyIdMax) | (this.f4434d << 32) : (this.f4434d & BodyPartID.bodyIdMax) | (iMax << 32);
        this.f4451u = 0L;
        this.f4452v = -1;
        this.f4453w = -1;
    }

    @Override // c0.o
    public final long a() {
        return this.f4450t;
    }

    @Override // d0.s0
    public final int b() {
        return this.f4438h.size();
    }

    @Override // d0.s0
    public final long c() {
        return this.f4442l;
    }

    @Override // d0.s0
    public final int d() {
        return this.f4446p;
    }

    @Override // d0.s0
    public final int e() {
        return this.f4444n;
    }

    @Override // d0.s0
    public final Object f(int i10) {
        return this.f4438h.get(i10).w();
    }

    @Override // c0.o
    public final int g() {
        return this.f4452v;
    }

    @Override // c0.o, d0.s0
    public final int getIndex() {
        return this.f4431a;
    }

    @Override // c0.o, d0.s0
    public final Object getKey() {
        return this.f4432b;
    }

    @Override // d0.s0
    public final boolean h() {
        return this.f4433c;
    }

    @Override // d0.s0
    public final void i() {
        this.f4454x = true;
    }

    @Override // d0.s0
    public final long j(int i10) {
        return this.f4451u;
    }

    @Override // d0.s0
    public final int k() {
        return this.f4443m;
    }

    @Override // c0.o
    public final long l() {
        return this.f4451u;
    }

    @Override // c0.o
    public final int m() {
        return this.f4453w;
    }

    @Override // d0.s0
    public final void n(int i10, int i11, int i12, int i13) {
        q(i10, i11, i12, i13, -1, -1);
    }

    public final int o(long j10) {
        return (int) (this.f4433c ? j10 & BodyPartID.bodyIdMax : j10 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(g1.a aVar, boolean z10) {
        List<g2.g1> list;
        int i10;
        if (this.f4447q == Integer.MIN_VALUE) {
            y.c.a("position() should be called first");
        }
        List<g2.g1> list2 = this.f4438h;
        int size = list2.size();
        int i11 = 0;
        while (i11 < size) {
            g2.g1 g1Var = list2.get(i11);
            int i12 = this.f4448r;
            boolean z11 = this.f4433c;
            int i13 = i12 - (z11 ? g1Var.f11383b : g1Var.f11382a);
            int i14 = this.f4449s;
            long j10 = this.f4451u;
            d0.p pVarA = this.f4441k.a(i11, this.f4432b);
            t1.d dVar = null;
            if (pVarA != null) {
                if (z10) {
                    pVarA.f7233r = j10;
                    list = list2;
                    i10 = size;
                } else {
                    list = list2;
                    i10 = size;
                    long jD = f3.m.d(!f3.m.b(pVarA.f7233r, d0.p.f7214s) ? pVarA.f7233r : j10, ((f3.m) pVarA.f7232q.getValue()).f8820a);
                    if (((o(j10) <= i13 && o(jD) <= i13) || (o(j10) >= i14 && o(jD) >= i14)) && ((Boolean) pVarA.f7223h.getValue()).booleanValue()) {
                        ph.h.c(pVarA.f7216a, null, null, new d0.s(pVarA, null), 3);
                    }
                    j10 = jD;
                }
                dVar = pVarA.f7229n;
            } else {
                list = list2;
                i10 = size;
            }
            long jD2 = f3.m.d(j10, this.f4439i);
            if (!z10 && pVarA != null) {
                pVarA.f7228m = jD2;
            }
            if (z11) {
                if (dVar != null) {
                    aVar.getClass();
                    g1.a.a(aVar, g1Var);
                    g1Var.m0(f3.m.d(jD2, g1Var.f11386e), CropImageView.DEFAULT_ASPECT_RATIO, dVar);
                } else {
                    g1.a.l(aVar, g1Var, jD2);
                }
            } else if (dVar != null) {
                g1.a.j(aVar, g1Var, jD2, dVar);
            } else {
                g1.a.i(aVar, g1Var, jD2);
            }
            i11++;
            list2 = list;
            size = i10;
        }
    }

    public final void q(int i10, int i11, int i12, int i13, int i14, int i15) {
        long j10;
        long j11;
        boolean z10 = this.f4433c;
        int i16 = z10 ? i13 : i12;
        this.f4447q = i16;
        if (!z10) {
            i12 = i13;
        }
        if (z10 && this.f4435e == f3.r.f8829b) {
            i11 = (i12 - i11) - this.f4434d;
        }
        if (z10) {
            j10 = i11 << 32;
            j11 = i10;
        } else {
            j10 = i10 << 32;
            j11 = i11;
        }
        this.f4451u = (j11 & BodyPartID.bodyIdMax) | j10;
        this.f4452v = i14;
        this.f4453w = i15;
        this.f4448r = -this.f4436f;
        this.f4449s = i16 + this.f4437g;
    }
}

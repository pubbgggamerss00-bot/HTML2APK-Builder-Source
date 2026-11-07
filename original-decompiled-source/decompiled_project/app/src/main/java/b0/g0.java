package b0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class g0 implements n, d0.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3338a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g1> f3339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3340c;

    /* renamed from: d, reason: collision with root package name */
    public final d.b f3341d;

    /* renamed from: e, reason: collision with root package name */
    public final d.c f3342e;

    /* renamed from: f, reason: collision with root package name */
    public final f3.r f3343f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3344g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3345h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3346i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3347j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3348k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3349l;

    /* renamed from: m, reason: collision with root package name */
    public final LazyLayoutItemAnimator<g0> f3350m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3351n;

    /* renamed from: o, reason: collision with root package name */
    public int f3352o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3353p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3354q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3355r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3356s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3357t;

    /* renamed from: u, reason: collision with root package name */
    public int f3358u;

    /* renamed from: v, reason: collision with root package name */
    public int f3359v;

    /* renamed from: w, reason: collision with root package name */
    public int f3360w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3361x;

    public g0() {
        throw null;
    }

    public g0(int i10, List list, boolean z10, d.b bVar, d.c cVar, f3.r rVar, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11) {
        this.f3338a = i10;
        this.f3339b = list;
        this.f3340c = z10;
        this.f3341d = bVar;
        this.f3342e = cVar;
        this.f3343f = rVar;
        this.f3344g = i11;
        this.f3345h = i12;
        this.f3346i = i13;
        this.f3347j = j10;
        this.f3348k = obj;
        this.f3349l = obj2;
        this.f3350m = lazyLayoutItemAnimator;
        this.f3351n = j11;
        this.f3354q = 1;
        this.f3358u = PKIFailureInfo.systemUnavail;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = (g1) list.get(i15);
            boolean z11 = this.f3340c;
            i14 += z11 ? g1Var.f11383b : g1Var.f11382a;
            iMax = Math.max(iMax, !z11 ? g1Var.f11383b : g1Var.f11382a);
        }
        this.f3353p = i14;
        int i16 = i14 + this.f3346i;
        this.f3355r = i16 >= 0 ? i16 : 0;
        this.f3356s = iMax;
        this.f3361x = new int[this.f3339b.size() * 2];
    }

    public final int a(long j10) {
        return (int) (this.f3340c ? j10 & BodyPartID.bodyIdMax : j10 >> 32);
    }

    @Override // d0.s0
    public final int b() {
        return this.f3339b.size();
    }

    @Override // d0.s0
    public final long c() {
        return this.f3351n;
    }

    @Override // d0.s0
    public final int d() {
        return this.f3355r;
    }

    @Override // d0.s0
    public final int e() {
        return this.f3354q;
    }

    @Override // d0.s0
    public final Object f(int i10) {
        return this.f3339b.get(i10).w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(g1.a aVar, boolean z10) {
        List<g1> list;
        int i10;
        if (this.f3358u == Integer.MIN_VALUE) {
            y.c.a("position() should be called first");
        }
        List<g1> list2 = this.f3339b;
        int size = list2.size();
        int i11 = 0;
        while (i11 < size) {
            g1 g1Var = list2.get(i11);
            int i12 = this.f3359v;
            boolean z11 = this.f3340c;
            int i13 = i12 - (z11 ? g1Var.f11383b : g1Var.f11382a);
            int i14 = this.f3360w;
            long j10 = j(i11);
            d0.p pVarA = this.f3350m.a(i11, this.f3348k);
            t1.d dVar = null;
            if (pVarA != null) {
                if (z10) {
                    pVarA.f7233r = j10;
                    list = list2;
                    i10 = size;
                } else {
                    list = list2;
                    i10 = size;
                    if (!f3.m.b(pVarA.f7233r, d0.p.f7214s)) {
                        j10 = pVarA.f7233r;
                    }
                    long jD = f3.m.d(j10, ((f3.m) pVarA.f7232q.getValue()).f8820a);
                    if (((a(j10) <= i13 && a(jD) <= i13) || (a(j10) >= i14 && a(jD) >= i14)) && ((Boolean) pVarA.f7223h.getValue()).booleanValue()) {
                        ph.h.c(pVarA.f7216a, null, null, new d0.s(pVarA, null), 3);
                    }
                    j10 = jD;
                }
                dVar = pVarA.f7229n;
            } else {
                list = list2;
                i10 = size;
            }
            long jD2 = f3.m.d(j10, this.f3347j);
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

    @Override // b0.n, d0.s0
    public final int getIndex() {
        return this.f3338a;
    }

    @Override // b0.n, d0.s0
    public final Object getKey() {
        return this.f3348k;
    }

    @Override // b0.n
    public final int getOffset() {
        return this.f3352o;
    }

    @Override // b0.n
    public final int getSize() {
        return this.f3353p;
    }

    @Override // d0.s0
    public final boolean h() {
        return this.f3340c;
    }

    @Override // d0.s0
    public final void i() {
        this.f3357t = true;
    }

    @Override // d0.s0
    public final long j(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f3361x;
        return (iArr[i11] << 32) | (iArr[i11 + 1] & BodyPartID.bodyIdMax);
    }

    @Override // d0.s0
    public final int k() {
        return 0;
    }

    public final void l(int i10, int i11, int i12) {
        int i13;
        this.f3352o = i10;
        boolean z10 = this.f3340c;
        this.f3358u = z10 ? i12 : i11;
        List<g1> list = this.f3339b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            g1 g1Var = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f3361x;
            if (z10) {
                d.b bVar = this.f3341d;
                if (bVar == null) {
                    y.c.b("null horizontalAlignment when isVertical == true");
                    throw new pg.g();
                }
                iArr[i15] = bVar.a(g1Var.f11382a, i11, this.f3343f);
                iArr[i15 + 1] = i10;
                i13 = g1Var.f11383b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                d.c cVar = this.f3342e;
                if (cVar == null) {
                    y.c.b("null verticalAlignment when isVertical == false");
                    throw new pg.g();
                }
                iArr[i16] = cVar.a(g1Var.f11383b, i12);
                i13 = g1Var.f11382a;
            }
            i10 += i13;
        }
        this.f3359v = -this.f3344g;
        this.f3360w = this.f3358u + this.f3345h;
    }

    @Override // d0.s0
    public final void n(int i10, int i11, int i12, int i13) {
        l(i10, i12, i13);
    }
}

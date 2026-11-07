package b0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import d0.c1;
import d0.d1;
import d0.d2;
import d0.f1;
import g2.i1;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t.b1;
import v.l1;
import x0.n1;
import x0.q1;
import x0.x1;

/* loaded from: classes.dex */
public final class m0 implements l1 {

    /* renamed from: w, reason: collision with root package name */
    public static final g1.n f3381w = c2.y.e(a.f3404a, b.f3405a);

    /* renamed from: a, reason: collision with root package name */
    public final b0.a f3382a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3383b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f3384c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f3385d;

    /* renamed from: e, reason: collision with root package name */
    public final x1 f3386e;

    /* renamed from: f, reason: collision with root package name */
    public final x.n f3387f;

    /* renamed from: g, reason: collision with root package name */
    public float f3388g;

    /* renamed from: h, reason: collision with root package name */
    public final v.j f3389h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3390i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f3391j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f3392k;

    /* renamed from: l, reason: collision with root package name */
    public final d0.d f3393l;

    /* renamed from: m, reason: collision with root package name */
    public final LazyLayoutItemAnimator<g0> f3394m;

    /* renamed from: n, reason: collision with root package name */
    public final d0.k f3395n;

    /* renamed from: o, reason: collision with root package name */
    public final d1 f3396o;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f3397p;

    /* renamed from: q, reason: collision with root package name */
    public final c1 f3398q;

    /* renamed from: r, reason: collision with root package name */
    public final n1<pg.f0> f3399r;

    /* renamed from: s, reason: collision with root package name */
    public final x1 f3400s;

    /* renamed from: t, reason: collision with root package name */
    public final x1 f3401t;

    /* renamed from: u, reason: collision with root package name */
    public final n1<pg.f0> f3402u;

    /* renamed from: v, reason: collision with root package name */
    public final f1 f3403v;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, m0, List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3404a = new a(2);

        @Override // eh.p
        public final List<? extends Integer> invoke(g1.o oVar, m0 m0Var) {
            m0 m0Var2 = m0Var;
            return qg.p.j(Integer.valueOf(m0Var2.g()), Integer.valueOf(m0Var2.h()));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<List<? extends Integer>, m0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3405a = new b(1);

        @Override // eh.l
        public final m0 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new m0(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    public m0() {
        b0.a aVar = new b0.a();
        aVar.f3283a = -1;
        this(0, 0, aVar);
    }

    @Override // v.l1
    public final boolean a() {
        return this.f3389h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean b() {
        return ((Boolean) this.f3401t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.c(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(b1 b1Var, eh.p pVar, vg.c cVar) {
        r0 r0Var;
        m0 m0Var;
        eh.p pVar2;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i10 = r0Var.f3426f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                r0Var.f3426f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                r0Var = new r0(this, cVar);
            }
        }
        Object obj = r0Var.f3424d;
        ug.a aVar = ug.a.f29706a;
        int i11 = r0Var.f3426f;
        if (i11 == 0) {
            pg.q.b(obj);
            r0Var.f3421a = this;
            r0Var.f3422b = b1Var;
            r0Var.f3423c = (vg.i) pVar;
            r0Var.f3426f = 1;
            if (this.f3393l.a(r0Var) != aVar) {
                m0Var = this;
                pVar2 = pVar;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        eh.p pVar3 = (eh.p) r0Var.f3423c;
        b1Var = r0Var.f3422b;
        m0Var = r0Var.f3421a;
        pg.q.b(obj);
        pVar2 = pVar3;
        v.j jVar = m0Var.f3389h;
        r0Var.f3421a = null;
        r0Var.f3422b = null;
        r0Var.f3423c = null;
        r0Var.f3426f = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean d() {
        return ((Boolean) this.f3400s.getValue()).booleanValue();
    }

    @Override // v.l1
    public final float e(float f10) {
        return this.f3389h.e(f10);
    }

    public final void f(f0 f0Var, boolean z10, boolean z11) {
        if (!z10 && this.f3383b) {
            this.f3384c = f0Var;
            return;
        }
        if (z10) {
            this.f3383b = true;
        }
        g0 g0Var = f0Var.f3319a;
        int i10 = f0Var.f3320b;
        this.f3401t.setValue(Boolean.valueOf(((g0Var != null ? g0Var.f3338a : 0) == 0 && i10 == 0) ? false : true));
        this.f3400s.setValue(Boolean.valueOf(f0Var.f3321c));
        this.f3388g -= f0Var.f3322d;
        this.f3386e.setValue(f0Var);
        k0 k0Var = this.f3385d;
        if (z11) {
            k0Var.getClass();
            if (!(((float) i10) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                y.c.c("scrollOffset should be non-negative");
            }
            k0Var.f3373b.f(i10);
        } else {
            k0Var.getClass();
            k0Var.f3375d = g0Var != null ? g0Var.f3348k : null;
            if (k0Var.f3374c || f0Var.f3332n > 0) {
                k0Var.f3374c = true;
                if (!(((float) i10) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                    y.c.c("scrollOffset should be non-negative");
                }
                k0Var.a(g0Var != null ? g0Var.f3338a : 0, i10);
            }
            if (this.f3390i) {
                b0.a aVar = this.f3382a;
                aVar.getClass();
                List<g0> list = f0Var.f3329k;
                if (aVar.f3283a != -1 && !list.isEmpty()) {
                    if (aVar.f3283a != (aVar.f3285c ? ((n) qg.x.J(list)).getIndex() + 1 : ((n) qg.x.B(list)).getIndex() - 1)) {
                        aVar.f3283a = -1;
                        d1.b bVar = aVar.f3284b;
                        if (bVar != null) {
                            bVar.cancel();
                        }
                        aVar.f3284b = null;
                    }
                }
            }
        }
        if (z10) {
            this.f3403v.a(f0Var.f3324f, f0Var.f3327i, f0Var.f3326h);
        }
    }

    public final int g() {
        return this.f3385d.f3372a.g();
    }

    public final int h() {
        return this.f3385d.f3373b.g();
    }

    public final z i() {
        return (z) this.f3386e.getValue();
    }

    public final void j(int i10, int i11) {
        k0 k0Var = this.f3385d;
        if (k0Var.f3372a.g() != i10 || k0Var.f3373b.g() != i11) {
            LazyLayoutItemAnimator<g0> lazyLayoutItemAnimator = this.f3394m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f990b = null;
            lazyLayoutItemAnimator.f991c = -1;
        }
        k0Var.a(i10, i11);
        k0Var.f3375d = null;
        i1 i1Var = this.f3391j;
        if (i1Var != null) {
            i1Var.h();
        }
    }

    public m0(int i10, int i11) {
        b0.a aVar = new b0.a();
        aVar.f3283a = -1;
        this(i10, i11, aVar);
    }

    public m0(int i10, int i11, b0.a aVar) {
        this.f3382a = aVar;
        this.f3385d = new k0(i10, i11);
        this.f3386e = new x1(u0.f3451a, q1.f31878a);
        this.f3387f = new x.n();
        this.f3389h = new v.j(new t0(this));
        this.f3390i = true;
        this.f3392k = new q0(this);
        this.f3393l = new d0.d();
        this.f3394m = new LazyLayoutItemAnimator<>();
        this.f3395n = new d0.k();
        this.f3396o = new d1(null, new p0(this, i10));
        this.f3397p = new o0(this);
        this.f3398q = new c1();
        this.f3399r = d2.a();
        Boolean bool = Boolean.FALSE;
        this.f3400s = bg.b.h(bool);
        this.f3401t = bg.b.h(bool);
        this.f3402u = d2.a();
        this.f3403v = new f1();
    }
}

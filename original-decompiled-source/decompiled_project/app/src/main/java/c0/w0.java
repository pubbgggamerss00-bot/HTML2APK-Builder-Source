package c0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import d0.d1;
import d0.d2;
import g2.i1;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import v.l1;
import x0.n1;
import x0.q1;
import x0.x1;

/* loaded from: classes.dex */
public final class w0 implements l1 {

    /* renamed from: w, reason: collision with root package name */
    public static final g1.n f4504w = c2.y.e(a.f4527a, b.f4528a);

    /* renamed from: a, reason: collision with root package name */
    public final c0.a f4505a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4506b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f4507c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f4508d;

    /* renamed from: e, reason: collision with root package name */
    public final x1 f4509e;

    /* renamed from: f, reason: collision with root package name */
    public final x.n f4510f;

    /* renamed from: g, reason: collision with root package name */
    public float f4511g;

    /* renamed from: h, reason: collision with root package name */
    public final v.j f4512h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4513i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f4514j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f4515k;

    /* renamed from: l, reason: collision with root package name */
    public final d0.d f4516l;

    /* renamed from: m, reason: collision with root package name */
    public final LazyLayoutItemAnimator<m0> f4517m;

    /* renamed from: n, reason: collision with root package name */
    public final d0.k f4518n;

    /* renamed from: o, reason: collision with root package name */
    public final d0.d1 f4519o;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f4520p;

    /* renamed from: q, reason: collision with root package name */
    public final d0.c1 f4521q;

    /* renamed from: r, reason: collision with root package name */
    public final n1<pg.f0> f4522r;

    /* renamed from: s, reason: collision with root package name */
    public final n1<pg.f0> f4523s;

    /* renamed from: t, reason: collision with root package name */
    public final x1 f4524t;

    /* renamed from: u, reason: collision with root package name */
    public final x1 f4525u;

    /* renamed from: v, reason: collision with root package name */
    public final d0.f1 f4526v;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, w0, List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4527a = new a(2);

        @Override // eh.p
        public final List<? extends Integer> invoke(g1.o oVar, w0 w0Var) {
            w0 w0Var2 = w0Var;
            return qg.p.j(Integer.valueOf(w0Var2.g()), Integer.valueOf(w0Var2.h()));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<List<? extends Integer>, w0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4528a = new b(1);

        @Override // eh.l
        public final w0 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new w0(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    public w0() {
        this(0, 0, new c0.a());
    }

    public static Object j(w0 w0Var, int i10, vg.i iVar) {
        w0Var.getClass();
        Object objC = w0Var.c(t.b1.f25167a, new c1(w0Var, i10, null), iVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    @Override // v.l1
    public final boolean a() {
        return this.f4512h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean b() {
        return ((Boolean) this.f4525u.getValue()).booleanValue();
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
    public final Object c(t.b1 b1Var, eh.p pVar, vg.c cVar) {
        b1 b1Var2;
        w0 w0Var;
        eh.p pVar2;
        if (cVar instanceof b1) {
            b1Var2 = (b1) cVar;
            int i10 = b1Var2.f4354f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b1Var2.f4354f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b1Var2 = new b1(this, cVar);
            }
        }
        Object obj = b1Var2.f4352d;
        ug.a aVar = ug.a.f29706a;
        int i11 = b1Var2.f4354f;
        if (i11 == 0) {
            pg.q.b(obj);
            b1Var2.f4349a = this;
            b1Var2.f4350b = b1Var;
            b1Var2.f4351c = (vg.i) pVar;
            b1Var2.f4354f = 1;
            if (this.f4516l.a(b1Var2) != aVar) {
                w0Var = this;
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
        eh.p pVar3 = (eh.p) b1Var2.f4351c;
        b1Var = b1Var2.f4350b;
        w0Var = b1Var2.f4349a;
        pg.q.b(obj);
        pVar2 = pVar3;
        v.j jVar = w0Var.f4512h;
        b1Var2.f4349a = null;
        b1Var2.f4350b = null;
        b1Var2.f4351c = null;
        b1Var2.f4354f = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean d() {
        return ((Boolean) this.f4524t.getValue()).booleanValue();
    }

    @Override // v.l1
    public final float e(float f10) {
        return this.f4512h.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(l0 l0Var, boolean z10, boolean z11) {
        int iG;
        if (!z10 && this.f4506b) {
            this.f4507c = l0Var;
            return;
        }
        if (z10) {
            this.f4506b = true;
        }
        float f10 = this.f4511g;
        float f11 = l0Var.f4416d;
        int i10 = l0Var.f4414b;
        n0 n0Var = l0Var.f4413a;
        this.f4511g = f10 - f11;
        this.f4509e.setValue(l0Var);
        this.f4525u.setValue(Boolean.valueOf(((n0Var != null ? n0Var.f4456a : 0) == 0 && i10 == 0) ? false : true));
        this.f4524t.setValue(Boolean.valueOf(l0Var.f4415c));
        q0 q0Var = this.f4508d;
        if (z11) {
            q0Var.getClass();
            if (!(((float) i10) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                y.c.c("scrollOffset should be non-negative");
            }
            q0Var.f4471b.f(i10);
        } else {
            q0Var.getClass();
            if (n0Var != null) {
                m0[] m0VarArr = n0Var.f4457b;
                m0 m0Var = m0VarArr.length == 0 ? null : m0VarArr[0];
                Object obj = m0Var != null ? m0Var.f4432b : null;
                q0Var.f4473d = obj;
                if (q0Var.f4472c || l0Var.f4427o > 0) {
                    q0Var.f4472c = true;
                    if (!(((float) i10) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                        y.c.c("scrollOffset should be non-negative (" + i10 + ')');
                    }
                    if (n0Var != null) {
                        m0[] m0VarArr2 = n0Var.f4457b;
                        m0 m0Var2 = m0VarArr2.length != 0 ? m0VarArr2[0] : null;
                        int i11 = m0Var2 != null ? m0Var2.f4431a : 0;
                        q0Var.a(i11, i10);
                    }
                }
                if (this.f4513i) {
                    c0.a aVar = this.f4505a;
                    aVar.getClass();
                    v.t0 t0Var = l0Var.f4428p;
                    z0.b<d1.b> bVar = aVar.f4336b;
                    if (aVar.f4335a != -1 && !l0Var.i().isEmpty()) {
                        if (aVar.f4337c) {
                            o oVar = (o) qg.x.J(l0Var.i());
                            iG = (t0Var == v.t0.f30083a ? oVar.g() : oVar.m()) + 1;
                        } else {
                            o oVar2 = (o) qg.x.B(l0Var.i());
                            iG = (t0Var == v.t0.f30083a ? oVar2.g() : oVar2.m()) - 1;
                        }
                        if (aVar.f4335a != iG) {
                            aVar.f4335a = -1;
                            d1.b[] bVarArr = bVar.f34700a;
                            int i12 = bVar.f34702c;
                            for (int i13 = 0; i13 < i12; i13++) {
                                bVarArr[i13].cancel();
                            }
                            bVar.g();
                        }
                    }
                }
            }
        }
        if (z10) {
            this.f4526v.a(l0Var.f4418f, l0Var.f4421i, l0Var.f4420h);
        }
    }

    public final int g() {
        return this.f4508d.f4470a.g();
    }

    public final int h() {
        return this.f4508d.f4471b.g();
    }

    public final f0 i() {
        return (f0) this.f4509e.getValue();
    }

    public final void k(int i10, int i11) {
        q0 q0Var = this.f4508d;
        if (q0Var.f4470a.g() != i10 || q0Var.f4471b.g() != i11) {
            LazyLayoutItemAnimator<m0> lazyLayoutItemAnimator = this.f4517m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f990b = null;
            lazyLayoutItemAnimator.f991c = -1;
        }
        q0Var.a(i10, i11);
        q0Var.f4473d = null;
        i1 i1Var = this.f4514j;
        if (i1Var != null) {
            i1Var.h();
        }
    }

    public w0(int i10, int i11) {
        this(i10, i11, new c0.a());
    }

    public w0(int i10, int i11, c0.a aVar) {
        this.f4505a = aVar;
        this.f4508d = new q0(i10, i11);
        this.f4509e = new x1(e1.f4374a, q1.f31878a);
        this.f4510f = new x.n();
        this.f4512h = new v.j(new d1(this));
        this.f4513i = true;
        this.f4515k = new a1(this);
        this.f4516l = new d0.d();
        this.f4517m = new LazyLayoutItemAnimator<>();
        this.f4518n = new d0.k();
        this.f4519o = new d0.d1(null, new z0(this, i10));
        this.f4520p = new y0(this);
        this.f4521q = new d0.c1();
        this.f4522r = d2.a();
        this.f4523s = d2.a();
        Boolean bool = Boolean.FALSE;
        this.f4524t = bg.b.h(bool);
        this.f4525u = bg.b.h(bool);
        this.f4526v = new d0.f1();
    }

    public /* synthetic */ w0(int i10) {
        this(0, 0);
    }
}

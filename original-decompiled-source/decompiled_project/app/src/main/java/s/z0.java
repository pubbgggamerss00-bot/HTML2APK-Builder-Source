package s;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class z0<S> extends c2.g0 {

    /* renamed from: t, reason: collision with root package name */
    public static final o f24046t = new o(CropImageView.DEFAULT_ASPECT_RATIO);

    /* renamed from: v, reason: collision with root package name */
    public static final o f24047v = new o(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f24048b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f24049c;

    /* renamed from: d, reason: collision with root package name */
    public S f24050d;

    /* renamed from: e, reason: collision with root package name */
    public y1<S> f24051e;

    /* renamed from: f, reason: collision with root package name */
    public long f24052f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f24053g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.u1 f24054h;

    /* renamed from: j, reason: collision with root package name */
    public ph.m f24055j;

    /* renamed from: k, reason: collision with root package name */
    public final yh.c f24056k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f24057l;

    /* renamed from: m, reason: collision with root package name */
    public long f24058m;

    /* renamed from: n, reason: collision with root package name */
    public final p.h0<a> f24059n;

    /* renamed from: p, reason: collision with root package name */
    public a f24060p;

    /* renamed from: q, reason: collision with root package name */
    public final c1 f24061q;

    /* renamed from: r, reason: collision with root package name */
    public float f24062r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f24063s;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f24064a;

        /* renamed from: b, reason: collision with root package name */
        public u2 f24065b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24066c;

        /* renamed from: d, reason: collision with root package name */
        public float f24067d;

        /* renamed from: e, reason: collision with root package name */
        public final o f24068e = new o(CropImageView.DEFAULT_ASPECT_RATIO);

        /* renamed from: f, reason: collision with root package name */
        public o f24069f;

        /* renamed from: g, reason: collision with root package name */
        public long f24070g;

        /* renamed from: h, reason: collision with root package name */
        public long f24071h;

        public final String toString() {
            return "progress nanos: " + this.f24064a + ", animationSpec: " + this.f24065b + ", isComplete: " + this.f24066c + ", value: " + this.f24067d + ", start: " + this.f24068e + ", initialVelocity: " + this.f24069f + ", durationNanos: " + this.f24070g + ", animationSpecDuration: " + this.f24071h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(p5.s sVar) {
        super(2);
        this.f24048b = bg.b.h(sVar);
        this.f24049c = bg.b.h(sVar);
        this.f24050d = sVar;
        this.f24053g = new d1(this);
        this.f24054h = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f24056k = new yh.c();
        this.f24057l = new v0();
        this.f24058m = Long.MIN_VALUE;
        this.f24059n = new p.h0<>((Object) null);
        this.f24061q = new c1(this);
        this.f24063s = new a1(this);
    }

    public static final void c0(z0 z0Var) {
        x0.u1 u1Var = z0Var.f24054h;
        y1<S> y1Var = z0Var.f24051e;
        if (y1Var == null) {
            return;
        }
        a aVar = z0Var.f24060p;
        if (aVar == null) {
            if (z0Var.f24052f <= 0 || u1Var.getFloatValue() == 1.0f || kotlin.jvm.internal.r.a(z0Var.f24049c.getValue(), z0Var.f24048b.getValue())) {
                aVar = null;
            } else {
                aVar = new a();
                aVar.f24067d = u1Var.getFloatValue();
                long j10 = z0Var.f24052f;
                aVar.f24070g = j10;
                aVar.f24071h = gh.a.c((1.0d - u1Var.getFloatValue()) * j10);
                aVar.f24068e.e(u1Var.getFloatValue(), 0);
            }
        }
        if (aVar != null) {
            aVar.f24070g = z0Var.f24052f;
            z0Var.f24059n.g(aVar);
            y1Var.m(aVar);
        }
        z0Var.f24060p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d0(z0 z0Var, a aVar, long j10) {
        long j11 = aVar.f24064a + j10;
        aVar.f24064a = j11;
        long j12 = aVar.f24071h;
        if (j11 >= j12) {
            aVar.f24067d = 1.0f;
            return;
        }
        u2 u2Var = aVar.f24065b;
        if (u2Var == null) {
            float f10 = j11 / j12;
            aVar.f24067d = (f10 * 1.0f) + ((1 - f10) * aVar.f24068e.a(0));
            return;
        }
        o oVar = aVar.f24068e;
        o oVar2 = aVar.f24069f;
        if (oVar2 == null) {
            oVar2 = f24046t;
        }
        aVar.f24067d = jh.j.l(((o) u2Var.d(j11, oVar, f24047v, oVar2)).a(0), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(z0 z0Var, vg.c cVar) {
        e1 e1Var;
        z0Var.getClass();
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i10 = e1Var.f23717d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                e1Var.f23717d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                e1Var = new e1(z0Var, cVar);
            }
        }
        Object obj = e1Var.f23715b;
        ug.a aVar = ug.a.f29706a;
        int i11 = e1Var.f23717d;
        if (i11 == 0) {
            pg.q.b(obj);
            if (z0Var.f24059n.d() && z0Var.f24060p == null) {
                return pg.f0.f21461a;
            }
            if (w1.h(e1Var.getContext()) == CropImageView.DEFAULT_ASPECT_RATIO) {
                z0Var.i0();
                z0Var.f24058m = Long.MIN_VALUE;
                return pg.f0.f21461a;
            }
            if (z0Var.f24058m == Long.MIN_VALUE) {
                c1 c1Var = z0Var.f24061q;
                e1Var.f23714a = z0Var;
                e1Var.f23717d = 1;
                if (x0.f1.a(e1Var.getContext()).f0(c1Var, e1Var) != aVar) {
                }
            }
            return aVar;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z0Var = e1Var.f23714a;
        pg.q.b(obj);
        do {
            if (!z0Var.f24059n.e() && z0Var.f24060p == null) {
                z0Var.f24058m = Long.MIN_VALUE;
                return pg.f0.f21461a;
            }
            e1Var.f23714a = z0Var;
            e1Var.f23717d = 2;
        } while (z0Var.h0(e1Var) != aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(z0 z0Var, vg.c cVar) throws Throwable {
        h1 h1Var;
        Object value;
        z0 z0Var2;
        Object obj;
        z0Var.getClass();
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i10 = h1Var.f23766e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h1Var.f23766e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h1Var = new h1(z0Var, cVar);
            }
        }
        Object obj2 = h1Var.f23764c;
        ug.a aVar = ug.a.f29706a;
        int i11 = h1Var.f23766e;
        if (i11 == 0) {
            pg.q.b(obj2);
            value = z0Var.f24048b.getValue();
            yh.c cVar2 = z0Var.f24056k;
            h1Var.f23762a = z0Var;
            h1Var.f23763b = value;
            h1Var.f23766e = 1;
            if (cVar2.h(h1Var) != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = h1Var.f23763b;
            z0Var2 = h1Var.f23762a;
            pg.q.b(obj2);
            if (!kotlin.jvm.internal.r.a(obj2, obj)) {
                return pg.f0.f21461a;
            }
            z0Var2.f24058m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        Object obj3 = h1Var.f23763b;
        z0 z0Var3 = h1Var.f23762a;
        pg.q.b(obj2);
        value = obj3;
        z0Var = z0Var3;
        h1Var.f23762a = z0Var;
        h1Var.f23763b = value;
        h1Var.f23766e = 2;
        ph.m mVar = new ph.m(1, ah.p.c(h1Var));
        mVar.p();
        z0Var.f24055j = mVar;
        z0Var.f24056k.l(null);
        Object objO = mVar.o();
        if (objO != aVar) {
            z0Var2 = z0Var;
            obj = value;
            obj2 = objO;
            if (!kotlin.jvm.internal.r.a(obj2, obj)) {
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g0(z0 z0Var, vg.c cVar) throws Throwable {
        i1 i1Var;
        z0 z0Var2;
        Object obj;
        z0 z0Var3;
        z0Var.getClass();
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i10 = i1Var.f23778e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                i1Var.f23778e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                i1Var = new i1(z0Var, cVar);
            }
        }
        Object objO = i1Var.f23776c;
        ug.a aVar = ug.a.f29706a;
        int i11 = i1Var.f23778e;
        if (i11 == 0) {
            pg.q.b(objO);
            Object value = z0Var.f24048b.getValue();
            yh.c cVar2 = z0Var.f24056k;
            i1Var.f23774a = z0Var;
            i1Var.f23775b = value;
            i1Var.f23778e = 1;
            if (cVar2.h(i1Var) != aVar) {
                z0Var2 = z0Var;
                obj = value;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = i1Var.f23775b;
            z0Var3 = i1Var.f23774a;
            pg.q.b(objO);
            if (!kotlin.jvm.internal.r.a(objO, obj)) {
                z0Var3.f24058m = Long.MIN_VALUE;
                throw new CancellationException("snapTo() was canceled because state was changed to " + objO + " instead of " + obj);
            }
            return pg.f0.f21461a;
        }
        obj = i1Var.f23775b;
        z0Var2 = i1Var.f23774a;
        pg.q.b(objO);
        S s10 = z0Var2.f24050d;
        yh.c cVar3 = z0Var2.f24056k;
        if (kotlin.jvm.internal.r.a(obj, s10)) {
            cVar3.l(null);
            return pg.f0.f21461a;
        }
        i1Var.f23774a = z0Var2;
        i1Var.f23775b = obj;
        i1Var.f23778e = 2;
        ph.m mVar = new ph.m(1, ah.p.c(i1Var));
        mVar.p();
        z0Var2.f24055j = mVar;
        cVar3.l(null);
        objO = mVar.o();
        if (objO != aVar) {
            z0Var3 = z0Var2;
            if (!kotlin.jvm.internal.r.a(objO, obj)) {
            }
            return pg.f0.f21461a;
        }
        return aVar;
    }

    @Override // c2.g0
    public final S V() {
        return (S) this.f24049c.getValue();
    }

    @Override // c2.g0
    public final S X() {
        return (S) this.f24048b.getValue();
    }

    @Override // c2.g0
    public final void Z(S s10) {
        this.f24049c.setValue(s10);
    }

    @Override // c2.g0
    public final void a0(y1<S> y1Var) {
        y1<S> y1Var2 = this.f24051e;
        if (y1Var2 != null && !y1Var.equals(y1Var2)) {
            x0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f24051e + ", new instance: " + y1Var);
        }
        this.f24051e = y1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg.j] */
    @Override // c2.g0
    public final void b0() {
        this.f24051e = null;
        ((h1.z) c2.f23680b.getValue()).c(this);
    }

    public final Object h0(vg.c cVar) {
        float fH = w1.h(cVar.getContext());
        if (fH <= CropImageView.DEFAULT_ASPECT_RATIO) {
            i0();
            return pg.f0.f21461a;
        }
        this.f24062r = fH;
        Object objF0 = x0.f1.a(cVar.getContext()).f0(this.f24063s, cVar);
        return objF0 == ug.a.f29706a ? objF0 : pg.f0.f21461a;
    }

    public final void i0() {
        y1<S> y1Var = this.f24051e;
        if (y1Var != null) {
            y1Var.c();
        }
        this.f24059n.i();
        if (this.f24060p != null) {
            this.f24060p = null;
            l0(1.0f);
            k0();
        }
    }

    public final Object j0(float f10, Object obj, vg.i iVar) {
        if (CropImageView.DEFAULT_ASPECT_RATIO > f10 || f10 > 1.0f) {
            x0.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        y1<S> y1Var = this.f24051e;
        if (y1Var == null) {
            return pg.f0.f21461a;
        }
        Object objA = v0.a(this.f24057l, new f1(obj, this.f24048b.getValue(), this, y1Var, f10, null), iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    public final void k0() {
        y1<S> y1Var = this.f24051e;
        if (y1Var == null) {
            return;
        }
        y1Var.l(gh.a.c(this.f24054h.getFloatValue() * ((Number) y1Var.f24012l.getValue()).longValue()));
    }

    public final void l0(float f10) {
        this.f24054h.e(f10);
    }
}

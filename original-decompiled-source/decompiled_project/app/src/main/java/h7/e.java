package h7;

import android.os.Trace;
import g2.j;
import java.util.concurrent.CancellationException;
import pg.f0;
import ph.g0;
import ph.i0;
import ph.j0;
import ph.k0;
import ph.l2;
import ph.s1;
import q1.c1;
import sh.a1;
import sh.l0;
import sh.o0;
import sh.q0;
import sh.z0;
import w7.f;
import x0.u2;
import x0.x1;

/* loaded from: classes.dex */
public final class e extends v1.c implements u2 {

    /* renamed from: z, reason: collision with root package name */
    public static final d f12280z = new d(0);

    /* renamed from: h, reason: collision with root package name */
    public c1 f12283h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12284j;

    /* renamed from: k, reason: collision with root package name */
    public s1 f12285k;

    /* renamed from: l, reason: collision with root package name */
    public o0 f12286l;

    /* renamed from: n, reason: collision with root package name */
    public i0 f12288n;

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super b, f0> f12290q;

    /* renamed from: t, reason: collision with root package name */
    public i f12293t;

    /* renamed from: v, reason: collision with root package name */
    public a f12294v;

    /* renamed from: w, reason: collision with root package name */
    public final z0 f12295w;

    /* renamed from: x, reason: collision with root package name */
    public final z0 f12296x;

    /* renamed from: y, reason: collision with root package name */
    public final l0 f12297y;

    /* renamed from: f, reason: collision with root package name */
    public final x1 f12281f = bg.b.h(null);

    /* renamed from: g, reason: collision with root package name */
    public float f12282g = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f12287m = 9205357640488583168L;

    /* renamed from: p, reason: collision with root package name */
    public eh.l<? super b, ? extends b> f12289p = f12280z;

    /* renamed from: r, reason: collision with root package name */
    public g2.j f12291r = j.a.f11398b;

    /* renamed from: s, reason: collision with root package name */
    public int f12292s = 1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final g7.p f12298a;

        /* renamed from: b, reason: collision with root package name */
        public final w7.f f12299b;

        /* renamed from: c, reason: collision with root package name */
        public final h7.c f12300c;

        public a(g7.p pVar, w7.f fVar, h7.c cVar) {
            this.f12298a = pVar;
            this.f12299b = fVar;
            this.f12300c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.r.a(this.f12298a, aVar.f12298a)) {
                return false;
            }
            h7.c cVar = aVar.f12300c;
            h7.c cVar2 = this.f12300c;
            return kotlin.jvm.internal.r.a(cVar2, cVar) && cVar2.equals(this.f12299b, aVar.f12299b);
        }

        public final int hashCode() {
            int iHashCode = this.f12298a.hashCode() * 31;
            h7.c cVar = this.f12300c;
            return cVar.hashCode(this.f12299b) + ((cVar.hashCode() + iHashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.f12298a + ", request=" + this.f12299b + ", modelEqualityDelegate=" + this.f12300c + ')';
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f12301a = new a();

            @Override // h7.e.b
            public final v1.c a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* renamed from: h7.e$b$b, reason: collision with other inner class name */
        public static final class C0113b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final v1.c f12302a;

            /* renamed from: b, reason: collision with root package name */
            public final w7.e f12303b;

            public C0113b(v1.c cVar, w7.e eVar) {
                this.f12302a = cVar;
                this.f12303b = eVar;
            }

            @Override // h7.e.b
            public final v1.c a() {
                return this.f12302a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0113b)) {
                    return false;
                }
                C0113b c0113b = (C0113b) obj;
                return kotlin.jvm.internal.r.a(this.f12302a, c0113b.f12302a) && kotlin.jvm.internal.r.a(this.f12303b, c0113b.f12303b);
            }

            public final int hashCode() {
                v1.c cVar = this.f12302a;
                return this.f12303b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.f12302a + ", result=" + this.f12303b + ')';
            }
        }

        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final v1.c f12304a;

            public c(v1.c cVar) {
                this.f12304a = cVar;
            }

            @Override // h7.e.b
            public final v1.c a() {
                return this.f12304a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.r.a(this.f12304a, ((c) obj).f12304a);
            }

            public final int hashCode() {
                v1.c cVar = this.f12304a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.f12304a + ')';
            }
        }

        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            public final v1.c f12305a;

            /* renamed from: b, reason: collision with root package name */
            public final w7.o f12306b;

            public d(v1.c cVar, w7.o oVar) {
                this.f12305a = cVar;
                this.f12306b = oVar;
            }

            @Override // h7.e.b
            public final v1.c a() {
                return this.f12305a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.r.a(this.f12305a, dVar.f12305a) && kotlin.jvm.internal.r.a(this.f12306b, dVar.f12306b);
            }

            public final int hashCode() {
                return this.f12306b.hashCode() + (this.f12305a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.f12305a + ", result=" + this.f12306b + ')';
            }
        }

        v1.c a();
    }

    @vg.e(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {228, 232}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public e f12307a;

        /* renamed from: b, reason: collision with root package name */
        public int f12308b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f12310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f12310d = aVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return e.this.new c(this.f12310d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r6 == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            e eVar;
            b bVar;
            w7.i iVar;
            b c0113b;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f12308b;
            e eVar2 = e.this;
            if (i10 == 0) {
                pg.q.b(obj);
                i iVar2 = eVar2.f12293t;
                a aVar2 = this.f12310d;
                if (iVar2 != null) {
                    w7.f fVarJ = e.j(eVar2, aVar2.f12299b, true);
                    g7.p pVar = aVar2.f12298a;
                    this.f12308b = 1;
                    obj = iVar2.a(pVar, fVarJ, this);
                } else {
                    w7.f fVarJ2 = e.j(eVar2, aVar2.f12299b, false);
                    g7.p pVar2 = aVar2.f12298a;
                    this.f12307a = eVar2;
                    this.f12308b = 2;
                    obj = pVar2.a(fVarJ2, this);
                    if (obj != aVar) {
                        eVar = eVar2;
                        iVar = (w7.i) obj;
                        eVar.getClass();
                        if (!(iVar instanceof w7.o)) {
                        }
                        bVar = c0113b;
                    }
                }
                return aVar;
            }
            if (i10 == 1) {
                pg.q.b(obj);
                bVar = (b) obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = this.f12307a;
                pg.q.b(obj);
                iVar = (w7.i) obj;
                eVar.getClass();
                if (!(iVar instanceof w7.o)) {
                    w7.o oVar = (w7.o) iVar;
                    c0113b = new b.d(f1.m.a(oVar.f31411a, oVar.f31412b.f31328a, eVar.f12292s), oVar);
                } else {
                    if (!(iVar instanceof w7.e)) {
                        throw new pg.l();
                    }
                    w7.e eVar3 = (w7.e) iVar;
                    g7.l lVar = eVar3.f31325a;
                    c0113b = new b.C0113b(lVar != null ? f1.m.a(lVar, eVar3.f31326b.f31328a, eVar.f12292s) : null, eVar3);
                }
                bVar = c0113b;
            }
            e.k(eVar2, bVar);
            return f0.f21461a;
        }
    }

    public e(a aVar) {
        this.f12294v = aVar;
        this.f12295w = a1.a(aVar);
        z0 z0VarA = a1.a(b.a.f12301a);
        this.f12296x = z0VarA;
        this.f12297y = gg.a.a(z0VarA);
    }

    public static final w7.f j(e eVar, w7.f fVar, boolean z10) {
        x7.i iVar = fVar.f31342o;
        f.c cVar = fVar.f31346s;
        if (iVar instanceof m) {
            m mVar = (m) iVar;
            if (eVar.f12286l == null) {
                o0 o0VarB = q0.b(0, 2, rh.a.f23577b);
                long j10 = eVar.f12287m;
                if (j10 != 9205357640488583168L) {
                    o0VarB.r(new p1.h(j10));
                }
                eVar.f12286l = o0VarB;
            }
            mVar.l();
        }
        f.a aVarA = w7.f.a(fVar);
        aVarA.f31351d = new f(fVar, eVar);
        if (cVar.f31384g == null) {
            aVarA.f31359l = x7.i.f32201a;
        }
        if (cVar.f31385h == null) {
            g2.j jVar = eVar.f12291r;
            int i10 = i7.i.f14196b;
            aVarA.f31360m = (kotlin.jvm.internal.r.a(jVar, j.a.f11398b) || kotlin.jvm.internal.r.a(jVar, j.a.f11399c)) ? x7.f.f32191b : x7.f.f32190a;
        }
        if (cVar.f31386i == null) {
            aVarA.f31361n = x7.c.f32186b;
        }
        if (z10) {
            tg.i iVar2 = tg.i.f28768a;
            aVarA.f31353f = iVar2;
            aVarA.f31354g = iVar2;
            aVarA.f31355h = iVar2;
        }
        return aVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(e eVar, b bVar) {
        w7.i iVar;
        eh.l<? super b, f0> lVar;
        z0 z0Var = eVar.f12296x;
        b bVar2 = (b) z0Var.getValue();
        b bVarInvoke = eVar.f12289p.invoke(bVar);
        z0Var.setValue(bVarInvoke);
        g2.j jVar = eVar.f12291r;
        if (!(bVarInvoke instanceof b.d)) {
            if (bVarInvoke instanceof b.C0113b) {
                iVar = ((b.C0113b) bVarInvoke).f12303b;
            }
            eVar.f12281f.setValue(bVarInvoke.a());
            if (bVar2.a() != bVarInvoke.a()) {
                Object objA = bVar2.a();
                u2 u2Var = objA instanceof u2 ? (u2) objA : null;
                if (u2Var != null) {
                    u2Var.c();
                }
                Object objA2 = bVarInvoke.a();
                u2 u2Var2 = objA2 instanceof u2 ? (u2) objA2 : null;
                if (u2Var2 != null) {
                    u2Var2.d();
                }
            }
            lVar = eVar.f12290q;
            if (lVar == null) {
                lVar.invoke(bVarInvoke);
                return;
            }
            return;
        }
        iVar = ((b.d) bVarInvoke).f12306b;
        ((a8.c) g7.k.a(iVar.a(), w7.h.f31391a)).a(g.f12313a, iVar);
        eVar.f12281f.setValue(bVarInvoke.a());
        if (bVar2.a() != bVarInvoke.a()) {
        }
        lVar = eVar.f12290q;
        if (lVar == null) {
        }
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f12282g = f10;
        return true;
    }

    @Override // x0.u2
    public final void b() {
        s1 s1Var = this.f12285k;
        if (s1Var != null) {
            s1Var.cancel((CancellationException) null);
        }
        this.f12285k = null;
        Object obj = (v1.c) this.f12281f.getValue();
        u2 u2Var = obj instanceof u2 ? (u2) obj : null;
        if (u2Var != null) {
            u2Var.b();
        }
        this.f12284j = false;
    }

    @Override // x0.u2
    public final void c() {
        s1 s1Var = this.f12285k;
        if (s1Var != null) {
            s1Var.cancel((CancellationException) null);
        }
        this.f12285k = null;
        Object obj = (v1.c) this.f12281f.getValue();
        u2 u2Var = obj instanceof u2 ? (u2) obj : null;
        if (u2Var != null) {
            u2Var.c();
        }
        this.f12284j = false;
    }

    @Override // x0.u2
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (v1.c) this.f12281f.getValue();
            u2 u2Var = obj instanceof u2 ? (u2) obj : null;
            if (u2Var != null) {
                u2Var.d();
            }
            l();
            this.f12284j = true;
            f0 f0Var = f0.f21461a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f12283h = c1Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final long h() {
        v1.c cVar = (v1.c) this.f12281f.getValue();
        if (cVar != null) {
            return cVar.h();
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final void i(s1.e eVar) {
        long jI = eVar.i();
        if (!p1.h.a(this.f12287m, jI)) {
            this.f12287m = jI;
            o0 o0Var = this.f12286l;
            if (o0Var != null) {
                o0Var.r(new p1.h(jI));
            }
        }
        v1.c cVar = (v1.c) this.f12281f.getValue();
        if (cVar != null) {
            cVar.g(eVar, eVar.i(), this.f12282g, this.f12283h);
        }
    }

    public final void l() {
        a aVar = this.f12294v;
        if (aVar == null) {
            return;
        }
        i0 i0Var = this.f12288n;
        if (i0Var == null) {
            kotlin.jvm.internal.r.h("scope");
            throw null;
        }
        c cVar = new c(aVar, null);
        tg.h coroutineContext = i0Var.getCoroutineContext();
        int i10 = i7.i.f14196b;
        g0 g0Var = (g0) coroutineContext.get(g0.f21535b);
        l2 l2VarB = (g0Var == null || g0Var.equals(ph.z0.f21633b)) ? ph.h.b(i0Var, ph.z0.f21633b, k0.f21556d, cVar) : ph.h.b(j0.a(new i7.e(i0Var.getCoroutineContext())), new i7.f(g0Var), k0.f21556d, cVar);
        s1 s1Var = this.f12285k;
        if (s1Var != null) {
            s1Var.cancel((CancellationException) null);
        }
        this.f12285k = l2VarB;
    }

    public final void m(a aVar) {
        if (kotlin.jvm.internal.r.a(this.f12294v, aVar)) {
            return;
        }
        this.f12294v = aVar;
        if (aVar == null) {
            s1 s1Var = this.f12285k;
            if (s1Var != null) {
                s1Var.cancel((CancellationException) null);
            }
            this.f12285k = null;
        } else if (this.f12284j) {
            l();
        }
        if (aVar != null) {
            z0 z0Var = this.f12295w;
            z0Var.getClass();
            z0Var.j(null, aVar);
        }
    }
}

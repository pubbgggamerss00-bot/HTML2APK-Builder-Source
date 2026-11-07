package androidx.compose.animation;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import f3.r;
import g2.d1;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.o0;
import i2.a1;
import j9.e1;
import j9.f1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p.l0;
import p.w0;
import pg.f0;
import qg.a0;
import r.d2;
import r.f2;
import r.j0;
import r.j2;
import r.l2;
import r.p;
import r.p1;
import r.p2;
import r.q;
import r.q1;
import r.r1;
import r.s1;
import r.t;
import r.u;
import r.u1;
import r.v;
import r.v1;
import r.w1;
import s.e0;
import s.m;
import s.m2;
import s.o2;
import s.y1;
import s8.c2;
import x0.n1;
import x0.r3;
import x0.x1;

/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements p<S> {

    /* renamed from: a, reason: collision with root package name */
    public final y1<S> f725a;

    /* renamed from: b, reason: collision with root package name */
    public j1.d f726b;

    /* renamed from: c, reason: collision with root package name */
    public r f727c;

    /* renamed from: d, reason: collision with root package name */
    public final x1 f728d = bg.b.h(new f3.p(0));

    /* renamed from: e, reason: collision with root package name */
    public final l0<S, r3<f3.p>> f729e = w0.b();

    /* renamed from: f, reason: collision with root package name */
    public y1.a.C0268a f730f;

    public static final class SizeModifierElement<S> extends a1<b<S>> {

        /* renamed from: b, reason: collision with root package name */
        public final y1<S>.a<f3.p, s.p> f731b;

        /* renamed from: c, reason: collision with root package name */
        public final n1 f732c;

        /* renamed from: d, reason: collision with root package name */
        public final AnimatedContentTransitionScopeImpl<S> f733d;

        public SizeModifierElement(y1.a aVar, n1 n1Var, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.f731b = aVar;
            this.f732c = n1Var;
            this.f733d = animatedContentTransitionScopeImpl;
        }

        @Override // i2.a1
        public final d.c a() {
            b bVar = new b();
            bVar.f735q = this.f731b;
            bVar.f736r = this.f732c;
            bVar.f737s = this.f733d;
            bVar.f738t = androidx.compose.animation.b.f762a;
            return bVar;
        }

        @Override // i2.a1
        public final void b(d.c cVar) {
            b bVar = (b) cVar;
            bVar.f735q = this.f731b;
            bVar.f736r = this.f732c;
            bVar.f737s = this.f733d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return kotlin.jvm.internal.r.a(sizeModifierElement.f731b, this.f731b) && kotlin.jvm.internal.r.a(sizeModifierElement.f732c, this.f732c);
        }

        public final int hashCode() {
            int iHashCode = this.f733d.hashCode() * 31;
            y1<S>.a<f3.p, s.p> aVar = this.f731b;
            return this.f732c.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    public static final class a implements d1 {

        /* renamed from: b, reason: collision with root package name */
        public final x1 f734b;

        public a(boolean z10) {
            this.f734b = bg.b.h(Boolean.valueOf(z10));
        }

        @Override // g2.d1
        public final Object t() {
            return this;
        }
    }

    public static final class b<S> extends d2 {

        /* renamed from: q, reason: collision with root package name */
        public y1<S>.a<f3.p, s.p> f735q;

        /* renamed from: r, reason: collision with root package name */
        public n1 f736r;

        /* renamed from: s, reason: collision with root package name */
        public AnimatedContentTransitionScopeImpl<S> f737s;

        /* renamed from: t, reason: collision with root package name */
        public long f738t;

        public static final class a extends s implements l<g1.a, f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<S> f739a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f740b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f741c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<S> bVar, g1 g1Var, long j10) {
                super(1);
                this.f739a = bVar;
                this.f740b = g1Var;
                this.f741c = j10;
            }

            @Override // eh.l
            public final f0 invoke(g1.a aVar) {
                j1.d dVar = this.f739a.f737s.f726b;
                g1.a.f(aVar, this.f740b, dVar.a((r0.f11383b & BodyPartID.bodyIdMax) | (r0.f11382a << 32), this.f741c, r.f8828a));
                return f0.f21461a;
            }
        }

        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$b, reason: collision with other inner class name */
        public static final class C0012b extends s implements l<y1.b<S>, e0<f3.p>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<S> f742a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f743b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0012b(b<S> bVar, long j10) {
                super(1);
                this.f742a = bVar;
                this.f743b = j10;
            }

            @Override // eh.l
            public final e0<f3.p> invoke(Object obj) {
                long j10;
                e0<f3.p> e0VarB;
                y1.b bVar = (y1.b) obj;
                Object objC = bVar.c();
                b<S> bVar2 = this.f742a;
                if (kotlin.jvm.internal.r.a(objC, bVar2.f737s.c())) {
                    j10 = f3.p.b(bVar2.f738t, androidx.compose.animation.b.f762a) ? this.f743b : bVar2.f738t;
                } else {
                    r3 r3Var = (r3) bVar2.f737s.f729e.d(bVar.c());
                    j10 = r3Var != null ? ((f3.p) r3Var.getValue()).f8826a : 0L;
                }
                r3 r3Var2 = (r3) bVar2.f737s.f729e.d(bVar.e());
                long j11 = r3Var2 != null ? ((f3.p) r3Var2.getValue()).f8826a : 0L;
                j2 j2Var = (j2) bVar2.f736r.getValue();
                return (j2Var == null || (e0VarB = j2Var.b(j10, j11)) == null) ? m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5) : e0VarB;
            }
        }

        public static final class c extends s implements l<S, f3.p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<S> f744a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f745b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b<S> bVar, long j10) {
                super(1);
                this.f744a = bVar;
                this.f745b = j10;
            }

            @Override // eh.l
            public final f3.p invoke(Object obj) {
                long j10;
                b<S> bVar = this.f744a;
                if (kotlin.jvm.internal.r.a(obj, bVar.f737s.c())) {
                    j10 = f3.p.b(bVar.f738t, androidx.compose.animation.b.f762a) ? this.f745b : bVar.f738t;
                } else {
                    r3<f3.p> r3VarD = bVar.f737s.f729e.d(obj);
                    j10 = r3VarD != null ? r3VarD.getValue().f8826a : 0L;
                }
                return new f3.p(j10);
            }
        }

        public b() {
            throw null;
        }

        @Override // androidx.compose.ui.d.c
        public final void N1() {
            this.f738t = androidx.compose.animation.b.f762a;
        }

        @Override // i2.b0
        public final m0 m(o0 o0Var, k0 k0Var, long j10) {
            long j11;
            g1 g1VarP = k0Var.P(j10);
            if (o0Var.I0()) {
                j11 = (g1VarP.f11382a << 32) | (g1VarP.f11383b & BodyPartID.bodyIdMax);
            } else {
                y1<S>.a<f3.p, s.p> aVar = this.f735q;
                if (aVar == null) {
                    j11 = (g1VarP.f11382a << 32) | (g1VarP.f11383b & BodyPartID.bodyIdMax);
                    this.f738t = j11;
                } else {
                    long j12 = (g1VarP.f11383b & BodyPartID.bodyIdMax) | (g1VarP.f11382a << 32);
                    y1.a.C0268a c0268aA = aVar.a(new C0012b(this, j12), new c(this, j12));
                    this.f737s.f730f = c0268aA;
                    j11 = ((f3.p) c0268aA.getValue()).f8826a;
                    this.f738t = ((f3.p) c0268aA.getValue()).f8826a;
                }
            }
            return o0Var.i0((int) (j11 >> 32), (int) (BodyPartID.bodyIdMax & j11), a0.f22708a, new a(this, g1VarP, j11));
        }
    }

    public AnimatedContentTransitionScopeImpl(y1<S> y1Var, j1.d dVar, r rVar) {
        this.f725a = y1Var;
        this.f726b = dVar;
        this.f727c = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long f(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        y1.a.C0268a c0268a = animatedContentTransitionScopeImpl.f730f;
        return c0268a != null ? ((f3.p) c0268a.getValue()).f8826a : ((f3.p) animatedContentTransitionScopeImpl.f728d.getValue()).f8826a;
    }

    @Override // r.p
    public final v1 a(int i10, m2 m2Var, c2 c2Var) {
        if (i10 == 0 || ((i10 == 4 && this.f727c == r.f8828a) || (i10 == 5 && this.f727c == r.f8829b))) {
            q qVar = new q(c2Var, this);
            o2 o2Var = r.w0.f22973a;
            return new v1(new p2((r.y1) null, new l2(new p1(qVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        if (i10 == 1 || ((i10 == 4 && this.f727c == r.f8829b) || (i10 == 5 && this.f727c == r.f8828a))) {
            r.r rVar = new r.r(c2Var, this);
            o2 o2Var2 = r.w0.f22973a;
            return new v1(new p2((r.y1) null, new l2(new p1(rVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        if (i10 == 2) {
            r.s sVar = new r.s(c2Var, this);
            o2 o2Var3 = r.w0.f22973a;
            return new v1(new p2((r.y1) null, new l2(new q1(sVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        if (i10 != 3) {
            return u1.f22959a;
        }
        e1 e1Var = new e1(c2Var, this, 1);
        o2 o2Var4 = r.w0.f22973a;
        return new v1(new p2((r.y1) null, new l2(new q1(e1Var), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
    }

    @Override // r.p
    public final r.x1 b(int i10, m2 m2Var, b9.w0 w0Var) {
        int i11 = 1;
        if (i10 == 0 || ((i10 == 4 && this.f727c == r.f8828a) || (i10 == 5 && this.f727c == r.f8829b))) {
            f1 f1Var = new f1(i11, this, w0Var);
            o2 o2Var = r.w0.f22973a;
            return new r.x1(new p2((r.y1) null, new l2(new r1(f1Var), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        if (i10 == 1 || ((i10 == 4 && this.f727c == r.f8829b) || (i10 == 5 && this.f727c == r.f8828a))) {
            t tVar = new t(this, w0Var);
            o2 o2Var2 = r.w0.f22973a;
            return new r.x1(new p2((r.y1) null, new l2(new r1(tVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        int i12 = 0;
        if (i10 == 2) {
            u uVar = new u(i12, this, w0Var);
            o2 o2Var3 = r.w0.f22973a;
            return new r.x1(new p2((r.y1) null, new l2(new s1(uVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
        }
        if (i10 != 3) {
            return w1.f22979a;
        }
        v vVar = new v(i12, this, w0Var);
        o2 o2Var4 = r.w0.f22973a;
        return new r.x1(new p2((r.y1) null, new l2(new s1(vVar), m2Var), (j0) null, (f2) null, (LinkedHashMap) null, 61));
    }

    @Override // s.y1.b
    public final S c() {
        return this.f725a.f().c();
    }

    @Override // s.y1.b
    public final S e() {
        return this.f725a.f().e();
    }
}

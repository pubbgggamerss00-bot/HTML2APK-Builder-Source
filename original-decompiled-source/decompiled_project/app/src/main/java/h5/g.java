package h5;

import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import eh.p;
import h5.g;
import kotlin.jvm.internal.g0;
import pg.f0;
import x0.h2;
import x0.j;
import x0.k0;
import x0.o0;

/* loaded from: classes.dex */
public final class g {

    public static final class a implements k0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f12259a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f12260b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0 f12261c;

        public a(t tVar, f fVar, g0 g0Var) {
            this.f12259a = tVar;
            this.f12260b = fVar;
            this.f12261c = g0Var;
        }

        @Override // x0.k0
        public final void a() {
            this.f12259a.getLifecycle().c(this.f12260b);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12262a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12262a = iArr;
        }
    }

    public static final void a(final Object obj, final t tVar, final eh.l lVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1220373486);
        int i11 = i10 | 16 | (kVarP.l(lVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                tVar = (t) kVarP.f(k.f12264a);
            } else {
                kVarP.v();
            }
            int i12 = i11 & (-113);
            kVarP.U();
            boolean zK = kVarP.K(obj) | kVarP.K(tVar);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new i(tVar.getLifecycle());
                kVarP.C(objG);
            }
            b(tVar, (i) objG, lVar, kVarP, i12 & 896);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p(obj, tVar, lVar, i10) { // from class: h5.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f12246a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f12247b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f12248c;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(7);
                    g.a(this.f12246a, this.f12247b, this.f12248c, (x0.j) obj2, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void b(final t tVar, final i iVar, final eh.l<? super i, ? extends h> lVar, x0.j jVar, final int i10) {
        int i11;
        x0.k kVarP = jVar.p(912823238);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(tVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(iVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(lVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zL = ((i11 & 896) == 256) | kVarP.l(iVar) | kVarP.l(tVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: h5.d
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.s, h5.f] */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        final g0 g0Var = new g0();
                        final i iVar2 = iVar;
                        final eh.l lVar2 = lVar;
                        ?? r02 = new r() { // from class: h5.f
                            /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                            @Override // androidx.lifecycle.r
                            public final void l(t tVar2, l.a aVar) {
                                int i12 = g.b.f12262a[aVar.ordinal()];
                                g0 g0Var2 = g0Var;
                                if (i12 == 3) {
                                    g0Var2.f16327a = lVar2.invoke(iVar2);
                                } else {
                                    if (i12 != 4) {
                                        return;
                                    }
                                    g0Var2.f16327a = null;
                                }
                            }
                        };
                        t tVar2 = tVar;
                        tVar2.getLifecycle().a(r02);
                        return new g.a(tVar2, r02, g0Var);
                    }
                };
                kVarP.C(objG);
            }
            o0.b(tVar, iVar, (eh.l) objG, kVarP);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p() { // from class: h5.e
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    g.b(tVar, iVar, lVar, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }
}

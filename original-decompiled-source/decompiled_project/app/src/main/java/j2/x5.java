package j2;

import android.view.View;
import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class x5 implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh.c f14971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.y1 f14972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.k2 f14973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<l3> f14974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f14975e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14976a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f14976a = iArr;
        }
    }

    @vg.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14977a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14978b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<l3> f14979c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.k2 f14980d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.t f14981e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x5 f14982f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f14983g;

        @vg.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {383}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14984a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sh.y0<Float> f14985b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l3 f14986c;

            /* renamed from: j2.x5$b$a$a, reason: collision with other inner class name */
            public static final class C0142a<T> implements sh.g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l3 f14987a;

                public C0142a(l3 l3Var) {
                    this.f14987a = l3Var;
                }

                @Override // sh.g
                public final Object c(Object obj, tg.e eVar) {
                    this.f14987a.f14827a.e(((Number) obj).floatValue());
                    return pg.f0.f21461a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sh.y0<Float> y0Var, l3 l3Var, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f14985b = y0Var;
                this.f14986c = l3Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f14985b, this.f14986c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                return ug.a.f29706a;
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f14984a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    C0142a c0142a = new C0142a(this.f14986c);
                    this.f14984a = 1;
                    if (this.f14985b.b(c0142a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                throw new pg.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.g0<l3> g0Var, x0.k2 k2Var, androidx.lifecycle.t tVar, x5 x5Var, View view, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f14979c = g0Var;
            this.f14980d = k2Var;
            this.f14981e = tVar;
            this.f14982f = x5Var;
            this.f14983g = view;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f14979c, this.f14980d, this.f14981e, this.f14982f, this.f14983g, eVar);
            bVar.f14978b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ph.s1 s1Var;
            ph.l2 l2VarC;
            Object obj2 = ug.a.f29706a;
            int i10 = this.f14977a;
            x5 x5Var = this.f14982f;
            androidx.lifecycle.t tVar = this.f14981e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s1Var = (ph.s1) this.f14978b;
                try {
                    pg.q.b(obj);
                    if (s1Var != null) {
                        s1Var.cancel((CancellationException) null);
                    }
                    tVar.getLifecycle().c(x5Var);
                    return pg.f0.f21461a;
                } catch (Throwable th2) {
                    th = th2;
                    if (s1Var != null) {
                        s1Var.cancel((CancellationException) null);
                    }
                    tVar.getLifecycle().c(x5Var);
                    throw th;
                }
            }
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f14978b;
            try {
                l3 l3Var = this.f14979c.f16327a;
                if (l3Var != null) {
                    sh.y0 y0VarA = a6.a(this.f14983g.getContext().getApplicationContext());
                    l3Var.f14827a.e(((Number) y0VarA.getValue()).floatValue());
                    l2VarC = ph.h.c(i0Var, null, null, new a(y0VarA, l3Var, null), 3);
                } else {
                    l2VarC = null;
                }
            } catch (Throwable th3) {
                th = th3;
                s1Var = null;
            }
            try {
                x0.k2 k2Var = this.f14980d;
                this.f14978b = l2VarC;
                this.f14977a = 1;
                Object objE = ph.h.e(k2Var.f31764a, new x0.p2(k2Var, new x0.q2(k2Var, null), x0.f1.a(getContext()), null), this);
                if (objE != obj2) {
                    objE = pg.f0.f21461a;
                }
                if (objE != obj2) {
                    objE = pg.f0.f21461a;
                }
                if (objE == obj2) {
                    return obj2;
                }
                s1Var = l2VarC;
                if (s1Var != null) {
                }
                tVar.getLifecycle().c(x5Var);
                return pg.f0.f21461a;
            } catch (Throwable th4) {
                s1Var = l2VarC;
                th = th4;
                if (s1Var != null) {
                }
                tVar.getLifecycle().c(x5Var);
                throw th;
            }
        }
    }

    public x5(uh.c cVar, x0.y1 y1Var, x0.k2 k2Var, kotlin.jvm.internal.g0 g0Var, View view) {
        this.f14971a = cVar;
        this.f14972b = y1Var;
        this.f14973c = k2Var;
        this.f14974d = g0Var;
        this.f14975e = view;
    }

    @Override // androidx.lifecycle.r
    public final void l(androidx.lifecycle.t tVar, l.a aVar) {
        boolean z10;
        int i10 = a.f14976a[aVar.ordinal()];
        ph.k<pg.f0> kVarX = null;
        if (i10 == 1) {
            ph.h.c(this.f14971a, null, ph.k0.f21556d, new b(this.f14974d, this.f14973c, tVar, this, this.f14975e, null), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                this.f14973c.v();
                return;
            } else {
                x0.k2 k2Var = this.f14973c;
                synchronized (k2Var.f31765b) {
                    k2Var.f31782s = true;
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                return;
            }
        }
        x0.y1 y1Var = this.f14972b;
        if (y1Var != null) {
            x0.z0 z0Var = y1Var.f31971b;
            synchronized (z0Var.f31980a) {
                try {
                    synchronized (z0Var.f31980a) {
                        z10 = z0Var.f31983d;
                    }
                    if (!z10) {
                        ArrayList arrayList = z0Var.f31981b;
                        z0Var.f31981b = z0Var.f31982c;
                        z0Var.f31982c = arrayList;
                        z0Var.f31983d = true;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((tg.e) arrayList.get(i11)).resumeWith(pg.f0.f21461a);
                        }
                        arrayList.clear();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        x0.k2 k2Var2 = this.f14973c;
        synchronized (k2Var2.f31765b) {
            if (k2Var2.f31782s) {
                k2Var2.f31782s = false;
                kVarX = k2Var2.x();
            }
        }
        if (kVarX != null) {
            ((ph.m) kVarX).resumeWith(pg.f0.f21461a);
        }
    }
}

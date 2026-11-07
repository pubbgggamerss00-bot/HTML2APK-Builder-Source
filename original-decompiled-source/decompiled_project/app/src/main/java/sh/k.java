package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q8.h1;
import rh.l;
import xh.h;
import xh.k;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends vg.i implements eh.q<ph.i0, g<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f24995a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f24996b;

    /* renamed from: c, reason: collision with root package name */
    public int f24997c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24998d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1 f25000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f25001g;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25002a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g<Object> f25003b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<Object> f25004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.g0 g0Var, g gVar, tg.e eVar) {
            super(1, eVar);
            this.f25003b = gVar;
            this.f25004c = g0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f25004c, this.f25003b, eVar);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.f0> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25002a;
            kotlin.jvm.internal.g0<Object> g0Var = this.f25004c;
            if (i10 == 0) {
                pg.q.b(obj);
                Object obj2 = g0Var.f16327a;
                if (obj2 == th.u.f28848a) {
                    obj2 = null;
                }
                this.f25002a = 1;
                if (this.f25003b.c(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            g0Var.f16327a = null;
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<rh.l<? extends Object>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public kotlin.jvm.internal.g0 f25005a;

        /* renamed from: b, reason: collision with root package name */
        public int f25006b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25007c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<Object> f25008d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g<Object> f25009e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.g0<Object> g0Var, g<Object> gVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f25008d = g0Var;
            this.f25009e = gVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f25008d, this.f25009e, eVar);
            bVar.f25007c = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(rh.l<? extends Object> lVar, tg.e<? super pg.f0> eVar) {
            return ((b) create(new rh.l(lVar.f23626a), eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v7, types: [T, uh.v] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.g0<Object> g0Var;
            kotlin.jvm.internal.g0<Object> g0Var2;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25006b;
            if (i10 == 0) {
                pg.q.b(obj);
                ?? r72 = ((rh.l) this.f25007c).f23626a;
                boolean z10 = r72 instanceof l.b;
                g0Var = this.f25008d;
                if (!z10) {
                    g0Var.f16327a = r72;
                }
                if (z10) {
                    l.a aVar2 = r72 instanceof l.a ? (l.a) r72 : null;
                    Throwable th2 = aVar2 != null ? aVar2.f23627a : null;
                    if (th2 != null) {
                        throw th2;
                    }
                    Object obj2 = g0Var.f16327a;
                    if (obj2 != null) {
                        Object obj3 = obj2 != th.u.f28848a ? obj2 : null;
                        this.f25007c = r72;
                        this.f25005a = g0Var;
                        this.f25006b = 1;
                        if (this.f25009e.c(obj3, this) == aVar) {
                            return aVar;
                        }
                        g0Var2 = g0Var;
                    }
                    g0Var.f16327a = th.u.f28850c;
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var2 = this.f25005a;
            pg.q.b(obj);
            g0Var = g0Var2;
            g0Var.f16327a = th.u.f28850c;
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<rh.u<? super Object>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25010a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25011b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z0 f25012c;

        public static final class a<T> implements g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ rh.u<Object> f25013a;

            @vg.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
            /* renamed from: sh.k$c$a$a, reason: collision with other inner class name */
            public static final class C0278a extends vg.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f25014a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f25015b;

                /* renamed from: c, reason: collision with root package name */
                public int f25016c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0278a(a<? super T> aVar, tg.e<? super C0278a> eVar) {
                    super(eVar);
                    this.f25015b = aVar;
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    this.f25014a = obj;
                    this.f25016c |= PKIFailureInfo.systemUnavail;
                    return this.f25015b.c(null, this);
                }
            }

            public a(rh.u<Object> uVar) {
                this.f25013a = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // sh.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t3, tg.e<? super pg.f0> eVar) {
                C0278a c0278a;
                if (eVar instanceof C0278a) {
                    c0278a = (C0278a) eVar;
                    int i10 = c0278a.f25016c;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        c0278a.f25016c = i10 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0278a = new C0278a(this, eVar);
                    }
                }
                Object obj = c0278a.f25014a;
                ug.a aVar = ug.a.f29706a;
                int i11 = c0278a.f25016c;
                if (i11 == 0) {
                    pg.q.b(obj);
                    if (t3 == null) {
                        t3 = (T) th.u.f28848a;
                    }
                    c0278a.f25016c = 1;
                    if (this.f25013a.d(t3, c0278a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z0 z0Var, tg.e eVar) {
            super(2, eVar);
            this.f25012c = z0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            c cVar = new c(this.f25012c, eVar);
            cVar.f25011b = obj;
            return cVar;
        }

        @Override // eh.p
        public final Object invoke(rh.u<? super Object> uVar, tg.e<? super pg.f0> eVar) {
            return ((c) create(uVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25010a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            a aVar2 = new a((rh.u) this.f25011b);
            this.f25010a = 1;
            this.f25012c.b(aVar2, this);
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h1 h1Var, z0 z0Var, tg.e eVar) {
        super(3, eVar);
        this.f25000f = h1Var;
        this.f25001g = z0Var;
    }

    @Override // eh.q
    public final Object b(ph.i0 i0Var, g<Object> gVar, tg.e<? super pg.f0> eVar) {
        k kVar = new k(this.f25000f, this.f25001g, eVar);
        kVar.f24998d = i0Var;
        kVar.f24999e = gVar;
        return kVar.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r9.c(r10, r19) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:15:0x0078, B:25:0x00a7], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, rh.w] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.g0 g0Var;
        g gVar;
        ?? r82;
        kotlin.jvm.internal.g0 g0Var2;
        kotlin.jvm.internal.f0 f0Var;
        xh.h hVar;
        rh.w wVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24997c;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f24998d;
            g gVar2 = (g) this.f24999e;
            c cVar = new c(this.f25001g, null);
            rh.a aVar2 = rh.a.f23576a;
            ph.k0 k0Var = ph.k0.f21553a;
            ph.a tVar = new rh.t(ph.e0.b(i0Var, tg.i.f28768a), rh.k.a(0, 4, aVar2));
            tVar.b0(k0Var, tVar, cVar);
            g0Var = new kotlin.jvm.internal.g0();
            gVar = gVar2;
            r82 = tVar;
        } else {
            if (i10 == 1) {
                f0Var = this.f24996b;
                g0Var2 = this.f24995a;
                rh.w wVar2 = (rh.w) this.f24999e;
                gVar = (g) this.f24998d;
                pg.q.b(obj);
                wVar = wVar2;
                g0Var2.f16327a = null;
                r82 = wVar;
                kotlin.jvm.internal.g0 g0Var3 = g0Var2;
                kotlin.jvm.internal.f0 f0Var2 = f0Var;
                g0Var = g0Var3;
                hVar = new xh.h(getContext());
                if (g0Var.f16327a != null) {
                    long j10 = f0Var2.f16326a;
                    a aVar3 = new a(g0Var, gVar, null);
                    xh.b bVar = new xh.b(j10);
                    xh.a aVar4 = xh.a.f33572a;
                    kotlin.jvm.internal.r.c(aVar4, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
                    kotlin.jvm.internal.m0.b(3, aVar4);
                    hVar.i(new h.a(bVar, aVar4, k.a.f33605a, xh.k.f33604e, aVar3, null), false);
                }
                xh.e eVarA = r82.a();
                hVar.i(new h.a(eVarA.b(), eVarA.a(), eVarA.d(), null, new b(g0Var, gVar, null), eVarA.c()), false);
                this.f24998d = gVar;
                this.f24999e = r82;
                this.f24995a = g0Var;
                this.f24996b = null;
                this.f24997c = 2;
                if (xh.h.f33581f.get(hVar) instanceof h.a) {
                    if (hVar.f(this) != aVar) {
                    }
                    return aVar;
                }
                if (hVar.g(this) != aVar) {
                }
                return aVar;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = this.f24995a;
            rh.w wVar3 = (rh.w) this.f24999e;
            g gVar3 = (g) this.f24998d;
            pg.q.b(obj);
            gVar = gVar3;
            r82 = wVar3;
        }
        g0Var2 = g0Var;
        if (g0Var2.f16327a == th.u.f28850c) {
            f0Var = new kotlin.jvm.internal.f0();
            r82 = r82;
            if (g0Var2.f16327a != null) {
                Long l10 = 200L;
                long jLongValue = l10.longValue();
                f0Var.f16326a = jLongValue;
                r82 = r82;
                if (jLongValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (jLongValue == 0) {
                    Object obj2 = g0Var2.f16327a;
                    if (obj2 == th.u.f28848a) {
                        obj2 = null;
                    }
                    this.f24998d = gVar;
                    this.f24999e = r82;
                    this.f24995a = g0Var2;
                    this.f24996b = f0Var;
                    this.f24997c = 1;
                    wVar = r82;
                }
                return aVar;
            }
            kotlin.jvm.internal.g0 g0Var32 = g0Var2;
            kotlin.jvm.internal.f0 f0Var22 = f0Var;
            g0Var = g0Var32;
            hVar = new xh.h(getContext());
            if (g0Var.f16327a != null) {
            }
            xh.e eVarA2 = r82.a();
            hVar.i(new h.a(eVarA2.b(), eVarA2.a(), eVarA2.d(), null, new b(g0Var, gVar, null), eVarA2.c()), false);
            this.f24998d = gVar;
            this.f24999e = r82;
            this.f24995a = g0Var;
            this.f24996b = null;
            this.f24997c = 2;
            if (xh.h.f33581f.get(hVar) instanceof h.a) {
            }
            g0Var2 = g0Var;
            if (g0Var2.f16327a == th.u.f28850c) {
                return pg.f0.f21461a;
            }
        }
    }
}

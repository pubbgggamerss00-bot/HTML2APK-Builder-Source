package th;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.i0;
import ph.j0;
import ph.k0;
import ph.s1;

/* loaded from: classes2.dex */
public final class k<T, R> extends i<T, R> {

    /* renamed from: e, reason: collision with root package name */
    public final vg.i f28797e;

    @vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28798a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28799b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k<T, R> f28800c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sh.g<R> f28801d;

        /* renamed from: th.k$a$a, reason: collision with other inner class name */
        public static final class C0292a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g0<s1> f28802a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f28803b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k<T, R> f28804c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sh.g<R> f28805d;

            @vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            /* renamed from: th.k$a$a$a, reason: collision with other inner class name */
            public static final class C0293a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f28806a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k<T, R> f28807b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ sh.g<R> f28808c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T f28809d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0293a(k<T, R> kVar, sh.g<? super R> gVar, T t3, tg.e<? super C0293a> eVar) {
                    super(2, eVar);
                    this.f28807b = kVar;
                    this.f28808c = gVar;
                    this.f28809d = t3;
                }

                @Override // vg.a
                public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                    return new C0293a(this.f28807b, this.f28808c, this.f28809d, eVar);
                }

                @Override // eh.p
                public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
                    return ((C0293a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
                }

                /* JADX WARN: Type inference failed for: r4v2, types: [eh.q, vg.i] */
                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f28806a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        ?? r42 = this.f28807b.f28797e;
                        this.f28806a = 1;
                        if (r42.b(this.f28808c, this.f28809d, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return f0.f21461a;
                }
            }

            @vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            /* renamed from: th.k$a$a$b */
            public static final class b extends vg.c {

                /* renamed from: a, reason: collision with root package name */
                public C0292a f28810a;

                /* renamed from: b, reason: collision with root package name */
                public Object f28811b;

                /* renamed from: c, reason: collision with root package name */
                public s1 f28812c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f28813d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C0292a<T> f28814e;

                /* renamed from: f, reason: collision with root package name */
                public int f28815f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0292a<? super T> c0292a, tg.e<? super b> eVar) {
                    super(eVar);
                    this.f28814e = c0292a;
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    this.f28813d = obj;
                    this.f28815f |= PKIFailureInfo.systemUnavail;
                    return this.f28814e.c(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0292a(g0<s1> g0Var, i0 i0Var, k<T, R> kVar, sh.g<? super R> gVar) {
                this.f28802a = g0Var;
                this.f28803b = i0Var;
                this.f28804c = kVar;
                this.f28805d = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // sh.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t3, tg.e<? super f0> eVar) {
                b bVar;
                C0292a<T> c0292a;
                if (eVar instanceof b) {
                    bVar = (b) eVar;
                    int i10 = bVar.f28815f;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        bVar.f28815f = i10 - PKIFailureInfo.systemUnavail;
                    } else {
                        bVar = new b(this, eVar);
                    }
                }
                Object obj = bVar.f28813d;
                ug.a aVar = ug.a.f29706a;
                int i11 = bVar.f28815f;
                if (i11 == 0) {
                    pg.q.b(obj);
                    s1 s1Var = this.f28802a.f16327a;
                    if (s1Var != null) {
                        s1Var.cancel((CancellationException) new m("Child of the scoped flow was cancelled"));
                        bVar.f28810a = this;
                        bVar.f28811b = t3;
                        bVar.f28812c = s1Var;
                        bVar.f28815f = 1;
                        if (s1Var.join(bVar) == aVar) {
                            return aVar;
                        }
                    }
                    c0292a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t3 = (T) bVar.f28811b;
                    c0292a = bVar.f28810a;
                    pg.q.b(obj);
                }
                c0292a.f28802a.f16327a = (T) ph.h.c(c0292a.f28803b, null, k0.f21556d, new C0293a(c0292a.f28804c, c0292a.f28805d, t3, null), 1);
                return f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k<T, R> kVar, sh.g<? super R> gVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f28800c = kVar;
            this.f28801d = gVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f28800c, this.f28801d, eVar);
            aVar.f28799b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28798a;
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var = (i0) this.f28799b;
                g0 g0Var = new g0();
                k<T, R> kVar = this.f28800c;
                sh.f<S> fVar = kVar.f28796d;
                C0292a c0292a = new C0292a(g0Var, i0Var, kVar, this.f28801d);
                this.f28798a = 1;
                if (fVar.b(c0292a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(eh.q<? super sh.g<? super R>, ? super T, ? super tg.e<? super f0>, ? extends Object> qVar, sh.f<? extends T> fVar, tg.h hVar, int i10, rh.a aVar) {
        super(fVar, hVar, i10, aVar);
        this.f28797e = (vg.i) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.q, vg.i] */
    @Override // th.g
    public final g<R> f(tg.h hVar, int i10, rh.a aVar) {
        return new k(this.f28797e, this.f28796d, hVar, i10, aVar);
    }

    @Override // th.i
    public final Object i(sh.g<? super R> gVar, tg.e<? super f0> eVar) {
        Object objC = j0.c(new a(this, gVar, null), eVar);
        return objC == ug.a.f29706a ? objC : f0.f21461a;
    }
}

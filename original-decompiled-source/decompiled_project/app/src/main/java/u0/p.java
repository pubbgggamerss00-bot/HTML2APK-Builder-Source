package u0;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29090a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<Object> f29092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<Object, tg.e<? super pg.f0>, Object> f29093d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<ph.s1> f29094a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f29095b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.p<Object, tg.e<? super pg.f0>, Object> f29096c;

        @vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
        /* renamed from: u0.p$a$a, reason: collision with other inner class name */
        public static final class C0298a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f29097a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ eh.p<Object, tg.e<? super pg.f0>, Object> f29098b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f29099c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ph.i0 f29100d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0298a(eh.p<Object, ? super tg.e<? super pg.f0>, ? extends Object> pVar, Object obj, ph.i0 i0Var, tg.e<? super C0298a> eVar) {
                super(2, eVar);
                this.f29098b = pVar;
                this.f29099c = obj;
                this.f29100d = i0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0298a(this.f29098b, this.f29099c, this.f29100d, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0298a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f29097a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f29097a = 1;
                    if (this.f29098b.invoke(this.f29099c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                ph.j0.b(this.f29100d, new l());
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {718}, m = "emit")
        public static final class b extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public a f29101a;

            /* renamed from: b, reason: collision with root package name */
            public Object f29102b;

            /* renamed from: c, reason: collision with root package name */
            public ph.s1 f29103c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f29104d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a<T> f29105e;

            /* renamed from: f, reason: collision with root package name */
            public int f29106f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, tg.e<? super b> eVar) {
                super(eVar);
                this.f29105e = aVar;
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f29104d = obj;
                this.f29106f |= PKIFailureInfo.systemUnavail;
                return this.f29105e.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.jvm.internal.g0<ph.s1> g0Var, ph.i0 i0Var, eh.p<Object, ? super tg.e<? super pg.f0>, ? extends Object> pVar) {
            this.f29094a = g0Var;
            this.f29095b = i0Var;
            this.f29096c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e<? super pg.f0> eVar) {
            b bVar;
            a<T> aVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i10 = bVar.f29106f;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f29106f = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(this, eVar);
                }
            }
            Object obj2 = bVar.f29104d;
            ug.a aVar2 = ug.a.f29706a;
            int i11 = bVar.f29106f;
            if (i11 == 0) {
                pg.q.b(obj2);
                ph.s1 s1Var = this.f29094a.f16327a;
                if (s1Var != null) {
                    s1Var.cancel((CancellationException) new l());
                    bVar.f29101a = this;
                    bVar.f29102b = obj;
                    bVar.f29103c = s1Var;
                    bVar.f29106f = 1;
                    if (s1Var.join(bVar) == aVar2) {
                        return aVar2;
                    }
                }
                aVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = bVar.f29102b;
                aVar = bVar.f29101a;
                pg.q.b(obj2);
            }
            kotlin.jvm.internal.g0<ph.s1> g0Var = aVar.f29094a;
            ph.i0 i0Var = aVar.f29095b;
            g0Var.f16327a = (T) ph.h.c(i0Var, null, ph.k0.f21556d, new C0298a(aVar.f29096c, obj, i0Var, null), 1);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(eh.a<Object> aVar, eh.p<Object, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super p> eVar) {
        super(2, eVar);
        this.f29092c = aVar;
        this.f29093d = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p pVar = new p(this.f29092c, this.f29093d, eVar);
        pVar.f29091b = obj;
        return pVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29090a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f29091b;
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            sh.m0 m0VarL = bg.b.l(this.f29092c);
            a aVar2 = new a(g0Var, i0Var, this.f29093d);
            this.f29090a = 1;
            if (m0VarL.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}

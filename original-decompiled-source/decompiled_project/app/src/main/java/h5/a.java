package h5;

import androidx.lifecycle.l;
import eh.p;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.q;
import ph.i0;
import x0.c2;

@vg.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends vg.i implements p<c2<Object>, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12231a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l.b f12234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg.h f12235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sh.f<Object> f12236f;

    @vg.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
    /* renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class C0110a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f12237a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ tg.h f12238b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sh.f<Object> f12239c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c2<Object> f12240d;

        /* renamed from: h5.a$a$a, reason: collision with other inner class name */
        public static final class C0111a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c2<T> f12241a;

            public C0111a(c2<T> c2Var) {
                this.f12241a = c2Var;
            }

            @Override // sh.g
            public final Object c(T t3, tg.e<? super f0> eVar) {
                this.f12241a.setValue(t3);
                return f0.f21461a;
            }
        }

        @vg.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
        /* renamed from: h5.a$a$b */
        public static final class b extends vg.i implements p<i0, tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f12242a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sh.f<Object> f12243b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c2<Object> f12244c;

            /* renamed from: h5.a$a$b$a, reason: collision with other inner class name */
            public static final class C0112a<T> implements sh.g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c2<T> f12245a;

                public C0112a(c2<T> c2Var) {
                    this.f12245a = c2Var;
                }

                @Override // sh.g
                public final Object c(T t3, tg.e<? super f0> eVar) {
                    this.f12245a.setValue(t3);
                    return f0.f21461a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(sh.f<Object> fVar, c2<Object> c2Var, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f12243b = fVar;
                this.f12244c = c2Var;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f12243b, this.f12244c, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f12242a;
                if (i10 == 0) {
                    q.b(obj);
                    C0112a c0112a = new C0112a(this.f12244c);
                    this.f12242a = 1;
                    if (this.f12243b.b(c0112a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0110a(tg.h hVar, sh.f<Object> fVar, c2<Object> c2Var, tg.e<? super C0110a> eVar) {
            super(2, eVar);
            this.f12238b = hVar;
            this.f12239c = fVar;
            this.f12240d = c2Var;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new C0110a(this.f12238b, this.f12239c, this.f12240d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((C0110a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5.b(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (ph.h.e(r1, r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f12237a;
            if (i10 == 0) {
                q.b(obj);
                tg.i iVar = tg.i.f28768a;
                tg.h hVar = this.f12238b;
                boolean zA = r.a(hVar, iVar);
                c2<Object> c2Var = this.f12240d;
                sh.f<Object> fVar = this.f12239c;
                if (zA) {
                    C0111a c0111a = new C0111a(c2Var);
                    this.f12237a = 1;
                } else {
                    b bVar = new b(fVar, c2Var, null);
                    this.f12237a = 2;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, l.b bVar, tg.h hVar, sh.f<Object> fVar, tg.e<? super a> eVar) {
        super(2, eVar);
        this.f12233c = lVar;
        this.f12234d = bVar;
        this.f12235e = hVar;
        this.f12236f = fVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        a aVar = new a(this.f12233c, this.f12234d, this.f12235e, this.f12236f, eVar);
        aVar.f12232b = obj;
        return aVar;
    }

    @Override // eh.p
    public final Object invoke(c2<Object> c2Var, tg.e<? super f0> eVar) {
        return ((a) create(c2Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12231a;
        if (i10 == 0) {
            q.b(obj);
            c2 c2Var = (c2) this.f12232b;
            C0110a c0110a = new C0110a(this.f12235e, this.f12236f, c2Var, null);
            this.f12231a = 1;
            if (androidx.lifecycle.i0.a(this.f12233c, this.f12234d, c0110a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}

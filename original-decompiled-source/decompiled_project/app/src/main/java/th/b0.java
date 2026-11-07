package th;

import f9.nh;
import pg.f0;

/* loaded from: classes2.dex */
public final class b0<T> implements sh.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f28776a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28777b;

    /* renamed from: c, reason: collision with root package name */
    public final a f28778c;

    @vg.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<T, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28779a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28780b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sh.g<T> f28781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(sh.g<? super T> gVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f28781c = gVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f28781c, eVar);
            aVar.f28780b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Object obj, tg.e<? super f0> eVar) {
            return ((a) create(obj, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28779a;
            if (i10 == 0) {
                pg.q.b(obj);
                Object obj2 = this.f28780b;
                this.f28779a = 1;
                if (this.f28781c.c(obj2, this) == aVar) {
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

    public b0(sh.g<? super T> gVar, tg.h hVar) {
        this.f28776a = hVar;
        this.f28777b = uh.b0.b(hVar);
        this.f28778c = new a(gVar, null);
    }

    @Override // sh.g
    public final Object c(T t3, tg.e<? super f0> eVar) {
        Object objA = nh.a(this.f28776a, t3, this.f28777b, this.f28778c, eVar);
        return objA == ug.a.f29706a ? objA : f0.f21461a;
    }
}

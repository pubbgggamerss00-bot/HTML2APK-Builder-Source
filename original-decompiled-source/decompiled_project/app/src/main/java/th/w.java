package th;

import kotlin.jvm.internal.m0;
import pg.f0;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final eh.q<sh.g<Object>, Object, tg.e<? super f0>, Object> f28856a;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements eh.q<sh.g<? super Object>, Object, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28857a = new a(3, sh.g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // eh.q
        public final Object b(sh.g<? super Object> gVar, Object obj, tg.e<? super f0> eVar) {
            return gVar.c(obj, eVar);
        }
    }

    static {
        a aVar = a.f28857a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        m0.b(3, aVar);
        f28856a = aVar;
    }
}

package ug;

import eh.p;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r;
import pg.q;
import vg.g;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f29710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f29711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg.e f29712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, tg.e eVar, tg.e eVar2) {
        super(eVar);
        this.f29711b = pVar;
        this.f29712c = eVar2;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f29710a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f29710a = 2;
            q.b(obj);
            return obj;
        }
        this.f29710a = 1;
        q.b(obj);
        p pVar = this.f29711b;
        r.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        m0.b(2, pVar);
        return pVar.invoke(this.f29712c, this);
    }
}

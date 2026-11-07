package ug;

import kotlin.jvm.internal.r;
import pg.q;
import tg.h;

/* loaded from: classes2.dex */
public final class e extends vg.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tg.e<Object> eVar, h hVar) {
        super(eVar, hVar);
        r.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        q.b(obj);
        return obj;
    }
}

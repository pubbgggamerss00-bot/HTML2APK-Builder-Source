package ug;

import kotlin.jvm.internal.r;
import pg.q;
import vg.g;

/* loaded from: classes2.dex */
public final class d extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tg.e<Object> eVar) {
        super(eVar);
        r.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        q.b(obj);
        return obj;
    }
}

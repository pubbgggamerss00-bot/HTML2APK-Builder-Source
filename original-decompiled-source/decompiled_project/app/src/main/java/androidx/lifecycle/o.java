package androidx.lifecycle;

import androidx.lifecycle.l;
import ph.v1;

/* loaded from: classes.dex */
public final class o extends m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final l f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.h f2334b;

    public o(l lVar, tg.h coroutineContext) {
        kotlin.jvm.internal.r.e(coroutineContext, "coroutineContext");
        this.f2333a = lVar;
        this.f2334b = coroutineContext;
        if (lVar.b() == l.b.f2319a) {
            v1.b(coroutineContext, null);
        }
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        return this.f2334b;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        l lVar = this.f2333a;
        if (lVar.b().compareTo(l.b.f2319a) <= 0) {
            lVar.c(this);
            v1.b(this.f2334b, null);
        }
    }
}

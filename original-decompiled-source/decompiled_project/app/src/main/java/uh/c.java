package uh;

import ph.i0;

/* loaded from: classes2.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f29723a;

    public c(tg.h hVar) {
        this.f29723a = hVar;
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        return this.f29723a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f29723a + ')';
    }
}

package l5;

import kotlin.jvm.internal.r;
import ph.i0;
import ph.v1;
import tg.h;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f16725a;

    public a(h coroutineContext) {
        r.e(coroutineContext, "coroutineContext");
        this.f16725a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        v1.b(this.f16725a, null);
    }

    @Override // ph.i0
    public final h getCoroutineContext() {
        return this.f16725a;
    }
}

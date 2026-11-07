package ph;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class f<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f21527d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f21528e;

    public f(tg.h hVar, Thread thread, f1 f1Var) {
        super(hVar, true);
        this.f21527d = thread;
        this.f21528e = f1Var;
    }

    @Override // ph.y1
    public final void i(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f21527d;
        if (kotlin.jvm.internal.r.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

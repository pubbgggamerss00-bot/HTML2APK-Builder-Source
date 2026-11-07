package uh;

import tg.h;

/* loaded from: classes2.dex */
public final class d0 implements h.b<c0<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<?> f29728a;

    public d0(ThreadLocal<?> threadLocal) {
        this.f29728a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.r.a(this.f29728a, ((d0) obj).f29728a);
    }

    public final int hashCode() {
        return this.f29728a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f29728a + ')';
    }
}

package androidx.lifecycle;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class n0 implements r, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2330a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2331b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2332c;

    public n0(l0 l0Var, String str) {
        this.f2330a = str;
        this.f2331b = l0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        if (aVar == l.a.ON_DESTROY) {
            this.f2332c = false;
            tVar.getLifecycle().c(this);
        }
    }

    public final void p(l lifecycle, c6.c registry) {
        kotlin.jvm.internal.r.e(registry, "registry");
        kotlin.jvm.internal.r.e(lifecycle, "lifecycle");
        if (this.f2332c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2332c = true;
        lifecycle.a(this);
        registry.c(this.f2330a, this.f2331b.f2326b.f14165e);
    }
}

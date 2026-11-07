package androidx.lifecycle;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class k implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c6.c f2316b;

    public k(l lVar, c6.c cVar) {
        this.f2315a = lVar;
        this.f2316b = cVar;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) throws NoSuchMethodException, SecurityException {
        if (aVar == l.a.ON_START) {
            this.f2315a.c(this);
            this.f2316b.d();
        }
    }
}

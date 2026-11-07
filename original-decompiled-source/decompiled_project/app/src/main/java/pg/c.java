package pg;

import di.h0;

/* loaded from: classes2.dex */
public final class c<T, R> extends b<T, R> implements tg.e<R> {

    /* renamed from: a, reason: collision with root package name */
    public di.g0 f21450a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21451b;

    /* renamed from: c, reason: collision with root package name */
    public tg.e<Object> f21452c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21453d;

    @Override // pg.b
    public final void a(Object obj, h0 h0Var) {
        this.f21452c = h0Var;
        this.f21451b = obj;
        ug.a aVar = ug.a.f29706a;
    }

    @Override // tg.e
    public final tg.h getContext() {
        return tg.i.f28768a;
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        this.f21452c = null;
        this.f21453d = obj;
    }
}

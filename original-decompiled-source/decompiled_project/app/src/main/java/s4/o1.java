package s4;

import tg.h;

/* loaded from: classes.dex */
public final class o1 implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f24357a;

    /* renamed from: b, reason: collision with root package name */
    public final m<?> f24358b;

    public o1(o1 o1Var, m<?> mVar) {
        this.f24357a = o1Var;
        this.f24358b = mVar;
    }

    public final void a(m mVar) {
        if (this.f24358b == mVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        o1 o1Var = this.f24357a;
        if (o1Var != null) {
            o1Var.a(mVar);
        }
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h.a
    public final h.b<?> getKey() {
        return n1.f24345a;
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}

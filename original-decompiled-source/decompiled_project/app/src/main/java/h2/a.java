package h2;

import c5.p;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public g<?> f12219a;

    @Override // c5.p
    public final boolean P(c<?> cVar) {
        return cVar == this.f12219a.getKey();
    }

    @Override // c5.p
    public final <T> T U(c<T> cVar) {
        if (cVar != this.f12219a.getKey()) {
            f2.a.b("Check failed.");
        }
        return (T) this.f12219a.i();
    }
}

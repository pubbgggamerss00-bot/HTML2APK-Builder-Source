package h2;

import c5.p;
import x0.x1;

/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: a, reason: collision with root package name */
    public final c<?> f12229a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f12230b = bg.b.h(null);

    public j(c<?> cVar) {
        this.f12229a = cVar;
    }

    @Override // c5.p
    public final boolean P(c<?> cVar) {
        return cVar == this.f12229a;
    }

    @Override // c5.p
    public final <T> T U(c<T> cVar) {
        if (cVar != this.f12229a) {
            f2.a.b("Check failed.");
        }
        T value = this.f12230b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}

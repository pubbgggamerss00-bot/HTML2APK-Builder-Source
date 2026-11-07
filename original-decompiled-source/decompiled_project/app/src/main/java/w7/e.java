package w7;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final g7.l f31325a;

    /* renamed from: b, reason: collision with root package name */
    public final f f31326b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f31327c;

    public e(g7.l lVar, f fVar, Throwable th2) {
        this.f31325a = lVar;
        this.f31326b = fVar;
        this.f31327c = th2;
    }

    @Override // w7.i
    public final f a() {
        return this.f31326b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.r.a(this.f31325a, eVar.f31325a) && kotlin.jvm.internal.r.a(this.f31326b, eVar.f31326b) && kotlin.jvm.internal.r.a(this.f31327c, eVar.f31327c);
    }

    public final int hashCode() {
        g7.l lVar = this.f31325a;
        return this.f31327c.hashCode() + ((this.f31326b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f31325a + ", request=" + this.f31326b + ", throwable=" + this.f31327c + ')';
    }
}

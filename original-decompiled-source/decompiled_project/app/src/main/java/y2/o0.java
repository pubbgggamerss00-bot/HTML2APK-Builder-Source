package y2;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f33759a;

    /* renamed from: b, reason: collision with root package name */
    public final v f33760b;

    public o0(t2.b bVar, v vVar) {
        this.f33759a = bVar;
        this.f33760b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.r.a(this.f33759a, o0Var.f33759a) && kotlin.jvm.internal.r.a(this.f33760b, o0Var.f33760b);
    }

    public final int hashCode() {
        return this.f33760b.hashCode() + (this.f33759a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f33759a) + ", offsetMapping=" + this.f33760b + ')';
    }
}

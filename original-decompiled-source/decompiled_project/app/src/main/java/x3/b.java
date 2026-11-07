package x3;

import p6.b;

/* loaded from: classes.dex */
public final class b<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final b.c f32052a;

    public b(b.c cVar) {
        this.f32052a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return "/assets/".equals("/assets/") && ((b) obj).f32052a.equals(this.f32052a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32052a.hashCode() ^ (-397067779);
    }

    public final String toString() {
        return "Pair{/assets/ " + this.f32052a + "}";
    }
}

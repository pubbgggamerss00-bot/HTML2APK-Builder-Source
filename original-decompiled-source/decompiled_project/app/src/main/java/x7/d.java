package x7;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: b, reason: collision with root package name */
    public final h f32188b;

    public d(h hVar) {
        this.f32188b = hVar;
    }

    @Override // x7.i
    public final Object b(tg.e<? super h> eVar) {
        return this.f32188b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && r.a(this.f32188b, ((d) obj).f32188b);
    }

    public final int hashCode() {
        return this.f32188b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f32188b + ')';
    }
}

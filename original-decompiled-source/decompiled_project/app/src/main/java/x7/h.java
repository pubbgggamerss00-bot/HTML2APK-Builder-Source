package x7;

import kotlin.jvm.internal.r;
import x7.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f32198c;

    /* renamed from: a, reason: collision with root package name */
    public final a f32199a;

    /* renamed from: b, reason: collision with root package name */
    public final a f32200b;

    static {
        a.b bVar = a.b.f32184a;
        f32198c = new h(bVar, bVar);
    }

    public h(a aVar, a aVar2) {
        this.f32199a = aVar;
        this.f32200b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return r.a(this.f32199a, hVar.f32199a) && r.a(this.f32200b, hVar.f32200b);
    }

    public final int hashCode() {
        return this.f32200b.hashCode() + (this.f32199a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f32199a + ", height=" + this.f32200b + ')';
    }
}

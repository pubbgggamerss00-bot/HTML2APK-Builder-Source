package k8;

import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<Integer> f16067a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Integer> f16068b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Integer> f16069c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Integer> f16070d;

    /* renamed from: e, reason: collision with root package name */
    public final List<Integer> f16071e;

    public b(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5) {
        this.f16067a = list;
        this.f16068b = list2;
        this.f16069c = list3;
        this.f16070d = list4;
        this.f16071e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.a(this.f16067a, bVar.f16067a) && r.a(this.f16068b, bVar.f16068b) && r.a(this.f16069c, bVar.f16069c) && r.a(this.f16070d, bVar.f16070d) && r.a(this.f16071e, bVar.f16071e);
    }

    public final int hashCode() {
        return this.f16071e.hashCode() + a2.a.a(this.f16070d, a2.a.a(this.f16069c, a2.a.a(this.f16068b, this.f16067a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CatAnimFrames(walkFrames=" + this.f16067a + ", idleFrames=" + this.f16068b + ", flipFrames=" + this.f16069c + ", purrFrames=" + this.f16070d + ", jumpFrames=" + this.f16071e + ")";
    }
}

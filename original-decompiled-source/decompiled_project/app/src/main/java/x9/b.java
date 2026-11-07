package x9;

import java.util.HashMap;
import java.util.Map;
import x9.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final aa.a f33469a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f33470b;

    public b(aa.a aVar, HashMap map) {
        this.f33469a = aVar;
        this.f33470b = map;
    }

    @Override // x9.e
    public final aa.a a() {
        return this.f33469a;
    }

    @Override // x9.e
    public final Map<o9.c, e.a> c() {
        return this.f33470b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33469a.equals(eVar.a()) && this.f33470b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f33469a.hashCode() ^ 1000003) * 1000003) ^ this.f33470b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f33469a + ", values=" + this.f33470b + "}";
    }
}

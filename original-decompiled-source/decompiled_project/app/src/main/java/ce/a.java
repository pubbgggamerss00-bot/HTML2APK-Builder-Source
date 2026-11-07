package ce;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f5403a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5404b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f5403a = str;
        this.f5404b = arrayList;
    }

    @Override // ce.k
    public final List<String> a() {
        return this.f5404b;
    }

    @Override // ce.k
    public final String b() {
        return this.f5403a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5403a.equals(kVar.b()) && this.f5404b.equals(kVar.a());
    }

    public final int hashCode() {
        return ((this.f5403a.hashCode() ^ 1000003) * 1000003) ^ this.f5404b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f5403a + ", usedDates=" + this.f5404b + "}";
    }
}

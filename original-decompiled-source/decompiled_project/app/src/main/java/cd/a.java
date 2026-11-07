package cd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5394b = new a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f5395a;

    public a(Map map) {
        this.f5395a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5395a.equals(((a) obj).f5395a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5395a.hashCode();
    }

    public final String toString() {
        return this.f5395a.toString();
    }
}

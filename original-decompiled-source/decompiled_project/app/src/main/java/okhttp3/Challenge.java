package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.r;
import l0.k;

/* loaded from: classes2.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f19185a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f19186b;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        this.f19185a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                r.d(US, "US");
                lowerCase = key.toLowerCase(US);
                r.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        r.d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f19186b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return r.a(challenge.f19185a, this.f19185a) && r.a(challenge.f19186b, this.f19186b);
    }

    public final int hashCode() {
        return this.f19186b.hashCode() + k.a(899, 31, this.f19185a);
    }

    public final String toString() {
        return this.f19185a + " authParams=" + this.f19186b;
    }
}

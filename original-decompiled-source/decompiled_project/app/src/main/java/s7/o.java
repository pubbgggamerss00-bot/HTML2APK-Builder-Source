package s7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import qg.k0;
import qg.x;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f24577b = new o(k0.j(new a().f24579a));

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f24578a;

    public o() {
        throw null;
    }

    public o(Map map) {
        this.f24578a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        List<String> list = this.f24578a.get(lowerCase);
        if (list != null) {
            return (String) x.K(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.r.a(this.f24578a, ((o) obj).f24578a);
    }

    public final int hashCode() {
        return this.f24578a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f24578a + ')';
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f24579a;

        public a() {
            this.f24579a = new LinkedHashMap();
        }

        public final void a(String str, String str2) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            LinkedHashMap linkedHashMap = this.f24579a;
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }

        public final void b(String str) {
            String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            this.f24579a.put(lowerCase, qg.p.k(str));
        }

        public a(o oVar) {
            Map<String, List<String>> map = oVar.f24578a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), x.e0((Collection) entry.getValue()));
            }
            this.f24579a = linkedHashMap;
        }
    }
}

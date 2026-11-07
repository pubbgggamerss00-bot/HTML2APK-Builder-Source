package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import qg.k0;
import qg.x;
import s7.b;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public final class a implements s7.b {
    @Override // s7.b
    public final b.C0273b a(r rVar, r rVar2) {
        if (rVar2.f24585a != 304 || rVar == null) {
            return new b.C0273b(rVar2);
        }
        o oVar = rVar.f24588d;
        o oVar2 = rVar2.f24588d;
        oVar.getClass();
        Map<String, List<String>> map = oVar.f24578a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), x.e0((Collection) entry.getValue()));
        }
        for (Map.Entry<String, List<String>> entry2 : oVar2.f24578a.entrySet()) {
            String key = entry2.getKey();
            List<String> value = entry2.getValue();
            String lowerCase = key.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, x.e0(value));
        }
        return new b.C0273b(new r(rVar2.f24585a, rVar2.f24586b, rVar2.f24587c, new o(k0.j(linkedHashMap)), null, rVar2.f24590f));
    }

    @Override // s7.b
    public final b.a b(r rVar) {
        return new b.a(rVar);
    }
}

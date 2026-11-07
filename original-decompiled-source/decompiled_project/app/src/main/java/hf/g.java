package hf;

import cf.l;
import cf.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f13025a;

    public g() {
        new HashMap();
        this.f13025a = new cf.d();
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f13025a;
    }

    public final l a(l lVar, String str, jf.c cVar) {
        String str2;
        l lVarG0;
        cf.d dVar = this.f13025a;
        cf.d dVarL0 = dVar.l0(lVar);
        if (dVarL0 != null) {
            cf.b bVarZ = cVar.Z();
            boolean zContainsValue = dVarL0.f5423b.containsValue(bVarZ);
            if (!zContainsValue && (bVarZ instanceof o)) {
                zContainsValue = dVarL0.f5423b.containsValue(((o) bVarZ).f5549b);
            }
            if (zContainsValue) {
                cf.b bVarZ2 = cVar.Z();
                for (Map.Entry<l, cf.b> entry : dVarL0.f5423b.entrySet()) {
                    cf.b value = entry.getValue();
                    if (value.equals(bVarZ2) || ((value instanceof o) && ((o) value).f5549b.equals(bVarZ2))) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }
        if (dVarL0 != null && l.G0.equals(lVar)) {
            for (Map.Entry<l, cf.b> entry2 : dVarL0.f5423b.entrySet()) {
                if ((entry2.getValue() instanceof o) && cVar.Z() == ((o) entry2.getValue()).f5549b) {
                    return entry2.getKey();
                }
            }
        }
        cf.d dVarL02 = dVar.l0(lVar);
        if (dVarL02 == null) {
            lVarG0 = l.g0(str.concat("1"));
        } else {
            int size = dVarL02.f5423b.keySet().size();
            do {
                size++;
                str2 = str + size;
            } while (dVarL02.f5423b.containsKey(l.g0(str2)));
            lVarG0 = l.g0(str2);
        }
        cf.d dVarL03 = dVar.l0(lVar);
        if (dVarL03 == null) {
            dVarL03 = new cf.d();
            dVar.O0(lVar, dVarL03);
        }
        dVarL03.P0(lVarG0, cVar);
        return lVarG0;
    }

    public g(cf.d dVar, a aVar) {
        new HashMap();
        this.f13025a = dVar;
    }
}

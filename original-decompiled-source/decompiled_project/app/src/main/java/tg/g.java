package tg;

import eh.p;
import kotlin.jvm.internal.r;
import tg.f;
import tg.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        h acc = (h) obj;
        h.a element = (h.a) obj2;
        r.e(acc, "acc");
        r.e(element, "element");
        h hVarMinusKey = acc.minusKey(element.getKey());
        i iVar = i.f28768a;
        if (hVarMinusKey == iVar) {
            return element;
        }
        f.a aVar = f.a.f28767a;
        f fVar = (f) hVarMinusKey.get(aVar);
        if (fVar == null) {
            return new d(element, hVarMinusKey);
        }
        h hVarMinusKey2 = hVarMinusKey.minusKey(aVar);
        return hVarMinusKey2 == iVar ? new d(fVar, element) : new d(fVar, new d(element, hVarMinusKey2));
    }
}

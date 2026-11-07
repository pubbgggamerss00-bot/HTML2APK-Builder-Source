package uh;

import ph.o2;
import tg.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements eh.p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        h.a aVar = (h.a) obj2;
        if (!(aVar instanceof o2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? aVar : Integer.valueOf(iIntValue + 1);
    }
}

package tg;

import eh.p;
import kotlin.jvm.internal.r;
import tg.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        String acc = (String) obj;
        h.a element = (h.a) obj2;
        r.e(acc, "acc");
        r.e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}

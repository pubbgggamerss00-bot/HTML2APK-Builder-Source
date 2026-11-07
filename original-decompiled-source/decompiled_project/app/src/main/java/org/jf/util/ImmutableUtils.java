package org.jf.util;

import nc.r;
import nc.u0;
import nc.v;
import nc.w0;
import nc.x0;
import nc.y;

/* loaded from: classes3.dex */
public class ImmutableUtils {
    public static <T> r<T> nullToEmptyList(r<T> rVar) {
        if (rVar != null) {
            return rVar;
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    public static <T> v<T> nullToEmptySet(v<T> vVar) {
        if (vVar != null) {
            return vVar;
        }
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    public static <T> y<T> nullToEmptySortedSet(y<T> yVar) {
        if (yVar != null) {
            return yVar;
        }
        int i10 = y.f18789f;
        return x0.f18787h;
    }
}

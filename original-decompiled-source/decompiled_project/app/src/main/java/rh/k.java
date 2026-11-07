package rh;

import rh.h;

/* loaded from: classes2.dex */
public final class k {
    public static c a(int i10, int i11, a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.f23576a;
        }
        if (i10 == -2) {
            if (aVar != a.f23576a) {
                return new p(1, aVar);
            }
            h.f23621u.getClass();
            return new c(h.a.f23623b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == a.f23576a ? new c(i10) : new p(i10, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f23576a ? new c(0) : new p(1, aVar);
        }
        if (aVar == a.f23576a) {
            return new p(1, a.f23577b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}

package nh;

import nh.b;

/* loaded from: classes2.dex */
public final class f {
    public static final long a(long j10) {
        if (j10 < 0) {
            b.a aVar = b.f18809b;
            return b.f18811d;
        }
        b.a aVar2 = b.f18809b;
        return b.f18810c;
    }

    public static final long b(long j10, long j11, e eVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return d.g(j12, eVar);
        }
        e eVar2 = e.f18815c;
        if (eVar.compareTo(eVar2) >= 0) {
            return b.i(a(j12));
        }
        long jB = cc.d.b(1L, eVar2, eVar);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f18809b;
        return b.g(d.g(j13, eVar2), d.g(j14, eVar));
    }
}

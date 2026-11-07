package ih;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a extends hh.a {
    @Override // hh.c
    public final int d(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // hh.c
    public final long f(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // hh.a
    public final Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        r.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}

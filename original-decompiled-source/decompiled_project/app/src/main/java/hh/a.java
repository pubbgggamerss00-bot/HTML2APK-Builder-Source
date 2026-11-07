package hh;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // hh.c
    public final int a(int i10) {
        return ((-i10) >> 31) & (g().nextInt() >>> (32 - i10));
    }

    @Override // hh.c
    public final int b() {
        return g().nextInt();
    }

    @Override // hh.c
    public final int c(int i10) {
        return g().nextInt(i10);
    }

    @Override // hh.c
    public final long e() {
        return g().nextLong();
    }

    public abstract Random g();
}

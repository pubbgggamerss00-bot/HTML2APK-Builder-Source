package x0;

/* loaded from: classes.dex */
public interface m1 extends r3, n1<Long> {
    long b();

    @Override // x0.r3
    default Object getValue() {
        return Long.valueOf(b());
    }

    void h(long j10);

    @Override // x0.n1
    default void setValue(Long l10) {
        h(l10.longValue());
    }
}

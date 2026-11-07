package x0;

/* loaded from: classes.dex */
public interface l1 extends n1<Integer>, r3<Integer> {
    void f(int i10);

    int g();

    default void i(int i10) {
        f(i10);
    }

    @Override // x0.n1
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        i(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x0.r3
    default Integer getValue() {
        return Integer.valueOf(g());
    }
}

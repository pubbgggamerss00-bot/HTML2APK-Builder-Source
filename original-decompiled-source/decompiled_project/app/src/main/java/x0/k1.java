package x0;

/* loaded from: classes.dex */
public interface k1 extends n1<Float>, r3<Float> {
    void e(float f10);

    float getFloatValue();

    default void j(float f10) {
        e(f10);
    }

    @Override // x0.n1
    /* bridge */ /* synthetic */ default void setValue(Float f10) {
        j(f10.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x0.r3
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}

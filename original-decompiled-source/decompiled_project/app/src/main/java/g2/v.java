package g2;

/* loaded from: classes.dex */
public interface v {
    long B(long j10);

    default void G(v vVar, float[] fArr) {
        f2.a.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void I(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long L(v vVar, long j10);

    p1.e N(v vVar, boolean z10);

    long R(long j10);

    v S();

    long Y(long j10);

    long a();

    boolean m();

    default long y(long j10) {
        return 9205357640488583168L;
    }
}

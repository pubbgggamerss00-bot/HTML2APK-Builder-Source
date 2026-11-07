package s;

/* loaded from: classes.dex */
public interface f0 extends l<Float> {
    @Override // s.l
    default q2 a(n2 n2Var) {
        return new v2(this);
    }

    long b(float f10, float f11, float f12);

    float c(float f10, float f11, float f12, long j10);

    default float d(float f10, float f11, float f12) {
        return c(f10, f11, f12, b(f10, f11, f12));
    }

    float e(float f10, float f11, float f12, long j10);
}

package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r extends q0<float[]> {

    /* renamed from: a, reason: collision with root package name */
    public float[] f16408a;

    /* renamed from: b, reason: collision with root package name */
    public int f16409b;

    @Override // kotlinx.serialization.internal.q0
    public final float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f16408a, this.f16409b);
        kotlin.jvm.internal.r.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        float[] fArr = this.f16408a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            kotlin.jvm.internal.r.d(fArrCopyOf, "copyOf(...)");
            this.f16408a = fArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16409b;
    }
}

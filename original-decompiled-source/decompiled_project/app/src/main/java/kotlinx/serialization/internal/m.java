package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m extends q0<double[]> {

    /* renamed from: a, reason: collision with root package name */
    public double[] f16380a;

    /* renamed from: b, reason: collision with root package name */
    public int f16381b;

    @Override // kotlinx.serialization.internal.q0
    public final double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f16380a, this.f16381b);
        kotlin.jvm.internal.r.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        double[] dArr = this.f16380a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            kotlin.jvm.internal.r.d(dArrCopyOf, "copyOf(...)");
            this.f16380a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16381b;
    }
}

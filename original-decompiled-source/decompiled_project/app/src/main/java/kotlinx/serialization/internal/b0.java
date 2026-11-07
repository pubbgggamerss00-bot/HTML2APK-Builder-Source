package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b0 extends q0<long[]> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f16349a;

    /* renamed from: b, reason: collision with root package name */
    public int f16350b;

    @Override // kotlinx.serialization.internal.q0
    public final long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f16349a, this.f16350b);
        kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        long[] jArr = this.f16349a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
            this.f16349a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16350b;
    }
}

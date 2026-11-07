package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x0 extends q0<short[]> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f16421a;

    /* renamed from: b, reason: collision with root package name */
    public int f16422b;

    @Override // kotlinx.serialization.internal.q0
    public final short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f16421a, this.f16422b);
        kotlin.jvm.internal.r.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        short[] sArr = this.f16421a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            kotlin.jvm.internal.r.d(sArrCopyOf, "copyOf(...)");
            this.f16421a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16422b;
    }
}

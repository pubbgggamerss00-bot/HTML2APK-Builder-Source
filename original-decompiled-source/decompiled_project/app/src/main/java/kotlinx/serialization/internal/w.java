package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w extends q0<int[]> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16418a;

    /* renamed from: b, reason: collision with root package name */
    public int f16419b;

    @Override // kotlinx.serialization.internal.q0
    public final int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f16418a, this.f16419b);
        kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        int[] iArr = this.f16418a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f16418a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16419b;
    }
}

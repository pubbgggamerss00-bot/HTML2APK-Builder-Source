package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c extends q0<boolean[]> {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f16353a;

    /* renamed from: b, reason: collision with root package name */
    public int f16354b;

    @Override // kotlinx.serialization.internal.q0
    public final boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f16353a, this.f16354b);
        kotlin.jvm.internal.r.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        boolean[] zArr = this.f16353a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            kotlin.jvm.internal.r.d(zArrCopyOf, "copyOf(...)");
            this.f16353a = zArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16354b;
    }
}

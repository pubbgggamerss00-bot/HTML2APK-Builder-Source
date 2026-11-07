package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a1 extends q0<pg.y> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16347a;

    /* renamed from: b, reason: collision with root package name */
    public int f16348b;

    @Override // kotlinx.serialization.internal.q0
    public final pg.y a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f16347a, this.f16348b);
        kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
        return new pg.y(iArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        int[] iArr = this.f16347a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f16347a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16348b;
    }
}

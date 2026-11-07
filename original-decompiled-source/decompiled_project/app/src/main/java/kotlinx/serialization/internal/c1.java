package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c1 extends q0<pg.d0> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f16358a;

    /* renamed from: b, reason: collision with root package name */
    public int f16359b;

    @Override // kotlinx.serialization.internal.q0
    public final pg.d0 a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f16358a, this.f16359b);
        kotlin.jvm.internal.r.d(sArrCopyOf, "copyOf(...)");
        return new pg.d0(sArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        short[] sArr = this.f16358a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            kotlin.jvm.internal.r.d(sArrCopyOf, "copyOf(...)");
            this.f16358a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16359b;
    }
}

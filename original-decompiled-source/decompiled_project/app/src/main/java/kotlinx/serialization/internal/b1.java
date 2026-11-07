package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b1 extends q0<pg.a0> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f16351a;

    /* renamed from: b, reason: collision with root package name */
    public int f16352b;

    @Override // kotlinx.serialization.internal.q0
    public final pg.a0 a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f16351a, this.f16352b);
        kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
        return new pg.a0(jArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        long[] jArr = this.f16351a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
            this.f16351a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16352b;
    }
}

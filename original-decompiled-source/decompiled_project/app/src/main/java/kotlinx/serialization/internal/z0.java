package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z0 extends q0<pg.w> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16424a;

    /* renamed from: b, reason: collision with root package name */
    public int f16425b;

    @Override // kotlinx.serialization.internal.q0
    public final pg.w a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f16424a, this.f16425b);
        kotlin.jvm.internal.r.d(bArrCopyOf, "copyOf(...)");
        return new pg.w(bArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        byte[] bArr = this.f16424a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            kotlin.jvm.internal.r.d(bArrCopyOf, "copyOf(...)");
            this.f16424a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16425b;
    }
}

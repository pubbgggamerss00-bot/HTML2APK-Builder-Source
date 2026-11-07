package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d extends q0<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16360a;

    /* renamed from: b, reason: collision with root package name */
    public int f16361b;

    @Override // kotlinx.serialization.internal.q0
    public final byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f16360a, this.f16361b);
        kotlin.jvm.internal.r.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        byte[] bArr = this.f16360a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            kotlin.jvm.internal.r.d(bArrCopyOf, "copyOf(...)");
            this.f16360a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16361b;
    }
}

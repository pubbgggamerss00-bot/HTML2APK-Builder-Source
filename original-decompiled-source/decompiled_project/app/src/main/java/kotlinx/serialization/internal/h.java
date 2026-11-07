package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h extends q0<char[]> {

    /* renamed from: a, reason: collision with root package name */
    public char[] f16369a;

    /* renamed from: b, reason: collision with root package name */
    public int f16370b;

    @Override // kotlinx.serialization.internal.q0
    public final char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f16369a, this.f16370b);
        kotlin.jvm.internal.r.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.q0
    public final void b(int i10) {
        char[] cArr = this.f16369a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            kotlin.jvm.internal.r.d(cArrCopyOf, "copyOf(...)");
            this.f16369a = cArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.q0
    public final int d() {
        return this.f16370b;
    }
}

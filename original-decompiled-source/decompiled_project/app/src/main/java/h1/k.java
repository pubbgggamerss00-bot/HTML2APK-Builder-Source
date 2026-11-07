package h1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p.b0 f12132a;

    public k(long[] jArr) {
        p.b0 b0Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            b0Var = new p.b0(jArrCopyOf.length);
            int i10 = b0Var.f20573b;
            if (i10 < 0) {
                q.d.b("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i10;
                long[] jArr2 = b0Var.f20572a;
                if (jArr2.length < length) {
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    kotlin.jvm.internal.r.d(jArrCopyOf2, "copyOf(...)");
                    b0Var.f20572a = jArrCopyOf2;
                }
                long[] jArr3 = b0Var.f20572a;
                int i11 = b0Var.f20573b;
                if (i10 != i11) {
                    qg.m.e(jArrCopyOf.length + i10, jArr3, i10, jArr3, i11);
                }
                qg.m.e(i10, jArrCopyOf, 0, jArr3, jArrCopyOf.length);
                b0Var.f20573b += jArrCopyOf.length;
            }
        } else {
            b0Var = new p.b0(16);
        }
        this.f12132a = b0Var;
    }
}

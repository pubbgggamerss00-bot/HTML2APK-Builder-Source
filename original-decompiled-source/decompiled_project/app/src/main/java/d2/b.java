package d2;

import java.util.Arrays;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f7321a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f7322b;

    public final void a(long j10) {
        if (b(j10)) {
            return;
        }
        int i10 = this.f7321a;
        long[] jArrCopyOf = this.f7322b;
        if (i10 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i10 + 1, jArrCopyOf.length * 2));
            r.d(jArrCopyOf, "copyOf(...)");
            this.f7322b = jArrCopyOf;
        }
        jArrCopyOf[i10] = j10;
        if (i10 >= this.f7321a) {
            this.f7321a = i10 + 1;
        }
    }

    public final boolean b(long j10) {
        int i10 = this.f7321a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7322b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j10) {
        int i10 = this.f7321a;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f7322b[i11]) {
                int i12 = this.f7321a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f7322b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f7321a--;
                return;
            }
            i11++;
        }
    }
}

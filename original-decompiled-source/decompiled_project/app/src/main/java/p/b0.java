package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20572a;

    /* renamed from: b, reason: collision with root package name */
    public int f20573b;

    public b0(int i10) {
        this.f20572a = i10 == 0 ? p.f20700a : new long[i10];
    }

    public final void a(long j10) {
        int i10 = this.f20573b + 1;
        long[] jArr = this.f20572a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
            this.f20572a = jArrCopyOf;
        }
        long[] jArr2 = this.f20572a;
        int i11 = this.f20573b;
        jArr2[i11] = j10;
        this.f20573b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int i10 = b0Var.f20573b;
            int i11 = this.f20573b;
            if (i10 == i11) {
                long[] jArr = this.f20572a;
                long[] jArr2 = b0Var.f20572a;
                jh.g gVarQ = jh.j.q(0, i11);
                int i12 = gVarQ.f15744a;
                int i13 = gVarQ.f15745b;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f20572a;
        int i10 = this.f20573b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f20572a;
        int i10 = this.f20573b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j10);
            i11++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}

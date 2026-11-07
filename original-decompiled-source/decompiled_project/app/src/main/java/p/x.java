package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20750a;

    /* renamed from: b, reason: collision with root package name */
    public int f20751b;

    public x(int i10) {
        this.f20750a = i10 == 0 ? k.f20650a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f20751b + 1);
        int[] iArr = this.f20750a;
        int i11 = this.f20751b;
        iArr[i11] = i10;
        this.f20751b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f20750a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20750a = iArrCopyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f20751b) {
            return this.f20750a[i10];
        }
        q.d.b("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i10 = this.f20751b;
        if (i10 != 0) {
            return this.f20750a[i10 - 1];
        }
        q.d.c("IntList is empty.");
        throw null;
    }

    public final void e(int i10) {
        int[] iArr = this.f20750a;
        int i11 = this.f20751b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (i10 == iArr[i12]) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            f(i12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i10 = xVar.f20751b;
            int i11 = this.f20751b;
            if (i10 == i11) {
                int[] iArr = this.f20750a;
                int[] iArr2 = xVar.f20750a;
                jh.g gVarQ = jh.j.q(0, i11);
                int i12 = gVarQ.f15744a;
                int i13 = gVarQ.f15745b;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
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

    public final int f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20751b)) {
            q.d.b("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f20750a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            qg.m.d(i10, iArr, i10 + 1, i11, iArr);
        }
        this.f20751b--;
        return i12;
    }

    public final void g(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f20751b) {
            q.d.b("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f20750a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f20750a;
        int i10 = this.f20751b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f20750a;
        int i10 = this.f20751b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i12);
            i11++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ x() {
        this(16);
    }
}

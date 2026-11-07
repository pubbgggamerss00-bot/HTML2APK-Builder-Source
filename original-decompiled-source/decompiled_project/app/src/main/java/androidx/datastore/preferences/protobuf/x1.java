package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final x1 f2170f = new x1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2171a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2172b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2173c;

    /* renamed from: d, reason: collision with root package name */
    public int f2174d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2175e;

    public x1() {
        this(0, new int[8], new Object[8], true);
    }

    public static x1 e(x1 x1Var, x1 x1Var2) {
        int i10 = x1Var.f2171a + x1Var2.f2171a;
        int[] iArrCopyOf = Arrays.copyOf(x1Var.f2172b, i10);
        System.arraycopy(x1Var2.f2172b, 0, iArrCopyOf, x1Var.f2171a, x1Var2.f2171a);
        Object[] objArrCopyOf = Arrays.copyOf(x1Var.f2173c, i10);
        System.arraycopy(x1Var2.f2173c, 0, objArrCopyOf, x1Var.f2171a, x1Var2.f2171a);
        return new x1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (!this.f2175e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f2172b;
        if (i10 > iArr.length) {
            int i11 = this.f2171a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f2172b = Arrays.copyOf(iArr, i10);
            this.f2173c = Arrays.copyOf(this.f2173c, i10);
        }
    }

    public final int c() {
        int iG;
        int i10;
        int iG2;
        int i11 = this.f2174d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2171a; i13++) {
            int i14 = this.f2172b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f2173c[i13]).getClass();
                    iG2 = m.g(i15) + 8;
                } else if (i16 == 2) {
                    iG2 = m.b(i15, (j) this.f2173c[i13]);
                } else if (i16 == 3) {
                    iG = m.g(i15) * 2;
                    i10 = ((x1) this.f2173c[i13]).c();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(e0.c());
                    }
                    ((Integer) this.f2173c[i13]).getClass();
                    iG2 = m.g(i15) + 4;
                }
                i12 = iG2 + i12;
            } else {
                long jLongValue = ((Long) this.f2173c[i13]).longValue();
                iG = m.g(i15);
                i10 = m.i(jLongValue);
            }
            i12 = i10 + iG + i12;
        }
        this.f2174d = i12;
        return i12;
    }

    public final boolean d(int i10, k kVar) throws IOException {
        int iE;
        a();
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            f(i10, Long.valueOf(kVar.u()));
            return true;
        }
        if (i12 == 1) {
            f(i10, Long.valueOf(kVar.q()));
            return true;
        }
        if (i12 == 2) {
            f(i10, kVar.m());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw e0.c();
            }
            f(i10, Integer.valueOf(kVar.p()));
            return true;
        }
        x1 x1Var = new x1();
        do {
            iE = kVar.E();
            if (iE == 0) {
                break;
            }
        } while (x1Var.d(iE, kVar));
        kVar.a((i11 << 3) | 4);
        f(i10, x1Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        int i10 = this.f2171a;
        if (i10 == x1Var.f2171a) {
            int[] iArr = this.f2172b;
            int[] iArr2 = x1Var.f2172b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f2173c;
                    Object[] objArr2 = x1Var.f2173c;
                    int i12 = this.f2171a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        a();
        b(this.f2171a + 1);
        int[] iArr = this.f2172b;
        int i11 = this.f2171a;
        iArr[i11] = i10;
        this.f2173c[i11] = obj;
        this.f2171a = i11 + 1;
    }

    public final void g(c2 c2Var) throws IOException {
        if (this.f2171a == 0) {
            return;
        }
        c2Var.getClass();
        for (int i10 = 0; i10 < this.f2171a; i10++) {
            int i11 = this.f2172b[i10];
            Object obj = this.f2173c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                ((n) c2Var).f2101a.E(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                ((n) c2Var).f2101a.r(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                ((n) c2Var).f2101a.n(i12, (j) obj);
            } else if (i13 == 3) {
                m mVar = ((n) c2Var).f2101a;
                mVar.B(i12, 3);
                ((x1) obj).g(c2Var);
                mVar.B(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(e0.c());
                }
                ((n) c2Var).f2101a.p(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f2171a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f2172b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f2173c;
        int i15 = this.f2171a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public x1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f2174d = -1;
        this.f2171a = i10;
        this.f2172b = iArr;
        this.f2173c = objArr;
        this.f2175e = z10;
    }
}

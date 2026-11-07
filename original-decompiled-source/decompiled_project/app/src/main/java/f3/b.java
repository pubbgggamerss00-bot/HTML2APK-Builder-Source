package f3;

import x0.s1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8811a;

    public static final class a {
        public static long a(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        c.l(i15);
                        throw new pg.g();
                    }
                    i14 = 8190;
                }
            }
            return c.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public static long b(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        c.l(i15);
                        throw new pg.g();
                    }
                    i14 = 8190;
                }
            }
            return c.a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
        }
    }

    public /* synthetic */ b(long j10) {
        this.f8811a = j10;
    }

    public static final long a(int i10, int i11, int i12, int i13) {
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            l.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return c.h(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(long j10, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = k(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = i(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = j(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = h(j10);
        }
        return a(i10, i11, i12, i13);
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean d(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean e(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ad.k.b((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean f(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean g(long j10) {
        int i10 = (int) (3 & j10);
        int iB = (1 << ad.k.b((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1;
        int i11 = ((int) (j10 >> 2)) & iB;
        int i12 = ((int) (j10 >> 33)) & iB;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int h(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (int) (j10 >> 33);
        int iB = i11 & ((1 << ad.k.b((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
        if (iB == 0) {
            return Integer.MAX_VALUE;
        }
        return iB - 1;
    }

    public static final int j(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int k(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ad.k.b((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
    }

    public static final boolean l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    public static String m(long j10) {
        int i10 = i(j10);
        String strValueOf = i10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i10);
        int iH = h(j10);
        String strValueOf2 = iH != Integer.MAX_VALUE ? String.valueOf(iH) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(k(j10));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(j(j10));
        sb.append(", maxHeight = ");
        return s1.a(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8811a == ((b) obj).f8811a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8811a);
    }

    public final String toString() {
        return m(this.f8811a);
    }
}

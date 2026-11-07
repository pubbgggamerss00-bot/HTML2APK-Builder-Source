package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m72 {

    /* renamed from: f, reason: collision with root package name */
    public static final m72 f6958f = new m72(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f6959a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6960b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6961c;

    /* renamed from: d, reason: collision with root package name */
    public int f6962d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6963e;

    public m72(int i6, int[] iArr, Object[] objArr, boolean z6) {
        this.f6962d = -1;
        this.f6959a = i6;
        this.f6960b = iArr;
        this.f6961c = objArr;
        this.f6963e = z6;
    }

    public final int a() {
        int iR;
        int iS;
        int iR2;
        int i6 = this.f6962d;
        if (i6 != -1) {
            return i6;
        }
        int iR3 = 0;
        for (int i7 = 0; i7 < this.f6959a; i7++) {
            int i8 = this.f6960b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.f6961c[i7]).getClass();
                    iR2 = p42.r(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int i11 = i9 << 3;
                    g42 g42Var = (g42) this.f6961c[i7];
                    int iR4 = p42.r(i11);
                    int iG = g42Var.g();
                    iR3 = p42.r(iG) + iG + iR4 + iR3;
                } else if (i10 == 3) {
                    int iR5 = p42.r(i9 << 3);
                    iR = iR5 + iR5;
                    iS = ((m72) this.f6961c[i7]).a();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(new t52());
                    }
                    ((Integer) this.f6961c[i7]).getClass();
                    iR2 = p42.r(i9 << 3) + 4;
                }
                iR3 = iR2 + iR3;
            } else {
                int i12 = i9 << 3;
                long jLongValue = ((Long) this.f6961c[i7]).longValue();
                iR = p42.r(i12);
                iS = p42.s(jLongValue);
            }
            iR3 = iS + iR + iR3;
        }
        this.f6962d = iR3;
        return iR3;
    }

    public final void b(int i6, Object obj) {
        if (!this.f6963e) {
            throw new UnsupportedOperationException();
        }
        d(this.f6959a + 1);
        int[] iArr = this.f6960b;
        int i7 = this.f6959a;
        iArr[i7] = i6;
        this.f6961c[i7] = obj;
        this.f6959a = i7 + 1;
    }

    public final void c(y72 y72Var) {
        if (this.f6959a != 0) {
            for (int i6 = 0; i6 < this.f6959a; i6++) {
                int i7 = this.f6960b[i6];
                Object obj = this.f6961c[i6];
                int i8 = i7 & 7;
                int i9 = i7 >>> 3;
                if (i8 == 0) {
                    ((q42) y72Var).f8227a.K(i9, ((Long) obj).longValue());
                } else if (i8 == 1) {
                    ((q42) y72Var).f8227a.z(i9, ((Long) obj).longValue());
                } else if (i8 == 2) {
                    ((q42) y72Var).f8227a.w(i9, (g42) obj);
                } else if (i8 == 3) {
                    q42 q42Var = (q42) y72Var;
                    q42Var.f8227a.H(i9, 3);
                    ((m72) obj).c(y72Var);
                    q42Var.f8227a.H(i9, 4);
                } else {
                    if (i8 != 5) {
                        throw new RuntimeException(new t52());
                    }
                    ((q42) y72Var).f8227a.x(i9, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void d(int i6) {
        int[] iArr = this.f6960b;
        if (i6 > iArr.length) {
            int i7 = this.f6959a;
            int i8 = (i7 / 2) + i7;
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f6960b = Arrays.copyOf(iArr, i6);
            this.f6961c = Arrays.copyOf(this.f6961c, i6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m72)) {
            return false;
        }
        m72 m72Var = (m72) obj;
        int i6 = this.f6959a;
        if (i6 == m72Var.f6959a) {
            int[] iArr = this.f6960b;
            int[] iArr2 = m72Var.f6960b;
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    Object[] objArr = this.f6961c;
                    Object[] objArr2 = m72Var.f6961c;
                    int i8 = this.f6959a;
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (objArr[i9].equals(objArr2[i9])) {
                        }
                    }
                    return true;
                }
                if (iArr[i7] != iArr2[i7]) {
                    break;
                }
                i7++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f6959a;
        int i7 = i6 + 527;
        int[] iArr = this.f6960b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i6; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = ((i7 * 31) + i8) * 31;
        Object[] objArr = this.f6961c;
        int i11 = this.f6959a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }

    public m72() {
        this(0, new int[8], new Object[8], true);
    }
}

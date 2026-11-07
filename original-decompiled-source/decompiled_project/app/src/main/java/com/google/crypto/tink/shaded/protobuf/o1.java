package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f6737f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f6738a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6739b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6740c;

    /* renamed from: d, reason: collision with root package name */
    public int f6741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6742e;

    public o1() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f6739b;
        if (i10 > iArr.length) {
            int i11 = this.f6738a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f6739b = Arrays.copyOf(iArr, i10);
            this.f6740c = Arrays.copyOf(this.f6740c, i10);
        }
    }

    public final int b() {
        int iQ;
        int iT;
        int iL;
        int i10 = this.f6741d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6738a; i12++) {
            int i13 = this.f6739b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f6740c[i12]).getClass();
                    iL = k.L(i14);
                } else if (i15 == 2) {
                    iL = k.I(i14, (h) this.f6740c[i12]);
                } else if (i15 == 3) {
                    iQ = k.Q(i14) * 2;
                    iT = ((o1) this.f6740c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(z.c());
                    }
                    ((Integer) this.f6740c[i12]).getClass();
                    iL = k.K(i14);
                }
                i11 = iL + i11;
            } else {
                long jLongValue = ((Long) this.f6740c[i12]).longValue();
                iQ = k.Q(i14);
                iT = k.T(jLongValue);
            }
            i11 = iT + iQ + i11;
        }
        this.f6741d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f6742e) {
            throw new UnsupportedOperationException();
        }
        a(this.f6738a + 1);
        int[] iArr = this.f6739b;
        int i11 = this.f6738a;
        iArr[i11] = i10;
        this.f6740c[i11] = obj;
        this.f6738a = i11 + 1;
    }

    public final void d(v1 v1Var) throws IOException {
        if (this.f6738a == 0) {
            return;
        }
        v1Var.getClass();
        for (int i10 = 0; i10 < this.f6738a; i10++) {
            int i11 = this.f6739b[i10];
            Object obj = this.f6740c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                ((l) v1Var).f6726a.k0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                ((l) v1Var).f6726a.Z(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                ((l) v1Var).a(i12, (h) obj);
            } else if (i13 == 3) {
                k kVar = ((l) v1Var).f6726a;
                kVar.h0(i12, 3);
                ((o1) obj).d(v1Var);
                kVar.h0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(z.c());
                }
                ((l) v1Var).f6726a.X(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f6738a;
        if (i10 == o1Var.f6738a) {
            int[] iArr = this.f6739b;
            int[] iArr2 = o1Var.f6739b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f6740c;
                    Object[] objArr2 = o1Var.f6740c;
                    int i12 = this.f6738a;
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

    public final int hashCode() {
        int i10 = this.f6738a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f6739b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f6740c;
        int i15 = this.f6738a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6741d = -1;
        this.f6738a = i10;
        this.f6739b = iArr;
        this.f6740c = objArr;
        this.f6742e = z10;
    }
}

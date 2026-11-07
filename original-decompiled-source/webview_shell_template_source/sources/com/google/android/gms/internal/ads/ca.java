package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ca implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3481a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f3482b = new ex0(0, new byte[9400]);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f3483c;

    /* renamed from: d, reason: collision with root package name */
    public final xj1 f3484d;

    /* renamed from: e, reason: collision with root package name */
    public final w6 f3485e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f3486f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f3487g;
    public final SparseBooleanArray h;

    /* renamed from: i, reason: collision with root package name */
    public final aa f3488i;

    /* renamed from: j, reason: collision with root package name */
    public z9 f3489j;

    /* renamed from: k, reason: collision with root package name */
    public z0 f3490k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3491l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3492m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3493n;

    /* renamed from: o, reason: collision with root package name */
    public int f3494o;

    public ca(w6 w6Var, m11 m11Var, xj1 xj1Var) {
        this.f3484d = xj1Var;
        this.f3485e = w6Var;
        this.f3481a = Collections.singletonList(m11Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f3487g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f3486f = sparseArray;
        this.f3483c = new SparseIntArray();
        this.f3488i = new aa();
        this.f3490k = z0.h;
        this.f3494o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f3486f.put(sparseArray2.keyAt(i6), (fa) sparseArray2.valueAt(i6));
        }
        this.f3486f.put(0, new w9(new ni0(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6, long j7) {
        z9 z9Var;
        long j8;
        SparseArray sparseArray = this.f3486f;
        List list = this.f3481a;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            m11 m11Var = (m11) list.get(i6);
            synchronized (m11Var) {
                j8 = m11Var.f6902b;
            }
            if (j8 != -9223372036854775807L) {
                long jD = m11Var.d();
                if (jD != -9223372036854775807L && jD != 0 && jD != j7) {
                    m11Var.e(j7);
                }
            }
        }
        if (j7 != 0 && (z9Var = this.f3489j) != null) {
            z9Var.b(j7);
        }
        this.f3482b.g(0);
        this.f3483c.clear();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            ((fa) sparseArray.valueAt(i7)).zzc();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f3482b.f4416a;
        p0 p0Var = (p0) y0Var;
        p0Var.g(bArr, 0, 940, false);
        int i6 = 0;
        while (i6 < 188) {
            for (int i7 = 0; i7 < 5; i7++) {
                if (bArr[(i7 * 188) + i6] != 71) {
                    break;
                }
            }
            p0Var.l(i6);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x027a  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) {
        y0 y0Var2;
        int i6;
        long j6;
        long jM;
        long jZzd = y0Var.zzd();
        if (this.f3491l) {
            long j7 = -9223372036854775807L;
            aa aaVar = this.f3488i;
            if (jZzd != -1 && !aaVar.f2635c) {
                int i7 = this.f3494o;
                ex0 ex0Var = aaVar.f2634b;
                if (i7 <= 0) {
                    aaVar.a(y0Var);
                    return 0;
                }
                if (aaVar.f2637e) {
                    if (aaVar.f2639g == -9223372036854775807L) {
                        aaVar.a(y0Var);
                        return 0;
                    }
                    if (aaVar.f2636d) {
                        long j8 = aaVar.f2638f;
                        if (j8 == -9223372036854775807L) {
                            aaVar.a(y0Var);
                            return 0;
                        }
                        m11 m11Var = aaVar.f2633a;
                        aaVar.h = m11Var.c(aaVar.f2639g) - m11Var.b(j8);
                        aaVar.a(y0Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, y0Var.zzd());
                    if (y0Var.zzf() != 0) {
                        b1Var.f2886a = 0L;
                        return 1;
                    }
                    ex0Var.g(iMin);
                    y0Var.zzj();
                    y0Var.h(0, iMin, ex0Var.f4416a);
                    int i8 = ex0Var.f4417b;
                    int i9 = ex0Var.f4418c;
                    while (true) {
                        if (i8 >= i9) {
                            jM = -9223372036854775807L;
                            break;
                        }
                        if (ex0Var.f4416a[i8] == 71) {
                            jM = ed0.m(ex0Var, i8, i7);
                            if (jM != -9223372036854775807L) {
                                break;
                            }
                        }
                        i8++;
                    }
                    aaVar.f2638f = jM;
                    aaVar.f2636d = true;
                    return 0;
                }
                long jZzd2 = y0Var.zzd();
                int iMin2 = (int) Math.min(112800L, jZzd2);
                long j9 = jZzd2 - iMin2;
                if (y0Var.zzf() != j9) {
                    b1Var.f2886a = j9;
                    return 1;
                }
                ex0Var.g(iMin2);
                y0Var.zzj();
                y0Var.h(0, iMin2, ex0Var.f4416a);
                int i10 = ex0Var.f4417b;
                int i11 = ex0Var.f4418c;
                int i12 = i11 - 188;
                while (true) {
                    if (i12 < i10) {
                        break;
                    }
                    byte[] bArr = ex0Var.f4416a;
                    int i13 = -4;
                    int i14 = 0;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        }
                        int i15 = (i13 * 188) + i12;
                        if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long jM2 = ed0.m(ex0Var, i12, i7);
                                if (jM2 != -9223372036854775807L) {
                                    j7 = jM2;
                                    break;
                                }
                            }
                        }
                        i13++;
                    }
                    i12--;
                }
                aaVar.f2639g = j7;
                aaVar.f2637e = true;
                return 0;
            }
            if (this.f3492m) {
                i6 = 1;
                j6 = 0;
            } else {
                this.f3492m = true;
                long j10 = aaVar.h;
                if (j10 != -9223372036854775807L) {
                    i6 = 1;
                    j6 = 0;
                    z9 z9Var = new z9(new y5(13), new y9(this.f3494o, aaVar.f2633a), j10, j10 + 1, 0L, jZzd, 188L, 940);
                    this.f3489j = z9Var;
                    this.f3490k.f(z9Var.f6893a);
                } else {
                    i6 = 1;
                    j6 = 0;
                    this.f3490k.f(new l1(j10, 0L));
                }
            }
            if (this.f3493n) {
                this.f3493n = false;
                c(j6, j6);
                if (y0Var.zzf() != j6) {
                    b1Var.f2886a = j6;
                    return i6;
                }
            }
            z9 z9Var2 = this.f3489j;
            if (z9Var2 != null && z9Var2.f6895c != null) {
                return z9Var2.a(y0Var, b1Var);
            }
            y0Var2 = y0Var;
        } else {
            y0Var2 = y0Var;
            i6 = 1;
        }
        ex0 ex0Var2 = this.f3482b;
        byte[] bArr2 = ex0Var2.f4416a;
        if (9400 - ex0Var2.f4417b < 188) {
            int iO = ex0Var2.o();
            if (iO > 0) {
                System.arraycopy(bArr2, ex0Var2.f4417b, bArr2, 0, iO);
            }
            ex0Var2.h(iO, bArr2);
        }
        while (true) {
            int iO2 = ex0Var2.o();
            SparseArray sparseArray = this.f3486f;
            if (iO2 >= 188) {
                int i16 = ex0Var2.f4417b;
                int i17 = ex0Var2.f4418c;
                byte[] bArr3 = ex0Var2.f4416a;
                while (i16 < i17 && bArr3[i16] != 71) {
                    i16++;
                }
                ex0Var2.j(i16);
                int i18 = i16 + 188;
                int i19 = ex0Var2.f4418c;
                if (i18 > i19) {
                    return 0;
                }
                int iQ = ex0Var2.q();
                if ((8388608 & iQ) != 0) {
                    ex0Var2.j(i18);
                    return 0;
                }
                int i20 = (4194304 & iQ) != 0 ? 1 : 0;
                int i21 = iQ & 32;
                int i22 = (iQ >> 8) & 8191;
                fa faVar = (iQ & 16) != 0 ? (fa) sparseArray.get(i22) : null;
                if (faVar == null) {
                    ex0Var2.j(i18);
                    return 0;
                }
                int i23 = iQ & 15;
                SparseIntArray sparseIntArray = this.f3483c;
                int i24 = sparseIntArray.get(i22, i23 - 1);
                sparseIntArray.put(i22, i23);
                if (i24 == i23) {
                    ex0Var2.j(i18);
                    return 0;
                }
                if (i23 != ((i24 + 1) & 15)) {
                    faVar.zzc();
                }
                if (i21 != 0) {
                    int iV = ex0Var2.v();
                    i20 |= (ex0Var2.v() & 64) != 0 ? 2 : 0;
                    ex0Var2.k(iV - 1);
                }
                boolean z6 = this.f3491l;
                if (z6 || !this.h.get(i22, false)) {
                    ex0Var2.i(i18);
                    faVar.a(i20, ex0Var2);
                    ex0Var2.i(i19);
                    if (!z6) {
                        if (this.f3491l && jZzd != -1) {
                            this.f3493n = true;
                        }
                    }
                }
                ex0Var2.j(i18);
                return 0;
            }
            int i25 = ex0Var2.f4418c;
            int iJ = y0Var2.j(i25, 9400 - i25, bArr2);
            if (iJ == -1) {
                int i26 = 0;
                while (i26 < sparseArray.size()) {
                    fa faVar2 = (fa) sparseArray.valueAt(i26);
                    if (faVar2 instanceof q9) {
                        q9 q9Var = (q9) faVar2;
                        if (q9Var.f8268c == 3 && q9Var.f8274j == -1) {
                            q9Var.a(i6, new ex0());
                        }
                    }
                    i26++;
                    i6 = 1;
                }
                return -1;
            }
            ex0Var2.i(i25 + iJ);
            i6 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f3490k = new b7(z0Var, this.f3485e);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}

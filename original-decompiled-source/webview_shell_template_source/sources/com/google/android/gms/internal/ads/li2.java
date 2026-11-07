package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.EOFException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class li2 implements s1 {
    public l2 A;

    /* renamed from: a, reason: collision with root package name */
    public final ji2 f6752a;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f6755d;

    /* renamed from: e, reason: collision with root package name */
    public ei2 f6756e;

    /* renamed from: f, reason: collision with root package name */
    public w f6757f;

    /* renamed from: n, reason: collision with root package name */
    public int f6764n;

    /* renamed from: o, reason: collision with root package name */
    public int f6765o;

    /* renamed from: p, reason: collision with root package name */
    public int f6766p;

    /* renamed from: q, reason: collision with root package name */
    public int f6767q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6770u;

    /* renamed from: x, reason: collision with root package name */
    public w f6773x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6775z;

    /* renamed from: b, reason: collision with root package name */
    public final c7 f6753b = new c7();

    /* renamed from: g, reason: collision with root package name */
    public int f6758g = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    public long[] h = new long[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: i, reason: collision with root package name */
    public long[] f6759i = new long[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: l, reason: collision with root package name */
    public long[] f6762l = new long[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: k, reason: collision with root package name */
    public int[] f6761k = new int[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: j, reason: collision with root package name */
    public int[] f6760j = new int[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: m, reason: collision with root package name */
    public r1[] f6763m = new r1[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: c, reason: collision with root package name */
    public final qi2 f6754c = new qi2(new aa1(25));

    /* renamed from: r, reason: collision with root package name */
    public long f6768r = Long.MIN_VALUE;
    public long s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public long f6769t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6772w = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6771v = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6774y = true;

    public li2(u1 u1Var, d0 d0Var, cf2 cf2Var) {
        this.f6755d = d0Var;
        this.f6752a = new ji2(u1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a2, B:60:0x0114, B:62:0x011d, B:41:0x00bb, B:43:0x00bf, B:45:0x00d8, B:49:0x00e1, B:50:0x00e6, B:52:0x00ec, B:56:0x00fa, B:58:0x00ff, B:59:0x0111, B:68:0x018b), top: B:71:0x003f }] */
    @Override // com.google.android.gms.internal.ads.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6, int i6, int i7, int i8, r1 r1Var) {
        if (this.f6771v) {
            if ((i6 & 1) == 0) {
                return;
            } else {
                this.f6771v = false;
            }
        }
        if (this.f6774y) {
            if (j6 < this.f6768r) {
                return;
            }
            if ((i6 & 1) == 0) {
                if (!this.f6775z) {
                    qs0.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f6773x)));
                    this.f6775z = true;
                }
                i6 |= 1;
            }
        }
        long j7 = (this.f6752a.f6081e - i7) - i8;
        synchronized (this) {
            try {
                int i9 = this.f6764n;
                if (i9 > 0) {
                    int i10 = i(i9 - 1);
                    y5.n(this.f6759i[i10] + ((long) this.f6760j[i10]) <= j7);
                }
                this.f6770u = (536870912 & i6) != 0;
                this.f6769t = Math.max(this.f6769t, j6);
                int i11 = i(this.f6764n);
                this.f6762l[i11] = j6;
                this.f6759i[i11] = j7;
                this.f6760j[i11] = i7;
                this.f6761k[i11] = i6;
                this.f6763m[i11] = r1Var;
                this.h[i11] = 0;
                if (!(this.f6754c.f8396b.size() == 0)) {
                    if (!((ki2) this.f6754c.f8396b.valueAt(r10.size() - 1)).f6434a.equals(this.f6773x)) {
                        w wVar = this.f6773x;
                        if (wVar == null) {
                            throw null;
                        }
                        this.f6755d.getClass();
                        yz1 yz1Var = ef2.f4271j;
                        qi2 qi2Var = this.f6754c;
                        int i12 = this.f6765o + this.f6764n;
                        ki2 ki2Var = new ki2(wVar, yz1Var);
                        SparseArray sparseArray = qi2Var.f8396b;
                        if (qi2Var.f8395a == -1) {
                            y5.r(sparseArray.size() == 0);
                            qi2Var.f8395a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            y5.n(i12 >= iKeyAt);
                            if (iKeyAt == i12) {
                                aa1 aa1Var = qi2Var.f8397c;
                                Object objValueAt = sparseArray.valueAt(sparseArray.size() - 1);
                                aa1Var.getClass();
                                ef2 ef2Var = ((ki2) objValueAt).f6435b;
                            }
                        }
                        sparseArray.append(i12, ki2Var);
                    }
                }
                int i13 = this.f6764n + 1;
                this.f6764n = i13;
                int i14 = this.f6758g;
                if (i13 == i14) {
                    int i15 = i14 + CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                    long[] jArr = new long[i15];
                    long[] jArr2 = new long[i15];
                    long[] jArr3 = new long[i15];
                    int[] iArr = new int[i15];
                    int[] iArr2 = new int[i15];
                    r1[] r1VarArr = new r1[i15];
                    int i16 = this.f6766p;
                    int i17 = i14 - i16;
                    System.arraycopy(this.f6759i, i16, jArr2, 0, i17);
                    System.arraycopy(this.f6762l, this.f6766p, jArr3, 0, i17);
                    System.arraycopy(this.f6761k, this.f6766p, iArr, 0, i17);
                    System.arraycopy(this.f6760j, this.f6766p, iArr2, 0, i17);
                    System.arraycopy(this.f6763m, this.f6766p, r1VarArr, 0, i17);
                    System.arraycopy(this.h, this.f6766p, jArr, 0, i17);
                    int i18 = this.f6766p;
                    System.arraycopy(this.f6759i, 0, jArr2, i17, i18);
                    System.arraycopy(this.f6762l, 0, jArr3, i17, i18);
                    System.arraycopy(this.f6761k, 0, iArr, i17, i18);
                    System.arraycopy(this.f6760j, 0, iArr2, i17, i18);
                    System.arraycopy(this.f6763m, 0, r1VarArr, i17, i18);
                    System.arraycopy(this.h, 0, jArr, i17, i18);
                    this.f6759i = jArr2;
                    this.f6762l = jArr3;
                    this.f6761k = iArr;
                    this.f6760j = iArr2;
                    this.f6763m = r1VarArr;
                    this.h = jArr;
                    this.f6766p = 0;
                    this.f6758g = i15;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x001e, B:15:0x0036, B:19:0x004f, B:18:0x004d), top: B:29:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(w wVar) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            try {
                this.f6772w = false;
                if (!Objects.equals(wVar, this.f6773x)) {
                    if (!(this.f6754c.f8396b.size() == 0)) {
                        if (((ki2) this.f6754c.f8396b.valueAt(r1.size() - 1)).f6434a.equals(wVar)) {
                            this.f6773x = ((ki2) this.f6754c.f8396b.valueAt(r5.size() - 1)).f6434a;
                        } else {
                            this.f6773x = wVar;
                        }
                        boolean z7 = this.f6774y;
                        w wVar2 = this.f6773x;
                        this.f6774y = z7 & bk.f(wVar2.f9978m, wVar2.f9975j);
                        this.f6775z = false;
                        z6 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ei2 ei2Var = this.f6756e;
        if (ei2Var == null || !z6) {
            return;
        }
        ei2Var.F.post(ei2Var.D);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final int c(gc2 gc2Var, int i6, boolean z6) throws EOFException {
        ji2 ji2Var = this.f6752a;
        int iB = ji2Var.b(i6);
        ii2 ii2Var = ji2Var.f6080d;
        hk2 hk2Var = ii2Var.f5780c;
        byte[] bArr = hk2Var.f5436a;
        long j6 = ji2Var.f6081e - ii2Var.f5778a;
        hk2Var.getClass();
        int iJ = gc2Var.j((int) j6, iB, bArr);
        if (iJ == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        long j7 = ji2Var.f6081e + iJ;
        ji2Var.f6081e = j7;
        ii2 ii2Var2 = ji2Var.f6080d;
        if (j7 == ii2Var2.f5779b) {
            ji2Var.f6080d = ii2Var2.f5781d;
        }
        return iJ;
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final int d(gc2 gc2Var, int i6, boolean z6) {
        return c(gc2Var, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void e(int i6, ex0 ex0Var) {
        f(ex0Var, i6, 0);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void f(ex0 ex0Var, int i6, int i7) {
        while (true) {
            ji2 ji2Var = this.f6752a;
            if (i6 <= 0) {
                ji2Var.getClass();
                return;
            }
            int iB = ji2Var.b(i6);
            ii2 ii2Var = ji2Var.f6080d;
            hk2 hk2Var = ii2Var.f5780c;
            byte[] bArr = hk2Var.f5436a;
            long j6 = ji2Var.f6081e - ii2Var.f5778a;
            hk2Var.getClass();
            ex0Var.f((int) j6, iB, bArr);
            i6 -= iB;
            long j7 = ji2Var.f6081e + iB;
            ji2Var.f6081e = j7;
            ii2 ii2Var2 = ji2Var.f6080d;
            if (j7 == ii2Var2.f5779b) {
                ji2Var.f6080d = ii2Var2.f5781d;
            }
        }
    }

    public final synchronized boolean g(boolean z6, long j6) throws Throwable {
        li2 li2Var;
        long j7;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f6767q = 0;
                        ji2 ji2Var = this.f6752a;
                        ji2Var.f6079c = ji2Var.f6078b;
                        int i6 = i(0);
                        int i7 = this.f6767q;
                        int iH = this.f6764n;
                        if ((i7 != iH) && j6 >= this.f6762l[i6]) {
                            if (j6 > this.f6769t) {
                                if (z6) {
                                    z6 = true;
                                }
                            }
                            if (this.f6774y) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < iH) {
                                        try {
                                            if (this.f6762l[i6] >= j6) {
                                                li2Var = this;
                                                j7 = j6;
                                                iH = i8;
                                                break;
                                            }
                                            i6++;
                                            if (i6 == this.f6758g) {
                                                i6 = 0;
                                            }
                                            i8++;
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            throw th2;
                                        }
                                    } else {
                                        li2Var = this;
                                        j7 = j6;
                                        if (!z6) {
                                            iH = -1;
                                        }
                                    }
                                }
                            } else {
                                li2Var = this;
                                j7 = j6;
                                iH = li2Var.h(i6, iH, j7, true);
                            }
                            if (iH != -1) {
                                li2Var.f6768r = j7;
                                li2Var.f6767q += iH;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th3 = th;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th2;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final int h(int i6, int i7, long j6, boolean z6) {
        int i8 = -1;
        for (int i9 = 0; i9 < i7; i9++) {
            long j7 = this.f6762l[i6];
            if (j7 > j6) {
                break;
            }
            if (!z6 || (this.f6761k[i6] & 1) != 0) {
                if (j7 == j6) {
                    return i9;
                }
                i8 = i9;
            }
            i6++;
            if (i6 == this.f6758g) {
                i6 = 0;
            }
        }
        return i8;
    }

    public final int i(int i6) {
        int i7 = this.f6766p + i6;
        int i8 = this.f6758g;
        return i7 < i8 ? i7 : i7 - i8;
    }

    public final long j(int i6) {
        long j6 = this.s;
        long jMax = Long.MIN_VALUE;
        int i7 = 0;
        if (i6 != 0) {
            int i8 = i(i6 - 1);
            for (int i9 = 0; i9 < i6; i9++) {
                jMax = Math.max(jMax, this.f6762l[i8]);
                if ((this.f6761k[i8] & 1) != 0) {
                    break;
                }
                i8--;
                if (i8 == -1) {
                    i8 = this.f6758g - 1;
                }
            }
        }
        this.s = Math.max(j6, jMax);
        this.f6764n -= i6;
        int i10 = this.f6765o + i6;
        this.f6765o = i10;
        int i11 = this.f6766p + i6;
        this.f6766p = i11;
        int i12 = this.f6758g;
        if (i11 >= i12) {
            this.f6766p = i11 - i12;
        }
        int i13 = this.f6767q - i6;
        this.f6767q = i13;
        if (i13 < 0) {
            this.f6767q = 0;
        }
        qi2 qi2Var = this.f6754c;
        SparseArray sparseArray = qi2Var.f8396b;
        while (i7 < sparseArray.size() - 1) {
            int i14 = i7 + 1;
            if (i10 < sparseArray.keyAt(i14)) {
                break;
            }
            aa1 aa1Var = qi2Var.f8397c;
            Object objValueAt = sparseArray.valueAt(i7);
            aa1Var.getClass();
            ef2 ef2Var = ((ki2) objValueAt).f6435b;
            sparseArray.removeAt(i7);
            int i15 = qi2Var.f8395a;
            if (i15 > 0) {
                qi2Var.f8395a = i15 - 1;
            }
            i7 = i14;
        }
        if (this.f6764n != 0) {
            return this.f6759i[this.f6766p];
        }
        int i16 = this.f6766p;
        if (i16 == 0) {
            i16 = this.f6758g;
        }
        return this.f6759i[i16 - 1] + this.f6760j[r12];
    }

    public final void k(w wVar, ro0 ro0Var) {
        w wVar2 = this.f6757f;
        ih2 ih2Var = wVar2 == null ? null : wVar2.f9982q;
        this.f6757f = wVar;
        ih2 ih2Var2 = wVar.f9982q;
        d0 d0Var = this.f6755d;
        int iD = d0Var.d(wVar);
        tk2 tk2Var = new tk2(wVar);
        tk2Var.H = iD;
        ro0Var.s = new w(tk2Var);
        ro0Var.f8673t = this.A;
        if (wVar2 == null || !Objects.equals(ih2Var, ih2Var2)) {
            d0Var.getClass();
            l2 l2Var = wVar.f9982q == null ? null : new l2(16, new ze2(new gf2()));
            this.A = l2Var;
            ro0Var.f8673t = l2Var;
        }
    }

    public final void l() {
        long j6;
        ji2 ji2Var = this.f6752a;
        synchronized (this) {
            int i6 = this.f6764n;
            j6 = i6 == 0 ? -1L : j(i6);
        }
        ji2Var.a(j6);
    }

    public final void m(boolean z6) {
        ji2 ji2Var = this.f6752a;
        ii2 ii2Var = ji2Var.f6078b;
        if (ii2Var.f5780c != null) {
            u1 u1Var = ji2Var.f6082f;
            synchronized (u1Var) {
                ii2 ii2Var2 = ii2Var;
                while (ii2Var2 != null) {
                    try {
                        hk2[] hk2VarArr = (hk2[]) u1Var.f9424d;
                        int i6 = u1Var.f9423c;
                        u1Var.f9423c = i6 + 1;
                        hk2 hk2Var = ii2Var2.f5780c;
                        hk2Var.getClass();
                        hk2VarArr[i6] = hk2Var;
                        u1Var.f9422b--;
                        ii2Var2 = ii2Var2.f5781d;
                        if (ii2Var2 == null || ii2Var2.f5780c == null) {
                            ii2Var2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u1Var.notifyAll();
            }
            ii2Var.f5780c = null;
            ii2Var.f5781d = null;
        }
        ii2 ii2Var3 = ji2Var.f6078b;
        y5.r(ii2Var3.f5780c == null);
        ii2Var3.f5778a = 0L;
        ii2Var3.f5779b = 65536L;
        ii2 ii2Var4 = ji2Var.f6078b;
        ji2Var.f6079c = ii2Var4;
        ji2Var.f6080d = ii2Var4;
        ji2Var.f6081e = 0L;
        ji2Var.f6082f.e();
        this.f6764n = 0;
        this.f6765o = 0;
        this.f6766p = 0;
        this.f6767q = 0;
        this.f6771v = true;
        this.f6768r = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.f6769t = Long.MIN_VALUE;
        this.f6770u = false;
        qi2 qi2Var = this.f6754c;
        SparseArray sparseArray = qi2Var.f8396b;
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            aa1 aa1Var = qi2Var.f8397c;
            Object objValueAt = sparseArray.valueAt(i7);
            aa1Var.getClass();
            ef2 ef2Var = ((ki2) objValueAt).f6435b;
        }
        qi2Var.f8395a = -1;
        sparseArray.clear();
        if (z6) {
            this.f6773x = null;
            this.f6772w = true;
            this.f6774y = true;
        }
    }

    public final synchronized boolean n(boolean z6) {
        int i6 = this.f6767q;
        boolean z7 = false;
        if (i6 != this.f6764n) {
            if (((ki2) this.f6754c.a(this.f6765o + i6)).f6434a != this.f6757f) {
                return true;
            }
            int i7 = i(this.f6767q);
            if (this.A != null) {
                int i8 = this.f6761k[i7];
            } else {
                z7 = true;
            }
            return z7;
        }
        if (z6 || this.f6770u) {
            z7 = true;
        } else {
            w wVar = this.f6773x;
            if (wVar != null) {
                if (wVar == this.f6757f) {
                    return false;
                }
                z7 = true;
            }
        }
        return z7;
    }
}

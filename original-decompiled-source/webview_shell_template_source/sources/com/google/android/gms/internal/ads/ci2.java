package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ci2 implements mi2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei2 f3596b;

    public ci2(ei2 ei2Var, int i6) {
        this.f3596b = ei2Var;
        this.f3595a = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    @Override // com.google.android.gms.internal.ads.mi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j6) {
        boolean z6;
        int iH;
        ei2 ei2Var = this.f3596b;
        int i6 = this.f3595a;
        if (ei2Var.v()) {
            return 0;
        }
        ei2Var.r(i6);
        li2 li2Var = ei2Var.I[i6];
        boolean z7 = ei2Var.f4308c0;
        synchronized (li2Var) {
            int i7 = li2Var.f6767q;
            int i8 = li2Var.i(i7);
            int i9 = li2Var.f6767q;
            int i10 = li2Var.f6764n;
            z6 = true;
            if ((i9 != i10) && j6 >= li2Var.f6762l[i8]) {
                if (j6 <= li2Var.f6769t || !z7) {
                    iH = li2Var.h(i8, i10 - i7, j6, true);
                    if (iH == -1) {
                    }
                } else {
                    iH = i10 - i7;
                }
            }
            iH = 0;
        }
        synchronized (li2Var) {
            if (iH >= 0) {
                try {
                    if (li2Var.f6767q + iH > li2Var.f6764n) {
                        z6 = false;
                    }
                } finally {
                }
            }
            y5.n(z6);
            li2Var.f6767q += iH;
        }
        if (iH != 0) {
            return iH;
        }
        ei2Var.s(i6);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int b(ro0 ro0Var, ja2 ja2Var, int i6) {
        int i7;
        boolean z6;
        int i8;
        ei2 ei2Var = this.f3596b;
        int i9 = this.f3595a;
        if (ei2Var.v()) {
            return -3;
        }
        ei2Var.r(i9);
        li2 li2Var = ei2Var.I[i9];
        boolean z7 = ei2Var.f4308c0;
        li2Var.getClass();
        boolean z8 = (i6 & 2) != 0;
        c7 c7Var = li2Var.f6753b;
        synchronized (li2Var) {
            try {
                ja2Var.f6004e = false;
                int i10 = li2Var.f6767q;
                i7 = -4;
                if (i10 != li2Var.f6764n) {
                    w wVar = ((ki2) li2Var.f6754c.a(li2Var.f6765o + i10)).f6434a;
                    if (!z8 && wVar == li2Var.f6757f) {
                        int i11 = li2Var.i(li2Var.f6767q);
                        if (li2Var.A != null) {
                            int i12 = li2Var.f6761k[i11];
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            int i13 = li2Var.f6761k[i11];
                            ja2Var.f2614a = i13;
                            if (li2Var.f6767q == li2Var.f6764n - 1 && (z7 || li2Var.f6770u)) {
                                ja2Var.f2614a = 536870912 | i13;
                            }
                            ja2Var.f6005f = li2Var.f6762l[i11];
                            c7Var.f3443t = li2Var.f6760j[i11];
                            c7Var.f3444u = li2Var.f6759i[i11];
                            c7Var.f3445v = li2Var.f6763m[i11];
                            i8 = -4;
                        } else {
                            ja2Var.f6004e = true;
                            i8 = -3;
                        }
                    }
                    li2Var.k(wVar, ro0Var);
                    i8 = -5;
                } else {
                    if (!z7 && !li2Var.f6770u) {
                        w wVar2 = li2Var.f6773x;
                        if (wVar2 == null || (!z8 && wVar2 == li2Var.f6757f)) {
                            i8 = -3;
                        }
                        li2Var.k(wVar2, ro0Var);
                        i8 = -5;
                    }
                    ja2Var.f2614a = 4;
                    ja2Var.f6005f = Long.MIN_VALUE;
                    i8 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 != -4) {
            i7 = i8;
        } else if (!ja2Var.a(4)) {
            int i14 = i6 & 1;
            if ((i6 & 4) == 0) {
                if (i14 != 0) {
                    ji2 ji2Var = li2Var.f6752a;
                    ji2.e(ji2Var.f6079c, ja2Var, li2Var.f6753b, ji2Var.f6077a);
                } else {
                    ji2 ji2Var2 = li2Var.f6752a;
                    ji2Var2.f6079c = ji2.e(ji2Var2.f6079c, ja2Var, li2Var.f6753b, ji2Var2.f6077a);
                    li2Var.f6767q++;
                }
            } else if (i14 == 0) {
                li2Var.f6767q++;
            }
        }
        if (i7 == -3) {
            ei2Var.s(i9);
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void zzd() throws IOException {
        IOException iOException;
        int i6 = this.f3595a;
        ei2 ei2Var = this.f3596b;
        l2 l2Var = ei2Var.I[i6].A;
        if (l2Var != null) {
            throw ((ze2) l2Var.f6565t);
        }
        int i7 = ei2Var.S == 7 ? 6 : 3;
        sk2 sk2Var = ei2Var.A;
        IOException iOException2 = sk2Var.f8976c;
        if (iOException2 != null) {
            throw iOException2;
        }
        pk2 pk2Var = sk2Var.f8975b;
        if (pk2Var != null && (iOException = pk2Var.f8100u) != null && pk2Var.f8101v > i7) {
            throw iOException;
        }
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final boolean zze() {
        ei2 ei2Var = this.f3596b;
        return !ei2Var.v() && ei2Var.I[this.f3595a].n(ei2Var.f4308c0);
    }
}

package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.AdRequest;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x8 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f10412a;

    /* renamed from: c, reason: collision with root package name */
    public final String f10414c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10415d;

    /* renamed from: e, reason: collision with root package name */
    public String f10416e;

    /* renamed from: f, reason: collision with root package name */
    public s1 f10417f;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f10419i;

    /* renamed from: j, reason: collision with root package name */
    public long f10420j;

    /* renamed from: k, reason: collision with root package name */
    public w f10421k;

    /* renamed from: l, reason: collision with root package name */
    public int f10422l;

    /* renamed from: m, reason: collision with root package name */
    public int f10423m;

    /* renamed from: g, reason: collision with root package name */
    public int f10418g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f10426p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10413b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f10424n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f10425o = -1;

    public x8(String str, int i6, int i7) {
        this.f10412a = new ex0(new byte[i7]);
        this.f10414c = str;
        this.f10415d = i6;
    }

    public final void b(v0 v0Var) {
        int i6 = v0Var.f9677a;
        String str = (String) v0Var.f9679c;
        int i7 = v0Var.f9678b;
        if (i6 == -2147483647 || i7 == -1) {
            return;
        }
        w wVar = this.f10421k;
        if (wVar != null && i7 == wVar.B && i6 == wVar.C && str.equals(wVar.f9978m)) {
            return;
        }
        w wVar2 = this.f10421k;
        tk2 tk2Var = wVar2 == null ? new tk2() : new tk2(wVar2);
        tk2Var.f9320a = this.f10416e;
        tk2Var.c(str);
        tk2Var.A = i7;
        tk2Var.B = i6;
        tk2Var.f9323d = this.f10414c;
        tk2Var.f9325f = this.f10415d;
        w wVar3 = new w(tk2Var);
        this.f10421k = wVar3;
        this.f10417f.b(wVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ae  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) throws rn {
        long jU;
        int i6;
        int i7;
        int i8;
        int i9;
        int iW;
        int iW2;
        long jU2;
        int i10;
        int i11;
        int i12;
        byte b7;
        boolean z6;
        int i13;
        int i14;
        byte b8;
        int i15;
        byte b9;
        int i16;
        int i17;
        byte b10;
        y5.k(this.f10417f);
        while (ex0Var.o() > 0) {
            int i18 = this.f10418g;
            ex0 ex0Var2 = this.f10412a;
            if (i18 == 0) {
                while (true) {
                    if (ex0Var.o() > 0) {
                        int i19 = this.f10419i << 8;
                        this.f10419i = i19;
                        int iV = i19 | ex0Var.v();
                        this.f10419i = iV;
                        int i20 = (iV == 2147385345 || iV == -25230976 || iV == 536864768 || iV == -14745368) ? 1 : (iV == 1683496997 || iV == 622876772) ? 2 : (iV == 1078008818 || iV == -233094848) ? 3 : (iV == 1908687592 || iV == -398277519) ? 4 : 0;
                        this.f10423m = i20;
                        if (i20 != 0) {
                            byte[] bArr = ex0Var2.f4416a;
                            bArr[0] = (byte) ((iV >> 24) & 255);
                            bArr[1] = (byte) ((iV >> 16) & 255);
                            bArr[2] = (byte) ((iV >> 8) & 255);
                            bArr[3] = (byte) (iV & 255);
                            this.h = 4;
                            this.f10419i = 0;
                            if (i20 == 3 || i20 == 4) {
                                this.f10418g = 4;
                            } else if (i20 == 1) {
                                this.f10418g = 1;
                            } else {
                                this.f10418g = 2;
                            }
                        }
                    }
                }
            } else if (i18 != 1) {
                if (i18 != 2) {
                    int iW3 = -2147483647;
                    int i21 = 8;
                    if (i18 != 3) {
                        if (i18 != 4) {
                            if (i18 != 5) {
                                int iMin = Math.min(ex0Var.o(), this.f10422l - this.h);
                                this.f10417f.e(iMin, ex0Var);
                                int i22 = this.h + iMin;
                                this.h = i22;
                                if (i22 == this.f10422l) {
                                    y5.r(this.f10426p != -9223372036854775807L);
                                    this.f10417f.a(this.f10426p, this.f10423m == 4 ? 0 : 1, this.f10422l, 0, null);
                                    this.f10426p += this.f10420j;
                                    this.f10418g = 0;
                                }
                            } else if (f(ex0Var, ex0Var2.f4416a, this.f10425o)) {
                                byte[] bArr2 = ex0Var2.f4416a;
                                l42 l42VarB = w0.b(bArr2);
                                int iW4 = l42VarB.w(32);
                                int iA = w0.a(l42VarB, w0.f9995e);
                                int i23 = iA + 1;
                                char c7 = iW4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c7 == 0) {
                                    jU = -9223372036854775807L;
                                } else {
                                    if (!l42VarB.G()) {
                                        throw rn.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i24 = iA - 1;
                                    int i25 = bArr2[i24] << 8;
                                    int i26 = bArr2[iA] & 255;
                                    int i27 = j31.f5914a;
                                    char c8 = 65535;
                                    for (int i28 = 0; i28 < i24; i28++) {
                                        byte b11 = bArr2[i28];
                                        int[] iArr = j31.f5924l;
                                        char c9 = (char) (iArr[(c8 >> '\f') ^ ((b11 & 255) >> 4)] ^ ((char) (c8 << 4)));
                                        c8 = (char) (((char) (c9 << 4)) ^ iArr[(b11 & 15) ^ (c9 >> '\f')]);
                                    }
                                    if ((((char) i25) | i26) != c8) {
                                        throw rn.a(null, "CRC check failed");
                                    }
                                    int iW5 = l42VarB.w(2);
                                    if (iW5 != 0) {
                                        if (iW5 == 1) {
                                            i7 = 480;
                                        } else {
                                            if (iW5 != 2) {
                                                throw rn.a(null, "Unsupported base duration index in DTS UHD header: " + iW5);
                                            }
                                            i7 = 384;
                                        }
                                        i6 = 3;
                                    } else {
                                        i6 = 3;
                                        i7 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    int iW6 = l42VarB.w(i6) + 1;
                                    int iW7 = l42VarB.w(2);
                                    if (iW7 == 0) {
                                        i8 = 32000;
                                    } else if (iW7 == 1) {
                                        i8 = 44100;
                                    } else {
                                        if (iW7 != 2) {
                                            throw rn.a(null, "Unsupported clock rate index in DTS UHD header: " + iW7);
                                        }
                                        i8 = 48000;
                                    }
                                    if (l42VarB.G()) {
                                        l42VarB.D(36);
                                    }
                                    iW3 = i8 * (1 << l42VarB.w(2));
                                    jU = j31.u(i7 * iW6, 1000000L, i8, RoundingMode.DOWN);
                                }
                                int i29 = iW3;
                                int iA2 = 0;
                                for (char c10 = 0; c10 < c7; c10 = 1) {
                                    iA2 += w0.a(l42VarB, w0.f9996f);
                                }
                                for (int i30 = 0; i30 <= 0; i30++) {
                                    AtomicInteger atomicInteger = this.f10413b;
                                    if (c7 != 0) {
                                        atomicInteger.set(w0.a(l42VarB, w0.f9997g));
                                    }
                                    iA2 += atomicInteger.get() != 0 ? w0.a(l42VarB, w0.h) : 0;
                                }
                                int i31 = i23 + iA2;
                                long j6 = jU;
                                v0 v0Var = new v0("audio/vnd.dts.uhd;profile=p2", 2, i29, i31, j6);
                                if (this.f10423m == 3) {
                                    b(v0Var);
                                }
                                this.f10422l = i31;
                                if (j6 == -9223372036854775807L) {
                                    j6 = 0;
                                }
                                this.f10420j = j6;
                                ex0Var2.j(0);
                                this.f10417f.e(this.f10425o, ex0Var2);
                                this.f10418g = 6;
                            } else {
                                continue;
                            }
                        } else if (f(ex0Var, ex0Var2.f4416a, 6)) {
                            l42 l42VarB2 = w0.b(ex0Var2.f4416a);
                            l42VarB2.D(32);
                            int iA3 = w0.a(l42VarB2, w0.f9998i) + 1;
                            this.f10425o = iA3;
                            int i32 = this.h;
                            if (i32 > iA3) {
                                int i33 = i32 - iA3;
                                this.h = i32 - i33;
                                ex0Var.j(ex0Var.f4417b - i33);
                            }
                            this.f10418g = 5;
                        }
                    } else if (f(ex0Var, ex0Var2.f4416a, this.f10424n)) {
                        l42 l42VarB3 = w0.b(ex0Var2.f4416a);
                        l42VarB3.D(40);
                        int iW8 = l42VarB3.w(2);
                        boolean zG = l42VarB3.G();
                        int i34 = true != zG ? 16 : 20;
                        l42VarB3.D(true != zG ? 8 : 12);
                        int iW9 = l42VarB3.w(i34) + 1;
                        boolean zG2 = l42VarB3.G();
                        if (zG2) {
                            iW = l42VarB3.w(2);
                            int iW10 = l42VarB3.w(3) + 1;
                            if (l42VarB3.G()) {
                                l42VarB3.D(36);
                            }
                            int iW11 = l42VarB3.w(3) + 1;
                            int iW12 = l42VarB3.w(3) + 1;
                            if (iW11 != 1 || iW12 != 1) {
                                throw rn.b("Multiple audio presentations or assets not supported");
                            }
                            int i35 = iW8 + 1;
                            int iW13 = l42VarB3.w(i35);
                            int i36 = 0;
                            while (i36 < i35) {
                                if (((iW13 >> i36) & 1) == 1) {
                                    l42VarB3.D(i21);
                                }
                                i36++;
                                i21 = 8;
                            }
                            i9 = iW10 * AdRequest.MAX_CONTENT_URL_LENGTH;
                            if (l42VarB3.G()) {
                                l42VarB3.D(2);
                                int iW14 = (l42VarB3.w(2) + 1) << 2;
                                int iW15 = l42VarB3.w(2) + 1;
                                for (int i37 = 0; i37 < iW15; i37++) {
                                    l42VarB3.D(iW14);
                                }
                            }
                        } else {
                            i9 = 0;
                            iW = -1;
                        }
                        l42VarB3.D(i34);
                        l42VarB3.D(12);
                        if (zG2) {
                            if (l42VarB3.G()) {
                                l42VarB3.D(4);
                            }
                            if (l42VarB3.G()) {
                                l42VarB3.D(24);
                            }
                            if (l42VarB3.G()) {
                                l42VarB3.E(l42VarB3.w(10) + 1);
                            }
                            l42VarB3.D(5);
                            iW3 = w0.f9994d[l42VarB3.w(4)];
                            iW2 = l42VarB3.w(8) + 1;
                        } else {
                            iW2 = -1;
                        }
                        int i38 = iW3;
                        if (zG2) {
                            if (iW == 0) {
                                i10 = 32000;
                            } else if (iW == 1) {
                                i10 = 44100;
                            } else {
                                if (iW != 2) {
                                    throw rn.a(null, "Unsupported reference clock code in DTS HD header: " + iW);
                                }
                                i10 = 48000;
                            }
                            jU2 = j31.u(i9, 1000000L, i10, RoundingMode.DOWN);
                        } else {
                            jU2 = -9223372036854775807L;
                        }
                        b(new v0("audio/vnd.dts.hd;profile=lbr", iW2, i38, iW9, jU2));
                        this.f10422l = iW9;
                        this.f10420j = jU2 == -9223372036854775807L ? 0L : jU2;
                        ex0Var2.j(0);
                        this.f10417f.e(this.f10424n, ex0Var2);
                        this.f10418g = 6;
                    } else {
                        continue;
                    }
                } else if (f(ex0Var, ex0Var2.f4416a, 7)) {
                    l42 l42VarB4 = w0.b(ex0Var2.f4416a);
                    l42VarB4.D(42);
                    this.f10424n = l42VarB4.w(true != l42VarB4.G() ? 8 : 12) + 1;
                    this.f10418g = 3;
                }
            } else if (f(ex0Var, ex0Var2.f4416a, 18)) {
                byte[] bArr3 = ex0Var2.f4416a;
                if (this.f10421k == null) {
                    String str = this.f10416e;
                    l42 l42VarB5 = w0.b(bArr3);
                    l42VarB5.D(60);
                    int i39 = w0.f9991a[l42VarB5.w(6)];
                    int i40 = w0.f9992b[l42VarB5.w(4)];
                    int iW16 = l42VarB5.w(5);
                    int i41 = iW16 >= 29 ? -1 : (w0.f9993c[iW16] * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL) / 2;
                    l42VarB5.D(10);
                    int i42 = i39 + (l42VarB5.w(2) > 0 ? 1 : 0);
                    tk2 tk2Var = new tk2();
                    tk2Var.f9320a = str;
                    tk2Var.c("audio/vnd.dts");
                    tk2Var.f9326g = i41;
                    tk2Var.A = i42;
                    tk2Var.B = i40;
                    tk2Var.f9334p = null;
                    tk2Var.f9323d = this.f10414c;
                    tk2Var.f9325f = this.f10415d;
                    w wVar = new w(tk2Var);
                    this.f10421k = wVar;
                    this.f10417f.b(wVar);
                }
                byte b12 = bArr3[0];
                if (b12 != -2) {
                    if (b12 == -1) {
                        i16 = (bArr3[7] & 3) << 12;
                        i17 = (bArr3[6] & 255) << 4;
                        b10 = bArr3[9];
                    } else if (b12 != 31) {
                        i11 = (bArr3[5] & 3) << 12;
                        i12 = (bArr3[6] & 255) << 4;
                        b7 = bArr3[7];
                    } else {
                        i16 = (bArr3[6] & 3) << 12;
                        i17 = (bArr3[7] & 255) << 4;
                        b10 = bArr3[8];
                    }
                    i13 = (i16 | i17 | ((b10 & 60) >> 2)) + 1;
                    z6 = true;
                    if (z6) {
                        i13 = (i13 * 16) / 14;
                    }
                    this.f10422l = i13;
                    if (b12 == -2) {
                        if (b12 == -1) {
                            i14 = (bArr3[4] & 7) << 4;
                            b9 = bArr3[7];
                        } else if (b12 != 31) {
                            i14 = (bArr3[4] & 1) << 6;
                            b8 = bArr3[5];
                        } else {
                            i14 = (bArr3[5] & 7) << 4;
                            b9 = bArr3[6];
                        }
                        i15 = b9 & 60;
                        this.f10420j = ed0.l(j31.t(this.f10421k.C, (((i15 >> 2) | i14) + 1) * 32));
                        ex0Var2.j(0);
                        this.f10417f.e(18, ex0Var2);
                        this.f10418g = 6;
                    } else {
                        i14 = (bArr3[5] & 1) << 6;
                        b8 = bArr3[4];
                    }
                    i15 = b8 & 252;
                    this.f10420j = ed0.l(j31.t(this.f10421k.C, (((i15 >> 2) | i14) + 1) * 32));
                    ex0Var2.j(0);
                    this.f10417f.e(18, ex0Var2);
                    this.f10418g = 6;
                } else {
                    i11 = (bArr3[4] & 3) << 12;
                    i12 = (bArr3[7] & 255) << 4;
                    b7 = bArr3[6];
                }
                i13 = (i11 | i12 | ((b7 & 240) >> 4)) + 1;
                z6 = false;
                if (z6) {
                }
                this.f10422l = i13;
                if (b12 == -2) {
                }
                i15 = b8 & 252;
                this.f10420j = ed0.l(j31.t(this.f10421k.C, (((i15 >> 2) | i14) + 1) * 32));
                ex0Var2.j(0);
                this.f10417f.e(18, ex0Var2);
                this.f10418g = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f10416e = eaVar.f4182e;
        eaVar.b();
        this.f10417f = z0Var.g(eaVar.f4181d, 1);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f10426p = j6;
    }

    public final boolean f(ex0 ex0Var, byte[] bArr, int i6) {
        int iMin = Math.min(ex0Var.o(), i6 - this.h);
        ex0Var.f(this.h, iMin, bArr);
        int i7 = this.h + iMin;
        this.h = i7;
        return i7 == i6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f10418g = 0;
        this.h = 0;
        this.f10419i = 0;
        this.f10426p = -9223372036854775807L;
        this.f10413b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}

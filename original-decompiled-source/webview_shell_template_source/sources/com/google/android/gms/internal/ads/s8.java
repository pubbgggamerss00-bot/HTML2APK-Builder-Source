package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s8 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final l42 f8828a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f8829b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8830c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8831d;

    /* renamed from: e, reason: collision with root package name */
    public String f8832e;

    /* renamed from: f, reason: collision with root package name */
    public s1 f8833f;

    /* renamed from: g, reason: collision with root package name */
    public int f8834g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8835i;

    /* renamed from: j, reason: collision with root package name */
    public long f8836j;

    /* renamed from: k, reason: collision with root package name */
    public w f8837k;

    /* renamed from: l, reason: collision with root package name */
    public int f8838l;

    /* renamed from: m, reason: collision with root package name */
    public long f8839m;

    public s8(String str, int i6) {
        l42 l42Var = new l42(128, new byte[128]);
        this.f8828a = l42Var;
        this.f8829b = new ex0((byte[]) l42Var.f6576d);
        this.f8834g = 0;
        this.f8839m = -9223372036854775807L;
        this.f8830c = str;
        this.f8831d = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b5  */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        int i6;
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int iW;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        y5.k(this.f8833f);
        while (ex0Var.o() > 0) {
            int i21 = this.f8834g;
            ex0 ex0Var2 = this.f8829b;
            if (i21 == 0) {
                while (true) {
                    if (ex0Var.o() <= 0) {
                        break;
                    }
                    if (this.f8835i) {
                        int iV = ex0Var.v();
                        if (iV == 119) {
                            this.f8835i = false;
                            this.f8834g = 1;
                            byte[] bArr = ex0Var2.f4416a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.h = 2;
                            break;
                        }
                        this.f8835i = iV == 11;
                    } else {
                        this.f8835i = ex0Var.v() == 11;
                    }
                }
            } else if (i21 != 1) {
                int iMin = Math.min(ex0Var.o(), this.f8838l - this.h);
                this.f8833f.e(iMin, ex0Var);
                int i22 = this.h + iMin;
                this.h = i22;
                if (i22 == this.f8838l) {
                    y5.r(this.f8839m != -9223372036854775807L);
                    this.f8833f.a(this.f8839m, 1, this.f8838l, 0, null);
                    this.f8839m += this.f8836j;
                    this.f8834g = 0;
                }
            } else {
                byte[] bArr2 = ex0Var2.f4416a;
                int iMin2 = Math.min(ex0Var.o(), 128 - this.h);
                ex0Var.f(this.h, iMin2, bArr2);
                int i23 = this.h + iMin2;
                this.h = i23;
                if (i23 == 128) {
                    l42 l42Var = this.f8828a;
                    l42Var.B(0);
                    int[] iArr = d0.f3704w;
                    int[] iArr2 = d0.f3702u;
                    int i24 = (l42Var.f6573a * 8) + l42Var.f6574b;
                    l42Var.D(40);
                    int iW2 = l42Var.w(5);
                    l42Var.B(i24);
                    if (iW2 > 10) {
                        l42Var.D(16);
                        int iW3 = l42Var.w(2);
                        char c7 = iW3 != 0 ? iW3 != 1 ? iW3 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                        l42Var.D(3);
                        int iW4 = l42Var.w(11) + 1;
                        int iW5 = l42Var.w(2);
                        if (iW5 == 3) {
                            i11 = d0.f3703v[l42Var.w(2)];
                            iW = 3;
                            i12 = 6;
                        } else {
                            iW = l42Var.w(2);
                            int i25 = d0.f3701t[iW];
                            i11 = iArr2[iW5];
                            i12 = i25;
                        }
                        i10 = iW4 + iW4;
                        int i26 = (i10 * i11) / (i12 * 32);
                        int iW6 = l42Var.w(3);
                        boolean zG = l42Var.G();
                        i8 = iArr[iW6] + (zG ? 1 : 0);
                        l42Var.D(10);
                        if (l42Var.G()) {
                            l42Var.D(8);
                        }
                        if (iW6 == 0) {
                            l42Var.D(5);
                            if (l42Var.G()) {
                                l42Var.D(8);
                            }
                            i13 = 0;
                            iW6 = 0;
                        } else {
                            i13 = iW6;
                        }
                        if (c7 == 1) {
                            if (l42Var.G()) {
                                l42Var.D(16);
                            }
                            c7 = 1;
                        }
                        if (l42Var.G()) {
                            if (i13 > 2) {
                                l42Var.D(2);
                            }
                            if ((i13 & 1) == 0 || i13 <= 2) {
                                i17 = 6;
                            } else {
                                i17 = 6;
                                l42Var.D(6);
                            }
                            if ((i13 & 4) != 0) {
                                l42Var.D(i17);
                            }
                            if (zG && l42Var.G()) {
                                l42Var.D(5);
                            }
                            if (c7 == 0) {
                                if (l42Var.G()) {
                                    i18 = 6;
                                    l42Var.D(6);
                                } else {
                                    i18 = 6;
                                }
                                if (i13 == 0 && l42Var.G()) {
                                    l42Var.D(i18);
                                }
                                if (l42Var.G()) {
                                    l42Var.D(i18);
                                }
                                int iW7 = l42Var.w(2);
                                if (iW7 == 1) {
                                    l42Var.D(5);
                                    i19 = 2;
                                } else {
                                    if (iW7 == 2) {
                                        l42Var.D(12);
                                    } else if (iW7 == 3) {
                                        int iW8 = l42Var.w(5);
                                        if (l42Var.G()) {
                                            l42Var.D(5);
                                            if (l42Var.G()) {
                                                i20 = 4;
                                                l42Var.D(4);
                                            } else {
                                                i20 = 4;
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                l42Var.D(i20);
                                            }
                                            if (l42Var.G()) {
                                                if (l42Var.G()) {
                                                    l42Var.D(i20);
                                                }
                                                if (l42Var.G()) {
                                                    l42Var.D(i20);
                                                }
                                            }
                                        }
                                        if (l42Var.G()) {
                                            l42Var.D(5);
                                            if (l42Var.G()) {
                                                l42Var.D(7);
                                                if (l42Var.G()) {
                                                    l42Var.D(8);
                                                    i19 = 2;
                                                } else {
                                                    i19 = 2;
                                                }
                                                l42Var.D((iW8 + i19) * 8);
                                                l42Var.y();
                                            }
                                        }
                                    }
                                    i19 = 2;
                                }
                                if (i13 < i19) {
                                    if (l42Var.G()) {
                                        l42Var.D(14);
                                    }
                                    if (iW6 == 0 && l42Var.G()) {
                                        l42Var.D(14);
                                    }
                                }
                                if (!l42Var.G()) {
                                    i14 = iW;
                                    c7 = 0;
                                } else if (iW == 0) {
                                    l42Var.D(5);
                                    i14 = 0;
                                    c7 = 0;
                                } else {
                                    for (int i27 = 0; i27 < i12; i27++) {
                                        if (l42Var.G()) {
                                            l42Var.D(5);
                                        }
                                    }
                                    i14 = iW;
                                    c7 = 0;
                                }
                            }
                            if (l42Var.G()) {
                            }
                            if (c7 == 0) {
                                l42Var.C();
                            }
                            if (c7 == 2) {
                                i15 = 6;
                                if (!l42Var.G()) {
                                    i9 = i12 * 256;
                                    i6 = i26;
                                }
                            }
                        } else {
                            i14 = iW;
                            if (l42Var.G()) {
                                l42Var.D(5);
                                if (i13 == 2) {
                                    l42Var.D(4);
                                    i13 = 2;
                                }
                                if (i13 >= 6) {
                                    l42Var.D(2);
                                }
                                if (l42Var.G()) {
                                    i16 = 8;
                                    l42Var.D(8);
                                } else {
                                    i16 = 8;
                                }
                                if (i13 == 0 && l42Var.G()) {
                                    l42Var.D(i16);
                                }
                                if (iW5 < 3) {
                                    l42Var.C();
                                }
                            }
                            if (c7 == 0 && i14 != 3) {
                                l42Var.C();
                            }
                            if (c7 == 2 || !(i14 == 3 || l42Var.G())) {
                                i15 = 6;
                            } else {
                                i15 = 6;
                                l42Var.D(6);
                            }
                            str = (!l42Var.G() && l42Var.w(i15) == 1 && l42Var.w(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                            i9 = i12 * 256;
                            i6 = i26;
                        }
                    } else {
                        l42Var.D(32);
                        int iW9 = l42Var.w(2);
                        String str2 = iW9 == 3 ? null : "audio/ac3";
                        int iW10 = l42Var.w(6);
                        i6 = d0.f3705x[iW10 / 2] * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                        int i28 = d0.i(iW9, iW10);
                        l42Var.D(8);
                        int iW11 = l42Var.w(3);
                        if ((iW11 & 1) == 0 || iW11 == 1) {
                            i7 = 2;
                        } else {
                            i7 = 2;
                            l42Var.D(2);
                        }
                        if ((iW11 & 4) != 0) {
                            l42Var.D(i7);
                        }
                        if (iW11 == i7) {
                            l42Var.D(i7);
                        }
                        int i29 = iW9 < 3 ? iArr2[iW9] : -1;
                        i8 = iArr[iW11] + (l42Var.G() ? 1 : 0);
                        i9 = 1536;
                        str = str2;
                        i10 = i28;
                        i11 = i29;
                    }
                    w wVar = this.f8837k;
                    if (wVar == null || i8 != wVar.B || i11 != wVar.C || !Objects.equals(str, wVar.f9978m)) {
                        tk2 tk2Var = new tk2();
                        tk2Var.f9320a = this.f8832e;
                        tk2Var.c(str);
                        tk2Var.A = i8;
                        tk2Var.B = i11;
                        tk2Var.f9323d = this.f8830c;
                        tk2Var.f9325f = this.f8831d;
                        tk2Var.h = i6;
                        if ("audio/ac3".equals(str)) {
                            tk2Var.f9326g = i6;
                        }
                        w wVar2 = new w(tk2Var);
                        this.f8837k = wVar2;
                        this.f8833f.b(wVar2);
                    }
                    this.f8838l = i10;
                    this.f8836j = (i9 * 1000000) / this.f8837k.C;
                    ex0Var2.j(0);
                    this.f8833f.e(128, ex0Var2);
                    this.f8834g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f8832e = eaVar.f4182e;
        eaVar.b();
        this.f8833f = z0Var.g(eaVar.f4181d, 1);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f8839m = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f8834g = 0;
        this.h = 0;
        this.f8835i = false;
        this.f8839m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}

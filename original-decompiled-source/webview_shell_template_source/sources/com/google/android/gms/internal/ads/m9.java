package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m9 implements z8 {

    /* renamed from: e, reason: collision with root package name */
    public String f6982e;

    /* renamed from: f, reason: collision with root package name */
    public s1 f6983f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6985i;

    /* renamed from: k, reason: collision with root package name */
    public int f6987k;

    /* renamed from: l, reason: collision with root package name */
    public int f6988l;

    /* renamed from: n, reason: collision with root package name */
    public int f6990n;

    /* renamed from: o, reason: collision with root package name */
    public int f6991o;
    public int s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6996u;

    /* renamed from: d, reason: collision with root package name */
    public int f6981d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f6978a = new ex0(2, new byte[15]);

    /* renamed from: b, reason: collision with root package name */
    public final l42 f6979b = new l42();

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f6980c = new ex0();

    /* renamed from: p, reason: collision with root package name */
    public final n9 f6992p = new n9();

    /* renamed from: q, reason: collision with root package name */
    public int f6993q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f6994r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f6995t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6986j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6989m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f6984g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0486 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) throws rn {
        int i6;
        int i7;
        int iW;
        int iW2;
        int i8;
        char c7;
        byte[] bArr;
        long j6;
        long j7;
        char c8;
        int iW3;
        char c9;
        long j8;
        y5.k(this.f6983f);
        while (ex0Var.o() > 0) {
            int i9 = this.f6981d;
            int i10 = 8;
            int i11 = 1;
            if (i9 != 0) {
                ex0 ex0Var2 = this.f6980c;
                n9 n9Var = this.f6992p;
                if (i9 != 1) {
                    int i12 = n9Var.f7343a;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = ex0Var.f4417b;
                        int iMin = Math.min(ex0Var.o(), ex0Var2.o());
                        ex0Var.f(ex0Var2.f4417b, iMin, ex0Var2.f4416a);
                        ex0Var2.k(iMin);
                        ex0Var.j(i13);
                    }
                    int iMin2 = Math.min(ex0Var.o(), n9Var.f7345c - this.f6990n);
                    this.f6983f.e(iMin2, ex0Var);
                    int i14 = this.f6990n + iMin2;
                    this.f6990n = i14;
                    if (i14 != n9Var.f7345c) {
                        continue;
                    } else {
                        int i15 = n9Var.f7343a;
                        if (i15 == 1) {
                            byte[] bArr2 = ex0Var2.f4416a;
                            l42 l42Var = new l42(bArr2.length, bArr2);
                            int iW4 = l42Var.w(8);
                            char c10 = 5;
                            int iW5 = l42Var.w(5);
                            if (iW5 != 31) {
                                switch (iW5) {
                                    case 0:
                                        iW2 = 96000;
                                        break;
                                    case 1:
                                        iW2 = 88200;
                                        break;
                                    case 2:
                                        iW2 = 64000;
                                        break;
                                    case 3:
                                        iW2 = 48000;
                                        break;
                                    case 4:
                                        iW2 = 44100;
                                        break;
                                    case 5:
                                        iW2 = 32000;
                                        break;
                                    case 6:
                                        iW2 = 24000;
                                        break;
                                    case 7:
                                        iW2 = 22050;
                                        break;
                                    case 8:
                                        iW2 = 16000;
                                        break;
                                    case 9:
                                        iW2 = 12000;
                                        break;
                                    case 10:
                                        iW2 = 11025;
                                        break;
                                    case 11:
                                        iW2 = 8000;
                                        break;
                                    case 12:
                                        iW2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw rn.b("Unsupported sampling rate index " + iW5);
                                    case 15:
                                        iW2 = 57600;
                                        break;
                                    case 16:
                                        iW2 = 51200;
                                        break;
                                    case 17:
                                        iW2 = 40000;
                                        break;
                                    case 18:
                                        iW2 = 38400;
                                        break;
                                    case 19:
                                        iW2 = 34150;
                                        break;
                                    case 20:
                                        iW2 = 28800;
                                        break;
                                    case dn.zzm /* 21 */:
                                        iW2 = 25600;
                                        break;
                                    case 22:
                                        iW2 = 20000;
                                        break;
                                    case 23:
                                        iW2 = 19200;
                                        break;
                                    case 24:
                                        iW2 = 17075;
                                        break;
                                    case 25:
                                        iW2 = 14400;
                                        break;
                                    case 26:
                                        iW2 = 12800;
                                        break;
                                    case 27:
                                        iW2 = 9600;
                                        break;
                                }
                            } else {
                                iW2 = l42Var.w(24);
                            }
                            int iW6 = l42Var.w(3);
                            int i16 = 4;
                            if (iW6 == 0) {
                                i8 = 768;
                            } else if (iW6 == 1) {
                                i8 = 1024;
                            } else if (iW6 == 2 || iW6 == 3) {
                                i8 = 2048;
                            } else {
                                if (iW6 != 4) {
                                    throw rn.b("Unsupported coreSbrFrameLengthIndex " + iW6);
                                }
                                i8 = 4096;
                            }
                            int i17 = i8;
                            if (iW6 == 0 || iW6 == 1) {
                                c7 = 0;
                            } else if (iW6 == 2) {
                                c7 = 2;
                            } else if (iW6 == 3) {
                                c7 = 3;
                            } else {
                                if (iW6 != 4) {
                                    throw rn.b("Unsupported coreSbrFrameLengthIndex " + iW6);
                                }
                                c7 = 1;
                            }
                            l42Var.D(2);
                            o9.c(l42Var);
                            int iW7 = l42Var.w(5);
                            int i18 = 0;
                            int iA = 0;
                            while (true) {
                                int i19 = i11;
                                int i20 = 16;
                                if (i18 < iW7 + 1) {
                                    int iW8 = l42Var.w(3);
                                    iA = o9.a(l42Var, 5, 8, 16) + 1 + iA;
                                    if ((iW8 == 0 || iW8 == 2) && l42Var.G()) {
                                        o9.c(l42Var);
                                    }
                                    i18++;
                                    i11 = i19;
                                } else {
                                    int iA2 = o9.a(l42Var, 4, 8, 16) + 1;
                                    l42Var.C();
                                    int i21 = 0;
                                    while (true) {
                                        double d7 = 2.0d;
                                        if (i21 < iA2) {
                                            int iW9 = l42Var.w(2);
                                            if (iW9 == 0) {
                                                c8 = c10;
                                                l42Var.D(3);
                                                if (l42Var.G()) {
                                                    l42Var.D(13);
                                                }
                                                if (c7 > 0) {
                                                    o9.b(l42Var);
                                                }
                                            } else if (iW9 != i19) {
                                                if (iW9 == 3) {
                                                    o9.a(l42Var, i16, i10, i20);
                                                    int iA3 = o9.a(l42Var, i16, i10, i20);
                                                    if (l42Var.G()) {
                                                        o9.a(l42Var, i10, i20, 0);
                                                    }
                                                    l42Var.C();
                                                    if (iA3 > 0) {
                                                        l42Var.D(iA3 * 8);
                                                    }
                                                }
                                                c8 = 5;
                                            } else {
                                                l42Var.D(3);
                                                boolean zG = l42Var.G();
                                                if (zG) {
                                                    l42Var.D(13);
                                                }
                                                if (zG) {
                                                    l42Var.C();
                                                }
                                                if (c7 > 0) {
                                                    o9.b(l42Var);
                                                    iW3 = l42Var.w(2);
                                                    c9 = c7;
                                                } else {
                                                    iW3 = 0;
                                                    c9 = 0;
                                                }
                                                if (iW3 > 0) {
                                                    l42Var.D(6);
                                                    int iW10 = l42Var.w(2);
                                                    l42Var.D(i16);
                                                    c8 = 5;
                                                    if (l42Var.G()) {
                                                        l42Var.D(5);
                                                    }
                                                    if (iW3 == 2 || iW3 == 3) {
                                                        l42Var.D(6);
                                                    }
                                                    if (iW10 == 2) {
                                                        l42Var.C();
                                                    }
                                                } else {
                                                    c8 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA - 1) / Math.log(2.0d))) + 1;
                                                int iW11 = l42Var.w(2);
                                                if (iW11 > 0 && l42Var.G()) {
                                                    l42Var.D(iFloor);
                                                }
                                                if (l42Var.G()) {
                                                    l42Var.D(iFloor);
                                                }
                                                if (c9 == 0 && iW11 == 0) {
                                                    l42Var.C();
                                                }
                                            }
                                            i21++;
                                            c10 = c8;
                                            i10 = 8;
                                            i20 = 16;
                                            i16 = 4;
                                            i19 = 1;
                                        } else {
                                            if (l42Var.G()) {
                                                int i22 = 8;
                                                int iA4 = o9.a(l42Var, 2, 4, 8) + 1;
                                                int i23 = 0;
                                                bArr = null;
                                                while (i23 < iA4) {
                                                    int iA5 = o9.a(l42Var, 4, i22, 16);
                                                    int iA6 = o9.a(l42Var, 4, i22, 16);
                                                    if (iA5 == 7) {
                                                        int iW12 = l42Var.w(4) + 1;
                                                        l42Var.D(4);
                                                        byte[] bArr3 = new byte[iW12];
                                                        for (int i24 = 0; i24 < iW12; i24++) {
                                                            bArr3[i24] = (byte) l42Var.w(i22);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        l42Var.D(iA6 * i22);
                                                    }
                                                    i23++;
                                                    i22 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iW2) {
                                                case 14700:
                                                case 16000:
                                                    d7 = 3.0d;
                                                    this.f6993q = (int) (iW2 * d7);
                                                    this.f6994r = (int) (i17 * d7);
                                                    j6 = this.f6995t;
                                                    j7 = n9Var.f7344b;
                                                    if (j6 != j7) {
                                                        this.f6995t = j7;
                                                        String strConcat = iW4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iW4))) : "mhm1";
                                                        cp1 cp1VarO = (bArr == null || bArr.length <= 0) ? null : bo1.o(j31.f5919f, bArr);
                                                        tk2 tk2Var = new tk2();
                                                        tk2Var.f9320a = this.f6982e;
                                                        tk2Var.c("audio/mhm1");
                                                        tk2Var.B = this.f6993q;
                                                        tk2Var.f9327i = strConcat;
                                                        tk2Var.f9333o = cp1VarO;
                                                        this.f6983f.b(new w(tk2Var));
                                                    }
                                                    i7 = 1;
                                                    this.f6996u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f6993q = (int) (iW2 * d7);
                                                    this.f6994r = (int) (i17 * d7);
                                                    j6 = this.f6995t;
                                                    j7 = n9Var.f7344b;
                                                    if (j6 != j7) {
                                                    }
                                                    i7 = 1;
                                                    this.f6996u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d7 = 1.5d;
                                                    this.f6993q = (int) (iW2 * d7);
                                                    this.f6994r = (int) (i17 * d7);
                                                    j6 = this.f6995t;
                                                    j7 = n9Var.f7344b;
                                                    if (j6 != j7) {
                                                    }
                                                    i7 = 1;
                                                    this.f6996u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d7 = 1.0d;
                                                    this.f6993q = (int) (iW2 * d7);
                                                    this.f6994r = (int) (i17 * d7);
                                                    j6 = this.f6995t;
                                                    j7 = n9Var.f7344b;
                                                    if (j6 != j7) {
                                                    }
                                                    i7 = 1;
                                                    this.f6996u = true;
                                                    break;
                                                default:
                                                    throw rn.b("Unsupported sampling rate " + iW2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr4 = ex0Var2.f4416a;
                                l42 l42Var2 = new l42(bArr4.length, bArr4);
                                if (l42Var2.G()) {
                                    l42Var2.D(2);
                                    iW = l42Var2.w(13);
                                } else {
                                    iW = 0;
                                }
                                this.s = iW;
                            } else if (i15 == 2) {
                                if (this.f6996u) {
                                    this.f6986j = false;
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                int i25 = this.f6994r - this.s;
                                double d8 = this.f6993q;
                                long jRound = Math.round(this.f6984g);
                                if (this.f6985i) {
                                    this.f6985i = false;
                                    this.f6984g = this.h;
                                } else {
                                    this.f6984g += (i25 * 1000000.0d) / d8;
                                }
                                this.f6983f.a(jRound, i6, this.f6991o, 0, null);
                                this.f6996u = false;
                                this.s = 0;
                                this.f6991o = 0;
                            }
                            i7 = 1;
                        }
                        this.f6981d = i7;
                    }
                } else {
                    int iO = ex0Var.o();
                    ex0 ex0Var3 = this.f6978a;
                    int iMin3 = Math.min(iO, ex0Var3.o());
                    ex0Var.f(ex0Var3.f4417b, iMin3, ex0Var3.f4416a);
                    ex0Var3.k(iMin3);
                    if (ex0Var3.o() == 0) {
                        int i26 = ex0Var3.f4418c;
                        byte[] bArr5 = ex0Var3.f4416a;
                        l42 l42Var3 = this.f6979b;
                        l42Var3.f6576d = bArr5;
                        l42Var3.f6573a = 0;
                        l42Var3.f6574b = 0;
                        l42Var3.f6575c = i26;
                        l42Var3.u();
                        int iA7 = o9.a(l42Var3, 3, 8, 8);
                        n9Var.f7343a = iA7;
                        if (iA7 != -1) {
                            y5.n(Math.max(Math.max(2, 8), 32) <= 63);
                            kq1.a(kq1.a(3L, 255L), 4294967296L);
                            if (l42Var3.t() < 2) {
                                j8 = -1;
                                n9Var.f7344b = j8;
                                if (j8 != -1) {
                                    if (j8 > 16) {
                                        throw rn.b("Contains sub-stream with an invalid packet label " + j8);
                                    }
                                    if (j8 == 0) {
                                        int i27 = n9Var.f7343a;
                                        if (i27 == 1) {
                                            throw rn.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i27 == 2) {
                                            throw rn.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i27 == 17) {
                                            throw rn.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int iA8 = o9.a(l42Var3, 11, 24, 24);
                                    n9Var.f7345c = iA8;
                                    if (iA8 != -1) {
                                        this.f6990n = 0;
                                        this.f6991o = iA8 + i26 + this.f6991o;
                                        ex0Var3.j(0);
                                        this.f6983f.e(ex0Var3.f4418c, ex0Var3);
                                        ex0Var3.g(2);
                                        ex0Var2.g(n9Var.f7345c);
                                        this.f6989m = true;
                                        this.f6981d = 2;
                                    }
                                }
                            } else {
                                long jX = l42Var3.x(2);
                                if (jX == 3) {
                                    if (l42Var3.t() >= 8) {
                                        long jX2 = l42Var3.x(8);
                                        long j9 = jX2 + 3;
                                        if (jX2 != 255) {
                                            jX = j9;
                                        } else if (l42Var3.t() >= 32) {
                                            jX = l42Var3.x(32) + j9;
                                        }
                                    }
                                    j8 = -1;
                                    n9Var.f7344b = j8;
                                    if (j8 != -1) {
                                    }
                                }
                                j8 = jX;
                                n9Var.f7344b = j8;
                                if (j8 != -1) {
                                }
                            }
                        }
                        int i28 = ex0Var3.f4418c;
                        if (i28 < 15) {
                            ex0Var3.i(i28 + 1);
                        }
                    }
                    this.f6989m = false;
                }
            } else {
                int i29 = this.f6987k;
                if ((i29 & 2) == 0) {
                    ex0Var.j(ex0Var.f4418c);
                } else {
                    if ((i29 & 4) == 0) {
                        while (ex0Var.o() > 0) {
                            int i30 = this.f6988l << 8;
                            this.f6988l = i30;
                            int iV = i30 | ex0Var.v();
                            this.f6988l = iV;
                            if ((iV & 16777215) == 12583333) {
                                ex0Var.j(ex0Var.f4417b - 3);
                                this.f6988l = 0;
                            }
                        }
                    }
                    this.f6981d = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f6982e = eaVar.f4182e;
        eaVar.b();
        this.f6983f = z0Var.g(eaVar.f4181d, 1);
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f6987k = i6;
        if (!this.f6986j && (this.f6991o != 0 || !this.f6989m)) {
            this.f6985i = true;
        }
        if (j6 != -9223372036854775807L) {
            double d7 = j6;
            if (this.f6985i) {
                this.h = d7;
            } else {
                this.f6984g = d7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f6981d = 0;
        this.f6988l = 0;
        this.f6978a.g(2);
        this.f6990n = 0;
        this.f6991o = 0;
        this.f6993q = -2147483647;
        this.f6994r = -1;
        this.s = 0;
        this.f6995t = -1L;
        this.f6996u = false;
        this.f6985i = false;
        this.f6989m = true;
        this.f6986j = true;
        this.f6984g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}

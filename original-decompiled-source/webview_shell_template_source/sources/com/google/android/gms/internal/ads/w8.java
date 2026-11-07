package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w8 implements z8 {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f10099w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10100a;

    /* renamed from: d, reason: collision with root package name */
    public final String f10103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10104e;

    /* renamed from: f, reason: collision with root package name */
    public String f10105f;

    /* renamed from: g, reason: collision with root package name */
    public s1 f10106g;
    public s1 h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10110l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10111m;

    /* renamed from: p, reason: collision with root package name */
    public int f10114p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10115q;
    public int s;

    /* renamed from: u, reason: collision with root package name */
    public s1 f10118u;

    /* renamed from: v, reason: collision with root package name */
    public long f10119v;

    /* renamed from: b, reason: collision with root package name */
    public final l42 f10101b = new l42(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f10102c = new ex0(Arrays.copyOf(f10099w, 10));

    /* renamed from: i, reason: collision with root package name */
    public int f10107i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f10108j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10109k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f10112n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f10113o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f10116r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f10117t = -9223372036854775807L;

    public w8(String str, int i6, boolean z6) {
        this.f10100a = z6;
        this.f10103d = str;
        this.f10104e = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x029b, code lost:
    
        r24.f10114p = (r8 & 8) >> 3;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a7, code lost:
    
        if (r4 == ((r8 & 1) ^ 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a9, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ab, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ac, code lost:
    
        r24.f10110l = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b0, code lost:
    
        if (r24.f10111m != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b2, code lost:
    
        r24.f10107i = r4;
        r24.f10108j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b8, code lost:
    
        r24.f10107i = r17;
        r24.f10108j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bf, code lost:
    
        r25.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021d, code lost:
    
        r23 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ex0 ex0Var) {
        char c7;
        int i6;
        int i7;
        char c8;
        char c9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.f10106g.getClass();
        int i14 = j31.f5914a;
        while (ex0Var.o() > 0) {
            int i15 = this.f10107i;
            ex0 ex0Var2 = this.f10102c;
            int i16 = 4;
            int i17 = 3;
            char c10 = 65535;
            int i18 = 0;
            l42 l42Var = this.f10101b;
            int i19 = 1;
            if (i15 == 0) {
                byte[] bArr = ex0Var.f4416a;
                int i20 = ex0Var.f4417b;
                int i21 = ex0Var.f4418c;
                while (true) {
                    if (i20 >= i21) {
                        ex0Var.j(i20);
                        break;
                    }
                    int i22 = i20 + 1;
                    int i23 = i17;
                    byte b7 = bArr[i20];
                    int i24 = b7 & 255;
                    if (this.f10109k != 512 || (((((byte) i24) & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) != 65520) {
                        c7 = c10;
                    } else {
                        if (this.f10111m) {
                            break;
                        }
                        int i25 = i20 - 1;
                        ex0Var.j(i20);
                        byte[] bArr2 = (byte[]) l42Var.f6576d;
                        if (ex0Var.o() < i19) {
                            i6 = i19;
                        } else {
                            ex0Var.f(i18, i19, bArr2);
                            l42Var.B(i16);
                            int iW = l42Var.w(i19);
                            int i26 = this.f10112n;
                            if (i26 == -1 || iW == i26) {
                                if (this.f10113o != -1) {
                                    byte[] bArr3 = (byte[]) l42Var.f6576d;
                                    if (ex0Var.o() < i19) {
                                        break;
                                    }
                                    ex0Var.f(i18, i19, bArr3);
                                    l42Var.B(2);
                                    i11 = 4;
                                    i10 = i19;
                                    if (l42Var.w(4) == this.f10113o) {
                                        ex0Var.j(i22);
                                    } else {
                                        i6 = i10;
                                    }
                                } else {
                                    i10 = i19;
                                    i11 = 4;
                                }
                                byte[] bArr4 = (byte[]) l42Var.f6576d;
                                if (ex0Var.o() < i11) {
                                    break;
                                }
                                ex0Var.f(i18, i11, bArr4);
                                l42Var.B(14);
                                int iW2 = l42Var.w(13);
                                if (iW2 >= 7) {
                                    byte[] bArr5 = ex0Var.f4416a;
                                    int i27 = ex0Var.f4418c;
                                    int i28 = i25 + iW2;
                                    if (i28 >= i27) {
                                        break;
                                    }
                                    byte b8 = bArr5[i28];
                                    c7 = 65535;
                                    if (b8 != -1) {
                                        if (b8 == 73 && ((i12 = i28 + 1) == i27 || (bArr5[i12] == 68 && ((i13 = i28 + 2) == i27 || bArr5[i13] == 51)))) {
                                            break;
                                        }
                                    } else {
                                        int i29 = i28 + 1;
                                        if (i29 == i27) {
                                            break;
                                        }
                                        byte b9 = bArr5[i29];
                                        if ((((b9 & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520 && ((b9 & 8) >> 3) == iW) {
                                            break;
                                        }
                                    }
                                } else {
                                    c7 = 65535;
                                }
                                i6 = i10;
                                int i30 = this.f10109k;
                                i7 = i24 | i30;
                                if (i7 == 329) {
                                    c8 = 256;
                                    c9 = 2;
                                    i17 = 3;
                                    i8 = 0;
                                    i9 = 768;
                                } else if (i7 == 511) {
                                    c8 = 256;
                                    c9 = 2;
                                    i17 = 3;
                                    i8 = 0;
                                    i9 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                } else if (i7 == 836) {
                                    c8 = 256;
                                    c9 = 2;
                                    i17 = 3;
                                    i8 = 0;
                                    i9 = 1024;
                                } else {
                                    if (i7 == 1075) {
                                        this.f10107i = 2;
                                        this.f10108j = 3;
                                        this.s = 0;
                                        ex0Var2.j(0);
                                        ex0Var.j(i22);
                                        break;
                                    }
                                    c8 = 256;
                                    if (i30 != 256) {
                                        this.f10109k = 256;
                                        i19 = i6;
                                        c10 = c7;
                                        i16 = 4;
                                        i17 = 3;
                                        i18 = 0;
                                    } else {
                                        c9 = 2;
                                        i17 = 3;
                                        i8 = 0;
                                        char c11 = c7;
                                        i18 = i8;
                                        c10 = c11;
                                        i20 = i22;
                                        i19 = i6;
                                        i16 = 4;
                                    }
                                }
                                this.f10109k = i9;
                                char c112 = c7;
                                i18 = i8;
                                c10 = c112;
                                i20 = i22;
                                i19 = i6;
                                i16 = 4;
                            } else {
                                c7 = 65535;
                            }
                        }
                        c7 = 65535;
                        int i302 = this.f10109k;
                        i7 = i24 | i302;
                        if (i7 == 329) {
                        }
                        this.f10109k = i9;
                        char c1122 = c7;
                        i18 = i8;
                        c10 = c1122;
                        i20 = i22;
                        i19 = i6;
                        i16 = 4;
                    }
                    i6 = i19;
                    int i3022 = this.f10109k;
                    i7 = i24 | i3022;
                    if (i7 == 329) {
                    }
                    this.f10109k = i9;
                    char c11222 = c7;
                    i18 = i8;
                    c10 = c11222;
                    i20 = i22;
                    i19 = i6;
                    i16 = 4;
                }
            } else if (i15 != 1) {
                if (i15 == 2) {
                    byte[] bArr6 = ex0Var2.f4416a;
                    int iMin = Math.min(ex0Var.o(), 10 - this.f10108j);
                    ex0Var.f(this.f10108j, iMin, bArr6);
                    int i31 = this.f10108j + iMin;
                    this.f10108j = i31;
                    if (i31 == 10) {
                        this.h.e(10, ex0Var2);
                        ex0Var2.j(6);
                        s1 s1Var = this.h;
                        int iU = ex0Var2.u() + 10;
                        this.f10107i = 4;
                        this.f10108j = 10;
                        this.f10118u = s1Var;
                        this.f10119v = 0L;
                        this.s = iU;
                    }
                } else if (i15 != 3) {
                    int iMin2 = Math.min(ex0Var.o(), this.s - this.f10108j);
                    this.f10118u.e(iMin2, ex0Var);
                    int i32 = this.f10108j + iMin2;
                    this.f10108j = i32;
                    if (i32 == this.s) {
                        y5.r(this.f10117t != -9223372036854775807L);
                        this.f10118u.a(this.f10117t, 1, this.s, 0, null);
                        this.f10117t += this.f10119v;
                        this.f10107i = 0;
                        this.f10108j = 0;
                        this.f10109k = 256;
                    }
                } else {
                    int i33 = true != this.f10110l ? 5 : 7;
                    byte[] bArr7 = (byte[]) l42Var.f6576d;
                    int iMin3 = Math.min(ex0Var.o(), i33 - this.f10108j);
                    ex0Var.f(this.f10108j, iMin3, bArr7);
                    int i34 = this.f10108j + iMin3;
                    this.f10108j = i34;
                    if (i34 == i33) {
                        l42Var.B(0);
                        if (this.f10115q) {
                            l42Var.D(10);
                        } else {
                            int iW3 = l42Var.w(2) + 1;
                            if (iW3 != 2) {
                                qs0.f("AdtsReader", "Detected audio object type: " + iW3 + ", but assuming AAC LC.");
                            }
                            l42Var.D(5);
                            int iW4 = l42Var.w(3);
                            int i35 = this.f10113o;
                            byte[] bArr8 = {(byte) (((i35 >> 1) & 7) | 16), (byte) (((iW4 << 3) & 120) | ((i35 << 7) & 128))};
                            b0 b0VarA = c0.a(new l42(2, bArr8), false);
                            tk2 tk2Var = new tk2();
                            tk2Var.f9320a = this.f10105f;
                            tk2Var.c("audio/mp4a-latm");
                            tk2Var.f9327i = b0VarA.f2882c;
                            tk2Var.A = b0VarA.f2881b;
                            tk2Var.B = b0VarA.f2880a;
                            tk2Var.f9333o = Collections.singletonList(bArr8);
                            tk2Var.f9323d = this.f10103d;
                            tk2Var.f9325f = this.f10104e;
                            w wVar = new w(tk2Var);
                            this.f10116r = 1024000000 / wVar.C;
                            this.f10106g.b(wVar);
                            this.f10115q = true;
                        }
                        l42Var.D(4);
                        int iW5 = l42Var.w(13);
                        int i36 = iW5 - 7;
                        if (this.f10110l) {
                            i36 = iW5 - 9;
                        }
                        s1 s1Var2 = this.f10106g;
                        long j6 = this.f10116r;
                        this.f10107i = 4;
                        this.f10108j = 0;
                        this.f10118u = s1Var2;
                        this.f10119v = j6;
                        this.s = i36;
                    }
                }
            } else if (ex0Var.o() != 0) {
                ((byte[]) l42Var.f6576d)[0] = ex0Var.f4416a[ex0Var.f4417b];
                l42Var.B(2);
                int iW6 = l42Var.w(4);
                int i37 = this.f10113o;
                if (i37 == -1 || iW6 == i37) {
                    if (!this.f10111m) {
                        this.f10111m = true;
                        this.f10112n = this.f10114p;
                        this.f10113o = iW6;
                    }
                    this.f10107i = 3;
                    this.f10108j = 0;
                } else {
                    this.f10111m = false;
                    this.f10107i = 0;
                    this.f10108j = 0;
                    this.f10109k = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        eaVar.a();
        eaVar.b();
        this.f10105f = eaVar.f4182e;
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 1);
        this.f10106g = s1VarG;
        this.f10118u = s1VarG;
        if (!this.f10100a) {
            this.h = new t0();
            return;
        }
        eaVar.a();
        eaVar.b();
        s1 s1VarG2 = z0Var.g(eaVar.f4181d, 5);
        this.h = s1VarG2;
        tk2 tk2Var = new tk2();
        eaVar.b();
        tk2Var.f9320a = eaVar.f4182e;
        tk2Var.c("application/id3");
        s1VarG2.b(new w(tk2Var));
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        this.f10117t = j6;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f10117t = -9223372036854775807L;
        this.f10111m = false;
        this.f10107i = 0;
        this.f10108j = 0;
        this.f10109k = 256;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
    }
}

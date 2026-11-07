package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y1 implements x0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f10763l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f10764m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f10765n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f10766o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10768b;

    /* renamed from: c, reason: collision with root package name */
    public long f10769c;

    /* renamed from: d, reason: collision with root package name */
    public int f10770d;

    /* renamed from: e, reason: collision with root package name */
    public int f10771e;

    /* renamed from: g, reason: collision with root package name */
    public z0 f10773g;
    public s1 h;

    /* renamed from: j, reason: collision with root package name */
    public l1 f10775j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10776k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10767a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f10772f = -1;

    /* renamed from: i, reason: collision with root package name */
    public s1 f10774i = new t0();

    static {
        int i6 = j31.f5914a;
        Charset charset = StandardCharsets.UTF_8;
        f10765n = "#!AMR\n".getBytes(charset);
        f10766o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(y0 y0Var) {
        y0Var.zzj();
        byte[] bArr = f10765n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        y0Var.h(0, length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f10768b = false;
            y0Var.b(bArr.length);
            return true;
        }
        y0Var.zzj();
        byte[] bArr3 = f10766o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        y0Var.h(0, length2, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f10768b = true;
        y0Var.b(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f10769c = 0L;
        this.f10770d = 0;
        this.f10771e = 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        return a(y0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: EOFException -> 0x00da, TryCatch #0 {EOFException -> 0x00da, blocks: (B:24:0x006d, B:26:0x0079, B:40:0x0097, B:43:0x009e, B:42:0x009b, B:50:0x00b0, B:51:0x00c8, B:52:0x00c9, B:53:0x00d9), top: B:70:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: EOFException -> 0x00da, TryCatch #0 {EOFException -> 0x00da, blocks: (B:24:0x006d, B:26:0x0079, B:40:0x0097, B:43:0x009e, B:42:0x009b, B:50:0x00b0, B:51:0x00c8, B:52:0x00c9, B:53:0x00d9), top: B:70:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        byte b7;
        char c7;
        int iD;
        y5.k(this.h);
        int i6 = j31.f5914a;
        if (y0Var.zzf() == 0 && !a(y0Var)) {
            throw rn.a(null, "Could not find AMR header.");
        }
        boolean z6 = this.f10776k;
        int[] iArr = f10763l;
        int[] iArr2 = f10764m;
        if (!z6) {
            this.f10776k = true;
            boolean z7 = this.f10768b;
            String str = true != z7 ? "audio/3gpp" : "audio/amr-wb";
            int i7 = true != z7 ? 8000 : 16000;
            int i8 = z7 ? iArr2[8] : iArr[7];
            s1 s1Var = this.f10774i;
            tk2 tk2Var = new tk2();
            tk2Var.c(str);
            tk2Var.f9331m = i8;
            tk2Var.A = 1;
            tk2Var.B = i7;
            s1Var.b(new w(tk2Var));
        }
        byte[] bArr = this.f10767a;
        int i9 = this.f10771e;
        if (i9 == 0) {
            try {
                y0Var.zzj();
                y0Var.h(0, 1, bArr);
                b7 = bArr[0];
            } catch (EOFException unused) {
            }
            if ((b7 & 131) > 0) {
                throw rn.a(null, "Invalid padding bits for frame header " + ((int) b7));
            }
            boolean z8 = this.f10768b;
            int i10 = (b7 >> 3) & 15;
            if (!z8) {
                if (!z8) {
                    if (i10 >= 12 && i10 <= 14) {
                    }
                    i9 = !z8 ? iArr2[i10] : iArr[i10];
                    this.f10770d = i9;
                    this.f10771e = i9;
                    if (this.f10772f == -1) {
                        this.f10772f = i9;
                    }
                    iD = this.f10774i.d(y0Var, i9, true);
                    if (iD == -1) {
                        c7 = 65535;
                    } else {
                        int i11 = this.f10771e - iD;
                        this.f10771e = i11;
                        if (i11 <= 0) {
                            this.f10774i.a(this.f10769c, 1, this.f10770d, 0, null);
                            this.f10769c += 20000;
                        }
                        c7 = 0;
                    }
                }
                throw rn.a(null, "Illegal AMR " + (true != z8 ? "NB" : "WB") + " frame type " + i10);
            }
            if (i10 >= 10 && i10 <= 13) {
            }
            i9 = !z8 ? iArr2[i10] : iArr[i10];
            this.f10770d = i9;
            this.f10771e = i9;
            if (this.f10772f == -1) {
            }
            iD = this.f10774i.d(y0Var, i9, true);
            if (iD == -1) {
            }
        } else {
            iD = this.f10774i.d(y0Var, i9, true);
            if (iD == -1) {
            }
        }
        if (this.f10775j == null) {
            l1 l1Var = new l1(-9223372036854775807L, 0L);
            this.f10775j = l1Var;
            this.f10773g.f(l1Var);
        }
        return c7 == 65535 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f10773g = z0Var;
        s1 s1VarG = z0Var.g(0, 1);
        this.h = s1VarG;
        this.f10774i = s1VarG;
        z0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}

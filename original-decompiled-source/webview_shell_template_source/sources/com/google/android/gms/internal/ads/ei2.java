package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ei2 implements nh2, z0, qk2 {

    /* renamed from: f0, reason: collision with root package name */
    public static final Map f4304f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final w f4305g0;
    public final tg2 B;
    public final Handler F;
    public mh2 G;
    public k3 H;
    public li2[] I;
    public di2[] J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public h20 O;
    public m1 P;
    public long Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public long Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4306a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f4307b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4308c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4309d0;

    /* renamed from: e0, reason: collision with root package name */
    public final u1 f4310e0;
    public final Uri s;

    /* renamed from: t, reason: collision with root package name */
    public final lo1 f4311t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f4312u;

    /* renamed from: v, reason: collision with root package name */
    public final sh2 f4313v;

    /* renamed from: w, reason: collision with root package name */
    public final cf2 f4314w;

    /* renamed from: x, reason: collision with root package name */
    public final hi2 f4315x;

    /* renamed from: y, reason: collision with root package name */
    public final long f4316y;

    /* renamed from: z, reason: collision with root package name */
    public final long f4317z;
    public final sk2 A = new sk2();
    public final am0 C = new am0();
    public final b D = new b(21, this);
    public final p E = new p(17, this);

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f4304f0 = Collections.unmodifiableMap(map);
        tk2 tk2Var = new tk2();
        tk2Var.f9320a = "icy";
        tk2Var.c("application/x-icy");
        f4305g0 = new w(tk2Var);
    }

    public ei2(Uri uri, lo1 lo1Var, tg2 tg2Var, d0 d0Var, cf2 cf2Var, sh2 sh2Var, hi2 hi2Var, u1 u1Var, int i6, long j6) {
        this.s = uri;
        this.f4311t = lo1Var;
        this.f4312u = d0Var;
        this.f4314w = cf2Var;
        this.f4313v = sh2Var;
        this.f4315x = hi2Var;
        this.f4310e0 = u1Var;
        this.f4316y = i6;
        this.B = tg2Var;
        this.f4317z = j6;
        Looper looperMyLooper = Looper.myLooper();
        y5.k(looperMyLooper);
        this.F = new Handler(looperMyLooper, null);
        this.J = new di2[0];
        this.I = new li2[0];
        this.Z = -9223372036854775807L;
        this.S = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    @Override // com.google.android.gms.internal.ads.nh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j6) throws Throwable {
        sk2 sk2Var;
        boolean zG;
        p();
        boolean[] zArr = (boolean[]) this.O.f5217u;
        if (true != this.P.zzh()) {
            j6 = 0;
        }
        this.U = false;
        long j7 = this.Y;
        this.Y = j6;
        if (u()) {
            this.Z = j6;
            return j6;
        }
        if (this.S == 7 || (!this.f4308c0 && this.A.f8975b == null)) {
            this.f4306a0 = false;
            this.Z = j6;
            this.f4308c0 = false;
            this.V = false;
            sk2Var = this.A;
            if (!(sk2Var.f8975b != null)) {
                for (li2 li2Var : this.I) {
                    li2Var.l();
                }
                pk2 pk2Var = this.A.f8975b;
                y5.k(pk2Var);
                pk2Var.a(false);
                return j6;
            }
            sk2Var.f8976c = null;
            for (li2 li2Var2 : this.I) {
                li2Var2.m(false);
            }
        } else {
            int length = this.I.length;
            for (int i6 = 0; i6 < length; i6++) {
                li2 li2Var3 = this.I[i6];
                int i7 = li2Var3.f6765o;
                if (li2Var3.f6767q + i7 != 0 || j7 != j6) {
                    if (this.N) {
                        synchronized (li2Var3) {
                            synchronized (li2Var3) {
                                li2Var3.f6767q = 0;
                                ji2 ji2Var = li2Var3.f6752a;
                                ji2Var.f6079c = ji2Var.f6078b;
                            }
                        }
                        int i8 = li2Var3.f6765o;
                        if (i7 < i8 || i7 > li2Var3.f6764n + i8) {
                            zG = false;
                        } else {
                            li2Var3.f6768r = Long.MIN_VALUE;
                            li2Var3.f6767q = i7 - i8;
                            zG = true;
                        }
                    } else {
                        zG = li2Var3.g(false, j6);
                    }
                    if (!zG && (zArr[i6] || !this.M)) {
                        this.f4306a0 = false;
                        this.Z = j6;
                        this.f4308c0 = false;
                        this.V = false;
                        sk2Var = this.A;
                        if (!(sk2Var.f8975b != null)) {
                        }
                    }
                }
            }
        }
        return j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.nh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6) {
        long j7;
        long j8;
        int i6;
        if (this.N) {
            return;
        }
        p();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.O.f5218v;
        int length = this.I.length;
        int i7 = 0;
        while (i7 < length) {
            li2 li2Var = this.I[i7];
            boolean z6 = zArr[i7];
            ji2 ji2Var = li2Var.f6752a;
            synchronized (li2Var) {
                try {
                    int i8 = li2Var.f6764n;
                    if (i8 != 0) {
                        long[] jArr = li2Var.f6762l;
                        int i9 = li2Var.f6766p;
                        if (j6 < jArr[i9]) {
                            j7 = j6;
                        } else {
                            j7 = j6;
                            int iH = li2Var.h(i9, (!z6 || (i6 = li2Var.f6767q) == i8) ? i8 : i6 + 1, j7, false);
                            j8 = iH != -1 ? li2Var.j(iH) : -1L;
                        }
                    }
                } finally {
                }
            }
            ji2Var.a(j8);
            i7++;
            j6 = j7;
        }
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void d() {
        this.K = true;
        this.F.post(this.D);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.nh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(long j6, tc2 tc2Var) {
        p();
        if (!this.P.zzh()) {
            return 0L;
        }
        k1 k1VarB = this.P.b(j6);
        n1 n1Var = k1VarB.f6212a;
        n1 n1Var2 = k1VarB.f6213b;
        long j7 = tc2Var.f9229a;
        long j8 = tc2Var.f9230b;
        if (j7 == 0) {
            if (j8 == 0) {
                return j6;
            }
            j7 = 0;
        }
        long j9 = n1Var.f7277a;
        int i6 = j31.f5914a;
        long j10 = j6 - j7;
        long j11 = j6 + j8;
        long j12 = j6 ^ j11;
        long j13 = j8 ^ j11;
        if (((j6 ^ j7) & (j6 ^ j10)) < 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((j12 & j13) < 0) {
            j11 = Long.MAX_VALUE;
        }
        boolean z6 = j10 <= j9 && j9 <= j11;
        long j14 = n1Var2.f7277a;
        boolean z7 = j10 <= j14 && j14 <= j11;
        if (!z6 || !z7) {
            if (!z6) {
                return z7 ? j14 : j10;
            }
            return j9;
        }
        if (Math.abs(j9 - j6) <= Math.abs(j14 - j6)) {
            return j9;
        }
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void f(m1 m1Var) {
        this.F.post(new q(14, this, m1Var));
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final s1 g(int i6, int i7) {
        return o(new di2(i6, false));
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long h(ak2[] ak2VarArr, boolean[] zArr, mi2[] mi2VarArr, boolean[] zArr2, long j6) throws Throwable {
        ak2 ak2Var;
        p();
        h20 h20Var = this.O;
        ui2 ui2Var = (ui2) h20Var.f5216t;
        boolean[] zArr3 = (boolean[]) h20Var.f5218v;
        int i6 = this.W;
        for (int i7 = 0; i7 < ak2VarArr.length; i7++) {
            mi2 mi2Var = mi2VarArr[i7];
            if (mi2Var != null && (ak2VarArr[i7] == null || !zArr[i7])) {
                int i8 = ((ci2) mi2Var).f3595a;
                y5.r(zArr3[i8]);
                this.W--;
                zArr3[i8] = false;
                mi2VarArr[i7] = null;
            }
        }
        boolean z6 = !this.T ? j6 == 0 || this.N : i6 != 0;
        for (int i9 = 0; i9 < ak2VarArr.length; i9++) {
            if (mi2VarArr[i9] == null && (ak2Var = ak2VarArr[i9]) != null) {
                y5.r(ak2Var.zzd() == 1);
                y5.r(ak2Var.a(0) == 0);
                int iIndexOf = ui2Var.f9568b.indexOf(ak2Var.zzg());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                y5.r(!zArr3[iIndexOf]);
                this.W++;
                zArr3[iIndexOf] = true;
                this.V = ak2Var.zzf().s | this.V;
                mi2VarArr[i9] = new ci2(this, iIndexOf);
                zArr2[i9] = true;
                if (!z6) {
                    li2 li2Var = this.I[iIndexOf];
                    z6 = (li2Var.f6765o + li2Var.f6767q == 0 || li2Var.g(true, j6)) ? false : true;
                }
            }
        }
        if (this.W == 0) {
            this.f4306a0 = false;
            this.U = false;
            this.V = false;
            sk2 sk2Var = this.A;
            if (sk2Var.f8975b != null) {
                for (li2 li2Var2 : this.I) {
                    li2Var2.l();
                }
                pk2 pk2Var = sk2Var.f8975b;
                y5.k(pk2Var);
                pk2Var.a(false);
            } else {
                this.f4308c0 = false;
                for (li2 li2Var3 : this.I) {
                    li2Var3.m(false);
                }
            }
        } else if (z6) {
            j6 = a(j6);
            for (int i10 = 0; i10 < mi2VarArr.length; i10++) {
                if (mi2VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
            }
        }
        this.T = true;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void i(mh2 mh2Var, long j6) {
        this.G = mh2Var;
        this.C.b();
        t();
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        if (this.f4308c0) {
            return false;
        }
        sk2 sk2Var = this.A;
        if (sk2Var.f8976c != null || this.f4306a0) {
            return false;
        }
        if (this.L && this.W == 0) {
            return false;
        }
        boolean zB = this.C.b();
        if (sk2Var.f8975b != null) {
            return zB;
        }
        t();
        return true;
    }

    public final void k(bi2 bi2Var, boolean z6) {
        Uri uri = bi2Var.f3191b.f8791b;
        fh2 fh2Var = new fh2();
        lh2 lh2Var = new lh2(-1, null, j31.v(bi2Var.f3197i), j31.v(this.Q));
        sh2 sh2Var = this.f4313v;
        sh2Var.a(new k00(sh2Var, fh2Var, lh2Var));
        if (z6) {
            return;
        }
        for (li2 li2Var : this.I) {
            li2Var.m(false);
        }
        if (this.W > 0) {
            mh2 mh2Var = this.G;
            mh2Var.getClass();
            mh2Var.d(this);
        }
    }

    public final void l(bi2 bi2Var) {
        m1 m1Var;
        if (this.Q == -9223372036854775807L && (m1Var = this.P) != null) {
            boolean zZzh = m1Var.zzh();
            long jN = n(true);
            long j6 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.Q = j6;
            this.f4315x.r(zZzh, j6, this.R);
        }
        Uri uri = bi2Var.f3191b.f8791b;
        fh2 fh2Var = new fh2();
        lh2 lh2Var = new lh2(-1, null, j31.v(bi2Var.f3197i), j31.v(this.Q));
        sh2 sh2Var = this.f4313v;
        sh2Var.a(new wv0(sh2Var, fh2Var, lh2Var));
        this.f4308c0 = true;
        mh2 mh2Var = this.G;
        mh2Var.getClass();
        mh2Var.d(this);
    }

    public final int m() {
        int i6 = 0;
        for (li2 li2Var : this.I) {
            i6 += li2Var.f6765o + li2Var.f6764n;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(boolean z6) {
        long j6;
        int i6 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            li2[] li2VarArr = this.I;
            if (i6 >= li2VarArr.length) {
                return jMax;
            }
            if (!z6) {
                h20 h20Var = this.O;
                h20Var.getClass();
                if (((boolean[]) h20Var.f5218v)[i6]) {
                    li2 li2Var = li2VarArr[i6];
                    synchronized (li2Var) {
                        j6 = li2Var.f6769t;
                    }
                    jMax = Math.max(jMax, j6);
                } else {
                    continue;
                }
            }
            i6++;
        }
    }

    public final s1 o(di2 di2Var) {
        int length = this.I.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (di2Var.equals(this.J[i6])) {
                return this.I[i6];
            }
        }
        if (this.K) {
            qs0.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + di2Var.f3946a + ") after finishing tracks.");
            return new t0();
        }
        li2 li2Var = new li2(this.f4310e0, this.f4312u, this.f4314w);
        li2Var.f6756e = this;
        int i7 = length + 1;
        di2[] di2VarArr = (di2[]) Arrays.copyOf(this.J, i7);
        di2VarArr[length] = di2Var;
        int i8 = j31.f5914a;
        this.J = di2VarArr;
        li2[] li2VarArr = (li2[]) Arrays.copyOf(this.I, i7);
        li2VarArr[length] = li2Var;
        this.I = li2VarArr;
        return li2Var;
    }

    public final void p() {
        y5.r(this.L);
        this.O.getClass();
        this.P.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        w wVar;
        qh qhVarL;
        int i6;
        w wVar2;
        long j6 = this.f4317z;
        if (this.f4309d0 || this.L || !this.K || this.P == null) {
            return;
        }
        li2[] li2VarArr = this.I;
        int length = li2VarArr.length;
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                am0 am0Var = this.C;
                synchronized (am0Var) {
                    am0Var.s = false;
                }
                int length2 = this.I.length;
                a00[] a00VarArr = new a00[length2];
                boolean[] zArr = new boolean[length2];
                int i8 = 0;
                while (i8 < length2) {
                    li2 li2Var = this.I[i8];
                    synchronized (li2Var) {
                        wVar = li2Var.f6772w ? null : li2Var.f6773x;
                    }
                    wVar.getClass();
                    String str = wVar.f9978m;
                    boolean zEquals = "audio".equals(bk.h(str));
                    boolean z7 = (zEquals || bk.g(str)) ? true : z6;
                    zArr[i8] = z7;
                    boolean z8 = z6;
                    this.M |= z7;
                    this.N = (j6 != -9223372036854775807L && length2 == 1 && (("image".equals(bk.h(str)) || "application/x-image-uri".equals(str)) ? true : z8 ? 1 : 0) == true) ? true : z8 ? 1 : 0;
                    k3 k3Var = this.H;
                    if (k3Var != null) {
                        if (zEquals || this.J[i8].f3947b) {
                            qh qhVar = wVar.f9976k;
                            if (qhVar == null) {
                                zg[] zgVarArr = new zg[1];
                                zgVarArr[z8 ? 1 : 0] = k3Var;
                                qhVarL = new qh(-9223372036854775807L, zgVarArr);
                            } else {
                                zg[] zgVarArr2 = new zg[1];
                                zgVarArr2[z8 ? 1 : 0] = k3Var;
                                qhVarL = qhVar.l(zgVarArr2);
                            }
                            tk2 tk2Var = new tk2(wVar);
                            tk2Var.f9328j = qhVarL;
                            wVar = new w(tk2Var);
                        }
                        if (zEquals && wVar.f9973g == -1 && wVar.h == -1 && (i6 = k3Var.s) != -1) {
                            tk2 tk2Var2 = new tk2(wVar);
                            tk2Var2.f9326g = i6;
                            wVar = new w(tk2Var2);
                        }
                    }
                    int iD = this.f4312u.d(wVar);
                    tk2 tk2Var3 = new tk2(wVar);
                    tk2Var3.H = iD;
                    w wVar3 = new w(tk2Var3);
                    a00VarArr[i8] = new a00(Integer.toString(i8), wVar3);
                    this.V = wVar3.s | this.V;
                    i8++;
                    z6 = z8 ? 1 : 0;
                }
                this.O = new h20(new ui2(a00VarArr), zArr);
                if (this.N && this.Q == -9223372036854775807L) {
                    this.Q = j6;
                    this.P = new ai2(this, this.P);
                }
                this.f4315x.r(this.P.zzh(), this.Q, this.R);
                this.L = true;
                mh2 mh2Var = this.G;
                mh2Var.getClass();
                mh2Var.f(this);
                return;
            }
            li2 li2Var2 = li2VarArr[i7];
            synchronized (li2Var2) {
                wVar2 = li2Var2.f6772w ? null : li2Var2.f6773x;
            }
            if (wVar2 == null) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void r(int i6) {
        p();
        h20 h20Var = this.O;
        boolean[] zArr = (boolean[]) h20Var.s;
        if (zArr[i6]) {
            return;
        }
        w wVar = ((ui2) h20Var.f5216t).a(i6).f2534d[0];
        lh2 lh2Var = new lh2(bk.b(wVar.f9978m), wVar, j31.v(this.Y), -9223372036854775807L);
        sh2 sh2Var = this.f4313v;
        sh2Var.a(new com.google.android.gms.ads.mediation.customevent.a(11, sh2Var, lh2Var));
        zArr[i6] = true;
    }

    public final void s(int i6) {
        p();
        boolean[] zArr = (boolean[]) this.O.f5217u;
        if (this.f4306a0 && zArr[i6] && !this.I[i6].n(false)) {
            this.Z = 0L;
            this.f4306a0 = false;
            this.U = true;
            this.Y = 0L;
            this.f4307b0 = 0;
            for (li2 li2Var : this.I) {
                li2Var.m(false);
            }
            mh2 mh2Var = this.G;
            mh2Var.getClass();
            mh2Var.d(this);
        }
    }

    public final void t() {
        bi2 bi2Var = new bi2(this, this.s, this.f4311t, this.B, this, this.C);
        if (this.L) {
            y5.r(u());
            long j6 = this.Q;
            if (j6 != -9223372036854775807L && this.Z > j6) {
                this.f4308c0 = true;
                this.Z = -9223372036854775807L;
                return;
            }
            m1 m1Var = this.P;
            m1Var.getClass();
            n1 n1Var = m1Var.b(this.Z).f6212a;
            long j7 = this.Z;
            bi2Var.f3195f.f2886a = n1Var.f7278b;
            bi2Var.f3197i = j7;
            bi2Var.h = true;
            bi2Var.f3200l = false;
            for (li2 li2Var : this.I) {
                li2Var.f6768r = this.Z;
            }
            this.Z = -9223372036854775807L;
        }
        this.f4307b0 = m();
        sk2 sk2Var = this.A;
        sk2Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        y5.k(looperMyLooper);
        sk2Var.f8976c = null;
        pk2 pk2Var = new pk2(sk2Var, looperMyLooper, bi2Var, this, SystemClock.elapsedRealtime());
        y5.r(sk2Var.f8975b == null);
        sk2Var.f8975b = pk2Var;
        SystemClock.elapsedRealtime();
        pk2Var.f8099t.getClass();
        pk2Var.f8100u = null;
        xk2 xk2Var = sk2Var.f8974a;
        pk2 pk2Var2 = sk2Var.f8975b;
        pk2Var2.getClass();
        xk2Var.execute(pk2Var2);
        Uri uri = bi2Var.f3198j.f7851a;
        fh2 fh2Var = new fh2();
        lh2 lh2Var = new lh2(-1, null, j31.v(bi2Var.f3197i), j31.v(this.Q));
        sh2 sh2Var = this.f4313v;
        sh2Var.a(new com.google.android.gms.ads.mediation.customevent.b(sh2Var, fh2Var, lh2Var));
    }

    public final boolean u() {
        return this.Z != -9223372036854775807L;
    }

    public final boolean v() {
        return this.U || u();
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        long jN;
        boolean z6;
        long j6;
        p();
        if (this.f4308c0 || this.W == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.Z;
        }
        if (this.M) {
            int length = this.I.length;
            jN = Long.MAX_VALUE;
            for (int i6 = 0; i6 < length; i6++) {
                h20 h20Var = this.O;
                if (((boolean[]) h20Var.f5217u)[i6] && ((boolean[]) h20Var.f5218v)[i6]) {
                    li2 li2Var = this.I[i6];
                    synchronized (li2Var) {
                        z6 = li2Var.f6770u;
                    }
                    if (z6) {
                        continue;
                    } else {
                        li2 li2Var2 = this.I[i6];
                        synchronized (li2Var2) {
                            j6 = li2Var2.f6769t;
                        }
                        jN = Math.min(jN, j6);
                    }
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n(false);
        }
        return jN == Long.MIN_VALUE ? this.Y : jN;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long zzd() {
        if (this.V) {
            this.V = false;
        } else {
            if (!this.U) {
                return -9223372036854775807L;
            }
            if (!this.f4308c0 && m() <= this.f4307b0) {
                return -9223372036854775807L;
            }
            this.U = false;
        }
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final ui2 zzh() {
        p();
        return (ui2) this.O.f5216t;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void zzk() throws IOException {
        IOException iOException;
        int i6 = this.S == 7 ? 6 : 3;
        sk2 sk2Var = this.A;
        IOException iOException2 = sk2Var.f8976c;
        if (iOException2 != null) {
            throw iOException2;
        }
        pk2 pk2Var = sk2Var.f8975b;
        if (pk2Var != null && (iOException = pk2Var.f8100u) != null && pk2Var.f8101v > i6) {
            throw iOException;
        }
        if (this.f4308c0 && !this.L) {
            throw rn.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean zzp() {
        boolean z6;
        if (this.A.f8975b == null) {
            return false;
        }
        am0 am0Var = this.C;
        synchronized (am0Var) {
            z6 = am0Var.s;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
    }
}

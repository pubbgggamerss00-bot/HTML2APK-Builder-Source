package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ob2 implements Handler.Callback, mh2, kc2 {

    /* renamed from: l0, reason: collision with root package name */
    public static final long f7683l0 = j31.v(10000);
    public final jc2 A;
    public final Looper B;
    public final cy C;
    public final jx D;
    public final long E;
    public final va2 F;
    public final ArrayList G;
    public final el0 H;
    public final xb2 I;
    public final hc2 J;
    public final long K;
    public final hd2 L;
    public final wc2 M;
    public final xo0 N;
    public tc2 O;
    public ic2 P;
    public p9 Q;
    public boolean R;
    public boolean T;
    public boolean U;
    public boolean W;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f7684a0;

    /* renamed from: b0, reason: collision with root package name */
    public nb2 f7685b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f7686c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f7687d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f7688e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f7689f0;

    /* renamed from: g0, reason: collision with root package name */
    public wa2 f7690g0;

    /* renamed from: i0, reason: collision with root package name */
    public ya2 f7692i0;

    /* renamed from: j0, reason: collision with root package name */
    public final dh0 f7693j0;

    /* renamed from: k0, reason: collision with root package name */
    public final sa2 f7694k0;
    public final sc2[] s;

    /* renamed from: t, reason: collision with root package name */
    public final pa2[] f7695t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f7696u;

    /* renamed from: v, reason: collision with root package name */
    public final fk2 f7697v;

    /* renamed from: w, reason: collision with root package name */
    public final gk2 f7698w;

    /* renamed from: x, reason: collision with root package name */
    public final rb2 f7699x;

    /* renamed from: y, reason: collision with root package name */
    public final lk2 f7700y;

    /* renamed from: z, reason: collision with root package name */
    public final xo0 f7701z;
    public int X = 0;
    public boolean Y = false;
    public boolean S = false;

    /* renamed from: h0, reason: collision with root package name */
    public long f7691h0 = -9223372036854775807L;
    public long V = -9223372036854775807L;

    public ob2(pa2[] pa2VarArr, fk2 fk2Var, gk2 gk2Var, rb2 rb2Var, nk2 nk2Var, bd2 bd2Var, tc2 tc2Var, sa2 sa2Var, long j6, Looper looper, hy0 hy0Var, dh0 dh0Var, hd2 hd2Var, ya2 ya2Var) {
        Looper looper2;
        this.f7693j0 = dh0Var;
        this.f7697v = fk2Var;
        this.f7698w = gk2Var;
        this.f7699x = rb2Var;
        this.f7700y = nk2Var;
        boolean z6 = false;
        this.O = tc2Var;
        this.f7694k0 = sa2Var;
        this.K = j6;
        this.H = hy0Var;
        this.L = hd2Var;
        this.f7692i0 = ya2Var;
        this.M = bd2Var;
        this.E = rb2Var.zzb();
        uw uwVar = zy.f11601a;
        ic2 ic2VarG = ic2.g(gk2Var);
        this.P = ic2VarG;
        this.Q = new p9(ic2VarG);
        int length = pa2VarArr.length;
        this.f7695t = new pa2[2];
        this.f7696u = new boolean[2];
        qc2 qc2VarA = fk2Var.a();
        this.s = new sc2[2];
        for (int i6 = 0; i6 < 2; i6++) {
            pa2 pa2Var = pa2VarArr[i6];
            pa2Var.f8011w = i6;
            pa2Var.f8012x = hd2Var;
            pa2Var.f8013y = hy0Var;
            this.f7695t[i6] = pa2Var;
            synchronized (pa2Var.s) {
                pa2Var.I = qc2VarA;
            }
            this.s[i6] = new sc2(pa2VarArr[i6], i6);
        }
        this.F = new va2(this);
        this.G = new ArrayList();
        this.C = new cy();
        this.D = new jx();
        fk2Var.f4717a = this;
        fk2Var.f4718b = nk2Var;
        this.f7689f0 = true;
        c01 c01VarA = hy0Var.a(looper, null);
        this.N = c01VarA;
        this.I = new xb2(bd2Var, c01VarA, new v31(19, this), ya2Var);
        this.J = new hc2(this, bd2Var, c01VarA, hd2Var);
        jc2 jc2Var = new jc2();
        this.A = jc2Var;
        synchronized (jc2Var.f6025a) {
            try {
                if (jc2Var.f6026b == null) {
                    if (jc2Var.f6028d == 0 && jc2Var.f6027c == null) {
                        z6 = true;
                    }
                    y5.r(z6);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    jc2Var.f6027c = handlerThread;
                    handlerThread.start();
                    jc2Var.f6026b = jc2Var.f6027c.getLooper();
                }
                jc2Var.f6028d++;
                looper2 = jc2Var.f6026b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.B = looper2;
        this.f7701z = hy0Var.a(looper2, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.nh2, com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    public static final boolean I(vb2 vb2Var) {
        if (vb2Var != null) {
            try {
                ?? r12 = vb2Var.f9791a;
                if (vb2Var.f9795e) {
                    mi2[] mi2VarArr = vb2Var.f9793c;
                    for (int i6 = 0; i6 < 2; i6++) {
                        mi2 mi2Var = mi2VarArr[i6];
                        if (mi2Var != null) {
                            mi2Var.zzd();
                        }
                    }
                } else {
                    r12.zzk();
                }
                if ((!vb2Var.f9795e ? 0L : r12.zzc()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int J(cy cyVar, jx jxVar, int i6, boolean z6, Object obj, zy zyVar, zy zyVar2) {
        cy cyVar2 = cyVar;
        zy zyVar3 = zyVar;
        Object obj2 = zyVar3.e(zyVar3.n(obj, jxVar).f6182c, cyVar, 0L).f3688a;
        for (int i7 = 0; i7 < zyVar2.c(); i7++) {
            if (zyVar2.e(i7, cyVar, 0L).f3688a.equals(obj2)) {
                return i7;
            }
        }
        int iA = zyVar3.a(obj);
        int iB = zyVar3.b();
        int iA2 = -1;
        int i8 = 0;
        while (true) {
            if (i8 >= iB || iA2 != -1) {
                break;
            }
            zy zyVar4 = zyVar3;
            int i9 = zyVar4.i(iA, jxVar, cyVar2, i6, z6);
            if (i9 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = zyVar2.a(zyVar4.f(i9));
            i8++;
            zyVar3 = zyVar4;
            iA = i9;
            cyVar2 = cyVar;
        }
        if (iA2 == -1) {
            return -1;
        }
        return zyVar2.d(iA2, jxVar, false).f6182c;
    }

    public static Pair O(zy zyVar, nb2 nb2Var, int i6, boolean z6, cy cyVar, jx jxVar) {
        zy zyVar2 = nb2Var.f7380a;
        if (zyVar.o()) {
            return null;
        }
        zy zyVar3 = true == zyVar2.o() ? zyVar : zyVar2;
        try {
            Pair pairL = zyVar3.l(cyVar, jxVar, nb2Var.f7381b, nb2Var.f7382c);
            if (!zyVar.equals(zyVar3)) {
                if (zyVar.a(pairL.first) == -1) {
                    int iJ = J(cyVar, jxVar, i6, z6, pairL.first, zyVar3, zyVar);
                    if (iJ != -1) {
                        return zyVar.l(cyVar, jxVar, iJ, -9223372036854775807L);
                    }
                    return null;
                }
                if (zyVar3.n(pairL.first, jxVar).f6184e && zyVar3.e(jxVar.f6182c, cyVar, 0L).f3697k == zyVar3.a(pairL.first)) {
                    return zyVar.l(cyVar, jxVar, zyVar.n(pairL.first, jxVar).f6182c, nb2Var.f7382c);
                }
            }
            return pairL;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void A(ui2 ui2Var, gk2 gk2Var) {
        vb2 vb2Var = this.I.f10484j;
        vb2Var.getClass();
        long jL = L(vb2Var.b());
        long j6 = H(this.P.f5661a, vb2Var.f9797g.f10148a) ? this.f7694k0.h : -9223372036854775807L;
        zy zyVar = this.P.f5661a;
        float f6 = this.F.zzc().f5818a;
        boolean z6 = this.P.f5671l;
        this.f7699x.d(new qb2(this.L, jL, f6, this.U, j6), (ak2[]) gk2Var.f5085c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0152, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        long j6;
        int i6;
        boolean z6;
        lb2 lb2Var;
        ip ipVarZzc;
        float f6;
        long jMax;
        vb2 vb2Var = this.I.h;
        if (vb2Var == null) {
            return;
        }
        long jZzd = vb2Var.f9795e ? vb2Var.f9791a.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!vb2Var.i()) {
                this.I.x(vb2Var);
                g(false);
                j();
            }
            r(jZzd);
            if (jZzd != this.P.f5677r) {
                ic2 ic2Var = this.P;
                j6 = -9223372036854775807L;
                i6 = 1;
                z6 = false;
                this.P = a(ic2Var.f5662b, jZzd, ic2Var.f5663c, jZzd, true, 5);
            } else {
                j6 = -9223372036854775807L;
                i6 = 1;
                z6 = false;
            }
        } else {
            j6 = -9223372036854775807L;
            i6 = 1;
            z6 = false;
            va2 va2Var = this.F;
            Object[] objArr = vb2Var != this.I.f10483i;
            vc2 vc2Var = va2Var.s;
            pa2 pa2Var = va2Var.f9767u;
            if (pa2Var == null || pa2Var.m() || ((objArr == true && va2Var.f9767u.f8014z != 2) || (!va2Var.f9767u.n() && (objArr == true || va2Var.f9767u.j())))) {
                va2Var.f9769w = true;
                if (va2Var.f9770x && !vc2Var.s) {
                    vc2Var.f9810u = SystemClock.elapsedRealtime();
                    vc2Var.s = true;
                }
            } else {
                ub2 ub2Var = va2Var.f9768v;
                ub2Var.getClass();
                long jZza = ub2Var.zza();
                if (!va2Var.f9769w) {
                    vc2Var.b(jZza);
                    ipVarZzc = ub2Var.zzc();
                    if (!ipVarZzc.equals(vc2Var.f9811v)) {
                        vc2Var.a(ipVarZzc);
                        va2Var.f9766t.f7701z.d(16, ipVarZzc).a();
                    }
                } else if (jZza >= vc2Var.zza()) {
                    va2Var.f9769w = false;
                    if (va2Var.f9770x && !vc2Var.s) {
                        vc2Var.f9810u = SystemClock.elapsedRealtime();
                        vc2Var.s = true;
                    }
                    vc2Var.b(jZza);
                    ipVarZzc = ub2Var.zzc();
                    if (!ipVarZzc.equals(vc2Var.f9811v)) {
                    }
                } else if (vc2Var.s) {
                    vc2Var.b(vc2Var.zza());
                    vc2Var.s = false;
                }
            }
            long jZza2 = va2Var.zza();
            this.f7686c0 = jZza2;
            long j7 = jZza2 - vb2Var.f9805p;
            long j8 = this.P.f5677r;
            if (!this.G.isEmpty() && !this.P.f5662b.b()) {
                if (this.f7689f0) {
                    j8--;
                    this.f7689f0 = false;
                }
                ic2 ic2Var2 = this.P;
                int iA = ic2Var2.f5661a.a(ic2Var2.f5662b.f7769a);
                int iMin = Math.min(this.f7688e0, this.G.size());
                if (iMin > 0) {
                    lb2Var = (lb2) this.G.get(iMin - 1);
                    while (lb2Var != null && (iA < 0 || (iA == 0 && j8 < 0))) {
                        int i7 = iMin - 1;
                        if (i7 > 0) {
                            lb2Var = (lb2) this.G.get(iMin - 2);
                            iMin = i7;
                        } else {
                            iMin = i7;
                        }
                    }
                    if (iMin < this.G.size()) {
                    }
                    this.f7688e0 = iMin;
                }
                lb2Var = null;
            }
            if (this.F.zzj()) {
                boolean z7 = !this.Q.f7994c;
                ic2 ic2Var3 = this.P;
                this.P = a(ic2Var3.f5662b, j7, ic2Var3.f5663c, j7, z7, 6);
            } else {
                ic2 ic2Var4 = this.P;
                ic2Var4.f5677r = j7;
                ic2Var4.s = SystemClock.elapsedRealtime();
            }
        }
        this.P.f5675p = this.I.f10484j.b();
        ic2 ic2Var5 = this.P;
        ic2Var5.f5676q = L(ic2Var5.f5675p);
        ic2 ic2Var6 = this.P;
        if (ic2Var6.f5671l && ic2Var6.f5665e == 3 && H(ic2Var6.f5661a, ic2Var6.f5662b)) {
            ic2 ic2Var7 = this.P;
            float fMax = 1.0f;
            if (ic2Var7.f5674o.f5818a == 1.0f) {
                sa2 sa2Var = this.f7694k0;
                long jK = K(ic2Var7.f5661a, ic2Var7.f5662b.f7769a, ic2Var7.f5677r);
                long j9 = this.P.f5676q;
                int i8 = i6;
                boolean z8 = z6;
                if (sa2Var.f8865c != j6) {
                    long j10 = jK - j9;
                    long j11 = sa2Var.f8872k;
                    if (j11 == j6) {
                        sa2Var.f8872k = j10;
                        sa2Var.f8873l = 0L;
                    } else {
                        sa2Var.f8872k = Math.max(j10, (long) ((j10 * 9.999871E-4f) + (j11 * 0.999f)));
                        sa2Var.f8873l = (long) ((Math.abs(j10 - r14) * 9.999871E-4f) + (sa2Var.f8873l * 0.999f));
                    }
                    if (sa2Var.f8871j == j6 || SystemClock.elapsedRealtime() - sa2Var.f8871j >= 1000) {
                        sa2Var.f8871j = SystemClock.elapsedRealtime();
                        long j12 = (sa2Var.f8873l * 3) + sa2Var.f8872k;
                        if (sa2Var.h > j12) {
                            long jS = j31.s(1000L);
                            float f7 = sa2Var.f8870i - 1.0f;
                            long j13 = sa2Var.f8867e;
                            f6 = 1.0E-7f;
                            float f8 = jS;
                            long j14 = sa2Var.h - (((long) (f7 * f8)) + ((long) (0.029999971f * f8)));
                            long[] jArr = new long[3];
                            jArr[z8 ? 1 : 0] = j12;
                            jArr[i8] = j13;
                            jArr[2] = j14;
                            jMax = jArr[z8 ? 1 : 0];
                            for (int i9 = i8; i9 < 3; i9++) {
                                long j15 = jArr[i9];
                                if (j15 > jMax) {
                                    jMax = j15;
                                }
                            }
                            sa2Var.h = jMax;
                        } else {
                            f6 = 1.0E-7f;
                            jMax = Math.max(sa2Var.h, Math.min(jK - ((long) (Math.max(0.0f, sa2Var.f8870i - 1.0f) / 1.0E-7f)), j12));
                            sa2Var.h = jMax;
                            long j16 = sa2Var.f8869g;
                            if (j16 != j6 && jMax > j16) {
                                sa2Var.h = j16;
                                jMax = j16;
                            }
                        }
                        long j17 = jK - jMax;
                        if (Math.abs(j17) < sa2Var.f8863a) {
                            sa2Var.f8870i = 1.0f;
                        } else {
                            fMax = Math.max(0.97f, Math.min((j17 * f6) + 1.0f, 1.03f));
                            sa2Var.f8870i = fMax;
                        }
                    } else {
                        fMax = sa2Var.f8870i;
                    }
                }
                if (this.F.zzc().f5818a != fMax) {
                    ip ipVar = new ip(fMax, this.P.f5674o.f5819b);
                    this.f7701z.b(16);
                    this.F.a(ipVar);
                    i(this.P.f5674o, this.F.zzc().f5818a, z8, z8);
                }
            }
        }
    }

    public final void C(zy zyVar, oh2 oh2Var, zy zyVar2, oh2 oh2Var2, long j6, boolean z6) {
        boolean zH = H(zyVar, oh2Var);
        Object obj = oh2Var.f7769a;
        if (!zH) {
            ip ipVar = oh2Var.b() ? ip.f5817d : this.P.f5674o;
            va2 va2Var = this.F;
            if (va2Var.zzc().equals(ipVar)) {
                return;
            }
            this.f7701z.b(16);
            va2Var.a(ipVar);
            i(this.P.f5674o, ipVar.f5818a, false, false);
            return;
        }
        jx jxVar = this.D;
        int i6 = zyVar.n(obj, jxVar).f6182c;
        cy cyVar = this.C;
        zyVar.e(i6, cyVar, 0L);
        t7 t7Var = cyVar.h;
        int i7 = j31.f5914a;
        sa2 sa2Var = this.f7694k0;
        sa2Var.getClass();
        t7Var.getClass();
        long jS = j31.s(-9223372036854775807L);
        sa2Var.f8865c = jS;
        sa2Var.f8868f = jS;
        sa2Var.f8869g = jS;
        sa2Var.c();
        if (j6 != -9223372036854775807L) {
            sa2Var.f8866d = K(zyVar, obj, j6);
            sa2Var.c();
            return;
        }
        if (!Objects.equals(!zyVar2.o() ? zyVar2.e(zyVar2.n(oh2Var2.f7769a, jxVar).f6182c, cyVar, 0L).f3688a : null, cyVar.f3688a) || z6) {
            sa2Var.f8866d = -9223372036854775807L;
            sa2Var.c();
        }
    }

    public final void D(boolean z6, boolean z7) {
        this.U = z6;
        long jElapsedRealtime = -9223372036854775807L;
        if (z6 && !z7) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.V = jElapsedRealtime;
    }

    public final synchronized void E(em1 em1Var, long j6) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j6;
        boolean z6 = false;
        while (!((Boolean) em1Var.mo7zza()).booleanValue() && j6 > 0) {
            try {
                wait(j6);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            j6 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean F() {
        vb2 vb2Var = this.I.h;
        long j6 = vb2Var.f9797g.f10152e;
        if (vb2Var.f9795e) {
            return j6 == -9223372036854775807L || this.P.f5677r < j6 || !G();
        }
        return false;
    }

    public final boolean G() {
        ic2 ic2Var = this.P;
        return ic2Var.f5671l && ic2Var.f5673n == 0;
    }

    public final boolean H(zy zyVar, oh2 oh2Var) {
        if (oh2Var.b() || zyVar.o()) {
            return false;
        }
        int i6 = zyVar.n(oh2Var.f7769a, this.D).f6182c;
        cy cyVar = this.C;
        zyVar.e(i6, cyVar, 0L);
        return cyVar.b() && cyVar.f3694g && cyVar.f3691d != -9223372036854775807L;
    }

    public final long K(zy zyVar, Object obj, long j6) {
        int i6 = zyVar.n(obj, this.D).f6182c;
        cy cyVar = this.C;
        zyVar.e(i6, cyVar, 0L);
        if (cyVar.f3691d == -9223372036854775807L || !cyVar.b() || !cyVar.f3694g) {
            return -9223372036854775807L;
        }
        long j7 = cyVar.f3692e;
        return j31.s((j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime()) - cyVar.f3691d) - j6;
    }

    public final long L(long j6) {
        vb2 vb2Var = this.I.f10484j;
        if (vb2Var == null) {
            return 0L;
        }
        return Math.max(0L, j6 - (this.f7686c0 - vb2Var.f9805p));
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    public final long M(oh2 oh2Var, long j6, boolean z6, boolean z7) throws wa2 {
        long jA;
        vb2 vb2Var;
        y();
        D(false, true);
        if (z7 || this.P.f5665e == 3) {
            v(2);
        }
        xb2 xb2Var = this.I;
        vb2 vb2Var2 = xb2Var.h;
        vb2 vb2Var3 = vb2Var2;
        while (vb2Var3 != null && !oh2Var.equals(vb2Var3.f9797g.f10148a)) {
            vb2Var3 = vb2Var3.f9802m;
        }
        if (z6 || vb2Var2 != vb2Var3 || (vb2Var3 != null && j6 + vb2Var3.f9805p < 0)) {
            for (int i6 = 0; i6 < 2; i6++) {
                b(i6);
            }
            if (vb2Var3 != null) {
                while (xb2Var.h != vb2Var3) {
                    xb2Var.k();
                }
                xb2Var.x(vb2Var3);
                vb2Var3.f9805p = 1000000000000L;
                c(new boolean[2], xb2Var.f10483i.c());
            }
        }
        if (vb2Var3 != null) {
            ?? r22 = vb2Var3.f9791a;
            xb2Var.x(vb2Var3);
            if (vb2Var3.f9795e) {
                vb2 vb2Var4 = vb2Var3;
                jA = j6;
                if (vb2Var4.f9796f) {
                    jA = r22.a(jA);
                    r22.c(jA - this.E);
                }
            } else {
                wb2 wb2Var = vb2Var3.f9797g;
                if (j6 == wb2Var.f10149b) {
                    vb2Var = vb2Var3;
                    jA = j6;
                } else {
                    vb2Var = vb2Var3;
                    jA = j6;
                    wb2Var = new wb2(wb2Var.f10148a, jA, wb2Var.f10150c, wb2Var.f10151d, wb2Var.f10152e, wb2Var.f10153f, wb2Var.f10154g, wb2Var.h);
                }
                vb2Var.f9797g = wb2Var;
            }
            r(jA);
            j();
        } else {
            jA = j6;
            xb2Var.t();
            r(jA);
        }
        g(false);
        this.f7701z.h(2);
        return jA;
    }

    public final Pair N(zy zyVar) {
        int i6;
        long j6 = 0;
        if (zyVar.o()) {
            return Pair.create(ic2.f5660t, 0L);
        }
        Pair pairL = zyVar.l(this.C, this.D, zyVar.g(this.Y), -9223372036854775807L);
        oh2 oh2VarS = this.I.s(zyVar, pairL.first);
        long jLongValue = ((Long) pairL.second).longValue();
        if (oh2VarS.b()) {
            Object obj = oh2VarS.f7769a;
            jx jxVar = this.D;
            zyVar.n(obj, jxVar);
            a aVarA = jxVar.f6185f.a(-1);
            int i7 = 0;
            while (true) {
                int[] iArr = aVarA.f2529d;
                if (i7 >= iArr.length || (i6 = iArr[i7]) == 0 || i6 == 1) {
                    break;
                }
                i7++;
            }
            if (-1 == i7) {
                jxVar.f6185f.getClass();
            }
        } else {
            j6 = jLongValue;
        }
        return Pair.create(oh2VarS, Long.valueOf(j6));
    }

    public final ic2 a(oh2 oh2Var, long j6, long j7, long j8, boolean z6, int i6) {
        cp1 cp1VarT;
        this.f7689f0 = (!this.f7689f0 && j6 == this.P.f5677r && oh2Var.equals(this.P.f5662b)) ? false : true;
        q();
        ic2 ic2Var = this.P;
        ui2 ui2Var = ic2Var.h;
        gk2 gk2Var = ic2Var.f5668i;
        List list = ic2Var.f5669j;
        if (this.J.f5336j) {
            vb2 vb2Var = this.I.h;
            ui2Var = vb2Var == null ? ui2.f9566d : vb2Var.f9803n;
            gk2Var = vb2Var == null ? this.f7698w : vb2Var.f9804o;
            ak2[] ak2VarArr = (ak2[]) gk2Var.f5085c;
            yn1 yn1Var = new yn1();
            boolean z7 = false;
            for (ak2 ak2Var : ak2VarArr) {
                if (ak2Var != null) {
                    qh qhVar = ak2Var.zze(0).f9976k;
                    if (qhVar == null) {
                        yn1Var.q(new qh(-9223372036854775807L, new zg[0]));
                    } else {
                        yn1Var.q(qhVar);
                        z7 = true;
                    }
                }
            }
            if (z7) {
                cp1VarT = yn1Var.t();
            } else {
                zn1 zn1Var = bo1.f3236t;
                cp1VarT = cp1.f3636w;
            }
            list = cp1VarT;
            if (vb2Var != null) {
                wb2 wb2Var = vb2Var.f9797g;
                long j9 = wb2Var.f10150c;
                if (j9 != j7) {
                    if (j7 != j9) {
                        wb2Var = new wb2(wb2Var.f10148a, wb2Var.f10149b, j7, wb2Var.f10151d, wb2Var.f10152e, wb2Var.f10153f, wb2Var.f10154g, wb2Var.h);
                    }
                    vb2Var.f9797g = wb2Var;
                }
            }
            vb2 vb2Var2 = this.I.h;
            if (vb2Var2 != null) {
                gk2 gk2Var2 = vb2Var2.f9804o;
                for (int i7 = 0; i7 < 2; i7++) {
                    if (gk2Var2.b(i7)) {
                        if (this.s[i7].f8897a.f8008t != 1) {
                            break;
                        }
                        ((rc2[]) gk2Var2.f5084b)[i7].getClass();
                    }
                }
            }
        } else if (!oh2Var.equals(ic2Var.f5662b)) {
            gk2Var = this.f7698w;
            ui2Var = ui2.f9566d;
            list = cp1.f3636w;
        }
        ui2 ui2Var2 = ui2Var;
        gk2 gk2Var3 = gk2Var;
        List list2 = list;
        if (z6) {
            p9 p9Var = this.Q;
            if (!p9Var.f7994c || p9Var.f7995d == 5) {
                p9Var.f7992a = true;
                p9Var.f7994c = true;
                p9Var.f7995d = i6;
            } else {
                y5.n(i6 == 5);
            }
        }
        ic2 ic2Var2 = this.P;
        return ic2Var2.b(oh2Var, j6, j7, j8, L(ic2Var2.f5675p), ui2Var2, gk2Var3, list2);
    }

    public final void b(int i6) {
        sc2[] sc2VarArr = this.s;
        int iA = sc2VarArr[i6].a();
        pa2 pa2Var = sc2VarArr[i6].f8897a;
        if (sc2.l(pa2Var)) {
            va2 va2Var = this.F;
            if (pa2Var == va2Var.f9767u) {
                va2Var.f9768v = null;
                va2Var.f9767u = null;
                va2Var.f9769w = true;
            }
            int i7 = pa2Var.f8014z;
            if (i7 == 2) {
                y5.r(i7 == 2);
                pa2Var.f8014z = 1;
                pa2Var.f();
            }
            y5.r(pa2Var.f8014z == 1);
            ro0 ro0Var = pa2Var.f8009u;
            ro0Var.f8673t = null;
            ro0Var.s = null;
            pa2Var.f8014z = 0;
            pa2Var.A = null;
            pa2Var.B = null;
            pa2Var.F = false;
            pa2Var.x();
        }
        n(i6, false);
        this.f7684a0 -= iA;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean[] zArr, long j6) throws wa2 {
        sc2[] sc2VarArr;
        int i6;
        xb2 xb2Var;
        int i7;
        int i8;
        ub2 ub2Var;
        xb2 xb2Var2 = this.I;
        vb2 vb2Var = xb2Var2.f10483i;
        gk2 gk2Var = vb2Var.f9804o;
        int i9 = 0;
        while (true) {
            sc2VarArr = this.s;
            i6 = 2;
            if (i9 >= 2) {
                break;
            }
            if (!gk2Var.b(i9)) {
                sc2VarArr[i9].f();
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < i6) {
            if (gk2Var.b(i10)) {
                boolean z6 = zArr[i10];
                vb2 vb2Var2 = xb2Var2.f10483i;
                sc2 sc2Var = sc2VarArr[i10];
                int iA = sc2Var.a();
                pa2 pa2Var = sc2Var.f8897a;
                if (iA > 0) {
                    xb2Var = xb2Var2;
                    i7 = i6;
                } else {
                    boolean z7 = vb2Var2 == xb2Var2.h;
                    gk2 gk2Var2 = vb2Var2.f9804o;
                    rc2 rc2Var = ((rc2[]) gk2Var2.f5084b)[i10];
                    ak2 ak2Var = ((ak2[]) gk2Var2.f5085c)[i10];
                    int iZzd = ak2Var != null ? ak2Var.zzd() : 0;
                    w[] wVarArr = new w[iZzd];
                    for (int i11 = 0; i11 < iZzd; i11++) {
                        wVarArr[i11] = ak2Var.zze(i11);
                    }
                    boolean z8 = G() && this.P.f5665e == 3;
                    boolean z9 = !z6 && z8;
                    this.f7684a0++;
                    mi2 mi2Var = vb2Var2.f9793c[i10];
                    long j7 = vb2Var2.f9805p;
                    oh2 oh2Var = vb2Var2.f9797g.f10148a;
                    sc2Var.f8899c = true;
                    y5.r(pa2Var.f8014z == 0);
                    pa2Var.f8010v = rc2Var;
                    pa2Var.f8014z = 1;
                    pa2Var.y(z9, z7);
                    xb2Var = xb2Var2;
                    boolean z10 = z7;
                    pa2Var.h(wVarArr, mi2Var, j6, j7, oh2Var);
                    pa2Var.F = false;
                    pa2Var.D = j6;
                    pa2Var.E = j6;
                    pa2Var.z(z9, j6);
                    va2 va2Var = this.F;
                    va2Var.getClass();
                    ub2 ub2VarT = pa2Var.t();
                    if (ub2VarT != null && ub2VarT != (ub2Var = va2Var.f9768v)) {
                        if (ub2Var != null) {
                            throw new wa2(2, new IllegalStateException("Multiple renderer media clocks enabled."), CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                        }
                        va2Var.f9768v = ub2VarT;
                        va2Var.f9767u = pa2Var;
                        ((ve2) ub2VarT).a(va2Var.s.f9811v);
                    }
                    pa2Var.b(11, new ib2());
                    if (z8 && z10 && (i8 = pa2Var.f8014z) == 1) {
                        y5.r(i8 == 1);
                        i7 = 2;
                        pa2Var.f8014z = 2;
                        pa2Var.e();
                    } else {
                        i7 = 2;
                    }
                }
            }
            i10++;
            i6 = i7;
            xb2Var2 = xb2Var;
        }
        vb2Var.h = true;
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final /* bridge */ /* synthetic */ void d(ni2 ni2Var) {
        this.f7701z.d(9, (nh2) ni2Var).a();
    }

    public final void e(IOException iOException, int i6) {
        wa2 wa2Var = new wa2(0, iOException, i6);
        vb2 vb2Var = this.I.h;
        if (vb2Var != null) {
            wa2Var = wa2Var.a(vb2Var.f9797g.f10148a);
        }
        qs0.d("ExoPlayerImplInternal", "Playback error", wa2Var);
        x(false, false);
        this.P = this.P.d(wa2Var);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final void f(nh2 nh2Var) {
        this.f7701z.d(8, nh2Var).a();
    }

    public final void g(boolean z6) {
        vb2 vb2Var = this.I.f10484j;
        oh2 oh2Var = vb2Var == null ? this.P.f5662b : vb2Var.f9797g.f10148a;
        boolean zEquals = this.P.f5670k.equals(oh2Var);
        if (!zEquals) {
            this.P = this.P.a(oh2Var);
        }
        ic2 ic2Var = this.P;
        ic2Var.f5675p = vb2Var == null ? ic2Var.f5677r : vb2Var.b();
        ic2 ic2Var2 = this.P;
        ic2Var2.f5676q = L(ic2Var2.f5675p);
        if ((!zEquals || z6) && vb2Var != null && vb2Var.f9795e) {
            A(vb2Var.f9803n, vb2Var.f9804o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.xb2] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.google.android.gms.internal.ads.zy] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(zy zyVar, boolean z6) throws Throwable {
        long j6;
        boolean z7;
        oh2 oh2Var;
        jx jxVar;
        boolean z8;
        long j7;
        boolean z9;
        boolean z10;
        boolean z11;
        long jLongValue;
        int iG;
        int i6;
        Object obj;
        int iG2;
        boolean z12;
        zy zyVar2;
        long jLongValue2;
        jx jxVar2;
        Object obj2;
        long j8;
        oh2 oh2VarS;
        boolean z13;
        long j9;
        boolean z14;
        boolean z15;
        long jM;
        boolean z16;
        int i7;
        int iG3;
        boolean z17;
        boolean z18;
        boolean z19;
        int i8;
        int i9;
        int i10;
        long j10;
        nb2 nb2Var;
        zy zyVar3;
        int i11;
        oh2 oh2Var2;
        oh2 oh2Var3;
        Object obj3;
        int i12;
        boolean z20;
        long j11;
        int i13;
        int i14;
        zy zyVar4;
        zy zyVar5;
        long j12;
        long j13;
        int i15;
        Object obj4;
        long j14;
        zy zyVar6;
        oh2 oh2Var4;
        long j15;
        int i16;
        ic2 ic2Var = this.P;
        nb2 nb2Var2 = this.f7685b0;
        int i17 = this.X;
        boolean z21 = this.Y;
        if (zyVar.o()) {
            zyVar2 = zyVar;
            oh2VarS = ic2.f5660t;
            z14 = true;
            z16 = false;
            z15 = false;
            jM = 0;
            j9 = -9223372036854775807L;
            z8 = false;
            j6 = -9223372036854775807L;
        } else {
            jx jxVar3 = this.D;
            oh2 oh2Var5 = ic2Var.f5662b;
            Object obj5 = oh2Var5.f7769a;
            zy zyVar7 = ic2Var.f5661a;
            if (zyVar7.o()) {
                j6 = -9223372036854775807L;
            } else {
                j6 = -9223372036854775807L;
                if (!zyVar7.n(oh2Var5.f7769a, jxVar3).f6184e) {
                    z7 = false;
                }
                long j16 = (!ic2Var.f5662b.b() || z7) ? ic2Var.f5663c : ic2Var.f5677r;
                Object obj6 = obj5;
                cy cyVar = this.C;
                if (nb2Var2 == null) {
                    oh2Var = oh2Var5;
                    Pair pairO = O(zyVar, nb2Var2, i17, z21, cyVar, jxVar3);
                    if (pairO == null) {
                        iG3 = zyVar.g(z21);
                        jLongValue = j16;
                        z17 = false;
                        z18 = false;
                        z19 = true;
                    } else {
                        if (nb2Var2.f7382c == j6) {
                            iG3 = zyVar.n(pairO.first, jxVar3).f6182c;
                            jLongValue = j16;
                            z17 = false;
                        } else {
                            Object obj7 = pairO.first;
                            jLongValue = ((Long) pairO.second).longValue();
                            obj6 = obj7;
                            iG3 = -1;
                            z17 = true;
                        }
                        z18 = ic2Var.f5665e == 4;
                        z19 = false;
                    }
                    z9 = z19;
                    j7 = j16;
                    iG = iG3;
                    jxVar = jxVar3;
                    z11 = z17;
                    z10 = z18;
                    i6 = -1;
                    z8 = false;
                } else {
                    oh2Var = oh2Var5;
                    if (ic2Var.f5661a.o()) {
                        iG = zyVar.g(z21);
                        jxVar = jxVar3;
                        jLongValue = j16;
                        j7 = jLongValue;
                        i6 = -1;
                        z9 = false;
                        z8 = false;
                        z10 = false;
                        z11 = false;
                    } else if (zyVar.a(obj6) == -1) {
                        jxVar = jxVar3;
                        z8 = false;
                        int iJ = J(cyVar, jxVar, i17, z21, obj6, ic2Var.f5661a, zyVar);
                        cyVar = cyVar;
                        obj6 = obj6;
                        if (iJ == -1) {
                            iG2 = zyVar.g(z21);
                            z12 = true;
                        } else {
                            iG2 = iJ;
                            z12 = false;
                        }
                        iG = iG2;
                        j7 = j16;
                        z10 = false;
                        z11 = false;
                        i6 = -1;
                        z9 = z12;
                        jLongValue = j7;
                    } else {
                        jxVar = jxVar3;
                        z8 = false;
                        if (j16 == j6) {
                            iG = zyVar.n(obj6, jxVar).f6182c;
                            jLongValue = j16;
                            j7 = jLongValue;
                            z9 = false;
                            z10 = false;
                            z11 = false;
                            i6 = -1;
                        } else if (z7) {
                            ic2Var.f5661a.n(oh2Var.f7769a, jxVar);
                            j7 = j16;
                            if (ic2Var.f5661a.e(jxVar.f6182c, cyVar, 0L).f3697k == ic2Var.f5661a.a(oh2Var.f7769a)) {
                                Pair pairL = zyVar.l(cyVar, jxVar, zyVar.n(obj6, jxVar).f6182c, j7);
                                cyVar = cyVar;
                                jxVar = jxVar;
                                obj = pairL.first;
                                jLongValue = ((Long) pairL.second).longValue();
                            } else {
                                obj = obj6;
                                jLongValue = j7;
                            }
                            obj6 = obj;
                            z9 = false;
                            z10 = false;
                            iG = -1;
                            i6 = -1;
                            z11 = true;
                        } else {
                            j7 = j16;
                            z9 = false;
                            z10 = false;
                            z11 = false;
                            jLongValue = j7;
                            iG = -1;
                            i6 = -1;
                        }
                    }
                }
                if (iG == i6) {
                    jxVar2 = jxVar;
                    int i18 = iG;
                    zyVar2 = zyVar;
                    Pair pairL2 = zyVar2.l(cyVar, jxVar2, i18, -9223372036854775807L);
                    Object obj8 = pairL2.first;
                    jLongValue2 = ((Long) pairL2.second).longValue();
                    obj2 = obj8;
                    j8 = j6;
                } else {
                    zyVar2 = zyVar;
                    jLongValue2 = jLongValue;
                    jxVar2 = jxVar;
                    obj2 = obj6;
                    j8 = jLongValue2;
                }
                oh2VarS = this.I.s(zyVar2, obj2);
                z13 = (oh2Var.f7769a.equals(obj2) || oh2Var.b() || oh2VarS.b()) ? z8 : true;
                jx jxVarN = zyVar2.n(obj2, jxVar2);
                if (!z7 && j7 == j8 && oh2Var.f7769a.equals(oh2VarS.f7769a)) {
                    if (oh2Var.b()) {
                        jxVarN.c(oh2Var.f7770b);
                    }
                    if (oh2VarS.b()) {
                        jxVarN.c(-1);
                    }
                }
                if (true == z13) {
                    oh2VarS = oh2Var;
                }
                if (oh2VarS.b()) {
                    if (oh2VarS.equals(oh2Var)) {
                        jLongValue2 = ic2Var.f5677r;
                    } else {
                        zyVar2.n(oh2VarS.f7769a, jxVar2);
                        int i19 = oh2VarS.f7771c;
                        a aVarA = jxVar2.f6185f.a(oh2VarS.f7770b);
                        ?? r5 = z8;
                        while (true) {
                            int[] iArr = aVarA.f2529d;
                            if (r5 >= iArr.length || (i7 = iArr[r5]) == 0 || i7 == 1) {
                                break;
                            } else {
                                r5++;
                            }
                        }
                        if (i19 == r5) {
                            jxVar2.f6185f.getClass();
                        }
                        jLongValue2 = 0;
                    }
                }
                j9 = j8;
                z14 = z9;
                z15 = z11;
                jM = jLongValue2;
                z16 = z10;
            }
            z7 = true;
            if (ic2Var.f5662b.b()) {
                Object obj62 = obj5;
                cy cyVar2 = this.C;
                if (nb2Var2 == null) {
                }
                if (iG == i6) {
                }
                oh2VarS = this.I.s(zyVar2, obj2);
                if (oh2Var.f7769a.equals(obj2)) {
                    jx jxVarN2 = zyVar2.n(obj2, jxVar2);
                    if (!z7) {
                        if (oh2Var.b()) {
                        }
                        if (oh2VarS.b()) {
                        }
                    }
                    if (true == z13) {
                    }
                    if (oh2VarS.b()) {
                    }
                    j9 = j8;
                    z14 = z9;
                    z15 = z11;
                    jM = jLongValue2;
                    z16 = z10;
                }
            }
        }
        boolean z22 = (this.P.f5662b.equals(oh2VarS) && jM == this.P.f5677r) ? z8 : true;
        if (z14) {
            try {
                if (this.P.f5665e != 1) {
                    i8 = 4;
                    i9 = 4;
                    try {
                        v(4);
                    } catch (Throwable th) {
                        th = th;
                        i10 = i8;
                        j10 = j9;
                        nb2Var = null;
                        zyVar3 = zyVar2;
                        oh2Var2 = oh2VarS;
                        i11 = 2;
                        ic2 ic2Var2 = this.P;
                        zy zyVar8 = ic2Var2.f5661a;
                        oh2 oh2Var6 = ic2Var2.f5662b;
                        oh2Var3 = oh2Var2;
                        C(zyVar3, oh2Var3, zyVar8, oh2Var6, true != z15 ? j6 : jM, false);
                        if (z22) {
                        }
                        q();
                        s(zyVar3, this.P.f5661a);
                        this.P = this.P.f(zyVar3);
                        if (!zyVar3.o()) {
                        }
                        g(z8);
                        this.f7701z.h(i14);
                        throw th;
                    }
                } else {
                    i9 = 4;
                }
                p(z8, z8, z8, true);
                i8 = i9;
            } catch (Throwable th2) {
                th = th2;
                i8 = 4;
                i10 = i8;
                j10 = j9;
                nb2Var = null;
                zyVar3 = zyVar2;
                oh2Var2 = oh2VarS;
                i11 = 2;
                ic2 ic2Var22 = this.P;
                zy zyVar82 = ic2Var22.f5661a;
                oh2 oh2Var62 = ic2Var22.f5662b;
                oh2Var3 = oh2Var2;
                C(zyVar3, oh2Var3, zyVar82, oh2Var62, true != z15 ? j6 : jM, false);
                if (z22) {
                }
                q();
                s(zyVar3, this.P.f5661a);
                this.P = this.P.f(zyVar3);
                if (!zyVar3.o()) {
                }
                g(z8);
                this.f7701z.h(i14);
                throw th;
            }
        } else {
            i8 = 4;
        }
        sc2[] sc2VarArr = this.s;
        ?? r7 = i8;
        for (?? r52 = z8; r52 < 2; r52++) {
            try {
                pa2 pa2Var = sc2VarArr[r52].f8897a;
                if (!Objects.equals(pa2Var.H, zyVar2)) {
                    pa2Var.H = zyVar2;
                }
                r7 = 4;
            } catch (Throwable th3) {
                th = th3;
                j10 = j9;
                nb2Var = null;
                i10 = 4;
                zyVar3 = zyVar2;
                oh2Var2 = oh2VarS;
                i11 = 2;
                ic2 ic2Var222 = this.P;
                zy zyVar822 = ic2Var222.f5661a;
                oh2 oh2Var622 = ic2Var222.f5662b;
                oh2Var3 = oh2Var2;
                C(zyVar3, oh2Var3, zyVar822, oh2Var622, true != z15 ? j6 : jM, false);
                if (z22) {
                }
                q();
                s(zyVar3, this.P.f5661a);
                this.P = this.P.f(zyVar3);
                if (!zyVar3.o()) {
                }
                g(z8);
                this.f7701z.h(i14);
                throw th;
            }
        }
        try {
            if (z22) {
                r7 = zyVar2;
                i10 = 4;
                if (r7.o()) {
                    oh2Var2 = oh2VarS;
                } else {
                    for (vb2 vb2Var = this.I.h; vb2Var != null; vb2Var = vb2Var.f9802m) {
                        if (vb2Var.f9797g.f10148a.equals(oh2VarS)) {
                            wb2 wb2VarR = this.I.r(r7, vb2Var.f9797g);
                            vb2Var.f9797g = wb2VarR;
                            Object obj9 = vb2Var.f9791a;
                            if (obj9 instanceof vg2) {
                                long j17 = wb2VarR.f10151d;
                                if (j17 == j6) {
                                    j17 = Long.MIN_VALUE;
                                }
                                ((vg2) obj9).f9865w = j17;
                            }
                        }
                    }
                    try {
                        xb2 xb2Var = this.I;
                        oh2Var2 = oh2VarS;
                        long j18 = jM;
                        try {
                            jM = M(oh2Var2, j18, xb2Var.h != xb2Var.f10483i ? true : z8, z16);
                        } catch (Throwable th4) {
                            th = th4;
                            jM = j18;
                            zyVar4 = r7;
                            j10 = j9;
                            i11 = 2;
                            nb2Var = null;
                            zyVar3 = zyVar4;
                            ic2 ic2Var2222 = this.P;
                            zy zyVar8222 = ic2Var2222.f5661a;
                            oh2 oh2Var6222 = ic2Var2222.f5662b;
                            oh2Var3 = oh2Var2;
                            C(zyVar3, oh2Var3, zyVar8222, oh2Var6222, true != z15 ? j6 : jM, false);
                            if (z22) {
                            }
                            q();
                            s(zyVar3, this.P.f5661a);
                            this.P = this.P.f(zyVar3);
                            if (!zyVar3.o()) {
                            }
                            g(z8);
                            this.f7701z.h(i14);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        oh2Var2 = oh2VarS;
                        zyVar4 = r7;
                        j10 = j9;
                        i11 = 2;
                        nb2Var = null;
                        zyVar3 = zyVar4;
                        ic2 ic2Var22222 = this.P;
                        zy zyVar82222 = ic2Var22222.f5661a;
                        oh2 oh2Var62222 = ic2Var22222.f5662b;
                        oh2Var3 = oh2Var2;
                        C(zyVar3, oh2Var3, zyVar82222, oh2Var62222, true != z15 ? j6 : jM, false);
                        if (z22) {
                        }
                        q();
                        s(zyVar3, this.P.f5661a);
                        this.P = this.P.f(zyVar3);
                        if (!zyVar3.o()) {
                        }
                        g(z8);
                        this.f7701z.h(i14);
                        throw th;
                    }
                }
                ic2 ic2Var3 = this.P;
                oh2 oh2Var7 = oh2Var2;
                C(zyVar, oh2Var7, ic2Var3.f5661a, ic2Var3.f5662b, true == z15 ? j6 : jM, false);
                if (z22) {
                    ic2 ic2Var4 = this.P;
                    obj4 = ic2Var4.f5662b.f7769a;
                    zy zyVar9 = ic2Var4.f5661a;
                    if (z22) {
                        long j19 = this.P.f5664d;
                        if (zyVar.a(obj4) != -1) {
                        }
                        this.P = a(oh2Var4, j15, j14, j19, z, i16);
                    }
                }
                q();
                s(zyVar6, this.P.f5661a);
                this.P = this.P.f(zyVar6);
                if (!zyVar6.o()) {
                }
                g(z8);
                this.f7701z.h(2);
                return;
            }
            try {
                xb2 xb2Var2 = this.I;
                long j20 = this.f7686c0;
                vb2 vb2Var2 = xb2Var2.f10483i;
                if (vb2Var2 == null) {
                    zyVar5 = zyVar;
                    j13 = j20;
                    j12 = 0;
                } else {
                    long j21 = vb2Var2.f9805p;
                    if (vb2Var2.f9795e) {
                        long jMax = j21;
                        ?? r42 = z8;
                        while (true) {
                            try {
                                sc2[] sc2VarArr2 = this.s;
                                if (r42 >= 2) {
                                    zyVar5 = zyVar;
                                    j12 = jMax;
                                    break;
                                }
                                if (sc2VarArr2[r42].k(vb2Var2)) {
                                    sc2 sc2Var = this.s[r42];
                                    y5.r(sc2Var.k(vb2Var2));
                                    i15 = r42;
                                    long j22 = sc2Var.f8897a.E;
                                    if (j22 == Long.MIN_VALUE) {
                                        zyVar5 = zyVar;
                                        j12 = Long.MIN_VALUE;
                                        break;
                                    }
                                    jMax = Math.max(j22, jMax);
                                } else {
                                    i15 = r42;
                                }
                                r42 = i15 + 1;
                            } catch (Throwable th6) {
                                th = th6;
                                oh2Var2 = oh2VarS;
                                j10 = j9;
                                i11 = 2;
                                nb2Var = null;
                                i10 = 4;
                                zyVar3 = zyVar;
                            }
                        }
                    } else {
                        zyVar5 = zyVar;
                        j12 = j21;
                    }
                    j13 = j20;
                }
                i10 = 4;
                try {
                    if (!xb2Var2.z(zyVar5, j13, j12)) {
                        t(z8);
                    }
                    oh2Var2 = oh2VarS;
                    ic2 ic2Var32 = this.P;
                    oh2 oh2Var72 = oh2Var2;
                    C(zyVar, oh2Var72, ic2Var32.f5661a, ic2Var32.f5662b, true == z15 ? j6 : jM, false);
                    if (z22 && j9 == this.P.f5663c) {
                        zyVar6 = zyVar;
                    } else {
                        ic2 ic2Var42 = this.P;
                        obj4 = ic2Var42.f5662b.f7769a;
                        zy zyVar92 = ic2Var42.f5661a;
                        boolean z23 = (z22 || !z6 || zyVar92.o() || zyVar92.n(obj4, this.D).f6184e) ? z8 : true;
                        long j192 = this.P.f5664d;
                        if (zyVar.a(obj4) != -1) {
                            j14 = j9;
                            zyVar6 = zyVar;
                            oh2Var4 = oh2Var72;
                            j15 = jM;
                            i16 = i10;
                        } else {
                            j14 = j9;
                            zyVar6 = zyVar;
                            oh2Var4 = oh2Var72;
                            j15 = jM;
                            i16 = 3;
                        }
                        this.P = a(oh2Var4, j15, j14, j192, z23, i16);
                    }
                    q();
                    s(zyVar6, this.P.f5661a);
                    this.P = this.P.f(zyVar6);
                    if (!zyVar6.o()) {
                        this.f7685b0 = null;
                    }
                    g(z8);
                    this.f7701z.h(2);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    r7 = zyVar5;
                    oh2Var2 = oh2VarS;
                    zyVar4 = r7;
                    j10 = j9;
                    i11 = 2;
                    nb2Var = null;
                    zyVar3 = zyVar4;
                    ic2 ic2Var222222 = this.P;
                    zy zyVar822222 = ic2Var222222.f5661a;
                    oh2 oh2Var622222 = ic2Var222222.f5662b;
                    oh2Var3 = oh2Var2;
                    C(zyVar3, oh2Var3, zyVar822222, oh2Var622222, true != z15 ? j6 : jM, false);
                    if (z22) {
                        ic2 ic2Var5 = this.P;
                        obj3 = ic2Var5.f5662b.f7769a;
                        zy zyVar10 = ic2Var5.f5661a;
                        if (z22) {
                            i12 = i11;
                            z20 = z8;
                            long j23 = this.P.f5664d;
                            if (zyVar3.a(obj3) != -1) {
                            }
                            i14 = i12;
                            this.P = a(oh2Var3, j11, j10, j23, z20, i13);
                        }
                    }
                    q();
                    s(zyVar3, this.P.f5661a);
                    this.P = this.P.f(zyVar3);
                    if (!zyVar3.o()) {
                    }
                    g(z8);
                    this.f7701z.h(i14);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                r7 = zyVar;
                i10 = 4;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        ic2 ic2Var2222222 = this.P;
        zy zyVar8222222 = ic2Var2222222.f5661a;
        oh2 oh2Var6222222 = ic2Var2222222.f5662b;
        oh2Var3 = oh2Var2;
        C(zyVar3, oh2Var3, zyVar8222222, oh2Var6222222, true != z15 ? j6 : jM, false);
        if (z22 || j10 != this.P.f5663c) {
            ic2 ic2Var52 = this.P;
            obj3 = ic2Var52.f5662b.f7769a;
            zy zyVar102 = ic2Var52.f5661a;
            if (z22 || !z6 || zyVar102.o() || zyVar102.n(obj3, this.D).f6184e) {
                i12 = i11;
                z20 = z8;
            } else {
                i12 = i11;
                z20 = true;
            }
            long j232 = this.P.f5664d;
            if (zyVar3.a(obj3) != -1) {
                j11 = jM;
                i13 = i10;
            } else {
                j11 = jM;
                i13 = 3;
            }
            i14 = i12;
            this.P = a(oh2Var3, j11, j10, j232, z20, i13);
        } else {
            i14 = i11;
        }
        q();
        s(zyVar3, this.P.f5661a);
        this.P = this.P.f(zyVar3);
        if (!zyVar3.o()) {
            this.f7685b0 = nb2Var;
        }
        g(z8);
        this.f7701z.h(i14);
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:322:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x09a8 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, dp1 -> 0x0030, rn -> 0x0033, ze2 -> 0x0036, wa2 -> 0x0039, TryCatch #14 {dp1 -> 0x0030, rn -> 0x0033, wa2 -> 0x0039, ze2 -> 0x0036, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004a, B:29:0x004b, B:32:0x0065, B:33:0x007a, B:34:0x008b, B:35:0x00a3, B:36:0x00ab, B:37:0x00b3, B:41:0x00ba, B:43:0x00c3, B:45:0x00d1, B:46:0x00d9, B:47:0x00e4, B:48:0x00f8, B:49:0x0110, B:50:0x0127, B:52:0x0136, B:53:0x013c, B:54:0x0149, B:56:0x0156, B:57:0x016c, B:58:0x017b, B:59:0x0186, B:61:0x0196, B:62:0x01a2, B:63:0x01b4, B:65:0x01bf, B:66:0x01c0, B:68:0x01ca, B:71:0x01d5, B:73:0x01dd, B:74:0x01e0, B:75:0x01e1, B:76:0x01ec, B:80:0x01f3, B:82:0x01fb, B:84:0x01ff, B:86:0x0204, B:88:0x020c, B:89:0x020f, B:91:0x0214, B:97:0x0220, B:98:0x0221, B:102:0x0228, B:104:0x0236, B:105:0x0239, B:106:0x023e, B:108:0x024e, B:109:0x0251, B:110:0x0256, B:111:0x025b, B:113:0x0265, B:118:0x026e, B:120:0x0272, B:124:0x0279, B:126:0x0280, B:127:0x0288, B:128:0x028d, B:130:0x0291, B:135:0x029a, B:136:0x029f, B:138:0x02a9, B:144:0x02b4, B:146:0x02b8, B:147:0x02c7, B:149:0x02da, B:150:0x0301, B:151:0x0306, B:152:0x0307, B:154:0x030d, B:156:0x0328, B:161:0x0331, B:169:0x0359, B:170:0x035e, B:176:0x0368, B:185:0x0379, B:186:0x037e, B:187:0x0386, B:188:0x03a3, B:190:0x03ca, B:274:0x050e, B:247:0x04c9, B:246:0x04c5, B:286:0x0523, B:287:0x052b, B:191:0x03f4, B:196:0x0410, B:198:0x0420, B:199:0x0434, B:201:0x0439, B:205:0x0440, B:207:0x0445, B:209:0x0450, B:288:0x052c, B:290:0x0544, B:293:0x0550, B:295:0x0558, B:299:0x055f, B:301:0x0566, B:302:0x056e, B:304:0x0576, B:306:0x0582, B:308:0x058c, B:312:0x05a7, B:314:0x05af, B:315:0x05b4, B:309:0x0596, B:311:0x059a, B:316:0x05b8, B:318:0x05bc, B:320:0x05cd, B:388:0x06ee, B:390:0x06f6, B:392:0x06fe, B:395:0x0704, B:396:0x0710, B:398:0x0714, B:400:0x071c, B:403:0x0728, B:405:0x072e, B:407:0x0736, B:409:0x073c, B:411:0x0741, B:412:0x074a, B:413:0x0764, B:415:0x076a, B:417:0x076f, B:419:0x0774, B:421:0x0782, B:459:0x0830, B:460:0x0835, B:464:0x083f, B:466:0x0847, B:468:0x084d, B:472:0x0858, B:471:0x0856, B:473:0x0861, B:475:0x086d, B:476:0x0886, B:478:0x088a, B:480:0x0892, B:495:0x08c2, B:481:0x0898, B:483:0x08a2, B:487:0x08ad, B:493:0x08bd, B:498:0x08d0, B:500:0x08d6, B:504:0x08e3, B:513:0x090d, B:515:0x0913, B:517:0x0917, B:542:0x099d, B:544:0x09a8, B:546:0x09b6, B:547:0x09be, B:566:0x0a08, B:569:0x0a0f, B:571:0x0a13, B:573:0x0a1b, B:574:0x0a1e, B:575:0x0a21, B:577:0x0a27, B:579:0x0a30, B:581:0x0a3a, B:583:0x0a40, B:590:0x0a5f, B:592:0x0a65, B:596:0x0a6e, B:610:0x0a98, B:602:0x0a80, B:605:0x0a86, B:609:0x0a91, B:608:0x0a8f, B:584:0x0a47, B:587:0x0a55, B:588:0x0a5c, B:589:0x0a5d, B:520:0x0921, B:522:0x0925, B:524:0x0939, B:526:0x0944, B:528:0x094e, B:532:0x0957, B:534:0x0961, B:540:0x096c, B:548:0x09c2, B:550:0x09c8, B:552:0x09cc, B:556:0x09d5, B:558:0x09e4, B:560:0x09ec, B:562:0x09f8, B:563:0x09fd, B:564:0x0a00, B:565:0x0a05, B:506:0x08eb, B:508:0x08ef, B:509:0x08fa, B:511:0x0900, B:497:0x08c8, B:424:0x078b, B:426:0x078f, B:428:0x0797, B:430:0x079b, B:432:0x07a5, B:435:0x07ab, B:436:0x07ae, B:438:0x07b6, B:440:0x07c8, B:442:0x07d0, B:444:0x07d8, B:448:0x07e1, B:450:0x0806, B:451:0x0809, B:453:0x0816, B:455:0x081c, B:456:0x0823, B:458:0x082f, B:323:0x05d8, B:325:0x05dc, B:328:0x05e3, B:331:0x05ee, B:333:0x05f2, B:335:0x05fa, B:336:0x05fd, B:338:0x0603, B:340:0x060d, B:342:0x0643, B:344:0x064d, B:346:0x0655, B:348:0x065f, B:349:0x0662, B:350:0x0664, B:351:0x0665, B:353:0x066b, B:356:0x067c, B:358:0x0686, B:360:0x0690, B:362:0x06a5, B:364:0x06ab, B:367:0x06bb, B:368:0x06bd, B:369:0x06be, B:370:0x06c1, B:372:0x06c7, B:375:0x06cc, B:377:0x06d0, B:387:0x06eb, B:380:0x06d9, B:382:0x06df, B:385:0x06e8, B:386:0x06ea, B:319:0x05ca, B:611:0x0a9d, B:615:0x0aa4, B:177:0x0369, B:178:0x036e, B:181:0x0375, B:184:0x0378), top: B:690:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x09c2 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, dp1 -> 0x0030, rn -> 0x0033, ze2 -> 0x0036, wa2 -> 0x0039, TryCatch #14 {dp1 -> 0x0030, rn -> 0x0033, wa2 -> 0x0039, ze2 -> 0x0036, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004a, B:29:0x004b, B:32:0x0065, B:33:0x007a, B:34:0x008b, B:35:0x00a3, B:36:0x00ab, B:37:0x00b3, B:41:0x00ba, B:43:0x00c3, B:45:0x00d1, B:46:0x00d9, B:47:0x00e4, B:48:0x00f8, B:49:0x0110, B:50:0x0127, B:52:0x0136, B:53:0x013c, B:54:0x0149, B:56:0x0156, B:57:0x016c, B:58:0x017b, B:59:0x0186, B:61:0x0196, B:62:0x01a2, B:63:0x01b4, B:65:0x01bf, B:66:0x01c0, B:68:0x01ca, B:71:0x01d5, B:73:0x01dd, B:74:0x01e0, B:75:0x01e1, B:76:0x01ec, B:80:0x01f3, B:82:0x01fb, B:84:0x01ff, B:86:0x0204, B:88:0x020c, B:89:0x020f, B:91:0x0214, B:97:0x0220, B:98:0x0221, B:102:0x0228, B:104:0x0236, B:105:0x0239, B:106:0x023e, B:108:0x024e, B:109:0x0251, B:110:0x0256, B:111:0x025b, B:113:0x0265, B:118:0x026e, B:120:0x0272, B:124:0x0279, B:126:0x0280, B:127:0x0288, B:128:0x028d, B:130:0x0291, B:135:0x029a, B:136:0x029f, B:138:0x02a9, B:144:0x02b4, B:146:0x02b8, B:147:0x02c7, B:149:0x02da, B:150:0x0301, B:151:0x0306, B:152:0x0307, B:154:0x030d, B:156:0x0328, B:161:0x0331, B:169:0x0359, B:170:0x035e, B:176:0x0368, B:185:0x0379, B:186:0x037e, B:187:0x0386, B:188:0x03a3, B:190:0x03ca, B:274:0x050e, B:247:0x04c9, B:246:0x04c5, B:286:0x0523, B:287:0x052b, B:191:0x03f4, B:196:0x0410, B:198:0x0420, B:199:0x0434, B:201:0x0439, B:205:0x0440, B:207:0x0445, B:209:0x0450, B:288:0x052c, B:290:0x0544, B:293:0x0550, B:295:0x0558, B:299:0x055f, B:301:0x0566, B:302:0x056e, B:304:0x0576, B:306:0x0582, B:308:0x058c, B:312:0x05a7, B:314:0x05af, B:315:0x05b4, B:309:0x0596, B:311:0x059a, B:316:0x05b8, B:318:0x05bc, B:320:0x05cd, B:388:0x06ee, B:390:0x06f6, B:392:0x06fe, B:395:0x0704, B:396:0x0710, B:398:0x0714, B:400:0x071c, B:403:0x0728, B:405:0x072e, B:407:0x0736, B:409:0x073c, B:411:0x0741, B:412:0x074a, B:413:0x0764, B:415:0x076a, B:417:0x076f, B:419:0x0774, B:421:0x0782, B:459:0x0830, B:460:0x0835, B:464:0x083f, B:466:0x0847, B:468:0x084d, B:472:0x0858, B:471:0x0856, B:473:0x0861, B:475:0x086d, B:476:0x0886, B:478:0x088a, B:480:0x0892, B:495:0x08c2, B:481:0x0898, B:483:0x08a2, B:487:0x08ad, B:493:0x08bd, B:498:0x08d0, B:500:0x08d6, B:504:0x08e3, B:513:0x090d, B:515:0x0913, B:517:0x0917, B:542:0x099d, B:544:0x09a8, B:546:0x09b6, B:547:0x09be, B:566:0x0a08, B:569:0x0a0f, B:571:0x0a13, B:573:0x0a1b, B:574:0x0a1e, B:575:0x0a21, B:577:0x0a27, B:579:0x0a30, B:581:0x0a3a, B:583:0x0a40, B:590:0x0a5f, B:592:0x0a65, B:596:0x0a6e, B:610:0x0a98, B:602:0x0a80, B:605:0x0a86, B:609:0x0a91, B:608:0x0a8f, B:584:0x0a47, B:587:0x0a55, B:588:0x0a5c, B:589:0x0a5d, B:520:0x0921, B:522:0x0925, B:524:0x0939, B:526:0x0944, B:528:0x094e, B:532:0x0957, B:534:0x0961, B:540:0x096c, B:548:0x09c2, B:550:0x09c8, B:552:0x09cc, B:556:0x09d5, B:558:0x09e4, B:560:0x09ec, B:562:0x09f8, B:563:0x09fd, B:564:0x0a00, B:565:0x0a05, B:506:0x08eb, B:508:0x08ef, B:509:0x08fa, B:511:0x0900, B:497:0x08c8, B:424:0x078b, B:426:0x078f, B:428:0x0797, B:430:0x079b, B:432:0x07a5, B:435:0x07ab, B:436:0x07ae, B:438:0x07b6, B:440:0x07c8, B:442:0x07d0, B:444:0x07d8, B:448:0x07e1, B:450:0x0806, B:451:0x0809, B:453:0x0816, B:455:0x081c, B:456:0x0823, B:458:0x082f, B:323:0x05d8, B:325:0x05dc, B:328:0x05e3, B:331:0x05ee, B:333:0x05f2, B:335:0x05fa, B:336:0x05fd, B:338:0x0603, B:340:0x060d, B:342:0x0643, B:344:0x064d, B:346:0x0655, B:348:0x065f, B:349:0x0662, B:350:0x0664, B:351:0x0665, B:353:0x066b, B:356:0x067c, B:358:0x0686, B:360:0x0690, B:362:0x06a5, B:364:0x06ab, B:367:0x06bb, B:368:0x06bd, B:369:0x06be, B:370:0x06c1, B:372:0x06c7, B:375:0x06cc, B:377:0x06d0, B:387:0x06eb, B:380:0x06d9, B:382:0x06df, B:385:0x06e8, B:386:0x06ea, B:319:0x05ca, B:611:0x0a9d, B:615:0x0aa4, B:177:0x0369, B:178:0x036e, B:181:0x0375, B:184:0x0378), top: B:690:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x09c8 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, dp1 -> 0x0030, rn -> 0x0033, ze2 -> 0x0036, wa2 -> 0x0039, TryCatch #14 {dp1 -> 0x0030, rn -> 0x0033, wa2 -> 0x0039, ze2 -> 0x0036, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004a, B:29:0x004b, B:32:0x0065, B:33:0x007a, B:34:0x008b, B:35:0x00a3, B:36:0x00ab, B:37:0x00b3, B:41:0x00ba, B:43:0x00c3, B:45:0x00d1, B:46:0x00d9, B:47:0x00e4, B:48:0x00f8, B:49:0x0110, B:50:0x0127, B:52:0x0136, B:53:0x013c, B:54:0x0149, B:56:0x0156, B:57:0x016c, B:58:0x017b, B:59:0x0186, B:61:0x0196, B:62:0x01a2, B:63:0x01b4, B:65:0x01bf, B:66:0x01c0, B:68:0x01ca, B:71:0x01d5, B:73:0x01dd, B:74:0x01e0, B:75:0x01e1, B:76:0x01ec, B:80:0x01f3, B:82:0x01fb, B:84:0x01ff, B:86:0x0204, B:88:0x020c, B:89:0x020f, B:91:0x0214, B:97:0x0220, B:98:0x0221, B:102:0x0228, B:104:0x0236, B:105:0x0239, B:106:0x023e, B:108:0x024e, B:109:0x0251, B:110:0x0256, B:111:0x025b, B:113:0x0265, B:118:0x026e, B:120:0x0272, B:124:0x0279, B:126:0x0280, B:127:0x0288, B:128:0x028d, B:130:0x0291, B:135:0x029a, B:136:0x029f, B:138:0x02a9, B:144:0x02b4, B:146:0x02b8, B:147:0x02c7, B:149:0x02da, B:150:0x0301, B:151:0x0306, B:152:0x0307, B:154:0x030d, B:156:0x0328, B:161:0x0331, B:169:0x0359, B:170:0x035e, B:176:0x0368, B:185:0x0379, B:186:0x037e, B:187:0x0386, B:188:0x03a3, B:190:0x03ca, B:274:0x050e, B:247:0x04c9, B:246:0x04c5, B:286:0x0523, B:287:0x052b, B:191:0x03f4, B:196:0x0410, B:198:0x0420, B:199:0x0434, B:201:0x0439, B:205:0x0440, B:207:0x0445, B:209:0x0450, B:288:0x052c, B:290:0x0544, B:293:0x0550, B:295:0x0558, B:299:0x055f, B:301:0x0566, B:302:0x056e, B:304:0x0576, B:306:0x0582, B:308:0x058c, B:312:0x05a7, B:314:0x05af, B:315:0x05b4, B:309:0x0596, B:311:0x059a, B:316:0x05b8, B:318:0x05bc, B:320:0x05cd, B:388:0x06ee, B:390:0x06f6, B:392:0x06fe, B:395:0x0704, B:396:0x0710, B:398:0x0714, B:400:0x071c, B:403:0x0728, B:405:0x072e, B:407:0x0736, B:409:0x073c, B:411:0x0741, B:412:0x074a, B:413:0x0764, B:415:0x076a, B:417:0x076f, B:419:0x0774, B:421:0x0782, B:459:0x0830, B:460:0x0835, B:464:0x083f, B:466:0x0847, B:468:0x084d, B:472:0x0858, B:471:0x0856, B:473:0x0861, B:475:0x086d, B:476:0x0886, B:478:0x088a, B:480:0x0892, B:495:0x08c2, B:481:0x0898, B:483:0x08a2, B:487:0x08ad, B:493:0x08bd, B:498:0x08d0, B:500:0x08d6, B:504:0x08e3, B:513:0x090d, B:515:0x0913, B:517:0x0917, B:542:0x099d, B:544:0x09a8, B:546:0x09b6, B:547:0x09be, B:566:0x0a08, B:569:0x0a0f, B:571:0x0a13, B:573:0x0a1b, B:574:0x0a1e, B:575:0x0a21, B:577:0x0a27, B:579:0x0a30, B:581:0x0a3a, B:583:0x0a40, B:590:0x0a5f, B:592:0x0a65, B:596:0x0a6e, B:610:0x0a98, B:602:0x0a80, B:605:0x0a86, B:609:0x0a91, B:608:0x0a8f, B:584:0x0a47, B:587:0x0a55, B:588:0x0a5c, B:589:0x0a5d, B:520:0x0921, B:522:0x0925, B:524:0x0939, B:526:0x0944, B:528:0x094e, B:532:0x0957, B:534:0x0961, B:540:0x096c, B:548:0x09c2, B:550:0x09c8, B:552:0x09cc, B:556:0x09d5, B:558:0x09e4, B:560:0x09ec, B:562:0x09f8, B:563:0x09fd, B:564:0x0a00, B:565:0x0a05, B:506:0x08eb, B:508:0x08ef, B:509:0x08fa, B:511:0x0900, B:497:0x08c8, B:424:0x078b, B:426:0x078f, B:428:0x0797, B:430:0x079b, B:432:0x07a5, B:435:0x07ab, B:436:0x07ae, B:438:0x07b6, B:440:0x07c8, B:442:0x07d0, B:444:0x07d8, B:448:0x07e1, B:450:0x0806, B:451:0x0809, B:453:0x0816, B:455:0x081c, B:456:0x0823, B:458:0x082f, B:323:0x05d8, B:325:0x05dc, B:328:0x05e3, B:331:0x05ee, B:333:0x05f2, B:335:0x05fa, B:336:0x05fd, B:338:0x0603, B:340:0x060d, B:342:0x0643, B:344:0x064d, B:346:0x0655, B:348:0x065f, B:349:0x0662, B:350:0x0664, B:351:0x0665, B:353:0x066b, B:356:0x067c, B:358:0x0686, B:360:0x0690, B:362:0x06a5, B:364:0x06ab, B:367:0x06bb, B:368:0x06bd, B:369:0x06be, B:370:0x06c1, B:372:0x06c7, B:375:0x06cc, B:377:0x06d0, B:387:0x06eb, B:380:0x06d9, B:382:0x06df, B:385:0x06e8, B:386:0x06ea, B:319:0x05ca, B:611:0x0a9d, B:615:0x0aa4, B:177:0x0369, B:178:0x036e, B:181:0x0375, B:184:0x0378), top: B:690:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x09e4 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, dp1 -> 0x0030, rn -> 0x0033, ze2 -> 0x0036, wa2 -> 0x0039, TryCatch #14 {dp1 -> 0x0030, rn -> 0x0033, wa2 -> 0x0039, ze2 -> 0x0036, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004a, B:29:0x004b, B:32:0x0065, B:33:0x007a, B:34:0x008b, B:35:0x00a3, B:36:0x00ab, B:37:0x00b3, B:41:0x00ba, B:43:0x00c3, B:45:0x00d1, B:46:0x00d9, B:47:0x00e4, B:48:0x00f8, B:49:0x0110, B:50:0x0127, B:52:0x0136, B:53:0x013c, B:54:0x0149, B:56:0x0156, B:57:0x016c, B:58:0x017b, B:59:0x0186, B:61:0x0196, B:62:0x01a2, B:63:0x01b4, B:65:0x01bf, B:66:0x01c0, B:68:0x01ca, B:71:0x01d5, B:73:0x01dd, B:74:0x01e0, B:75:0x01e1, B:76:0x01ec, B:80:0x01f3, B:82:0x01fb, B:84:0x01ff, B:86:0x0204, B:88:0x020c, B:89:0x020f, B:91:0x0214, B:97:0x0220, B:98:0x0221, B:102:0x0228, B:104:0x0236, B:105:0x0239, B:106:0x023e, B:108:0x024e, B:109:0x0251, B:110:0x0256, B:111:0x025b, B:113:0x0265, B:118:0x026e, B:120:0x0272, B:124:0x0279, B:126:0x0280, B:127:0x0288, B:128:0x028d, B:130:0x0291, B:135:0x029a, B:136:0x029f, B:138:0x02a9, B:144:0x02b4, B:146:0x02b8, B:147:0x02c7, B:149:0x02da, B:150:0x0301, B:151:0x0306, B:152:0x0307, B:154:0x030d, B:156:0x0328, B:161:0x0331, B:169:0x0359, B:170:0x035e, B:176:0x0368, B:185:0x0379, B:186:0x037e, B:187:0x0386, B:188:0x03a3, B:190:0x03ca, B:274:0x050e, B:247:0x04c9, B:246:0x04c5, B:286:0x0523, B:287:0x052b, B:191:0x03f4, B:196:0x0410, B:198:0x0420, B:199:0x0434, B:201:0x0439, B:205:0x0440, B:207:0x0445, B:209:0x0450, B:288:0x052c, B:290:0x0544, B:293:0x0550, B:295:0x0558, B:299:0x055f, B:301:0x0566, B:302:0x056e, B:304:0x0576, B:306:0x0582, B:308:0x058c, B:312:0x05a7, B:314:0x05af, B:315:0x05b4, B:309:0x0596, B:311:0x059a, B:316:0x05b8, B:318:0x05bc, B:320:0x05cd, B:388:0x06ee, B:390:0x06f6, B:392:0x06fe, B:395:0x0704, B:396:0x0710, B:398:0x0714, B:400:0x071c, B:403:0x0728, B:405:0x072e, B:407:0x0736, B:409:0x073c, B:411:0x0741, B:412:0x074a, B:413:0x0764, B:415:0x076a, B:417:0x076f, B:419:0x0774, B:421:0x0782, B:459:0x0830, B:460:0x0835, B:464:0x083f, B:466:0x0847, B:468:0x084d, B:472:0x0858, B:471:0x0856, B:473:0x0861, B:475:0x086d, B:476:0x0886, B:478:0x088a, B:480:0x0892, B:495:0x08c2, B:481:0x0898, B:483:0x08a2, B:487:0x08ad, B:493:0x08bd, B:498:0x08d0, B:500:0x08d6, B:504:0x08e3, B:513:0x090d, B:515:0x0913, B:517:0x0917, B:542:0x099d, B:544:0x09a8, B:546:0x09b6, B:547:0x09be, B:566:0x0a08, B:569:0x0a0f, B:571:0x0a13, B:573:0x0a1b, B:574:0x0a1e, B:575:0x0a21, B:577:0x0a27, B:579:0x0a30, B:581:0x0a3a, B:583:0x0a40, B:590:0x0a5f, B:592:0x0a65, B:596:0x0a6e, B:610:0x0a98, B:602:0x0a80, B:605:0x0a86, B:609:0x0a91, B:608:0x0a8f, B:584:0x0a47, B:587:0x0a55, B:588:0x0a5c, B:589:0x0a5d, B:520:0x0921, B:522:0x0925, B:524:0x0939, B:526:0x0944, B:528:0x094e, B:532:0x0957, B:534:0x0961, B:540:0x096c, B:548:0x09c2, B:550:0x09c8, B:552:0x09cc, B:556:0x09d5, B:558:0x09e4, B:560:0x09ec, B:562:0x09f8, B:563:0x09fd, B:564:0x0a00, B:565:0x0a05, B:506:0x08eb, B:508:0x08ef, B:509:0x08fa, B:511:0x0900, B:497:0x08c8, B:424:0x078b, B:426:0x078f, B:428:0x0797, B:430:0x079b, B:432:0x07a5, B:435:0x07ab, B:436:0x07ae, B:438:0x07b6, B:440:0x07c8, B:442:0x07d0, B:444:0x07d8, B:448:0x07e1, B:450:0x0806, B:451:0x0809, B:453:0x0816, B:455:0x081c, B:456:0x0823, B:458:0x082f, B:323:0x05d8, B:325:0x05dc, B:328:0x05e3, B:331:0x05ee, B:333:0x05f2, B:335:0x05fa, B:336:0x05fd, B:338:0x0603, B:340:0x060d, B:342:0x0643, B:344:0x064d, B:346:0x0655, B:348:0x065f, B:349:0x0662, B:350:0x0664, B:351:0x0665, B:353:0x066b, B:356:0x067c, B:358:0x0686, B:360:0x0690, B:362:0x06a5, B:364:0x06ab, B:367:0x06bb, B:368:0x06bd, B:369:0x06be, B:370:0x06c1, B:372:0x06c7, B:375:0x06cc, B:377:0x06d0, B:387:0x06eb, B:380:0x06d9, B:382:0x06df, B:385:0x06e8, B:386:0x06ea, B:319:0x05ca, B:611:0x0a9d, B:615:0x0aa4, B:177:0x0369, B:178:0x036e, B:181:0x0375, B:184:0x0378), top: B:690:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0a5d A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, dp1 -> 0x0030, rn -> 0x0033, ze2 -> 0x0036, wa2 -> 0x0039, TryCatch #14 {dp1 -> 0x0030, rn -> 0x0033, wa2 -> 0x0039, ze2 -> 0x0036, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004a, B:29:0x004b, B:32:0x0065, B:33:0x007a, B:34:0x008b, B:35:0x00a3, B:36:0x00ab, B:37:0x00b3, B:41:0x00ba, B:43:0x00c3, B:45:0x00d1, B:46:0x00d9, B:47:0x00e4, B:48:0x00f8, B:49:0x0110, B:50:0x0127, B:52:0x0136, B:53:0x013c, B:54:0x0149, B:56:0x0156, B:57:0x016c, B:58:0x017b, B:59:0x0186, B:61:0x0196, B:62:0x01a2, B:63:0x01b4, B:65:0x01bf, B:66:0x01c0, B:68:0x01ca, B:71:0x01d5, B:73:0x01dd, B:74:0x01e0, B:75:0x01e1, B:76:0x01ec, B:80:0x01f3, B:82:0x01fb, B:84:0x01ff, B:86:0x0204, B:88:0x020c, B:89:0x020f, B:91:0x0214, B:97:0x0220, B:98:0x0221, B:102:0x0228, B:104:0x0236, B:105:0x0239, B:106:0x023e, B:108:0x024e, B:109:0x0251, B:110:0x0256, B:111:0x025b, B:113:0x0265, B:118:0x026e, B:120:0x0272, B:124:0x0279, B:126:0x0280, B:127:0x0288, B:128:0x028d, B:130:0x0291, B:135:0x029a, B:136:0x029f, B:138:0x02a9, B:144:0x02b4, B:146:0x02b8, B:147:0x02c7, B:149:0x02da, B:150:0x0301, B:151:0x0306, B:152:0x0307, B:154:0x030d, B:156:0x0328, B:161:0x0331, B:169:0x0359, B:170:0x035e, B:176:0x0368, B:185:0x0379, B:186:0x037e, B:187:0x0386, B:188:0x03a3, B:190:0x03ca, B:274:0x050e, B:247:0x04c9, B:246:0x04c5, B:286:0x0523, B:287:0x052b, B:191:0x03f4, B:196:0x0410, B:198:0x0420, B:199:0x0434, B:201:0x0439, B:205:0x0440, B:207:0x0445, B:209:0x0450, B:288:0x052c, B:290:0x0544, B:293:0x0550, B:295:0x0558, B:299:0x055f, B:301:0x0566, B:302:0x056e, B:304:0x0576, B:306:0x0582, B:308:0x058c, B:312:0x05a7, B:314:0x05af, B:315:0x05b4, B:309:0x0596, B:311:0x059a, B:316:0x05b8, B:318:0x05bc, B:320:0x05cd, B:388:0x06ee, B:390:0x06f6, B:392:0x06fe, B:395:0x0704, B:396:0x0710, B:398:0x0714, B:400:0x071c, B:403:0x0728, B:405:0x072e, B:407:0x0736, B:409:0x073c, B:411:0x0741, B:412:0x074a, B:413:0x0764, B:415:0x076a, B:417:0x076f, B:419:0x0774, B:421:0x0782, B:459:0x0830, B:460:0x0835, B:464:0x083f, B:466:0x0847, B:468:0x084d, B:472:0x0858, B:471:0x0856, B:473:0x0861, B:475:0x086d, B:476:0x0886, B:478:0x088a, B:480:0x0892, B:495:0x08c2, B:481:0x0898, B:483:0x08a2, B:487:0x08ad, B:493:0x08bd, B:498:0x08d0, B:500:0x08d6, B:504:0x08e3, B:513:0x090d, B:515:0x0913, B:517:0x0917, B:542:0x099d, B:544:0x09a8, B:546:0x09b6, B:547:0x09be, B:566:0x0a08, B:569:0x0a0f, B:571:0x0a13, B:573:0x0a1b, B:574:0x0a1e, B:575:0x0a21, B:577:0x0a27, B:579:0x0a30, B:581:0x0a3a, B:583:0x0a40, B:590:0x0a5f, B:592:0x0a65, B:596:0x0a6e, B:610:0x0a98, B:602:0x0a80, B:605:0x0a86, B:609:0x0a91, B:608:0x0a8f, B:584:0x0a47, B:587:0x0a55, B:588:0x0a5c, B:589:0x0a5d, B:520:0x0921, B:522:0x0925, B:524:0x0939, B:526:0x0944, B:528:0x094e, B:532:0x0957, B:534:0x0961, B:540:0x096c, B:548:0x09c2, B:550:0x09c8, B:552:0x09cc, B:556:0x09d5, B:558:0x09e4, B:560:0x09ec, B:562:0x09f8, B:563:0x09fd, B:564:0x0a00, B:565:0x0a05, B:506:0x08eb, B:508:0x08ef, B:509:0x08fa, B:511:0x0900, B:497:0x08c8, B:424:0x078b, B:426:0x078f, B:428:0x0797, B:430:0x079b, B:432:0x07a5, B:435:0x07ab, B:436:0x07ae, B:438:0x07b6, B:440:0x07c8, B:442:0x07d0, B:444:0x07d8, B:448:0x07e1, B:450:0x0806, B:451:0x0809, B:453:0x0816, B:455:0x081c, B:456:0x0823, B:458:0x082f, B:323:0x05d8, B:325:0x05dc, B:328:0x05e3, B:331:0x05ee, B:333:0x05f2, B:335:0x05fa, B:336:0x05fd, B:338:0x0603, B:340:0x060d, B:342:0x0643, B:344:0x064d, B:346:0x0655, B:348:0x065f, B:349:0x0662, B:350:0x0664, B:351:0x0665, B:353:0x066b, B:356:0x067c, B:358:0x0686, B:360:0x0690, B:362:0x06a5, B:364:0x06ab, B:367:0x06bb, B:368:0x06bd, B:369:0x06be, B:370:0x06c1, B:372:0x06c7, B:375:0x06cc, B:377:0x06d0, B:387:0x06eb, B:380:0x06d9, B:382:0x06df, B:385:0x06e8, B:386:0x06ea, B:319:0x05ca, B:611:0x0a9d, B:615:0x0aa4, B:177:0x0369, B:178:0x036e, B:181:0x0375, B:184:0x0378), top: B:690:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v131, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) throws Throwable {
        int i6;
        vb2 vb2VarP;
        int i7;
        int i8;
        int i9;
        boolean z6;
        boolean z7;
        long j6;
        boolean zE;
        int i10;
        vb2 vb2VarN;
        vb2 vb2Var;
        boolean z8;
        wb2 wb2VarQ;
        long j7;
        long j8;
        oh2 oh2VarS;
        boolean z9;
        long j9;
        int i11;
        int i12;
        oh2 oh2Var;
        long j10;
        long j11;
        long j12;
        ic2 ic2Var;
        int i13;
        ic2 ic2VarA;
        long jM;
        ic2 ic2Var2;
        oh2 oh2Var2;
        zy zyVar;
        long j13;
        oh2 oh2Var3;
        long j14;
        ob2 ob2Var = this;
        try {
            int i14 = -1;
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i15 = message.arg2;
                    ob2Var.u(i15 >> 4, i15 & 15, z10, true);
                    break;
                case 2:
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ob2Var.f7701z.b(2);
                    if (ob2Var.P.f5661a.o() || !ob2Var.J.e()) {
                        i7 = 4;
                        i8 = 3;
                    } else {
                        xb2 xb2Var = ob2Var.I;
                        long j15 = ob2Var.f7686c0;
                        vb2 vb2Var2 = xb2Var.f10484j;
                        if (vb2Var2 != null) {
                            y5.r(vb2Var2.f9802m == null);
                            if (vb2Var2.f9795e) {
                                vb2Var2.f9791a.b(j15 - vb2Var2.f9805p);
                            }
                        }
                        if (ob2Var.I.y() && (wb2VarQ = ob2Var.I.q(ob2Var.f7686c0, ob2Var.P)) != null) {
                            vb2 vb2VarM = ob2Var.I.m(wb2VarQ);
                            if (!vb2VarM.f9794d) {
                                long j16 = wb2VarQ.f10149b;
                                vb2VarM.f9794d = true;
                                vb2VarM.f9791a.i(ob2Var, j16);
                            } else if (vb2VarM.f9795e) {
                                ob2Var.f7701z.d(8, vb2VarM.f9791a).a();
                            }
                            if (ob2Var.I.n() == vb2VarM) {
                                ob2Var.r(wb2VarQ.f10149b);
                            }
                            ob2Var.g(false);
                        }
                        if (ob2Var.W) {
                            ob2Var.W = I(ob2Var.I.f10484j);
                            ob2Var.z();
                        } else {
                            ob2Var.j();
                        }
                        vb2 vb2VarP2 = ob2Var.I.p();
                        if (vb2VarP2 != null) {
                            if (vb2VarP2.f9802m == null || ob2Var.T) {
                                i7 = 4;
                                if (vb2VarP2.f9797g.h || ob2Var.T) {
                                    int i16 = 0;
                                    while (true) {
                                        sc2[] sc2VarArr = ob2Var.s;
                                        if (i16 < 2) {
                                            sc2 sc2Var = sc2VarArr[i16];
                                            if (sc2Var.k(vb2VarP2) && sc2Var.j()) {
                                                pa2 pa2Var = sc2Var.f8897a;
                                                pa2Var.F = true;
                                                if (pa2Var instanceof wi2) {
                                                    throw null;
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                }
                            } else {
                                vb2 vb2VarP3 = ob2Var.I.p();
                                if (vb2VarP3.f9795e) {
                                    int i17 = 0;
                                    while (true) {
                                        sc2[] sc2VarArr2 = ob2Var.s;
                                        if (i17 >= 2) {
                                            vb2 vb2Var3 = vb2VarP2.f9802m;
                                            if (vb2Var3.f9795e || ob2Var.f7686c0 >= vb2Var3.c()) {
                                                gk2 gk2VarE = vb2VarP2.e();
                                                vb2 vb2VarL = ob2Var.I.l();
                                                gk2 gk2VarE2 = vb2VarL.e();
                                                zy zyVar2 = ob2Var.P.f5661a;
                                                i7 = 4;
                                                ob2Var.C(zyVar2, vb2VarL.f9797g.f10148a, zyVar2, vb2VarP2.f9797g.f10148a, -9223372036854775807L, false);
                                                if (!vb2VarL.f9795e || vb2VarL.f9791a.zzd() == -9223372036854775807L) {
                                                    for (int i18 = 0; i18 < 2; i18++) {
                                                        boolean zB = gk2VarE.b(i18);
                                                        boolean zB2 = gk2VarE2.b(i18);
                                                        if (zB && !ob2Var.s[i18].f8897a.F) {
                                                            ob2Var.f7695t[i18].getClass();
                                                            rc2 rc2Var = ((rc2[]) gk2VarE.f5084b)[i18];
                                                            rc2 rc2Var2 = ((rc2[]) gk2VarE2.f5084b)[i18];
                                                            if (!zB2 || !rc2Var2.equals(rc2Var)) {
                                                                sc2 sc2Var2 = ob2Var.s[i18];
                                                                vb2VarL.c();
                                                                pa2 pa2Var2 = sc2Var2.f8897a;
                                                                pa2Var2.F = true;
                                                                if (pa2Var2 instanceof wi2) {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    vb2VarL.c();
                                                    sc2[] sc2VarArr3 = ob2Var.s;
                                                    for (int i19 = 0; i19 < 2; i19++) {
                                                        pa2 pa2Var3 = sc2VarArr3[i19].f8897a;
                                                        pa2Var3.F = true;
                                                        if (pa2Var3 instanceof wi2) {
                                                            throw null;
                                                        }
                                                    }
                                                    if (!vb2VarL.i()) {
                                                        ob2Var.I.x(vb2VarL);
                                                        ob2Var.g(false);
                                                        ob2Var.j();
                                                    }
                                                }
                                            }
                                        } else if (sc2VarArr2[i17].i(vb2VarP3)) {
                                            i17++;
                                        }
                                    }
                                    i7 = 4;
                                } else {
                                    i7 = 4;
                                }
                            }
                            vb2 vb2VarP4 = ob2Var.I.p();
                            if (vb2VarP4 != null && ob2Var.I.n() != vb2VarP4 && !vb2VarP4.h) {
                                vb2 vb2VarP5 = ob2Var.I.p();
                                gk2 gk2VarE3 = vb2VarP5.e();
                                int i20 = 0;
                                boolean z11 = false;
                                while (true) {
                                    sc2[] sc2VarArr4 = ob2Var.s;
                                    if (i20 < 2) {
                                        sc2 sc2Var3 = sc2VarArr4[i20];
                                        if (sc2Var3.a() != 0) {
                                            boolean zK = sc2Var3.k(vb2VarP5);
                                            if (!gk2VarE3.b(i20) || !zK) {
                                                pa2 pa2Var4 = sc2Var3.f8897a;
                                                if (!pa2Var4.F) {
                                                    ak2 ak2Var = ((ak2[]) gk2VarE3.f5085c)[i20];
                                                    int iZzd = ak2Var != null ? ak2Var.zzd() : 0;
                                                    w[] wVarArr = new w[iZzd];
                                                    for (int i21 = 0; i21 < iZzd; i21++) {
                                                        wVarArr[i21] = ak2Var.zze(i21);
                                                    }
                                                    sc2Var3.e(wVarArr, vb2VarP5.f9793c[i20], vb2VarP5.c(), vb2VarP5.f9805p, vb2VarP5.f9797g.f10148a);
                                                } else if (pa2Var4.m()) {
                                                    ob2Var.b(i20);
                                                } else {
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        i20++;
                                    } else if (!z11) {
                                        ob2Var.c(new boolean[2], ob2Var.I.f10483i.c());
                                    }
                                }
                            }
                            boolean z12 = false;
                            while (ob2Var.G() && !ob2Var.T && (vb2VarN = ob2Var.I.n()) != null && (vb2Var = vb2VarN.f9802m) != null && ob2Var.f7686c0 >= vb2Var.c() && vb2Var.h) {
                                if (z12) {
                                    ob2Var.l();
                                }
                                vb2 vb2VarK = ob2Var.I.k();
                                if (vb2VarK == null) {
                                    throw null;
                                }
                                if (ob2Var.P.f5662b.f7769a.equals(vb2VarK.f9797g.f10148a.f7769a)) {
                                    oh2 oh2Var4 = ob2Var.P.f5662b;
                                    if (oh2Var4.f7770b == i14) {
                                        oh2 oh2Var5 = vb2VarK.f9797g.f10148a;
                                        z8 = oh2Var5.f7770b == i14 && oh2Var4.f7773e != oh2Var5.f7773e;
                                    }
                                }
                                wb2 wb2Var = vb2VarK.f9797g;
                                boolean z13 = z8;
                                oh2 oh2Var6 = wb2Var.f10148a;
                                long j17 = wb2Var.f10149b;
                                int i22 = i14;
                                ob2Var.P = ob2Var.a(oh2Var6, j17, wb2Var.f10150c, j17, !z13, 0);
                                ob2Var.q();
                                ob2Var.B();
                                if (ob2Var.P.f5665e == 3) {
                                    ob2Var.w();
                                }
                                gk2 gk2VarE4 = ob2Var.I.n().e();
                                for (int i23 = 0; i23 < 2; i23++) {
                                    if (gk2VarE4.b(i23)) {
                                        ob2Var.s[i23].b();
                                    }
                                }
                                i14 = i22;
                                z12 = true;
                            }
                            i8 = 3;
                            ob2Var.f7692i0.getClass();
                        }
                    }
                    int i24 = ob2Var.P.f5665e;
                    if (i24 != 1 && i24 != i7) {
                        vb2 vb2VarN2 = ob2Var.I.n();
                        if (vb2VarN2 == null) {
                            ob2Var.f7701z.c(jUptimeMillis + ((ob2Var.P.f5665e != i8 || ob2Var.G()) ? f7683l0 : 1000L));
                            break;
                        } else {
                            Trace.beginSection("doSomeWork");
                            ob2Var.B();
                            if (vb2VarN2.f9795e) {
                                ob2Var.f7687d0 = j31.s(SystemClock.elapsedRealtime());
                                vb2VarN2.f9791a.c(ob2Var.P.f5677r - ob2Var.E);
                                z6 = true;
                                z7 = true;
                                int i25 = 0;
                                while (true) {
                                    sc2[] sc2VarArr5 = ob2Var.s;
                                    if (i25 < 2) {
                                        sc2 sc2Var4 = sc2VarArr5[i25];
                                        if (sc2Var4.a() == 0) {
                                            ob2Var.n(i25, false);
                                            i10 = i7;
                                        } else {
                                            i10 = i7;
                                            sc2Var4.d(ob2Var.f7686c0, ob2Var.f7687d0);
                                            boolean z14 = z6 && sc2Var4.f8897a.m();
                                            boolean zH = sc2Var4.h(vb2VarN2);
                                            ob2Var.n(i25, zH);
                                            boolean z15 = z7 && zH;
                                            if (!zH) {
                                                ob2Var.m(i25);
                                            }
                                            z7 = z15;
                                            z6 = z14;
                                        }
                                        i25++;
                                        i7 = i10;
                                    } else {
                                        i9 = i7;
                                    }
                                }
                            } else {
                                i9 = i7;
                                vb2VarN2.f9791a.zzk();
                                z6 = true;
                                z7 = true;
                            }
                            long j18 = vb2VarN2.f9797g.f10152e;
                            if (z6 && vb2VarN2.f9795e) {
                                j6 = -9223372036854775807L;
                                if (j18 == -9223372036854775807L || j18 <= ob2Var.P.f5677r) {
                                    if (ob2Var.T) {
                                        ob2Var.T = false;
                                        ob2Var.u(ob2Var.P.f5673n, 5, false, false);
                                    }
                                    if (vb2VarN2.f9797g.h) {
                                        ob2Var.v(i9);
                                        ob2Var.y();
                                    }
                                    if (ob2Var.P.f5665e == 2) {
                                        int i26 = 0;
                                        while (true) {
                                            sc2[] sc2VarArr6 = ob2Var.s;
                                            if (i26 >= 2) {
                                                ic2 ic2Var3 = ob2Var.P;
                                                if (ic2Var3.f5667g || ic2Var3.f5676q >= 500000 || !I(ob2Var.I.f10484j)) {
                                                    ob2Var.f7691h0 = j6;
                                                } else if (ob2Var.f7691h0 == j6) {
                                                    ob2Var.f7691h0 = SystemClock.elapsedRealtime();
                                                } else if (SystemClock.elapsedRealtime() - ob2Var.f7691h0 >= 4000) {
                                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                                }
                                                boolean z16 = ob2Var.G() && ob2Var.P.f5665e == i8;
                                                ob2Var.P.getClass();
                                                int i27 = ob2Var.P.f5665e;
                                                if (i27 != i9 && (z16 || i27 == 2 || (i27 == i8 && ob2Var.f7684a0 != 0))) {
                                                    ob2Var.f7701z.c(jUptimeMillis + ((i27 != i8 || ob2Var.G()) ? f7683l0 : 1000L));
                                                }
                                                Trace.endSection();
                                                break;
                                            } else {
                                                if (sc2VarArr6[i26].k(vb2VarN2)) {
                                                    ob2Var.m(i26);
                                                }
                                                i26++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            ic2 ic2Var4 = ob2Var.P;
                            if (ic2Var4.f5665e != 2) {
                                if (ob2Var.P.f5665e == i8) {
                                    if (ob2Var.f7684a0 == 0) {
                                        if (!ob2Var.F()) {
                                            ob2Var.D(ob2Var.G(), false);
                                            ob2Var.v(2);
                                            if (ob2Var.U) {
                                                for (vb2 vb2VarN3 = ob2Var.I.n(); vb2VarN3 != null; vb2VarN3 = vb2VarN3.f9802m) {
                                                    for (ak2 ak2Var2 : (ak2[]) vb2VarN3.e().f5085c) {
                                                    }
                                                }
                                                ob2Var.f7694k0.b();
                                            }
                                            ob2Var.y();
                                        }
                                    } else if (!z7) {
                                        ob2Var.D(ob2Var.G(), false);
                                        ob2Var.v(2);
                                        if (ob2Var.U) {
                                        }
                                        ob2Var.y();
                                    }
                                }
                                if (ob2Var.P.f5665e == 2) {
                                }
                            } else {
                                if (ob2Var.f7684a0 == 0) {
                                    zE = ob2Var.F();
                                } else if (z7) {
                                    if (ic2Var4.f5667g) {
                                        long jA = ob2Var.H(ob2Var.P.f5661a, ob2Var.I.n().f9797g.f10148a) ? ob2Var.f7694k0.a() : j6;
                                        vb2 vb2Var4 = ob2Var.I.f10484j;
                                        boolean z17 = vb2Var4.i() && vb2Var4.f9797g.h;
                                        boolean z18 = vb2Var4.f9797g.f10148a.b() && !vb2Var4.f9795e;
                                        if (!z17 && !z18) {
                                            long jL = ob2Var.L(vb2Var4.b());
                                            rb2 rb2Var = ob2Var.f7699x;
                                            hd2 hd2Var = ob2Var.L;
                                            zy zyVar3 = ob2Var.P.f5661a;
                                            float f6 = ob2Var.F.zzc().f5818a;
                                            boolean z19 = ob2Var.P.f5671l;
                                            zE = rb2Var.e(new qb2(hd2Var, jL, f6, ob2Var.U, jA));
                                        }
                                    }
                                    ob2Var.v(i8);
                                    ob2Var.f7690g0 = null;
                                    if (ob2Var.G()) {
                                        ob2Var.D(false, false);
                                        va2 va2Var = ob2Var.F;
                                        va2Var.f9770x = true;
                                        vc2 vc2Var = va2Var.s;
                                        if (!vc2Var.s) {
                                            vc2Var.f9810u = SystemClock.elapsedRealtime();
                                            vc2Var.s = true;
                                        }
                                        ob2Var.w();
                                    }
                                    if (ob2Var.P.f5665e == 2) {
                                    }
                                } else {
                                    if (ob2Var.P.f5665e == i8) {
                                    }
                                    if (ob2Var.P.f5665e == 2) {
                                    }
                                }
                                if (zE) {
                                    ob2Var.v(i8);
                                    ob2Var.f7690g0 = null;
                                    if (ob2Var.G()) {
                                    }
                                }
                                if (ob2Var.P.f5665e == 2) {
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    nb2 nb2Var = (nb2) message.obj;
                    ob2Var.Q.a(1);
                    Pair pairO = O(ob2Var.P.f5661a, nb2Var, ob2Var.X, ob2Var.Y, ob2Var.C, ob2Var.D);
                    if (pairO == null) {
                        Pair pairN = ob2Var.N(ob2Var.P.f5661a);
                        oh2 oh2Var7 = (oh2) pairN.first;
                        long jLongValue = ((Long) pairN.second).longValue();
                        z9 = !ob2Var.P.f5661a.o();
                        oh2VarS = oh2Var7;
                        j9 = jLongValue;
                        j7 = -9223372036854775807L;
                        j8 = 0;
                    } else {
                        Object obj = pairO.first;
                        long jLongValue2 = ((Long) pairO.second).longValue();
                        j7 = nb2Var.f7382c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                        j8 = 0;
                        oh2VarS = ob2Var.I.s(ob2Var.P.f5661a, obj);
                        if (oh2VarS.b()) {
                            ob2Var.P.f5661a.n(oh2VarS.f7769a, ob2Var.D);
                            a aVarA = ob2Var.D.f6185f.a(-1);
                            while (true) {
                                int[] iArr = aVarA.f2529d;
                                i11 = (i11 >= iArr.length || (i12 = iArr[i11]) == 0 || i12 == 1) ? 0 : i11 + 1;
                            }
                            if (i11 == -1) {
                                ob2Var.D.f6185f.getClass();
                            }
                            z9 = true;
                            j9 = 0;
                        } else {
                            z9 = nb2Var.f7382c == -9223372036854775807L;
                            j9 = jLongValue2;
                        }
                    }
                    try {
                        if (ob2Var.P.f5661a.o()) {
                            ob2Var.f7685b0 = nb2Var;
                        } else if (pairO == null) {
                            if (ob2Var.P.f5665e != 1) {
                                ob2Var.v(4);
                            }
                            ob2Var.p(false, true, false, true);
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            if (oh2VarS.equals(ob2Var.P.f5662b)) {
                                                try {
                                                    vb2 vb2VarN4 = ob2Var.I.n();
                                                    long jE = (vb2VarN4 == null || !vb2VarN4.f9795e || j9 == j8) ? j9 : vb2VarN4.f9791a.e(j9, ob2Var.O);
                                                    j11 = jE;
                                                    if (j31.v(jE) != j31.v(ob2Var.P.f5677r) || ((i13 = (ic2Var = ob2Var.P).f5665e) != 2 && i13 != 3)) {
                                                        oh2Var = oh2VarS;
                                                        j12 = j7;
                                                    }
                                                    long j19 = ic2Var.f5677r;
                                                    ic2VarA = ob2Var.a(oh2VarS, j19, j7, j19, z9, 2);
                                                    ob2Var.P = ic2VarA;
                                                    break;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    oh2Var = oh2VarS;
                                                    j10 = j9;
                                                    ob2Var.P = ob2Var.a(oh2Var, j10, j7, j10, z9, 2);
                                                    throw th;
                                                }
                                            } else {
                                                oh2Var = oh2VarS;
                                                j12 = j7;
                                                j11 = j9;
                                            }
                                            ob2Var.C(zyVar, oh2Var2, zyVar, ic2Var2.f5662b, j13, true);
                                            oh2Var3 = oh2Var2;
                                            j7 = j13;
                                            j14 = jM;
                                            ob2Var = this;
                                            ic2VarA = ob2Var.a(oh2Var3, j14, j7, j14, z9, 2);
                                            ob2Var.P = ic2VarA;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            oh2Var = oh2Var2;
                                            j7 = j13;
                                            j10 = jM;
                                            ob2Var.P = ob2Var.a(oh2Var, j10, j7, j10, z9, 2);
                                            throw th;
                                        }
                                        zyVar = ic2Var2.f5661a;
                                        j13 = j12;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        oh2Var = oh2Var2;
                                        j7 = j12;
                                        j10 = jM;
                                        ob2Var.P = ob2Var.a(oh2Var, j10, j7, j10, z9, 2);
                                        throw th;
                                    }
                                    ic2Var2 = ob2Var.P;
                                    oh2Var2 = oh2Var;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                boolean z20 = ob2Var.P.f5665e == 4;
                                xb2 xb2Var2 = ob2Var.I;
                                jM = ob2Var.M(oh2Var, j11, xb2Var2.h != xb2Var2.f10483i, z20);
                                z9 |= j9 != jM;
                            } catch (Throwable th5) {
                                th = th5;
                                j7 = j12;
                                j10 = j9;
                                ob2Var.P = ob2Var.a(oh2Var, j10, j7, j10, z9, 2);
                                throw th;
                            }
                        }
                        oh2Var3 = oh2VarS;
                        j14 = j9;
                        ob2Var = this;
                        ic2VarA = ob2Var.a(oh2Var3, j14, j7, j14, z9, 2);
                        ob2Var.P = ic2VarA;
                    } catch (Throwable th6) {
                        th = th6;
                        oh2Var = oh2VarS;
                    }
                    break;
                case 4:
                    ip ipVar = (ip) message.obj;
                    ob2Var.f7701z.b(16);
                    ob2Var.F.a(ipVar);
                    ip ipVarZzc = ob2Var.F.zzc();
                    ob2Var.i(ipVarZzc, ipVarZzc.f5818a, true, true);
                    break;
                case 5:
                    ob2Var.O = (tc2) message.obj;
                    break;
                case 6:
                    ob2Var.x(false, true);
                    break;
                case 7:
                    try {
                        ob2Var.p(true, false, true, false);
                        for (int i28 = 0; i28 < 2; i28++) {
                            ob2Var.f7695t[i28].v();
                            ob2Var.s[i28].c();
                        }
                        ob2Var.f7699x.f(ob2Var.L);
                        ob2Var.v(1);
                        ob2Var.A.a();
                        synchronized (this) {
                            ob2Var.R = true;
                            ob2Var.notifyAll();
                        }
                        return true;
                    } catch (Throwable th7) {
                        ob2Var.A.a();
                        synchronized (this) {
                            ob2Var.R = true;
                            ob2Var.notifyAll();
                            throw th7;
                        }
                    }
                case 8:
                    nh2 nh2Var = (nh2) message.obj;
                    xb2 xb2Var3 = ob2Var.I;
                    vb2 vb2Var5 = xb2Var3.f10484j;
                    if (vb2Var5 != null && vb2Var5.f9791a == nh2Var) {
                        if (vb2Var5 == null) {
                            throw null;
                        }
                        if (!vb2Var5.f9795e) {
                            float f7 = ob2Var.F.zzc().f5818a;
                            vb2Var5.g(ob2Var.P.f5661a);
                        }
                        ob2Var.A(vb2Var5.d(), vb2Var5.e());
                        if (vb2Var5 == ob2Var.I.n()) {
                            ob2Var.r(vb2Var5.f9797g.f10149b);
                            ob2Var.c(new boolean[2], ob2Var.I.f10483i.c());
                            ic2 ic2Var5 = ob2Var.P;
                            oh2 oh2Var8 = ic2Var5.f5662b;
                            long j20 = vb2Var5.f9797g.f10149b;
                            ob2Var.P = ob2Var.a(oh2Var8, j20, ic2Var5.f5663c, j20, false, 5);
                        }
                        ob2Var.j();
                        break;
                    } else {
                        vb2 vb2VarO = xb2Var3.o(nh2Var);
                        if (vb2VarO != null) {
                            y5.r(!vb2VarO.f9795e);
                            float f8 = ob2Var.F.zzc().f5818a;
                            vb2VarO.g(ob2Var.P.f5661a);
                            vb2 vb2Var6 = ob2Var.I.f10485k;
                            if (vb2Var6 != null && vb2Var6.f9791a == nh2Var) {
                                ob2Var.k();
                                break;
                            }
                        }
                    }
                    break;
                case 9:
                    nh2 nh2Var2 = (nh2) message.obj;
                    xb2 xb2Var4 = ob2Var.I;
                    vb2 vb2Var7 = xb2Var4.f10484j;
                    if (vb2Var7 != null && vb2Var7.f9791a == nh2Var2) {
                        long j21 = ob2Var.f7686c0;
                        if (vb2Var7 != null) {
                            y5.r(vb2Var7.f9802m == null);
                            if (vb2Var7.f9795e) {
                                vb2Var7.f9791a.b(j21 - vb2Var7.f9805p);
                            }
                        }
                        ob2Var.j();
                        break;
                    } else {
                        vb2 vb2Var8 = xb2Var4.f10485k;
                        if (vb2Var8 != null && vb2Var8.f9791a == nh2Var2) {
                            ob2Var.k();
                            break;
                        }
                    }
                    break;
                case 10:
                    ob2Var.o();
                    break;
                case 11:
                    int i29 = message.arg1;
                    ob2Var.X = i29;
                    if (!ob2Var.I.A(ob2Var.P.f5661a, i29)) {
                        ob2Var.t(true);
                    }
                    ob2Var.g(false);
                    break;
                case 12:
                    boolean z21 = message.arg1 != 0;
                    ob2Var.Y = z21;
                    if (!ob2Var.I.B(ob2Var.P.f5661a, z21)) {
                        ob2Var.t(true);
                    }
                    ob2Var.g(false);
                    break;
                case 13:
                    boolean z22 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (ob2Var.Z != z22) {
                        ob2Var.Z = z22;
                        if (!z22) {
                            sc2[] sc2VarArr7 = ob2Var.s;
                            for (int i30 = 0; i30 < 2; i30++) {
                                sc2 sc2Var5 = sc2VarArr7[i30];
                                if (sc2Var5.a() == 0) {
                                    sc2Var5.f();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            ob2Var.notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    mc2 mc2Var = (mc2) message.obj;
                    if (mc2Var.f7086d != ob2Var.B) {
                        ob2Var.f7701z.d(15, mc2Var).a();
                        break;
                    } else {
                        synchronized (mc2Var) {
                        }
                        try {
                            mc2Var.f7083a.b(mc2Var.f7084b, mc2Var.f7085c);
                            mc2Var.a(true);
                            int i31 = ob2Var.P.f5665e;
                            if (i31 == 3 || i31 == 2) {
                                ob2Var.f7701z.h(2);
                                break;
                            }
                        } catch (Throwable th8) {
                            mc2Var.a(true);
                            throw th8;
                        }
                    }
                case 15:
                    mc2 mc2Var2 = (mc2) message.obj;
                    Looper looper = mc2Var2.f7086d;
                    if (looper.getThread().isAlive()) {
                        ob2Var.H.a(looper, null).e(new cf(11, mc2Var2));
                        break;
                    } else {
                        qs0.f("TAG", "Trying to send message on a dead thread.");
                        mc2Var2.a(false);
                        break;
                    }
                case 16:
                    ip ipVar2 = (ip) message.obj;
                    ob2Var.i(ipVar2, ipVar2.f5818a, true, false);
                    break;
                case 17:
                    jb2 jb2Var = (jb2) message.obj;
                    ob2Var.Q.a(1);
                    if (jb2Var.f6018b != -1) {
                        ob2Var.f7685b0 = new nb2(new oc2(jb2Var.f6017a, jb2Var.f6020d), jb2Var.f6018b, jb2Var.f6019c);
                    }
                    ob2Var.h(ob2Var.J.i(jb2Var.f6017a, jb2Var.f6020d), false);
                    break;
                case 18:
                    jb2 jb2Var2 = (jb2) message.obj;
                    int size = message.arg1;
                    ob2Var.Q.a(1);
                    hc2 hc2Var = ob2Var.J;
                    if (size == -1) {
                        size = hc2Var.f5329b.size();
                    }
                    ob2Var.h(hc2Var.f(size, jb2Var2.f6017a, jb2Var2.f6020d), false);
                    break;
                case 19:
                    kb2 kb2Var = (kb2) message.obj;
                    ob2Var.Q.a(1);
                    hc2 hc2Var2 = ob2Var.J;
                    kb2Var.getClass();
                    ob2Var.h(hc2Var2.g(), false);
                    break;
                case 20:
                    int i32 = message.arg1;
                    int i33 = message.arg2;
                    oi2 oi2Var = (oi2) message.obj;
                    ob2Var.Q.a(1);
                    ob2Var.h(ob2Var.J.h(i32, i33, oi2Var), false);
                    break;
                case dn.zzm /* 21 */:
                    oi2 oi2Var2 = (oi2) message.obj;
                    ob2Var.Q.a(1);
                    ob2Var.h(ob2Var.J.j(oi2Var2), false);
                    break;
                case 22:
                    ob2Var.h(ob2Var.J.a(), true);
                    break;
                case 23:
                    ob2Var.S = message.arg1 != 0;
                    ob2Var.q();
                    if (ob2Var.T && ob2Var.I.p() != ob2Var.I.n()) {
                        ob2Var.t(true);
                        ob2Var.g(false);
                        break;
                    }
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    ob2Var.o();
                    ob2Var.t(true);
                    break;
                case 26:
                    ob2Var.o();
                    ob2Var.t(true);
                    break;
                case 27:
                    int i34 = message.arg1;
                    int i35 = message.arg2;
                    List list = (List) message.obj;
                    ob2Var.Q.a(1);
                    ob2Var.h(ob2Var.J.b(list, i34, i35), false);
                    break;
                case 28:
                    ya2 ya2Var = (ya2) message.obj;
                    ob2Var.f7692i0 = ya2Var;
                    xb2 xb2Var5 = ob2Var.I;
                    zy zyVar4 = ob2Var.P.f5661a;
                    xb2Var5.w(ya2Var);
                    break;
                case 29:
                    ob2Var.Q.a(1);
                    ob2Var.p(false, false, false, true);
                    ob2Var.f7699x.b(ob2Var.L);
                    ob2Var.v(true != ob2Var.P.f5661a.o() ? 2 : 4);
                    ob2Var.J.c(ob2Var.f7700y.zze());
                    ob2Var.f7701z.h(2);
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    Object obj2 = pair.first;
                    AtomicBoolean atomicBoolean2 = (AtomicBoolean) pair.second;
                    sc2[] sc2VarArr8 = ob2Var.s;
                    for (int i36 = 0; i36 < 2; i36++) {
                        sc2VarArr8[i36].g(obj2);
                    }
                    if (atomicBoolean2 != null) {
                        synchronized (this) {
                            atomicBoolean2.set(true);
                            ob2Var.notifyAll();
                        }
                        break;
                    }
                    break;
            }
        } catch (dp1 e6) {
            ob2Var.e(e6, e6.s);
        } catch (rn e7) {
            ob2Var.e(e7, e7.f8672t == 1 ? true != e7.s ? 3003 : 3001 : CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
        } catch (wa2 e8) {
            e = e8;
            if (e.f10142u == 1 && (vb2VarP = ob2Var.I.p()) != null) {
                e = e.a(vb2VarP.f9797g.f10148a);
            }
            if (e.A && (ob2Var.f7690g0 == null || (i6 = e.s) == 5004 || i6 == 5003)) {
                qs0.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                wa2 wa2Var = ob2Var.f7690g0;
                if (wa2Var != null) {
                    wa2Var.addSuppressed(e);
                    e = ob2Var.f7690g0;
                } else {
                    ob2Var.f7690g0 = e;
                }
                xo0 xo0Var = ob2Var.f7701z;
                xo0Var.f(xo0Var.d(25, e));
            } else {
                wa2 wa2Var2 = ob2Var.f7690g0;
                if (wa2Var2 != null) {
                    wa2Var2.addSuppressed(e);
                    e = ob2Var.f7690g0;
                }
                qs0.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f10142u == 1) {
                    xb2 xb2Var6 = ob2Var.I;
                    if (xb2Var6.n() != xb2Var6.p()) {
                        while (true) {
                            xb2 xb2Var7 = ob2Var.I;
                            if (xb2Var7.n() == xb2Var7.p()) {
                                break;
                            }
                            ob2Var.I.k();
                        }
                        vb2 vb2VarN5 = ob2Var.I.n();
                        vb2VarN5.getClass();
                        ob2Var.l();
                        wb2 wb2Var2 = vb2VarN5.f9797g;
                        oh2 oh2Var9 = wb2Var2.f10148a;
                        long j22 = wb2Var2.f10149b;
                        ob2Var.P = ob2Var.a(oh2Var9, j22, wb2Var2.f10150c, j22, true, 0);
                    }
                }
                ob2Var.x(true, false);
                ob2Var.P = ob2Var.P.d(e);
            }
        } catch (ze2 e9) {
            ob2Var.e(e9, e9.s);
        } catch (IOException e10) {
            ob2Var.e(e10, 2000);
        } catch (RuntimeException e11) {
            int i37 = 1004;
            if (!(e11 instanceof IllegalStateException) && !(e11 instanceof IllegalArgumentException)) {
                i37 = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
            }
            wa2 wa2Var3 = new wa2(2, e11, i37);
            qs0.d("ExoPlayerImplInternal", "Playback error", wa2Var3);
            ob2Var.x(true, false);
            ob2Var.P = ob2Var.P.d(wa2Var3);
        }
        ob2Var.l();
        return true;
    }

    public final void i(ip ipVar, float f6, boolean z6, boolean z7) {
        ip ipVar2;
        int i6;
        if (z6) {
            if (z7) {
                this.Q.a(1);
            }
            ic2 ic2Var = this.P;
            ic2 ic2Var2 = new ic2(ic2Var.f5661a, ic2Var.f5662b, ic2Var.f5663c, ic2Var.f5664d, ic2Var.f5665e, ic2Var.f5666f, ic2Var.f5667g, ic2Var.h, ic2Var.f5668i, ic2Var.f5669j, ic2Var.f5670k, ic2Var.f5671l, ic2Var.f5672m, ic2Var.f5673n, ipVar, ic2Var.f5675p, ic2Var.f5676q, ic2Var.f5677r, ic2Var.s);
            ipVar2 = ipVar;
            this.P = ic2Var2;
        } else {
            ipVar2 = ipVar;
        }
        float f7 = ipVar2.f5818a;
        vb2 vb2Var = this.I.h;
        while (true) {
            i6 = 0;
            if (vb2Var == null) {
                break;
            }
            ak2[] ak2VarArr = (ak2[]) vb2Var.f9804o.f5085c;
            int length = ak2VarArr.length;
            while (i6 < length) {
                ak2 ak2Var = ak2VarArr[i6];
                i6++;
            }
            vb2Var = vb2Var.f9802m;
        }
        sc2[] sc2VarArr = this.s;
        while (i6 < 2) {
            sc2 sc2Var = sc2VarArr[i6];
            sc2Var.f8897a.i(f6, ipVar2.f5818a);
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean zA;
        boolean z6;
        long j6 = -9223372036854775807L;
        if (I(this.I.f10484j)) {
            vb2 vb2Var = this.I.f10484j;
            long jL = L(!vb2Var.f9795e ? 0L : vb2Var.f9791a.zzc());
            vb2 vb2Var2 = this.I.h;
            long j7 = H(this.P.f5661a, vb2Var.f9797g.f10148a) ? this.f7694k0.h : -9223372036854775807L;
            hd2 hd2Var = this.L;
            zy zyVar = this.P.f5661a;
            float f6 = this.F.zzc().f5818a;
            boolean z7 = this.P.f5671l;
            qb2 qb2Var = new qb2(hd2Var, jL, f6, this.U, j7);
            zA = this.f7699x.a(qb2Var);
            vb2 vb2Var3 = this.I.h;
            if (!zA && vb2Var3.f9795e && jL < 500000 && this.E > 0) {
                vb2Var3.f9791a.c(this.P.f5677r);
                zA = this.f7699x.a(qb2Var);
            }
        } else {
            zA = false;
        }
        this.W = zA;
        if (zA) {
            vb2 vb2Var4 = this.I.f10484j;
            vb2Var4.getClass();
            sb2 sb2Var = new sb2();
            sb2Var.f8889a = this.f7686c0 - vb2Var4.f9805p;
            float f7 = this.F.zzc().f5818a;
            y5.n(f7 > 0.0f || f7 == -3.4028235E38f);
            sb2Var.f8890b = f7;
            long j8 = this.V;
            if (j8 < 0) {
                if (j8 != -9223372036854775807L) {
                    z6 = false;
                    j6 = j8;
                }
                y5.n(z6);
                sb2Var.f8891c = j6;
                tb2 tb2Var = new tb2(sb2Var);
                y5.r(vb2Var4.f9802m == null);
                vb2Var4.f9791a.j(tb2Var);
            } else {
                j6 = j8;
            }
            z6 = true;
            y5.n(z6);
            sb2Var.f8891c = j6;
            tb2 tb2Var2 = new tb2(sb2Var);
            y5.r(vb2Var4.f9802m == null);
            vb2Var4.f9791a.j(tb2Var2);
        }
        z();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.nh2, com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    public final void k() {
        boolean z6;
        xb2 xb2Var = this.I;
        xb2Var.u();
        vb2 vb2Var = xb2Var.f10485k;
        if (vb2Var != null) {
            ?? r12 = vb2Var.f9791a;
            if ((!vb2Var.f9794d || vb2Var.f9795e) && !r12.zzp()) {
                zy zyVar = this.P.f5661a;
                if (vb2Var.f9795e) {
                    r12.zzb();
                }
                if (this.f7699x.zzi()) {
                    if (!vb2Var.f9794d) {
                        long j6 = vb2Var.f9797g.f10149b;
                        vb2Var.f9794d = true;
                        r12.i(this, j6);
                        return;
                    }
                    sb2 sb2Var = new sb2();
                    sb2Var.f8889a = this.f7686c0 - vb2Var.f9805p;
                    float f6 = this.F.zzc().f5818a;
                    y5.n(f6 > 0.0f || f6 == -3.4028235E38f);
                    sb2Var.f8890b = f6;
                    long j7 = this.V;
                    if (j7 >= 0) {
                        z6 = true;
                    } else if (j7 == -9223372036854775807L) {
                        j7 = -9223372036854775807L;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    y5.n(z6);
                    sb2Var.f8891c = j7;
                    tb2 tb2Var = new tb2(sb2Var);
                    y5.r(vb2Var.f9802m == null);
                    r12.j(tb2Var);
                }
            }
        }
    }

    public final void l() {
        p9 p9Var = this.Q;
        ic2 ic2Var = this.P;
        boolean z6 = p9Var.f7992a | (((ic2) p9Var.f7996e) != ic2Var);
        p9Var.f7992a = z6;
        p9Var.f7996e = ic2Var;
        if (z6) {
            gb2 gb2Var = (gb2) this.f7693j0.f3937t;
            gb2Var.B.e(new ow(6, gb2Var, p9Var));
            this.Q = new p9(this.P);
        }
    }

    public final void m(int i6) {
        sc2 sc2Var = this.s[i6];
        try {
            mi2 mi2Var = sc2Var.f8897a.A;
            mi2Var.getClass();
            mi2Var.zzd();
        } catch (IOException | RuntimeException e6) {
            int i7 = sc2Var.f8897a.f8008t;
            throw e6;
        }
    }

    public final void n(final int i6, final boolean z6) {
        boolean[] zArr = this.f7696u;
        if (zArr[i6] != z6) {
            zArr[i6] = z6;
            this.N.e(new Runnable(i6, z6) { // from class: com.google.android.gms.internal.ads.hb2

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f5323t;

                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = this.f5323t;
                    ob2 ob2Var = this.s;
                    int i8 = ob2Var.s[i7].f8897a.f8008t;
                    ob2Var.M.b();
                }
            });
        }
    }

    public final void o() throws wa2 {
        int i6;
        int i7;
        float f6 = this.F.zzc().f5818a;
        xb2 xb2Var = this.I;
        vb2 vb2Var = xb2Var.h;
        vb2 vb2Var2 = xb2Var.f10483i;
        gk2 gk2Var = null;
        vb2 vb2Var3 = vb2Var;
        boolean z6 = true;
        while (vb2Var3 != null && vb2Var3.f9795e) {
            gk2 gk2VarF = vb2Var3.f(this.P.f5661a);
            gk2 gk2Var2 = vb2Var3 == this.I.h ? gk2VarF : gk2Var;
            gk2 gk2Var3 = vb2Var3.f9804o;
            boolean z7 = false;
            if (gk2Var3 != null) {
                if (((ak2[]) gk2Var3.f5085c).length == ((ak2[]) gk2VarF.f5085c).length) {
                    for (int i8 = 0; i8 < ((ak2[]) gk2VarF.f5085c).length; i8++) {
                        if (gk2VarF.a(gk2Var3, i8)) {
                        }
                    }
                    if (vb2Var3 != vb2Var2) {
                        z7 = true;
                    }
                    z6 &= z7;
                    vb2Var3 = vb2Var3.f9802m;
                    gk2Var = gk2Var2;
                }
            }
            if (z6) {
                xb2 xb2Var2 = this.I;
                vb2 vb2Var4 = xb2Var2.h;
                boolean zX = xb2Var2.x(vb2Var4);
                boolean[] zArr = new boolean[2];
                gk2Var2.getClass();
                long jA = vb2Var4.a(gk2Var2, this.P.f5677r, zX, zArr);
                ic2 ic2Var = this.P;
                boolean z8 = (ic2Var.f5665e == 4 || jA == ic2Var.f5677r) ? false : true;
                ic2 ic2Var2 = this.P;
                i7 = 2;
                i6 = 4;
                this.P = a(ic2Var2.f5662b, jA, ic2Var2.f5663c, ic2Var2.f5664d, z8, 5);
                if (z8) {
                    r(jA);
                }
                boolean[] zArr2 = new boolean[2];
                int i9 = 0;
                while (true) {
                    sc2[] sc2VarArr = this.s;
                    if (i9 >= 2) {
                        break;
                    }
                    int iA = sc2VarArr[i9].a();
                    zArr2[i9] = 1 == iA;
                    if (iA != 0) {
                        if (!this.s[i9].k(vb2Var4)) {
                            b(i9);
                        } else if (zArr[i9]) {
                            sc2 sc2Var = this.s[i9];
                            long j6 = this.f7686c0;
                            pa2 pa2Var = sc2Var.f8897a;
                            if (sc2.l(pa2Var)) {
                                pa2Var.F = false;
                                pa2Var.D = j6;
                                pa2Var.E = j6;
                                pa2Var.z(false, j6);
                            }
                        }
                    }
                    i9++;
                }
                c(zArr2, this.f7686c0);
            } else {
                i6 = 4;
                i7 = 2;
                this.I.x(vb2Var3);
                if (vb2Var3.f9795e) {
                    vb2Var3.a(gk2VarF, Math.max(vb2Var3.f9797g.f10149b, this.f7686c0 - vb2Var3.f9805p), false, new boolean[2]);
                }
            }
            g(true);
            if (this.P.f5665e != i6) {
                j();
                B();
                this.f7701z.h(i7);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[PHI: r2 r6 r8
      0x00af: PHI (r2v2 com.google.android.gms.internal.ads.oh2) = (r2v1 com.google.android.gms.internal.ads.oh2), (r2v17 com.google.android.gms.internal.ads.oh2) binds: [B:30:0x0085, B:32:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r6v4 long) = (r6v3 long), (r6v16 long) binds: [B:30:0x0085, B:32:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r8v2 long) = (r8v1 long), (r8v10 long) binds: [B:30:0x0085, B:32:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z6, boolean z7, boolean z8, boolean z9) {
        long j6;
        boolean z10;
        zy oc2Var;
        oh2 oh2Var;
        List list;
        this.f7701z.b(2);
        this.f7690g0 = null;
        D(false, true);
        va2 va2Var = this.F;
        va2Var.f9770x = false;
        vc2 vc2Var = va2Var.s;
        if (vc2Var.s) {
            vc2Var.b(vc2Var.zza());
            vc2Var.s = false;
        }
        this.f7686c0 = 1000000000000L;
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                b(i6);
            } catch (RuntimeException e6) {
                qs0.d("ExoPlayerImplInternal", "Disable failed.", e6);
            }
        }
        if (z6) {
            sc2[] sc2VarArr = this.s;
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    sc2VarArr[i7].f();
                } catch (RuntimeException e7) {
                    qs0.d("ExoPlayerImplInternal", "Reset failed.", e7);
                }
            }
        }
        this.f7684a0 = 0;
        ic2 ic2Var = this.P;
        oh2 oh2Var2 = ic2Var.f5662b;
        long jLongValue = ic2Var.f5677r;
        if (!this.P.f5662b.b()) {
            ic2 ic2Var2 = this.P;
            jx jxVar = this.D;
            oh2 oh2Var3 = ic2Var2.f5662b;
            zy zyVar = ic2Var2.f5661a;
            j6 = (zyVar.o() || zyVar.n(oh2Var3.f7769a, jxVar).f6184e) ? this.P.f5663c : this.P.f5677r;
        }
        if (z7) {
            this.f7685b0 = null;
            Pair pairN = N(this.P.f5661a);
            oh2Var2 = (oh2) pairN.first;
            jLongValue = ((Long) pairN.second).longValue();
            j6 = -9223372036854775807L;
            z10 = oh2Var2.equals(this.P.f5662b) ? false : true;
        }
        long j7 = jLongValue;
        long j8 = j6;
        this.I.t();
        this.W = false;
        zy zyVar2 = this.P.f5661a;
        if (z8 && (zyVar2 instanceof oc2)) {
            oc2 oc2Var2 = (oc2) zyVar2;
            oi2 oi2Var = this.J.f5338l;
            zy[] zyVarArr = oc2Var2.h;
            zy[] zyVarArr2 = new zy[zyVarArr.length];
            for (int i8 = 0; i8 < zyVarArr.length; i8++) {
                zyVarArr2[i8] = new nc2(zyVarArr[i8]);
            }
            oc2Var = new oc2(zyVarArr2, oc2Var2.f7712i, oi2Var);
            if (oh2Var2.f7770b != -1) {
                oc2Var.n(oh2Var2.f7769a, this.D);
                jx jxVar2 = this.D;
                cy cyVar = this.C;
                oc2Var.e(jxVar2.f6182c, cyVar, 0L);
                if (cyVar.b()) {
                    oh2Var = new oh2(oh2Var2.f7772d, oh2Var2.f7769a);
                }
            }
            ic2 ic2Var3 = this.P;
            int i9 = ic2Var3.f5665e;
            wa2 wa2Var = z9 ? null : ic2Var3.f5666f;
            ui2 ui2Var = !z10 ? ui2.f9566d : ic2Var3.h;
            gk2 gk2Var = !z10 ? this.f7698w : ic2Var3.f5668i;
            if (z10) {
                list = ic2Var3.f5669j;
            } else {
                zn1 zn1Var = bo1.f3236t;
                list = cp1.f3636w;
            }
            this.P = new ic2(oc2Var, oh2Var, j8, j7, i9, wa2Var, false, ui2Var, gk2Var, list, oh2Var, ic2Var3.f5671l, ic2Var3.f5672m, ic2Var3.f5673n, ic2Var3.f5674o, j7, 0L, j7, 0L);
            if (z8) {
                return;
            }
            this.I.v();
            hc2 hc2Var = this.J;
            HashMap map = hc2Var.f5333f;
            for (ec2 ec2Var : map.values()) {
                try {
                    ec2Var.f4224a.a(ec2Var.f4225b);
                } catch (RuntimeException e8) {
                    qs0.d("MediaSourceList", "Failed to release child source.", e8);
                }
                qh2 qh2Var = ec2Var.f4224a;
                dc2 dc2Var = ec2Var.f4226c;
                qh2Var.h(dc2Var);
                ec2Var.f4224a.k(dc2Var);
            }
            map.clear();
            hc2Var.f5334g.clear();
            hc2Var.f5336j = false;
            return;
        }
        oc2Var = zyVar2;
        oh2Var = oh2Var2;
        ic2 ic2Var32 = this.P;
        int i92 = ic2Var32.f5665e;
        wa2 wa2Var2 = z9 ? null : ic2Var32.f5666f;
        ui2 ui2Var2 = !z10 ? ui2.f9566d : ic2Var32.h;
        gk2 gk2Var2 = !z10 ? this.f7698w : ic2Var32.f5668i;
        if (z10) {
        }
        this.P = new ic2(oc2Var, oh2Var, j8, j7, i92, wa2Var2, false, ui2Var2, gk2Var2, list, oh2Var, ic2Var32.f5671l, ic2Var32.f5672m, ic2Var32.f5673n, ic2Var32.f5674o, j7, 0L, j7, 0L);
        if (z8) {
        }
    }

    public final void q() {
        vb2 vb2Var = this.I.h;
        boolean z6 = false;
        if (vb2Var != null && vb2Var.f9797g.f10154g && this.S) {
            z6 = true;
        }
        this.T = z6;
    }

    public final void r(long j6) {
        vb2 vb2Var = this.I.h;
        long j7 = j6 + (vb2Var == null ? 1000000000000L : vb2Var.f9805p);
        this.f7686c0 = j7;
        this.F.s.b(j7);
        for (int i6 = 0; i6 < 2; i6++) {
            sc2 sc2Var = this.s[i6];
            long j8 = this.f7686c0;
            pa2 pa2Var = sc2Var.f8897a;
            if (sc2.l(pa2Var)) {
                pa2Var.F = false;
                pa2Var.D = j8;
                pa2Var.E = j8;
                pa2Var.z(false, j8);
            }
        }
        for (vb2 vb2Var2 = r0.h; vb2Var2 != null; vb2Var2 = vb2Var2.f9802m) {
            for (ak2 ak2Var : (ak2[]) vb2Var2.f9804o.f5085c) {
            }
        }
    }

    public final void s(zy zyVar, zy zyVar2) {
        if (zyVar.o() && zyVar2.o()) {
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((lb2) arrayList.get(size)).getClass();
            int i6 = j31.f5914a;
            throw null;
        }
    }

    public final void t(boolean z6) throws wa2 {
        oh2 oh2Var = this.I.h.f9797g.f10148a;
        long jM = M(oh2Var, this.P.f5677r, true, false);
        if (jM != this.P.f5677r) {
            ic2 ic2Var = this.P;
            this.P = a(oh2Var, jM, ic2Var.f5663c, ic2Var.f5664d, z6, 5);
        }
    }

    public final void u(int i6, int i7, boolean z6, boolean z7) {
        this.Q.a(z7 ? 1 : 0);
        this.P = this.P.c(i7, i6, z6);
        D(false, false);
        for (vb2 vb2Var = this.I.h; vb2Var != null; vb2Var = vb2Var.f9802m) {
            for (ak2 ak2Var : (ak2[]) vb2Var.f9804o.f5085c) {
            }
        }
        if (!G()) {
            y();
            B();
            return;
        }
        int i8 = this.P.f5665e;
        xo0 xo0Var = this.f7701z;
        if (i8 != 3) {
            if (i8 == 2) {
                xo0Var.h(2);
                return;
            }
            return;
        }
        va2 va2Var = this.F;
        va2Var.f9770x = true;
        vc2 vc2Var = va2Var.s;
        if (!vc2Var.s) {
            vc2Var.f9810u = SystemClock.elapsedRealtime();
            vc2Var.s = true;
        }
        w();
        xo0Var.h(2);
    }

    public final void v(int i6) {
        ic2 ic2Var = this.P;
        if (ic2Var.f5665e != i6) {
            if (i6 != 2) {
                this.f7691h0 = -9223372036854775807L;
            }
            this.P = ic2Var.e(i6);
        }
    }

    public final void w() {
        vb2 vb2Var = this.I.h;
        if (vb2Var == null) {
            return;
        }
        gk2 gk2Var = vb2Var.f9804o;
        for (int i6 = 0; i6 < 2; i6++) {
            if (gk2Var.b(i6)) {
                pa2 pa2Var = this.s[i6].f8897a;
                int i7 = pa2Var.f8014z;
                if (i7 == 1) {
                    y5.r(i7 == 1);
                    pa2Var.f8014z = 2;
                    pa2Var.e();
                }
            }
        }
    }

    public final void x(boolean z6, boolean z7) {
        p(z6 || !this.Z, false, true, false);
        this.Q.a(z7 ? 1 : 0);
        this.f7699x.c(this.L);
        v(1);
    }

    public final void y() {
        int i6;
        va2 va2Var = this.F;
        va2Var.f9770x = false;
        vc2 vc2Var = va2Var.s;
        if (vc2Var.s) {
            vc2Var.b(vc2Var.zza());
            vc2Var.s = false;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            pa2 pa2Var = this.s[i7].f8897a;
            if (sc2.l(pa2Var) && (i6 = pa2Var.f8014z) == 2) {
                y5.r(i6 == 2);
                pa2Var.f8014z = 1;
                pa2Var.f();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    public final void z() {
        vb2 vb2Var = this.I.f10484j;
        boolean z6 = this.W || (vb2Var != null && vb2Var.f9791a.zzp());
        ic2 ic2Var = this.P;
        if (z6 != ic2Var.f5667g) {
            this.P = new ic2(ic2Var.f5661a, ic2Var.f5662b, ic2Var.f5663c, ic2Var.f5664d, ic2Var.f5665e, ic2Var.f5666f, z6, ic2Var.h, ic2Var.f5668i, ic2Var.f5669j, ic2Var.f5670k, ic2Var.f5671l, ic2Var.f5672m, ic2Var.f5673n, ic2Var.f5674o, ic2Var.f5675p, ic2Var.f5676q, ic2Var.f5677r, ic2Var.s);
        }
    }
}

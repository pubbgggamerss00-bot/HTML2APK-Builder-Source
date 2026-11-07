package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gb2 extends q72 {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f4973n0 = 0;
    public final fk2 A;
    public final xo0 B;
    public final ob2 C;
    public final as0 D;
    public final CopyOnWriteArraySet E;
    public final jx F;
    public final ArrayList G;
    public final boolean H;
    public final bd2 I;
    public final Looper J;
    public final nk2 K;
    public final hy0 L;
    public final db2 M;
    public final eb2 N;
    public final oa2 O;
    public final long P;
    public int Q;
    public int R;
    public boolean S;
    public final tc2 T;
    public final ya2 U;
    public cr V;
    public lf W;
    public Object X;
    public Surface Y;
    public final int Z;

    /* renamed from: a0, reason: collision with root package name */
    public sx0 f4974a0;

    /* renamed from: b0, reason: collision with root package name */
    public final gy0 f4975b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4976c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4977d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f4978e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4979f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f4980g0;

    /* renamed from: h0, reason: collision with root package name */
    public lf f4981h0;

    /* renamed from: i0, reason: collision with root package name */
    public ic2 f4982i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f4983j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f4984k0;

    /* renamed from: l0, reason: collision with root package name */
    public final dh0 f4985l0;

    /* renamed from: m0, reason: collision with root package name */
    public oi2 f4986m0;

    /* renamed from: u, reason: collision with root package name */
    public final gk2 f4987u;

    /* renamed from: v, reason: collision with root package name */
    public final cr f4988v;

    /* renamed from: w, reason: collision with root package name */
    public final am0 f4989w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f4990x;

    /* renamed from: y, reason: collision with root package name */
    public final uc2 f4991y;

    /* renamed from: z, reason: collision with root package name */
    public final pa2[] f4992z;

    static {
        id.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public gb2(xa2 xa2Var, uc2 uc2Var) {
        int i6;
        fd2 fd2Var;
        hd2 hd2Var;
        hd2 hd2Var2;
        super(4);
        this.f4989w = new am0();
        try {
            qs0.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + j31.f5918e + "]");
            Context context = xa2Var.f10455a;
            String str = xa2Var.f10471r;
            Looper looper = xa2Var.h;
            hy0 hy0Var = xa2Var.f10456b;
            this.f4990x = context.getApplicationContext();
            this.I = new bd2(hy0Var);
            this.f4980g0 = xa2Var.f10462i;
            this.f4975b0 = xa2Var.f10463j;
            this.Z = xa2Var.f10464k;
            this.f4977d0 = false;
            this.P = xa2Var.f10468o;
            db2 db2Var = new db2(this);
            this.M = db2Var;
            this.N = new eb2();
            Handler handler = new Handler(looper);
            this.f4992z = ((xj0) xa2Var.f10457c.f9702t).c(handler, db2Var, db2Var);
            this.A = (fk2) xa2Var.f10459e.mo7zza();
            Context context2 = xa2Var.f10458d.f11029t;
            new s0();
            new j00(context2);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map.clear();
            map2.clear();
            this.K = nk2.b((Context) xa2Var.f10461g.f10617t);
            this.H = xa2Var.f10465l;
            this.T = xa2Var.f10466m;
            this.J = looper;
            this.L = hy0Var;
            this.f4991y = uc2Var;
            this.D = new as0(looper, hy0Var, new iu1(14));
            this.E = new CopyOnWriteArraySet();
            this.G = new ArrayList();
            this.f4986m0 = new oi2();
            this.U = ya2.f10912a;
            this.f4987u = new gk2(new rc2[2], new ak2[2], w50.f10048b, null);
            this.F = new jx();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i7 = 0; i7 < 20; i7++) {
                int i8 = iArr[i7];
                y5.r(!false);
                sparseBooleanArray.append(i8, true);
            }
            this.A.d();
            y5.r(!false);
            sparseBooleanArray.append(29, true);
            y5.r(!false);
            dj2 dj2Var = new dj2(sparseBooleanArray);
            this.f4988v = new cr(dj2Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i9 = 0; i9 < dj2Var.f3961a.size(); i9++) {
                int iA = dj2Var.a(i9);
                y5.r(!false);
                sparseBooleanArray2.append(iA, true);
            }
            y5.r(!false);
            sparseBooleanArray2.append(4, true);
            y5.r(!false);
            sparseBooleanArray2.append(10, true);
            y5.r(!false);
            this.V = new cr(new dj2(sparseBooleanArray2));
            this.B = this.L.a(this.J, null);
            dh0 dh0Var = new dh0(24, this);
            this.f4985l0 = dh0Var;
            this.f4982i0 = ic2.g(this.f4987u);
            this.I.n(this.f4991y, this.J);
            if (j31.f5914a < 31) {
                hd2Var2 = new hd2(str);
                i6 = 0;
            } else {
                Context context3 = this.f4990x;
                boolean z6 = xa2Var.f10469p;
                MediaMetricsManager mediaMetricsManagerC = androidx.camera.camera2.internal.b1.c(context3.getSystemService("media_metrics"));
                if (mediaMetricsManagerC == null) {
                    i6 = 0;
                    fd2Var = null;
                } else {
                    i6 = 0;
                    fd2Var = new fd2(context3, mediaMetricsManagerC.createPlaybackSession());
                }
                if (fd2Var == null) {
                    qs0.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    hd2Var = new hd2(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z6) {
                        R(fd2Var);
                    }
                    hd2Var = new hd2(fd2Var.f4614u.getSessionId(), str);
                }
                hd2Var2 = hd2Var;
            }
            this.C = new ob2(this.f4992z, this.A, this.f4987u, (rb2) xa2Var.f10460f.mo7zza(), this.K, this.I, this.T, xa2Var.s, xa2Var.f10467n, this.J, this.L, dh0Var, hd2Var2, this.U);
            this.f4976c0 = 1.0f;
            lf lfVar = lf.f6679z;
            this.W = lfVar;
            this.f4981h0 = lfVar;
            this.f4983j0 = -1;
            AudioManager audioManager = (AudioManager) this.f4990x.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i10 = oh0.f7758a;
            this.f4978e0 = true;
            bd2 bd2Var = this.I;
            as0 as0Var = this.D;
            if (bd2Var == null) {
                throw null;
            }
            as0Var.a(bd2Var);
            this.K.a(new Handler(this.J), this.I);
            this.E.add(this.M);
            context.getApplicationContext();
            new ka2(handler);
            this.O = new oa2(context, handler, this.M);
            context.getApplicationContext();
            context.getApplicationContext();
            n90 n90Var = n90.f7346d;
            this.f4974a0 = sx0.f9043c;
            this.A.c(this.f4975b0);
            I(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            I(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            I(1, 3, this.f4975b0);
            I(2, 4, Integer.valueOf(this.Z));
            I(2, 5, Integer.valueOf(i6));
            I(1, 9, Boolean.valueOf(this.f4977d0));
            I(2, 7, this.N);
            I(6, 8, this.N);
            I(-1, 16, Integer.valueOf(this.f4980g0));
            this.f4989w.b();
        } catch (Throwable th) {
            this.f4989w.b();
            throw th;
        }
    }

    public static long E(ic2 ic2Var) {
        cy cyVar = new cy();
        jx jxVar = new jx();
        ic2Var.f5661a.n(ic2Var.f5662b.f7769a, jxVar);
        long j6 = ic2Var.f5663c;
        if (j6 != -9223372036854775807L) {
            return j6;
        }
        ic2Var.f5661a.e(jxVar.f6182c, cyVar, 0L).getClass();
        return 0L;
    }

    public final void A(ja0 ja0Var) {
        N();
        as0 as0Var = this.I.f3046f;
        as0Var.e();
        CopyOnWriteArraySet copyOnWriteArraySet = as0Var.f2839d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            mr0 mr0Var = (mr0) it.next();
            if (mr0Var.f7214a.equals(ja0Var)) {
                vq0 vq0Var = as0Var.f2838c;
                mr0Var.f7217d = true;
                if (mr0Var.f7216c) {
                    mr0Var.f7216c = false;
                    vq0Var.e(mr0Var.f7214a, mr0Var.f7215b.b());
                }
                copyOnWriteArraySet.remove(mr0Var);
            }
        }
    }

    public final int B(ic2 ic2Var) {
        return ic2Var.f5661a.o() ? this.f4983j0 : ic2Var.f5661a.n(ic2Var.f5662b.f7769a, this.F).f6182c;
    }

    public final long C(ic2 ic2Var) {
        long jV = j31.v(0L);
        oh2 oh2Var = ic2Var.f5662b;
        zy zyVar = ic2Var.f5661a;
        if (!oh2Var.b()) {
            return j31.v(D(ic2Var));
        }
        zyVar.n(ic2Var.f5662b.f7769a, this.F);
        long j6 = ic2Var.f5663c;
        if (j6 != -9223372036854775807L) {
            return jV + j31.v(j6);
        }
        zyVar.e(B(ic2Var), (cy) this.s, 0L).getClass();
        return jV;
    }

    public final long D(ic2 ic2Var) {
        if (ic2Var.f5661a.o()) {
            return j31.s(this.f4984k0);
        }
        long j6 = ic2Var.f5677r;
        if (ic2Var.f5662b.b()) {
            return j6;
        }
        ic2Var.f5661a.n(ic2Var.f5662b.f7769a, this.F);
        return j6;
    }

    public final Pair F(zy zyVar, int i6, long j6) {
        if (zyVar.o()) {
            this.f4983j0 = i6;
            if (j6 == -9223372036854775807L) {
                j6 = 0;
            }
            this.f4984k0 = j6;
            return null;
        }
        if (i6 == -1 || i6 >= zyVar.c()) {
            i6 = zyVar.g(false);
            zyVar.e(i6, (cy) this.s, 0L).getClass();
            j6 = j31.v(0L);
        }
        return zyVar.l((cy) this.s, this.F, i6, j31.s(j6));
    }

    public final ic2 G(ic2 ic2Var, zy zyVar, Pair pair) {
        List list;
        y5.n(zyVar.o() || pair != null);
        zy zyVar2 = ic2Var.f5661a;
        long jC = C(ic2Var);
        ic2 ic2VarF = ic2Var.f(zyVar);
        if (zyVar.o()) {
            oh2 oh2Var = ic2.f5660t;
            long jS = j31.s(this.f4984k0);
            ic2 ic2VarA = ic2VarF.b(oh2Var, jS, jS, jS, 0L, ui2.f9566d, this.f4987u, cp1.f3636w).a(oh2Var);
            ic2VarA.f5675p = ic2VarA.f5677r;
            return ic2VarA;
        }
        Object obj = ic2VarF.f5662b.f7769a;
        int i6 = j31.f5914a;
        boolean zEquals = obj.equals(pair.first);
        oh2 oh2Var2 = !zEquals ? new oh2(-1L, pair.first) : ic2VarF.f5662b;
        long jLongValue = ((Long) pair.second).longValue();
        long jS2 = j31.s(jC);
        if (!zyVar2.o()) {
            zyVar2.n(obj, this.F);
        }
        if (!zEquals || jLongValue < jS2) {
            oh2 oh2Var3 = oh2Var2;
            y5.r(!oh2Var3.b());
            ui2 ui2Var = !zEquals ? ui2.f9566d : ic2VarF.h;
            gk2 gk2Var = !zEquals ? this.f4987u : ic2VarF.f5668i;
            if (zEquals) {
                list = ic2VarF.f5669j;
            } else {
                zn1 zn1Var = bo1.f3236t;
                list = cp1.f3636w;
            }
            ic2 ic2VarA2 = ic2VarF.b(oh2Var3, jLongValue, jLongValue, jLongValue, 0L, ui2Var, gk2Var, list).a(oh2Var3);
            ic2VarA2.f5675p = jLongValue;
            return ic2VarA2;
        }
        if (jLongValue != jS2) {
            oh2 oh2Var4 = oh2Var2;
            y5.r(!oh2Var4.b());
            long jMax = Math.max(0L, ic2VarF.f5676q - (jLongValue - jS2));
            long j6 = ic2VarF.f5675p;
            if (ic2VarF.f5670k.equals(ic2VarF.f5662b)) {
                j6 = jLongValue + jMax;
            }
            ic2 ic2VarB = ic2VarF.b(oh2Var4, jLongValue, jLongValue, jLongValue, jMax, ic2VarF.h, ic2VarF.f5668i, ic2VarF.f5669j);
            ic2VarB.f5675p = j6;
            return ic2VarB;
        }
        int iA = zyVar.a(ic2VarF.f5670k.f7769a);
        if (iA != -1 && zyVar.d(iA, this.F, false).f6182c == zyVar.n(oh2Var2.f7769a, this.F).f6182c) {
            return ic2VarF;
        }
        zyVar.n(oh2Var2.f7769a, this.F);
        long jA = oh2Var2.b() ? this.F.a(oh2Var2.f7770b, oh2Var2.f7771c) : this.F.f6183d;
        oh2 oh2Var5 = oh2Var2;
        ic2 ic2VarA3 = ic2VarF.b(oh2Var5, ic2VarF.f5677r, ic2VarF.f5677r, ic2VarF.f5664d, jA - ic2VarF.f5677r, ic2VarF.h, ic2VarF.f5668i, ic2VarF.f5669j).a(oh2Var5);
        ic2VarA3.f5675p = jA;
        return ic2VarA3;
    }

    public final void H(int i6, int i7) {
        sx0 sx0Var = this.f4974a0;
        if (i6 == sx0Var.f9044a && i7 == sx0Var.f9045b) {
            return;
        }
        this.f4974a0 = new sx0(i6, i7);
        sj1 sj1Var = new sj1(i6, i7);
        as0 as0Var = this.D;
        as0Var.c(24, sj1Var);
        as0Var.b();
        I(2, 14, new sx0(i6, i7));
    }

    public final void I(int i6, int i7, Object obj) {
        pa2[] pa2VarArr = this.f4992z;
        int length = pa2VarArr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            pa2 pa2Var = pa2VarArr[i8];
            if (i6 == -1 || pa2Var.f8008t == i6) {
                B(this.f4982i0);
                ob2 ob2Var = this.C;
                zy zyVar = this.f4982i0.f5661a;
                mc2 mc2Var = new mc2(ob2Var, pa2Var, ob2Var.B);
                y5.r(!mc2Var.f7087e);
                mc2Var.f7084b = i7;
                y5.r(!mc2Var.f7087e);
                mc2Var.f7085c = obj;
                y5.r(!mc2Var.f7087e);
                mc2Var.f7087e = true;
                synchronized (ob2Var) {
                    if (ob2Var.R || !ob2Var.B.getThread().isAlive()) {
                        qs0.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                        mc2Var.a(false);
                    } else {
                        ob2Var.f7701z.d(14, mc2Var).a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Surface surface) {
        Object obj = this.X;
        boolean z6 = false;
        boolean z7 = true;
        if (obj != null && obj != surface) {
            z6 = true;
        }
        long j6 = z6 ? this.P : -9223372036854775807L;
        ob2 ob2Var = this.C;
        synchronized (ob2Var) {
            if (!ob2Var.R && ob2Var.B.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                ob2Var.f7701z.d(30, new Pair(surface, atomicBoolean)).a();
                if (j6 != -9223372036854775807L) {
                    ob2Var.E(new l2(15, atomicBoolean), j6);
                    z7 = atomicBoolean.get();
                }
            }
        }
        if (z6) {
            Object obj2 = this.X;
            Surface surface2 = this.Y;
            if (obj2 == surface2) {
                surface2.release();
                this.Y = null;
            }
        }
        this.X = surface;
        if (z7) {
            return;
        }
        K(new wa2(2, new pb2("Detaching surface timed out."), 1003));
    }

    public final void K(wa2 wa2Var) {
        ic2 ic2Var = this.f4982i0;
        ic2 ic2VarA = ic2Var.a(ic2Var.f5662b);
        ic2VarA.f5675p = ic2VarA.f5677r;
        ic2VarA.f5676q = 0L;
        ic2 ic2VarE = ic2VarA.e(1);
        if (wa2Var != null) {
            ic2VarE = ic2VarE.d(wa2Var);
        }
        this.Q++;
        this.C.f7701z.zzb(6).a();
        M(ic2VarE, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void L(int i6, int i7, boolean z6) {
        ?? r14 = (!z6 || i6 == -1) ? 0 : 1;
        int i8 = i6 == 0 ? 1 : 0;
        ic2 ic2Var = this.f4982i0;
        if (ic2Var.f5671l == r14 && ic2Var.f5673n == i8 && ic2Var.f5672m == i7) {
            return;
        }
        this.Q++;
        ic2 ic2VarC = ic2Var.c(i7, i8, r14);
        this.C.f7701z.g(r14, i7 | (i8 << 4)).a();
        M(ic2VarC, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0557 A[LOOP:0: B:255:0x054f->B:257:0x0557, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0568 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0574 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0594 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(final ic2 ic2Var, int i6, boolean z6, int i7, long j6, int i8) {
        int i9;
        boolean z7;
        Pair pair;
        boolean z8;
        int i10;
        boolean zBooleanValue;
        tc tcVar;
        List list;
        zy zyVarV;
        lf lfVar;
        boolean z9;
        int iL;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final int i11;
        gk2 gk2Var;
        gk2 gk2Var2;
        int i12;
        final int i13;
        cr crVar;
        boolean z14;
        zy zyVarV2;
        int i14;
        boolean z15;
        zy zyVarV3;
        boolean z16;
        boolean z17;
        zy zyVarV4;
        boolean z18;
        boolean z19;
        boolean zO;
        dj2 dj2Var;
        int i15;
        cr crVar2;
        int i16;
        Object obj;
        tc tcVar2;
        Object obj2;
        int i17;
        long jE;
        long jE2;
        Object obj3;
        tc tcVar3;
        Object obj4;
        int iA;
        int i18 = i7;
        ic2 ic2Var2 = this.f4982i0;
        this.f4982i0 = ic2Var;
        boolean zEquals = ic2Var2.f5661a.equals(ic2Var.f5661a);
        zy zyVar = ic2Var2.f5661a;
        zy zyVar2 = ic2Var.f5661a;
        if (zyVar2.o() && zyVar.o()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (zyVar2.o() == zyVar.o()) {
                if (zyVar.e(zyVar.n(ic2Var2.f5662b.f7769a, this.F).f6182c, (cy) this.s, 0L).f3688a.equals(zyVar2.e(zyVar2.n(ic2Var.f5662b.f7769a, this.F).f6182c, (cy) this.s, 0L).f3688a)) {
                    if (!z6) {
                        i9 = i18;
                        z7 = false;
                    } else if (i18 != 0) {
                        i9 = i18;
                        z7 = true;
                    } else if (ic2Var2.f5662b.f7772d < ic2Var.f5662b.f7772d) {
                        pair = new Pair(Boolean.TRUE, 0);
                        z7 = true;
                        i9 = 0;
                    } else {
                        z7 = true;
                        i9 = 0;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z6) {
                        z8 = false;
                    } else if (i18 == 0) {
                        z8 = true;
                        i10 = 1;
                        i18 = 0;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i10));
                        boolean z20 = z8;
                        i9 = i18;
                        z7 = z20;
                    } else {
                        z8 = true;
                    }
                    boolean z21 = z8;
                    if (z8 && i18 == 1) {
                        z8 = z21;
                        i10 = 2;
                    } else {
                        if (zEquals) {
                            throw new IllegalStateException();
                        }
                        i10 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i10));
                    boolean z202 = z8;
                    i9 = i18;
                    z7 = z202;
                }
                zBooleanValue = ((Boolean) pair.first).booleanValue();
                int iIntValue = ((Integer) pair.second).intValue();
                if (zBooleanValue) {
                    tcVar = null;
                } else {
                    tcVar = !ic2Var.f5661a.o() ? ic2Var.f5661a.e(ic2Var.f5661a.n(ic2Var.f5662b.f7769a, this.F).f6182c, (cy) this.s, 0L).f3689b : null;
                    this.f4981h0 = lf.f6679z;
                }
                if (!zBooleanValue || !ic2Var2.f5669j.equals(ic2Var.f5669j)) {
                    lf lfVar2 = this.f4981h0;
                    lfVar2.getClass();
                    ae aeVar = new ae(lfVar2);
                    list = ic2Var.f5669j;
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        qh qhVar = (qh) list.get(i19);
                        int i20 = 0;
                        while (true) {
                            zg[] zgVarArr = qhVar.s;
                            if (i20 < zgVarArr.length) {
                                zgVarArr[i20].d(aeVar);
                                i20++;
                            }
                        }
                    }
                    this.f4981h0 = new lf(aeVar);
                }
                zyVarV = v();
                if (zyVarV.o()) {
                    tc tcVar4 = zyVarV.e(h(), (cy) this.s, 0L).f3689b;
                    lf lfVar3 = this.f4981h0;
                    lfVar3.getClass();
                    ae aeVar2 = new ae(lfVar3);
                    lf lfVar4 = tcVar4.f9225d;
                    if (lfVar4 != null) {
                        CharSequence charSequence = lfVar4.f6680a;
                        if (charSequence != null) {
                            aeVar2.f2671a = charSequence;
                        }
                        CharSequence charSequence2 = lfVar4.f6681b;
                        if (charSequence2 != null) {
                            aeVar2.f2672b = charSequence2;
                        }
                        CharSequence charSequence3 = lfVar4.f6682c;
                        if (charSequence3 != null) {
                            aeVar2.f2673c = charSequence3;
                        }
                        CharSequence charSequence4 = lfVar4.f6683d;
                        if (charSequence4 != null) {
                            aeVar2.f2674d = charSequence4;
                        }
                        CharSequence charSequence5 = lfVar4.f6684e;
                        if (charSequence5 != null) {
                            aeVar2.f2675e = charSequence5;
                        }
                        byte[] bArr = lfVar4.f6685f;
                        if (bArr != null) {
                            Integer num = lfVar4.f6686g;
                            aeVar2.f2676f = (byte[]) bArr.clone();
                            aeVar2.f2677g = num;
                        }
                        Integer num2 = lfVar4.h;
                        if (num2 != null) {
                            aeVar2.h = num2;
                        }
                        Integer num3 = lfVar4.f6687i;
                        if (num3 != null) {
                            aeVar2.f2678i = num3;
                        }
                        Integer num4 = lfVar4.f6688j;
                        if (num4 != null) {
                            aeVar2.f2679j = num4;
                        }
                        Boolean bool = lfVar4.f6689k;
                        if (bool != null) {
                            aeVar2.f2680k = bool;
                        }
                        Integer num5 = lfVar4.f6690l;
                        if (num5 != null) {
                            aeVar2.f2681l = num5;
                        }
                        Integer num6 = lfVar4.f6691m;
                        if (num6 != null) {
                            aeVar2.f2681l = num6;
                        }
                        Integer num7 = lfVar4.f6692n;
                        if (num7 != null) {
                            aeVar2.f2682m = num7;
                        }
                        Integer num8 = lfVar4.f6693o;
                        if (num8 != null) {
                            aeVar2.f2683n = num8;
                        }
                        Integer num9 = lfVar4.f6694p;
                        if (num9 != null) {
                            aeVar2.f2684o = num9;
                        }
                        Integer num10 = lfVar4.f6695q;
                        if (num10 != null) {
                            aeVar2.f2685p = num10;
                        }
                        Integer num11 = lfVar4.f6696r;
                        if (num11 != null) {
                            aeVar2.f2686q = num11;
                        }
                        CharSequence charSequence6 = lfVar4.s;
                        if (charSequence6 != null) {
                            aeVar2.f2687r = charSequence6;
                        }
                        CharSequence charSequence7 = lfVar4.f6697t;
                        if (charSequence7 != null) {
                            aeVar2.s = charSequence7;
                        }
                        CharSequence charSequence8 = lfVar4.f6698u;
                        if (charSequence8 != null) {
                            aeVar2.f2688t = charSequence8;
                        }
                        CharSequence charSequence9 = lfVar4.f6699v;
                        if (charSequence9 != null) {
                            aeVar2.f2689u = charSequence9;
                        }
                        CharSequence charSequence10 = lfVar4.f6700w;
                        if (charSequence10 != null) {
                            aeVar2.f2690v = charSequence10;
                        }
                        Integer num12 = lfVar4.f6701x;
                        if (num12 != null) {
                            aeVar2.f2691w = num12;
                        }
                    }
                    lfVar = new lf(aeVar2);
                } else {
                    lfVar = this.f4981h0;
                }
                boolean zEquals2 = lfVar.equals(this.W);
                this.W = lfVar;
                boolean z22 = ic2Var2.f5671l == ic2Var.f5671l;
                z9 = ic2Var2.f5665e == ic2Var.f5665e;
                if ((z9 || z22) && ((iL = l()) == 2 || iL == 3)) {
                    N();
                    this.f4982i0.getClass();
                    x();
                    x();
                }
                z10 = ic2Var2.f5667g == ic2Var.f5667g;
                if (!zEquals) {
                    this.D.c(0, new za2(ic2Var, i6));
                }
                if (z7) {
                    z11 = zBooleanValue;
                    z12 = z22;
                    z13 = zEquals2;
                } else {
                    jx jxVar = new jx();
                    if (ic2Var2.f5661a.o()) {
                        z11 = zBooleanValue;
                        z12 = z22;
                        z13 = zEquals2;
                        i16 = i8;
                        obj = null;
                        tcVar2 = null;
                        obj2 = null;
                        i17 = -1;
                    } else {
                        Object obj5 = ic2Var2.f5662b.f7769a;
                        ic2Var2.f5661a.n(obj5, jxVar);
                        int i21 = jxVar.f6182c;
                        int iA2 = ic2Var2.f5661a.a(obj5);
                        z11 = zBooleanValue;
                        z12 = z22;
                        z13 = zEquals2;
                        obj = ic2Var2.f5661a.e(i21, (cy) this.s, 0L).f3688a;
                        tcVar2 = ((cy) this.s).f3689b;
                        obj2 = obj5;
                        i16 = i21;
                        i17 = iA2;
                    }
                    if (i9 == 0) {
                        if (ic2Var2.f5662b.b()) {
                            oh2 oh2Var = ic2Var2.f5662b;
                            jE = jxVar.a(oh2Var.f7770b, oh2Var.f7771c);
                            jE2 = E(ic2Var2);
                            int i22 = j31.f5914a;
                            oh2 oh2Var2 = ic2Var2.f5662b;
                            bt btVar = new bt(obj, i16, tcVar2, obj2, i17, j31.v(jE), j31.v(jE2), oh2Var2.f7770b, oh2Var2.f7771c);
                            int iH = h();
                            if (this.f4982i0.f5661a.o()) {
                                ic2 ic2Var3 = this.f4982i0;
                                Object obj6 = ic2Var3.f5662b.f7769a;
                                ic2Var3.f5661a.n(obj6, this.F);
                                iA = this.f4982i0.f5661a.a(obj6);
                                obj4 = obj6;
                                obj3 = this.f4982i0.f5661a.e(iH, (cy) this.s, 0L).f3688a;
                                tcVar3 = ((cy) this.s).f3689b;
                            } else {
                                obj3 = null;
                                tcVar3 = null;
                                obj4 = null;
                                iA = -1;
                            }
                            long jV = j31.v(j6);
                            long jV2 = !this.f4982i0.f5662b.b() ? j31.v(E(this.f4982i0)) : jV;
                            oh2 oh2Var3 = this.f4982i0.f5662b;
                            bt btVar2 = new bt(obj3, iH, tcVar3, obj4, iA, jV, jV2, oh2Var3.f7770b, oh2Var3.f7771c);
                            as0 as0Var = this.D;
                            m2 m2Var = new m2();
                            m2Var.s = i9;
                            m2Var.f6905t = btVar;
                            m2Var.f6906u = btVar2;
                            as0Var.c(11, m2Var);
                        } else {
                            jE = ic2Var2.f5662b.f7773e != -1 ? E(this.f4982i0) : jxVar.f6183d;
                            jE2 = jE;
                            int i222 = j31.f5914a;
                            oh2 oh2Var22 = ic2Var2.f5662b;
                            bt btVar3 = new bt(obj, i16, tcVar2, obj2, i17, j31.v(jE), j31.v(jE2), oh2Var22.f7770b, oh2Var22.f7771c);
                            int iH2 = h();
                            if (this.f4982i0.f5661a.o()) {
                            }
                            long jV3 = j31.v(j6);
                            if (!this.f4982i0.f5662b.b()) {
                            }
                            oh2 oh2Var32 = this.f4982i0.f5662b;
                            bt btVar22 = new bt(obj3, iH2, tcVar3, obj4, iA, jV3, jV2, oh2Var32.f7770b, oh2Var32.f7771c);
                            as0 as0Var2 = this.D;
                            m2 m2Var2 = new m2();
                            m2Var2.s = i9;
                            m2Var2.f6905t = btVar3;
                            m2Var2.f6906u = btVar22;
                            as0Var2.c(11, m2Var2);
                        }
                    } else if (ic2Var2.f5662b.b()) {
                        jE = ic2Var2.f5677r;
                        jE2 = E(ic2Var2);
                        int i2222 = j31.f5914a;
                        oh2 oh2Var222 = ic2Var2.f5662b;
                        bt btVar32 = new bt(obj, i16, tcVar2, obj2, i17, j31.v(jE), j31.v(jE2), oh2Var222.f7770b, oh2Var222.f7771c);
                        int iH22 = h();
                        if (this.f4982i0.f5661a.o()) {
                        }
                        long jV32 = j31.v(j6);
                        if (!this.f4982i0.f5662b.b()) {
                        }
                        oh2 oh2Var322 = this.f4982i0.f5662b;
                        bt btVar222 = new bt(obj3, iH22, tcVar3, obj4, iA, jV32, jV2, oh2Var322.f7770b, oh2Var322.f7771c);
                        as0 as0Var22 = this.D;
                        m2 m2Var22 = new m2();
                        m2Var22.s = i9;
                        m2Var22.f6905t = btVar32;
                        m2Var22.f6906u = btVar222;
                        as0Var22.c(11, m2Var22);
                    } else {
                        jE = ic2Var2.f5677r;
                        jE2 = jE;
                        int i22222 = j31.f5914a;
                        oh2 oh2Var2222 = ic2Var2.f5662b;
                        bt btVar322 = new bt(obj, i16, tcVar2, obj2, i17, j31.v(jE), j31.v(jE2), oh2Var2222.f7770b, oh2Var2222.f7771c);
                        int iH222 = h();
                        if (this.f4982i0.f5661a.o()) {
                        }
                        long jV322 = j31.v(j6);
                        if (!this.f4982i0.f5662b.b()) {
                        }
                        oh2 oh2Var3222 = this.f4982i0.f5662b;
                        bt btVar2222 = new bt(obj3, iH222, tcVar3, obj4, iA, jV322, jV2, oh2Var3222.f7770b, oh2Var3222.f7771c);
                        as0 as0Var222 = this.D;
                        m2 m2Var222 = new m2();
                        m2Var222.s = i9;
                        m2Var222.f6905t = btVar322;
                        m2Var222.f6906u = btVar2222;
                        as0Var222.c(11, m2Var222);
                    }
                }
                if (z11) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    this.D.c(1, new ov1(tcVar, iIntValue));
                }
                if (ic2Var2.f5666f != ic2Var.f5666f) {
                    this.D.c(10, new eq0() { // from class: com.google.android.gms.internal.ads.ab2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i23 = i11;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i23) {
                                case 0:
                                    int i24 = gb2.f4973n0;
                                    bsVar.i(ic2Var4.f5665e);
                                    break;
                                default:
                                    int i25 = gb2.f4973n0;
                                    bsVar.j(ic2Var4.f5666f);
                                    break;
                            }
                        }
                    });
                    if (ic2Var.f5666f != null) {
                        this.D.c(10, new ck1(15, ic2Var));
                    }
                }
                gk2Var = ic2Var2.f5668i;
                gk2Var2 = ic2Var.f5668i;
                if (gk2Var != gk2Var2) {
                    this.A.f(gk2Var2.f5087e);
                    final int i23 = 1;
                    this.D.c(2, new eq0() { // from class: com.google.android.gms.internal.ads.cb2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i24 = i23;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i24) {
                                case 0:
                                    int i25 = gb2.f4973n0;
                                    int i26 = ic2Var4.f5673n;
                                    bsVar.zzi();
                                    break;
                                default:
                                    int i27 = gb2.f4973n0;
                                    Object obj8 = ic2Var4.f5668i.f5086d;
                                    bsVar.zzq();
                                    break;
                            }
                        }
                    });
                }
                if (!z13) {
                    this.D.c(14, new ih1(this.W));
                }
                i12 = 23;
                if (z10) {
                    this.D.c(3, new xj1(i12, ic2Var));
                }
                if (!z9 || z12) {
                    this.D.c(-1, new dh0(i12, ic2Var));
                }
                if (z9) {
                    final int i24 = 0;
                    this.D.c(4, new eq0() { // from class: com.google.android.gms.internal.ads.ab2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i232 = i24;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i232) {
                                case 0:
                                    int i242 = gb2.f4973n0;
                                    bsVar.i(ic2Var4.f5665e);
                                    break;
                                default:
                                    int i25 = gb2.f4973n0;
                                    bsVar.j(ic2Var4.f5666f);
                                    break;
                            }
                        }
                    });
                }
                if (z12 && ic2Var2.f5672m == ic2Var.f5672m) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    this.D.c(5, new eq0() { // from class: com.google.android.gms.internal.ads.bb2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i25 = i13;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i25) {
                                case 0:
                                    int i26 = gb2.f4973n0;
                                    boolean z23 = ic2Var4.f5671l;
                                    bsVar.zzf();
                                    break;
                                default:
                                    int i27 = gb2.f4973n0;
                                    ip ipVar = ic2Var4.f5674o;
                                    bsVar.zzg();
                                    break;
                            }
                        }
                    });
                }
                if (ic2Var2.f5673n != ic2Var.f5673n) {
                    this.D.c(6, new eq0() { // from class: com.google.android.gms.internal.ads.cb2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i242 = i13;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i242) {
                                case 0:
                                    int i25 = gb2.f4973n0;
                                    int i26 = ic2Var4.f5673n;
                                    bsVar.zzi();
                                    break;
                                default:
                                    int i27 = gb2.f4973n0;
                                    Object obj8 = ic2Var4.f5668i.f5086d;
                                    bsVar.zzq();
                                    break;
                            }
                        }
                    });
                }
                if (ic2Var2.h() != ic2Var.h()) {
                    this.D.c(7, new za2(ic2Var));
                }
                if (ic2Var2.f5674o.equals(ic2Var.f5674o)) {
                    final int i25 = 1;
                    this.D.c(12, new eq0() { // from class: com.google.android.gms.internal.ads.bb2
                        @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                        /* renamed from: zza */
                        public final void mo6zza(Object obj7) {
                            int i252 = i25;
                            ic2 ic2Var4 = ic2Var;
                            bs bsVar = (bs) obj7;
                            switch (i252) {
                                case 0:
                                    int i26 = gb2.f4973n0;
                                    boolean z23 = ic2Var4.f5671l;
                                    bsVar.zzf();
                                    break;
                                default:
                                    int i27 = gb2.f4973n0;
                                    ip ipVar = ic2Var4.f5674o;
                                    bsVar.zzg();
                                    break;
                            }
                        }
                    });
                }
                crVar = this.V;
                uc2 uc2Var = this.f4991y;
                cr crVar3 = this.f4988v;
                int i26 = j31.f5914a;
                boolean z23 = uc2Var.z();
                zy zyVarV5 = uc2Var.v();
                z14 = zyVarV5.o() && zyVarV5.e(uc2Var.h(), (cy) uc2Var.s, 0L).f3693f;
                zyVarV2 = uc2Var.v();
                if (zyVarV2.o()) {
                    int iH3 = uc2Var.h();
                    uc2Var.p();
                    uc2Var.y();
                    int iK = zyVarV2.k(iH3);
                    i14 = -1;
                    z15 = iK != -1;
                } else {
                    z15 = false;
                    i14 = -1;
                }
                zyVarV3 = uc2Var.v();
                if (zyVarV3.o()) {
                    int iH4 = uc2Var.h();
                    uc2Var.p();
                    uc2Var.y();
                    z16 = zyVarV3.j(iH4, 0, false) != i14;
                } else {
                    z16 = false;
                }
                zy zyVarV6 = uc2Var.v();
                z17 = zyVarV6.o() && zyVarV6.e(uc2Var.h(), (cy) uc2Var.s, 0L).b();
                zyVarV4 = uc2Var.v();
                if (zyVarV4.o()) {
                    z18 = z23;
                    z19 = zyVarV4.e(uc2Var.h(), (cy) uc2Var.s, 0L).f3694g;
                    zO = uc2Var.v().o();
                    vy0 vy0Var = new vy0();
                    dj2Var = crVar3.f3643a;
                    for (i15 = 0; i15 < dj2Var.f3961a.size(); i15++) {
                        vy0Var.a(dj2Var.a(i15));
                    }
                    if (!z18) {
                        vy0Var.a(4);
                    }
                    if (z14 && !z18) {
                        vy0Var.a(5);
                    }
                    if (z15 && !z18) {
                        vy0Var.a(6);
                    }
                    if (!zO && (z15 || !z17 || z14) && !z18) {
                        vy0Var.a(7);
                    }
                    if (z16 && !z18) {
                        vy0Var.a(8);
                    }
                    if (!zO && (z16 || (z17 && z19)) && !z18) {
                        vy0Var.a(9);
                    }
                    if (!z18) {
                        vy0Var.a(10);
                    }
                    if (z14 && !z18) {
                        vy0Var.a(11);
                    }
                    if (z14 && !z18) {
                        vy0Var.a(12);
                    }
                    crVar2 = new cr(vy0Var.b());
                    this.V = crVar2;
                    if (!crVar2.equals(crVar)) {
                        this.D.c(13, new rj1(this));
                    }
                    this.D.b();
                }
                z18 = z23;
                zO = uc2Var.v().o();
                vy0 vy0Var2 = new vy0();
                dj2Var = crVar3.f3643a;
                while (i15 < dj2Var.f3961a.size()) {
                }
                if (!z18) {
                }
                if (z14 && !z18) {
                }
                if (z15 && !z18) {
                }
                if (!zO && (z15 || !z17 || z14) && !z18) {
                }
                if (z16 && !z18) {
                }
                if (!zO && (z16 || (z17 && z19)) && !z18) {
                }
                if (!z18) {
                }
                if (z14 && !z18) {
                }
                if (z14 && !z18) {
                }
                crVar2 = new cr(vy0Var2.b());
                this.V = crVar2;
                if (!crVar2.equals(crVar)) {
                }
                this.D.b();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i9 = i18;
        z7 = z6;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
        }
        if (!zBooleanValue) {
            lf lfVar22 = this.f4981h0;
            lfVar22.getClass();
            ae aeVar3 = new ae(lfVar22);
            list = ic2Var.f5669j;
            while (i19 < list.size()) {
            }
            this.f4981h0 = new lf(aeVar3);
        }
        zyVarV = v();
        if (zyVarV.o()) {
        }
        boolean zEquals22 = lfVar.equals(this.W);
        this.W = lfVar;
        if (ic2Var2.f5671l == ic2Var.f5671l) {
        }
        if (ic2Var2.f5665e == ic2Var.f5665e) {
        }
        if (z9) {
            N();
            this.f4982i0.getClass();
            x();
            x();
        } else {
            N();
            this.f4982i0.getClass();
            x();
            x();
        }
        if (ic2Var2.f5667g == ic2Var.f5667g) {
        }
        if (!zEquals) {
        }
        if (z7) {
        }
        if (z11) {
        }
        if (ic2Var2.f5666f != ic2Var.f5666f) {
        }
        gk2Var = ic2Var2.f5668i;
        gk2Var2 = ic2Var.f5668i;
        if (gk2Var != gk2Var2) {
        }
        if (!z13) {
        }
        i12 = 23;
        if (z10) {
        }
        if (!z9) {
            this.D.c(-1, new dh0(i12, ic2Var));
        }
        if (z9) {
        }
        if (z12) {
            i13 = 0;
            this.D.c(5, new eq0() { // from class: com.google.android.gms.internal.ads.bb2
                @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
                /* renamed from: zza */
                public final void mo6zza(Object obj7) {
                    int i252 = i13;
                    ic2 ic2Var4 = ic2Var;
                    bs bsVar = (bs) obj7;
                    switch (i252) {
                        case 0:
                            int i262 = gb2.f4973n0;
                            boolean z232 = ic2Var4.f5671l;
                            bsVar.zzf();
                            break;
                        default:
                            int i27 = gb2.f4973n0;
                            ip ipVar = ic2Var4.f5674o;
                            bsVar.zzg();
                            break;
                    }
                }
            });
        }
        if (ic2Var2.f5673n != ic2Var.f5673n) {
        }
        if (ic2Var2.h() != ic2Var.h()) {
        }
        if (ic2Var2.f5674o.equals(ic2Var.f5674o)) {
        }
        crVar = this.V;
        uc2 uc2Var2 = this.f4991y;
        cr crVar32 = this.f4988v;
        int i262 = j31.f5914a;
        boolean z232 = uc2Var2.z();
        zy zyVarV52 = uc2Var2.v();
        if (zyVarV52.o()) {
        }
        zyVarV2 = uc2Var2.v();
        if (zyVarV2.o()) {
        }
        zyVarV3 = uc2Var2.v();
        if (zyVarV3.o()) {
        }
        zy zyVarV62 = uc2Var2.v();
        if (zyVarV62.o()) {
        }
        zyVarV4 = uc2Var2.v();
        if (zyVarV4.o()) {
        }
        zO = uc2Var2.v().o();
        vy0 vy0Var22 = new vy0();
        dj2Var = crVar32.f3643a;
        while (i15 < dj2Var.f3961a.size()) {
        }
        if (!z18) {
        }
        if (z14 && !z18) {
        }
        if (z15 && !z18) {
        }
        if (!zO && (z15 || !z17 || z14) && !z18) {
        }
        if (z16 && !z18) {
        }
        if (!zO && (z16 || (z17 && z19)) && !z18) {
        }
        if (!z18) {
        }
        if (z14 && !z18) {
        }
        if (z14 && !z18) {
        }
        crVar2 = new cr(vy0Var22.b());
        this.V = crVar2;
        if (!crVar2.equals(crVar)) {
        }
        this.D.b();
    }

    public final void N() {
        this.f4989w.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.J;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f4978e0) {
                throw new IllegalStateException(str);
            }
            qs0.g("ExoPlayerImpl", str, this.f4979f0 ? null : new IllegalStateException());
            this.f4979f0 = true;
        }
    }

    public final long O() {
        N();
        if (!z()) {
            zy zyVarV = v();
            if (zyVarV.o()) {
                return -9223372036854775807L;
            }
            return j31.v(zyVarV.e(h(), (cy) this.s, 0L).f3696j);
        }
        ic2 ic2Var = this.f4982i0;
        oh2 oh2Var = ic2Var.f5662b;
        zy zyVar = ic2Var.f5661a;
        Object obj = oh2Var.f7769a;
        jx jxVar = this.F;
        zyVar.n(obj, jxVar);
        return j31.v(jxVar.a(oh2Var.f7770b, oh2Var.f7771c));
    }

    public final void P(boolean z6) {
        N();
        l();
        oa2 oa2Var = this.O;
        oa2Var.a();
        oa2Var.c(0);
        L(1, 1, z6);
    }

    public final void Q() {
        N();
        oa2 oa2Var = this.O;
        x();
        oa2Var.a();
        oa2Var.c(0);
        K(null);
        int i6 = oh0.f7758a;
        cp1 cp1Var = cp1.f3636w;
        long j6 = this.f4982i0.f5677r;
        bo1.l(cp1Var);
    }

    public final void R(yc2 yc2Var) {
        this.I.f3046f.a(yc2Var);
    }

    public final void S() {
        String str;
        boolean z6;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = j31.f5918e;
        HashSet hashSet = id.f5678a;
        synchronized (id.class) {
            str = id.f5679b;
        }
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Release ", hexString, " [AndroidXMedia3/1.5.0-beta01] [", str2, "] [");
        sbA.append(str);
        sbA.append("]");
        qs0.e("ExoPlayerImpl", sbA.toString());
        N();
        oa2 oa2Var = this.O;
        oa2Var.f7666c = null;
        oa2Var.a();
        oa2Var.c(0);
        ob2 ob2Var = this.C;
        synchronized (ob2Var) {
            if (ob2Var.R || !ob2Var.B.getThread().isAlive()) {
                z6 = true;
            } else {
                ob2Var.f7701z.h(7);
                ob2Var.E(new ck1(16, ob2Var), ob2Var.K);
                z6 = ob2Var.R;
            }
        }
        if (!z6) {
            as0 as0Var = this.D;
            as0Var.c(10, new yz1(6));
            as0Var.b();
        }
        this.D.d();
        this.B.zze();
        nk2 nk2Var = this.K;
        bd2 bd2Var = this.I;
        CopyOnWriteArrayList copyOnWriteArrayList = nk2Var.f7461t.f6445a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jk2 jk2Var = (jk2) it.next();
            if (jk2Var.f6103b == bd2Var) {
                jk2Var.f6104c = true;
                copyOnWriteArrayList.remove(jk2Var);
            }
        }
        this.f4982i0.getClass();
        ic2 ic2VarE = this.f4982i0.e(1);
        this.f4982i0 = ic2VarE;
        ic2 ic2VarA = ic2VarE.a(ic2VarE.f5662b);
        this.f4982i0 = ic2VarA;
        ic2VarA.f5675p = ic2VarA.f5677r;
        this.f4982i0.f5676q = 0L;
        bd2 bd2Var2 = this.I;
        xo0 xo0Var = bd2Var2.h;
        y5.k(xo0Var);
        xo0Var.e(new x(22, bd2Var2));
        this.A.b();
        Surface surface = this.Y;
        if (surface != null) {
            surface.release();
            this.Y = null;
        }
        int i6 = oh0.f7758a;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void c(int i6, long j6) {
        N();
        if (i6 == -1) {
            return;
        }
        y5.n(i6 >= 0);
        zy zyVar = this.f4982i0.f5661a;
        if (zyVar.o() || i6 < zyVar.c()) {
            bd2 bd2Var = this.I;
            if (!bd2Var.f3048i) {
                xc2 xc2VarO = bd2Var.o();
                bd2Var.f3048i = true;
                bd2Var.q(xc2VarO, -1, new sj1(21));
            }
            this.Q++;
            if (z()) {
                qs0.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p9 p9Var = new p9(this.f4982i0);
                p9Var.a(1);
                gb2 gb2Var = (gb2) this.f4985l0.f3937t;
                gb2Var.B.e(new ow(6, gb2Var, p9Var));
                return;
            }
            ic2 ic2VarE = this.f4982i0;
            int i7 = ic2VarE.f5665e;
            if (i7 == 3 || (i7 == 4 && !zyVar.o())) {
                ic2VarE = this.f4982i0.e(2);
            }
            int iH = h();
            ic2 ic2VarG = G(ic2VarE, zyVar, F(zyVar, i6, j6));
            long jS = j31.s(j6);
            ob2 ob2Var = this.C;
            ob2Var.getClass();
            ob2Var.f7701z.d(3, new nb2(zyVar, i6, jS)).a();
            M(ic2VarG, 0, true, 1, D(ic2VarG), iH);
        }
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int e() {
        N();
        if (z()) {
            return this.f4982i0.f5662b.f7770b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int g() {
        N();
        if (z()) {
            return this.f4982i0.f5662b.f7771c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int h() {
        N();
        int iB = B(this.f4982i0);
        if (iB == -1) {
            return 0;
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int j() {
        N();
        if (this.f4982i0.f5661a.o()) {
            return 0;
        }
        ic2 ic2Var = this.f4982i0;
        return ic2Var.f5661a.a(ic2Var.f5662b.f7769a);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int l() {
        N();
        return this.f4982i0.f5665e;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int n() {
        N();
        return this.f4982i0.f5673n;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void p() {
        N();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long s() {
        N();
        return C(this.f4982i0);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long t() {
        N();
        return j31.v(D(this.f4982i0));
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long u() {
        N();
        return j31.v(this.f4982i0.f5676q);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final zy v() {
        N();
        return this.f4982i0.f5661a;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final w50 w() {
        N();
        return (w50) this.f4982i0.f5668i.f5086d;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final boolean x() {
        N();
        return this.f4982i0.f5671l;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void y() {
        N();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final boolean z() {
        N();
        return this.f4982i0.f5662b.b();
    }
}

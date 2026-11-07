package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fd2 implements yc2 {
    public String A;
    public PlaybackMetrics.Builder B;
    public no E;
    public ro0 F;
    public ro0 G;
    public ro0 H;
    public w I;
    public w J;
    public w K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final dd2 f4613t;

    /* renamed from: u, reason: collision with root package name */
    public final PlaybackSession f4614u;

    /* renamed from: w, reason: collision with root package name */
    public final cy f4616w = new cy();

    /* renamed from: x, reason: collision with root package name */
    public final jx f4617x = new jx();

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f4619z = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f4618y = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final long f4615v = SystemClock.elapsedRealtime();
    public int C = 0;
    public int D = 0;

    public fd2(Context context, PlaybackSession playbackSession) {
        this.s = context.getApplicationContext();
        this.f4614u = playbackSession;
        dd2 dd2Var = new dd2();
        this.f4613t = dd2Var;
        dd2Var.f3861d = this;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void a(xc2 xc2Var, lh2 lh2Var) {
        oh2 oh2Var = xc2Var.f10500d;
        if (oh2Var == null) {
            return;
        }
        w wVar = lh2Var.f6745b;
        wVar.getClass();
        ro0 ro0Var = new ro0(wVar, this.f4613t.a(xc2Var.f10498b, oh2Var));
        int i6 = lh2Var.f6744a;
        if (i6 != 0) {
            if (i6 == 1) {
                this.G = ro0Var;
                return;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    return;
                }
                this.H = ro0Var;
                return;
            }
        }
        this.F = ro0Var;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void c(xc2 xc2Var, int i6, long j6) {
        oh2 oh2Var = xc2Var.f10500d;
        if (oh2Var != null) {
            String strA = this.f4613t.a(xc2Var.f10498b, oh2Var);
            HashMap map = this.f4619z;
            Long l4 = (Long) map.get(strA);
            HashMap map2 = this.f4618y;
            Long l6 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l4 == null ? 0L : l4.longValue()) + j6));
            map2.put(strA, Long.valueOf((l6 != null ? l6.longValue() : 0L) + i6));
        }
    }

    public final void d(xc2 xc2Var, String str) {
        oh2 oh2Var = xc2Var.f10500d;
        if ((oh2Var == null || !oh2Var.b()) && str.equals(this.A)) {
            f();
        }
        this.f4618y.remove(str);
        this.f4619z.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void e(no noVar) {
        this.E = noVar;
    }

    public final void f() {
        PlaybackMetrics.Builder builder = this.B;
        if (builder != null && this.Q) {
            builder.setAudioUnderrunCount(this.P);
            this.B.setVideoFramesDropped(this.N);
            this.B.setVideoFramesPlayed(this.O);
            Long l4 = (Long) this.f4618y.get(this.A);
            this.B.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l6 = (Long) this.f4619z.get(this.A);
            this.B.setNetworkBytesRead(l6 == null ? 0L : l6.longValue());
            this.B.setStreamSource((l6 == null || l6.longValue() <= 0) ? 0 : 1);
            this.f4614u.reportPlaybackMetrics(this.B.build());
        }
        this.B = null;
        this.A = null;
        this.P = 0;
        this.N = 0;
        this.O = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.Q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0211 A[PHI: r6
      0x0211: PHI (r6v52 int) = (r6v34 int), (r6v83 int) binds: [B:211:0x0313, B:135:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214 A[PHI: r6
      0x0214: PHI (r6v51 int) = (r6v34 int), (r6v83 int) binds: [B:211:0x0313, B:135:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0217 A[PHI: r6
      0x0217: PHI (r6v50 int) = (r6v34 int), (r6v83 int) binds: [B:211:0x0313, B:135:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021a A[PHI: r6
      0x021a: PHI (r6v49 int) = (r6v34 int), (r6v83 int) binds: [B:211:0x0313, B:135:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ba  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.ro0, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // com.google.android.gms.internal.ads.yc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(q72 q72Var, lo loVar) throws NumberFormatException {
        ?? r8;
        int i6;
        int i7;
        fd2 fd2Var;
        boolean z6;
        int i8;
        int errorCode;
        int i9;
        int iP;
        ih2 ih2Var;
        int i10;
        int i11;
        if (((dj2) loVar.f6798t).f3961a.size() == 0) {
            return;
        }
        for (int i12 = 0; i12 < ((dj2) loVar.f6798t).f3961a.size(); i12++) {
            int iA = ((dj2) loVar.f6798t).a(i12);
            xc2 xc2Var = (xc2) ((SparseArray) loVar.f6799u).get(iA);
            xc2Var.getClass();
            if (iA == 0) {
                dd2 dd2Var = this.f4613t;
                synchronized (dd2Var) {
                    try {
                        if (dd2Var.f3861d == null) {
                            throw null;
                        }
                        zy zyVar = dd2Var.f3862e;
                        dd2Var.f3862e = xc2Var.f10498b;
                        Iterator it = dd2Var.f3860c.values().iterator();
                        while (it.hasNext()) {
                            cd2 cd2Var = (cd2) it.next();
                            if (!cd2Var.b(zyVar, dd2Var.f3862e) || cd2Var.a(xc2Var)) {
                                it.remove();
                                if (cd2Var.f3533e) {
                                    if (cd2Var.f3529a.equals(dd2Var.f3863f)) {
                                        dd2Var.d(cd2Var);
                                    }
                                    dd2Var.f3861d.d(xc2Var, cd2Var.f3529a);
                                }
                            }
                        }
                        dd2Var.e(xc2Var);
                    } finally {
                    }
                }
            } else if (iA == 11) {
                dd2 dd2Var2 = this.f4613t;
                synchronized (dd2Var2) {
                    try {
                        if (dd2Var2.f3861d == null) {
                            throw null;
                        }
                        Iterator it2 = dd2Var2.f3860c.values().iterator();
                        while (it2.hasNext()) {
                            cd2 cd2Var2 = (cd2) it2.next();
                            if (cd2Var2.a(xc2Var)) {
                                it2.remove();
                                if (cd2Var2.f3533e) {
                                    if (cd2Var2.f3529a.equals(dd2Var2.f3863f)) {
                                        dd2Var2.d(cd2Var2);
                                    }
                                    dd2Var2.f3861d.d(xc2Var, cd2Var2.f3529a);
                                }
                            }
                        }
                        dd2Var2.e(xc2Var);
                    } finally {
                    }
                }
            } else {
                this.f4613t.b(xc2Var);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (loVar.e(0)) {
            xc2 xc2Var2 = (xc2) ((SparseArray) loVar.f6799u).get(0);
            xc2Var2.getClass();
            if (this.B != null) {
                o(xc2Var2.f10498b, xc2Var2.f10500d);
            }
        }
        int i13 = 2;
        if (loVar.e(2) && this.B != null) {
            bo1 bo1Var = q72Var.w().f10049a;
            int size = bo1Var.size();
            int i14 = 0;
            loop3: while (true) {
                if (i14 >= size) {
                    ih2Var = null;
                    break;
                }
                b50 b50Var = (b50) bo1Var.get(i14);
                int i15 = 0;
                while (true) {
                    i11 = i14 + 1;
                    if (i15 < b50Var.f2920a) {
                        if (b50Var.f2924e[i15] && (ih2Var = b50Var.f2921b.f2534d[i15].f9982q) != null) {
                            break loop3;
                        } else {
                            i15++;
                        }
                    }
                }
                i14 = i11;
            }
            if (ih2Var != null) {
                PlaybackMetrics.Builder builder = this.B;
                int i16 = j31.f5914a;
                PlaybackMetrics.Builder builderC = b4.a.c(builder);
                int i17 = 0;
                while (true) {
                    if (i17 >= ih2Var.f5771v) {
                        i10 = 1;
                        break;
                    }
                    UUID uuid = ih2Var.s[i17].f7754t;
                    if (uuid.equals(f72.f4520d)) {
                        i10 = 3;
                        break;
                    } else if (uuid.equals(f72.f4521e)) {
                        i10 = 2;
                        break;
                    } else {
                        if (uuid.equals(f72.f4519c)) {
                            i10 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                builderC.setDrmType(i10);
            }
        }
        if (loVar.e(1011)) {
            this.P++;
        }
        no noVar = this.E;
        if (noVar != null) {
            Context context = this.s;
            if (noVar.s == 1001) {
                i8 = 20;
            } else {
                wa2 wa2Var = (wa2) noVar;
                boolean z7 = wa2Var.f10142u == 1;
                int i18 = wa2Var.f10146y;
                Throwable cause = noVar.getCause();
                cause.getClass();
                int i19 = 28;
                if (cause instanceof IOException) {
                    if (cause instanceof x02) {
                        iP = ((x02) cause).f10329u;
                        i8 = 5;
                    } else if (cause instanceof rn) {
                        iP = 0;
                        i8 = 11;
                    } else {
                        boolean z8 = cause instanceof uz1;
                        if (z8 || (cause instanceof j62)) {
                            if (hw0.b(context).a() == 1) {
                                iP = 0;
                                i8 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iP = 0;
                                    i8 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iP = 0;
                                    i8 = 7;
                                } else if (z8 && ((uz1) cause).f9673t == 1) {
                                    iP = 0;
                                    i8 = 4;
                                } else {
                                    iP = 0;
                                    i8 = 8;
                                }
                            }
                        } else if (noVar.s == 1002) {
                            i8 = 21;
                        } else if (cause instanceof ze2) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = j31.p(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (j31.o(errorCode)) {
                                    case 6002:
                                        i19 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i19 = 25;
                                        break;
                                    case 6005:
                                        i19 = 26;
                                        break;
                                    default:
                                        i19 = 27;
                                        break;
                                }
                                iP = errorCode;
                                i8 = i19;
                            } else if (j31.f5914a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                iP = 0;
                                i8 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                iP = 0;
                                i8 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i8 = 29;
                            } else {
                                if (!(cause3 instanceof gf2)) {
                                    i8 = 30;
                                }
                                iP = 0;
                                i8 = 23;
                            }
                        } else if ((cause instanceof ox1) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i8 = 32;
                            } else {
                                iP = 0;
                                i8 = 31;
                            }
                        } else {
                            iP = 0;
                            i8 = 9;
                        }
                    }
                    this.f4614u.reportPlaybackErrorEvent(qe.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.f4615v).setErrorCode(i8).setSubErrorCode(iP).setException(noVar).build());
                    this.Q = true;
                    this.E = null;
                } else if (z7) {
                    i8 = 35;
                    if (i18 != 0 && i18 != 1) {
                        if (z7 && i18 == 3) {
                            i8 = 15;
                        } else {
                            if (z7 && i18 == 2) {
                                iP = 0;
                                i8 = 23;
                            } else if (cause instanceof dg2) {
                                iP = j31.p(((dg2) cause).f3934u);
                                i8 = 13;
                            } else {
                                int i20 = 14;
                                if (cause instanceof yf2) {
                                    i9 = ((yf2) cause).s;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i8 = 14;
                                } else if (cause instanceof yd2) {
                                    i9 = ((yd2) cause).s;
                                    i20 = 17;
                                } else if (cause instanceof ae2) {
                                    i9 = ((ae2) cause).s;
                                    i20 = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (j31.o(errorCode)) {
                                    }
                                    iP = errorCode;
                                    i8 = i19;
                                } else {
                                    i8 = 22;
                                }
                                int i21 = i20;
                                iP = i9;
                                i8 = i21;
                            }
                            this.f4614u.reportPlaybackErrorEvent(qe.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.f4615v).setErrorCode(i8).setSubErrorCode(iP).setException(noVar).build());
                            this.Q = true;
                            this.E = null;
                        }
                    }
                }
            }
            iP = 0;
            this.f4614u.reportPlaybackErrorEvent(qe.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.f4615v).setErrorCode(i8).setSubErrorCode(iP).setException(noVar).build());
            this.Q = true;
            this.E = null;
        }
        if (loVar.e(2)) {
            w50 w50VarW = q72Var.w();
            boolean zA = w50VarW.a(2);
            boolean zA2 = w50VarW.a(1);
            boolean zA3 = w50VarW.a(3);
            if (zA || zA2) {
                z6 = zA3;
            } else {
                if (zA3) {
                    z6 = true;
                }
                r8 = 0;
                i6 = 4;
            }
            if (zA || Objects.equals(this.I, null)) {
                i6 = 4;
            } else {
                int i22 = this.I == null ? 1 : 0;
                this.I = null;
                i6 = 4;
                q(1, jElapsedRealtime, null, i22);
            }
            if (!zA2 && !Objects.equals(this.J, null)) {
                int i23 = this.J == null ? 1 : 0;
                this.J = null;
                q(0, jElapsedRealtime, null, i23);
            }
            if (!z6 && !Objects.equals(this.K, null)) {
                int i24 = this.K == null ? 1 : 0;
                this.K = null;
                q(2, jElapsedRealtime, null, i24);
            }
            r8 = 0;
        } else {
            r8 = 0;
            i6 = 4;
        }
        if (r(this.F)) {
            w wVar = (w) this.F.s;
            if (wVar.f9985u != -1) {
                if (!Objects.equals(this.I, wVar)) {
                    int i25 = this.I == null ? 1 : 0;
                    this.I = wVar;
                    q(1, jElapsedRealtime, wVar, i25);
                }
                this.F = r8;
            }
        }
        if (r(this.G)) {
            w wVar2 = (w) this.G.s;
            if (!Objects.equals(this.J, wVar2)) {
                int i26 = this.J == null ? 1 : 0;
                this.J = wVar2;
                q(0, jElapsedRealtime, wVar2, i26);
            }
            this.G = r8;
        }
        if (r(this.H)) {
            w wVar3 = (w) this.H.s;
            if (!Objects.equals(this.K, wVar3)) {
                int i27 = this.K == null ? 1 : 0;
                this.K = wVar3;
                q(2, jElapsedRealtime, wVar3, i27);
            }
            this.H = r8;
        }
        switch (hw0.b(this.s).a()) {
            case 0:
                i7 = 0;
                break;
            case 1:
                i7 = 9;
                break;
            case 2:
                i7 = 2;
                break;
            case 3:
                i7 = i6;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 6;
                break;
            case 6:
            case 8:
            default:
                i7 = 1;
                break;
            case 7:
                i7 = 3;
                break;
            case 9:
                i7 = 8;
                break;
            case 10:
                i7 = 7;
                break;
        }
        if (i7 != this.D) {
            this.D = i7;
            this.f4614u.reportNetworkEvent(b4.a.a().setNetworkType(i7).setTimeSinceCreatedMillis(jElapsedRealtime - this.f4615v).build());
        }
        if (q72Var.l() != 2) {
            this.L = false;
        }
        uc2 uc2Var = (uc2) q72Var;
        uc2Var.f9530v.a();
        gb2 gb2Var = uc2Var.f9529u;
        gb2Var.N();
        if (gb2Var.f4982i0.f5666f == null) {
            this.M = false;
        } else if (loVar.e(10)) {
            this.M = true;
        }
        int iL = q72Var.l();
        if (this.L) {
            i13 = 5;
        } else if (this.M) {
            i13 = 13;
        } else if (iL == i6) {
            i13 = 11;
        } else if (iL == 2) {
            int i28 = this.C;
            if (i28 != 0 && i28 != 2 && i28 != 12) {
                i13 = !q72Var.x() ? 7 : q72Var.n() != 0 ? 10 : 6;
            }
        } else {
            i13 = iL == 3 ? !q72Var.x() ? i6 : q72Var.n() != 0 ? 9 : 3 : (iL != 1 || this.C == 0) ? this.C : 12;
        }
        if (this.C != i13) {
            this.C = i13;
            this.Q = true;
            this.f4614u.reportPlaybackStateEvent(androidx.camera.camera2.internal.compat.quirk.b.c().setState(this.C).setTimeSinceCreatedMillis(jElapsedRealtime - this.f4615v).build());
        }
        if (loVar.e(1028)) {
            dd2 dd2Var3 = this.f4613t;
            xc2 xc2Var3 = (xc2) ((SparseArray) loVar.f6799u).get(1028);
            xc2Var3.getClass();
            synchronized (dd2Var3) {
                try {
                    String str = dd2Var3.f3863f;
                    if (str != null) {
                        cd2 cd2Var3 = (cd2) dd2Var3.f3860c.get(str);
                        if (cd2Var3 == null) {
                            throw r8;
                        }
                        dd2Var3.d(cd2Var3);
                    }
                    Iterator it3 = dd2Var3.f3860c.values().iterator();
                    while (it3.hasNext()) {
                        cd2 cd2Var4 = (cd2) it3.next();
                        it3.remove();
                        if (cd2Var4.f3533e && (fd2Var = dd2Var3.f3861d) != null) {
                            fd2Var.d(xc2Var3, cd2Var4.f3529a);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void j(qa2 qa2Var) {
        this.N += qa2Var.f8293g;
        this.O += qa2Var.f8291e;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void l(n90 n90Var) {
        ro0 ro0Var = this.F;
        if (ro0Var != null) {
            w wVar = (w) ro0Var.s;
            if (wVar.f9985u == -1) {
                tk2 tk2Var = new tk2(wVar);
                tk2Var.s = n90Var.f7347a;
                tk2Var.f9337t = n90Var.f7348b;
                this.F = new ro0(new w(tk2Var), (String) ro0Var.f8673t);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(zy zyVar, oh2 oh2Var) {
        int iA;
        int i6;
        PlaybackMetrics.Builder builder = this.B;
        if (oh2Var == null || (iA = zyVar.a(oh2Var.f7769a)) == -1) {
            return;
        }
        jx jxVar = this.f4617x;
        int i7 = 0;
        zyVar.d(iA, jxVar, false);
        int i8 = jxVar.f6182c;
        cy cyVar = this.f4616w;
        zyVar.e(i8, cyVar, 0L);
        q8 q8Var = cyVar.f3689b.f9223b;
        if (q8Var != null) {
            Uri uri = q8Var.f8246a;
            int i9 = j31.f5914a;
            String scheme = uri.getScheme();
            if (scheme == null || !rj1.p("rtsp", scheme)) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        String strG = rj1.g(lastPathSegment.substring(iLastIndexOf + 1));
                        switch (strG.hashCode()) {
                            case 104579:
                                if (!strG.equals("ism")) {
                                    i6 = 4;
                                    break;
                                } else {
                                    i6 = 1;
                                    break;
                                }
                            case 108321:
                                if (strG.equals("mpd")) {
                                    i6 = 0;
                                    break;
                                }
                                break;
                            case 3242057:
                                if (strG.equals("isml")) {
                                }
                                break;
                            case 3299913:
                                if (strG.equals("m3u8")) {
                                    i6 = 2;
                                    break;
                                }
                                break;
                        }
                        if (i6 == 4) {
                            Pattern pattern = j31.f5920g;
                            String path = uri.getPath();
                            path.getClass();
                            Matcher matcher = pattern.matcher(path);
                            if (matcher.matches()) {
                                String strGroup = matcher.group(2);
                                if (strGroup == null) {
                                    i7 = 1;
                                } else if (!strGroup.contains("format=mpd-time-csf")) {
                                    if (strGroup.contains("format=m3u8-aapl")) {
                                        i7 = 2;
                                    }
                                }
                            } else {
                                i7 = 4;
                            }
                        } else {
                            i7 = i6;
                        }
                    }
                }
            } else {
                i7 = 3;
            }
            i7 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        long j6 = cyVar.f3696j;
        if (j6 != -9223372036854775807L && !cyVar.f3695i && !cyVar.f3694g && !cyVar.b()) {
            builder.setMediaDurationMillis(j31.v(j6));
        }
        builder.setPlaybackType(true != cyVar.b() ? 1 : 2);
        this.Q = true;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void p(int i6) {
        if (i6 == 1) {
            this.L = true;
        }
    }

    public final void q(int i6, long j6, w wVar, int i7) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = pe.h(i6).setTimeSinceCreatedMillis(j6 - this.f4615v);
        if (wVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i7 != 1 ? 1 : 2);
            String str = wVar.f9977l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = wVar.f9978m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = wVar.f9975j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = wVar.f9974i;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i9 = wVar.f9984t;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = wVar.f9985u;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = wVar.B;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = wVar.C;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = wVar.f9970d;
            if (str4 != null) {
                int i13 = j31.f5914a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f6 = wVar.f9986v;
            if (f6 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f6);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.Q = true;
        this.f4614u.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final boolean r(ro0 ro0Var) {
        String str;
        if (ro0Var == null) {
            return false;
        }
        dd2 dd2Var = this.f4613t;
        String str2 = (String) ro0Var.f8673t;
        synchronized (dd2Var) {
            str = dd2Var.f3863f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void m() {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void b(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void h(IOException iOException) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void i(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void k(w wVar) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void n(w wVar) {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class te2 {
    public static final Object Z = new Object();

    /* renamed from: a0, reason: collision with root package name */
    public static ScheduledExecutorService f9238a0;

    /* renamed from: b0, reason: collision with root package name */
    public static int f9239b0;
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public float G;
    public ByteBuffer H;
    public int I;
    public ByteBuffer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public gb1 P;
    public ck1 Q;
    public long R;
    public boolean S;
    public Looper T;
    public long U;
    public long V;
    public Handler W;
    public final com.google.android.gms.ads.mediation.customevent.b X;
    public final r0 Y;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final ee2 f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final ye2 f9242c;

    /* renamed from: d, reason: collision with root package name */
    public final cp1 f9243d;

    /* renamed from: e, reason: collision with root package name */
    public final cp1 f9244e;

    /* renamed from: f, reason: collision with root package name */
    public final de2 f9245f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f9246g;
    public re2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ne2 f9247i;

    /* renamed from: j, reason: collision with root package name */
    public final ne2 f9248j;

    /* renamed from: k, reason: collision with root package name */
    public hd2 f9249k;

    /* renamed from: l, reason: collision with root package name */
    public xj1 f9250l;

    /* renamed from: m, reason: collision with root package name */
    public je2 f9251m;

    /* renamed from: n, reason: collision with root package name */
    public je2 f9252n;

    /* renamed from: o, reason: collision with root package name */
    public ia0 f9253o;

    /* renamed from: p, reason: collision with root package name */
    public AudioTrack f9254p;

    /* renamed from: q, reason: collision with root package name */
    public ld2 f9255q;

    /* renamed from: r, reason: collision with root package name */
    public pd2 f9256r;
    public me2 s;

    /* renamed from: t, reason: collision with root package name */
    public gy0 f9257t;

    /* renamed from: u, reason: collision with root package name */
    public ke2 f9258u;

    /* renamed from: v, reason: collision with root package name */
    public ke2 f9259v;

    /* renamed from: w, reason: collision with root package name */
    public ip f9260w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9261x;

    /* renamed from: y, reason: collision with root package name */
    public long f9262y;

    /* renamed from: z, reason: collision with root package name */
    public long f9263z;

    public te2(ie2 ie2Var) {
        ld2 ld2VarB;
        Context context = ie2Var.f5732a;
        this.f9240a = context;
        gy0 gy0Var = gy0.f5187b;
        this.f9257t = gy0Var;
        if (context != null) {
            ld2 ld2Var = ld2.f6671c;
            int i6 = j31.f5914a;
            ld2VarB = ld2.b(context, gy0Var, null);
        } else {
            ld2VarB = ie2Var.f5733b;
        }
        this.f9255q = ld2VarB;
        this.X = ie2Var.f5735d;
        int i7 = j31.f5914a;
        r0 r0Var = ie2Var.f5736e;
        r0Var.getClass();
        this.Y = r0Var;
        this.f9245f = new de2(new oe2(this));
        ee2 ee2Var = new ee2();
        this.f9241b = ee2Var;
        ye2 ye2Var = new ye2();
        ye2Var.f10944m = j31.f5919f;
        this.f9242c = ye2Var;
        qe0 qe0Var = new qe0();
        zn1 zn1Var = bo1.f3236t;
        Object[] objArr = {qe0Var, ee2Var, ye2Var};
        ap1.a(objArr, 3);
        this.f9243d = bo1.k(objArr, 3);
        this.f9244e = bo1.n(new xe2());
        this.G = 1.0f;
        this.O = 0;
        this.P = new gb1();
        ip ipVar = ip.f5817d;
        this.f9259v = new ke2(ipVar, 0L, 0L);
        this.f9260w = ipVar;
        this.f9261x = false;
        this.f9246g = new ArrayDeque();
        this.f9247i = new ne2();
        this.f9248j = new ne2();
    }

    public static boolean m(AudioTrack audioTrack) {
        return j31.f5914a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static final AudioTrack n(wd2 wd2Var, gy0 gy0Var, int i6, w wVar) throws UnsupportedOperationException, yd2, IllegalArgumentException {
        AudioTrack audioTrack;
        int i7 = wd2Var.f10172a;
        int i8 = wd2Var.f10174c;
        int i9 = wd2Var.f10173b;
        try {
            int i10 = j31.f5914a;
            if (i10 >= 23) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(gy0Var.a().f6595a).setAudioFormat(j31.w(i9, i8, i7)).setTransferMode(1).setBufferSizeInBytes(wd2Var.f10176e).setSessionId(i6);
                if (i10 >= 29) {
                    sessionId.setOffloadedPlayback(wd2Var.f10175d);
                }
                audioTrack = sessionId.build();
            } else {
                audioTrack = new AudioTrack(gy0Var.a().f6595a, j31.w(i9, i8, i7), wd2Var.f10176e, 1, i6);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new yd2(state, wd2Var.f10173b, wd2Var.f10174c, wd2Var.f10172a, wVar, wd2Var.f10175d, null);
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw new yd2(0, wd2Var.f10173b, wd2Var.f10174c, wd2Var.f10172a, wVar, wd2Var.f10175d, e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new yd2(0, wd2Var.f10173b, wd2Var.f10174c, wd2Var.f10172a, wVar, wd2Var.f10175d, e);
        }
    }

    public final long a() {
        return this.f9252n.f6044c == 0 ? this.f9262y / r0.f6043b : this.f9263z;
    }

    public final long b() {
        je2 je2Var = this.f9252n;
        if (je2Var.f6044c != 0) {
            return this.B;
        }
        long j6 = this.A;
        long j7 = je2Var.f6045d;
        int i6 = j31.f5914a;
        return ((j6 + j7) - 1) / j7;
    }

    public final AudioTrack c(je2 je2Var) throws yd2 {
        try {
            return n(je2Var.a(), this.f9257t, this.O, je2Var.f6042a);
        } catch (yd2 e6) {
            xj1 xj1Var = this.f9250l;
            if (xj1Var != null) {
                xj1Var.e(e6);
            }
            throw e6;
        }
    }

    public final void d(long j6) {
        ip ipVar;
        boolean z6;
        je2 je2Var = this.f9252n;
        int i6 = je2Var.f6044c;
        com.google.android.gms.ads.mediation.customevent.b bVar = this.X;
        if (i6 == 0) {
            int i7 = je2Var.f6042a.D;
            ipVar = this.f9260w;
            he0 he0Var = (he0) bVar.f2375u;
            float f6 = ipVar.f5818a;
            if (he0Var.f5353c != f6) {
                he0Var.f5353c = f6;
                he0Var.f5358i = true;
            }
            float f7 = ipVar.f5819b;
            if (he0Var.f5354d != f7) {
                he0Var.f5354d = f7;
                he0Var.f5358i = true;
            }
        } else {
            ipVar = ip.f5817d;
        }
        ip ipVar2 = ipVar;
        this.f9260w = ipVar2;
        if (i6 == 0) {
            int i8 = je2Var.f6042a.D;
            z6 = this.f9261x;
            ((we2) bVar.f2374t).f10181j = z6;
        } else {
            z6 = false;
        }
        this.f9261x = z6;
        long jMax = Math.max(0L, j6);
        je2 je2Var2 = this.f9252n;
        this.f9246g.add(new ke2(ipVar2, jMax, j31.t(je2Var2.f6046e, b())));
        ia0 ia0Var = this.f9252n.f6049i;
        this.f9253o = ia0Var;
        ia0Var.a();
        xj1 xj1Var = this.f9250l;
        if (xj1Var != null) {
            boolean z7 = this.f9261x;
            vd2 vd2Var = ((ve2) xj1Var.f10619t).R0;
            Handler handler = vd2Var.f9835a;
            if (handler != null) {
                handler.post(new d80(vd2Var, z7, 1));
            }
        }
    }

    public final void e() throws ae2 {
        boolean z6;
        ne2 ne2Var = this.f9248j;
        if (this.J == null) {
            return;
        }
        if (ne2Var.f7432a != null) {
            synchronized (Z) {
                z6 = f9239b0 > 0;
            }
            if (z6 || SystemClock.elapsedRealtime() < ne2Var.f7434c) {
                return;
            }
        }
        int iRemaining = this.J.remaining();
        int iWrite = this.f9254p.write(this.J, iRemaining, 1);
        this.R = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            ne2Var.f7432a = null;
            ne2Var.f7433b = -9223372036854775807L;
            ne2Var.f7434c = -9223372036854775807L;
            m(this.f9254p);
            int i6 = this.f9252n.f6044c;
            if (i6 == 0) {
                this.A += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i6 != 0) {
                    y5.r(this.J == this.H);
                    this.B = (this.C * this.I) + this.B;
                }
                this.J = null;
                return;
            }
            return;
        }
        if ((j31.f5914a >= 24 && iWrite == -6) || iWrite == -32) {
            if (b() > 0) {
                z = true;
            } else if (m(this.f9254p)) {
                if (this.f9252n.f6044c == 1) {
                    this.S = true;
                }
                z = true;
            }
        }
        ae2 ae2Var = new ae2(iWrite, this.f9252n.f6042a, z);
        xj1 xj1Var = this.f9250l;
        if (xj1Var != null) {
            xj1Var.e(ae2Var);
        }
        if (ae2Var.f2734t) {
            this.f9255q = ld2.f6671c;
            throw ae2Var;
        }
        ne2Var.a(ae2Var);
    }

    public final void f() {
        Context context;
        ld2 ld2VarC;
        md2 md2Var;
        if (this.f9256r != null || (context = this.f9240a) == null) {
            return;
        }
        this.T = Looper.myLooper();
        pd2 pd2Var = new pd2(context, new xj1(26, this), this.f9257t, this.Q);
        this.f9256r = pd2Var;
        if (pd2Var.f8048i) {
            ld2VarC = pd2Var.f8046f;
            ld2VarC.getClass();
        } else {
            pd2Var.f8048i = true;
            nd2 nd2Var = pd2Var.f8045e;
            if (nd2Var != null) {
                nd2Var.f7422a.registerContentObserver(nd2Var.f7423b, false, nd2Var);
            }
            int i6 = j31.f5914a;
            Handler handler = pd2Var.f8042b;
            Context context2 = pd2Var.f8041a;
            if (i6 >= 23 && (md2Var = pd2Var.f8043c) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(md2Var, handler);
            }
            ld2VarC = ld2.c(context2, context2.registerReceiver(pd2Var.f8044d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), pd2Var.h, pd2Var.f8047g);
            pd2Var.f8046f = ld2VarC;
        }
        this.f9255q = ld2VarC;
    }

    public final void g() throws IllegalStateException {
        if (this.L) {
            return;
        }
        this.L = true;
        long jB = b();
        de2 de2Var = this.f9245f;
        de2Var.f3889z = de2Var.d();
        de2Var.f3887x = j31.s(de2Var.G.zzb());
        de2Var.A = jB;
        if (m(this.f9254p)) {
            this.M = false;
        }
        this.f9254p.stop();
    }

    public final void h() throws ae2 {
        ByteBuffer byteBuffer;
        e();
        if (this.J != null) {
            return;
        }
        if (!this.f9253o.c()) {
            ByteBuffer byteBuffer2 = this.H;
            if (byteBuffer2 != null) {
                i(byteBuffer2);
                e();
                return;
            }
            return;
        }
        while (!this.f9253o.b()) {
            do {
                ia0 ia0Var = this.f9253o;
                if (ia0Var.c()) {
                    ByteBuffer byteBuffer3 = ia0Var.f5635c[ia0Var.d()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        ia0Var.e(jc0.f6021a);
                        byteBuffer = ia0Var.f5635c[ia0Var.d()];
                    }
                } else {
                    byteBuffer = jc0.f6021a;
                }
                if (byteBuffer.hasRemaining()) {
                    i(byteBuffer);
                    e();
                } else {
                    ByteBuffer byteBuffer4 = this.H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    ia0 ia0Var2 = this.f9253o;
                    ByteBuffer byteBuffer5 = this.H;
                    if (ia0Var2.c() && !ia0Var2.f5636d) {
                        ia0Var2.e(byteBuffer5);
                    }
                }
            } while (this.J == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        y5.r(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f9252n.f6044c == 0) {
                int iU = (int) j31.u(j31.s(20L), this.f9252n.f6046e, 1000000L, RoundingMode.UP);
                long jB = b();
                long j6 = iU;
                if (jB < j6) {
                    je2 je2Var = this.f9252n;
                    int i16 = je2Var.f6048g;
                    int i17 = je2Var.f6045d;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i18 = (int) jB;
                    while (byteBuffer.hasRemaining() && i18 < iU) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                i8 = (byteBuffer.get() & 255) << 24;
                            } else if (i16 != 4) {
                                if (i16 != 21) {
                                    if (i16 == 22) {
                                        i12 = byteBuffer.get() & 255;
                                        i13 = (byteBuffer.get() & 255) << 8;
                                        i14 = (byteBuffer.get() & 255) << 16;
                                        i15 = (byteBuffer.get() & 255) << 24;
                                    } else if (i16 == 268435456) {
                                        i6 = (byteBuffer.get() & 255) << 24;
                                        i7 = (byteBuffer.get() & 255) << 16;
                                    } else if (i16 == 1342177280) {
                                        i9 = (byteBuffer.get() & 255) << 24;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i16 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i12 = (byteBuffer.get() & 255) << 24;
                                        i13 = (byteBuffer.get() & 255) << 16;
                                        i14 = (byteBuffer.get() & 255) << 8;
                                        i15 = byteBuffer.get() & 255;
                                    }
                                    i8 = i12 | i13 | i14 | i15;
                                } else {
                                    i9 = (byteBuffer.get() & 255) << 8;
                                    i10 = (byteBuffer.get() & 255) << 16;
                                    i11 = (byteBuffer.get() & 255) << 24;
                                }
                                i8 = i9 | i10 | i11;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i8 = (int) (fMax < 0.0f ? (-fMax) * (-2.1474836E9f) : fMax * 2.1474836E9f);
                            }
                            int i19 = (int) ((i8 * i18) / j6);
                            if (i16 != 2) {
                                byteBufferOrder.put((byte) (i19 >> 16));
                                byteBufferOrder.put((byte) (i19 >> 24));
                            } else if (i16 == 3) {
                                byteBufferOrder.put((byte) (i19 >> 24));
                            } else if (i16 != 4) {
                                if (i16 == 21) {
                                    byteBufferOrder.put((byte) (i19 >> 8));
                                    byteBufferOrder.put((byte) (i19 >> 16));
                                    byteBufferOrder.put((byte) (i19 >> 24));
                                } else if (i16 == 22) {
                                    byteBufferOrder.put((byte) i19);
                                    byteBufferOrder.put((byte) (i19 >> 8));
                                    byteBufferOrder.put((byte) (i19 >> 16));
                                    byteBufferOrder.put((byte) (i19 >> 24));
                                } else if (i16 == 268435456) {
                                    byteBufferOrder.put((byte) (i19 >> 24));
                                    byteBufferOrder.put((byte) (i19 >> 16));
                                } else if (i16 == 1342177280) {
                                    byteBufferOrder.put((byte) (i19 >> 24));
                                    byteBufferOrder.put((byte) (i19 >> 16));
                                    byteBufferOrder.put((byte) (i19 >> 8));
                                } else {
                                    if (i16 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i19 >> 24));
                                    byteBufferOrder.put((byte) (i19 >> 16));
                                    byteBufferOrder.put((byte) (i19 >> 8));
                                    byteBufferOrder.put((byte) i19);
                                }
                            } else if (i19 < 0) {
                                byteBufferOrder.putFloat((-i19) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i19 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != iPosition + i17) {
                                i18++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i6 = (byteBuffer.get() & 255) << 16;
                            i7 = (byteBuffer.get() & 255) << 24;
                        }
                        i8 = i6 | i7;
                        int i192 = (int) ((i8 * i18) / j6);
                        if (i16 != 2) {
                        }
                        if (byteBuffer.position() != iPosition + i17) {
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            }
            this.J = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() throws ae2 {
        ByteBuffer byteBuffer;
        if (!this.f9253o.c()) {
            e();
            return this.J == null;
        }
        ia0 ia0Var = this.f9253o;
        if (ia0Var.c() && !ia0Var.f5636d) {
            ia0Var.f5636d = true;
            ((jc0) ia0Var.f5634b.get(0)).zzd();
        }
        h();
        if (!this.f9253o.b() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final boolean k() {
        return this.f9254p != null;
    }

    public final int l(w wVar) {
        f();
        String str = wVar.f9978m;
        int i6 = wVar.D;
        if (!"audio/raw".equals(str)) {
            return this.f9255q.a(wVar, this.f9257t) != null ? 2 : 0;
        }
        if (j31.c(i6)) {
            return i6 != 2 ? 1 : 2;
        }
        androidx.activity.m.g(i6, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final void o(w wVar, int[] iArr) throws xd2, pb0 {
        int iIntValue;
        ia0 ia0Var;
        int i6;
        int i7;
        int i8;
        int i9;
        int iN;
        int i10;
        int i11;
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        f();
        String str = wVar.f9978m;
        int i16 = wVar.C;
        int i17 = wVar.B;
        int i18 = wVar.D;
        if ("audio/raw".equals(str)) {
            y5.n(j31.c(i18));
            int iN2 = j31.n(i18) * i17;
            yn1 yn1Var = new yn1();
            yn1Var.r(this.f9243d);
            jc0[] jc0VarArr = (jc0[]) this.X.s;
            ap1.a(jc0VarArr, 2);
            yn1Var.s(2);
            System.arraycopy(jc0VarArr, 0, yn1Var.f9901t, yn1Var.f9902u, 2);
            yn1Var.f9902u += 2;
            ia0 ia0Var2 = new ia0(yn1Var.t());
            if (ia0Var2.equals(this.f9253o)) {
                ia0Var2 = this.f9253o;
            }
            int i19 = wVar.E;
            int i20 = wVar.F;
            ye2 ye2Var = this.f9242c;
            ye2Var.f10940i = i19;
            ye2Var.f10941j = i20;
            this.f9241b.f4261i = iArr;
            za0 za0Var = new za0(i16, i17, i18);
            try {
                bo1 bo1Var = ia0Var2.f5633a;
                if (za0Var.equals(za0.f11240e)) {
                    throw new pb0(za0Var);
                }
                for (int i21 = 0; i21 < bo1Var.size(); i21++) {
                    jc0 jc0Var = (jc0) bo1Var.get(i21);
                    za0 za0VarB = jc0Var.b(za0Var);
                    if (jc0Var.zzg()) {
                        y5.r(!za0VarB.equals(za0.f11240e));
                        za0Var = za0VarB;
                    }
                }
                i7 = za0Var.f11243c;
                int i22 = za0Var.f11241a;
                int i23 = za0Var.f11242b;
                iIntValue = j31.m(i23);
                i9 = iN2;
                i6 = i22;
                ia0Var = ia0Var2;
                iN = j31.n(i7) * i23;
                i8 = 0;
            } catch (pb0 e6) {
                throw new xd2(e6, wVar);
            }
        } else {
            ia0 ia0Var3 = new ia0(cp1.f3636w);
            rd2 rd2Var = rd2.f8613d;
            Pair pairA = this.f9255q.a(wVar, this.f9257t);
            if (pairA == null) {
                throw new xd2("Unable to configure passthrough for: ".concat(String.valueOf(wVar)), wVar);
            }
            int iIntValue2 = ((Integer) pairA.first).intValue();
            iIntValue = ((Integer) pairA.second).intValue();
            ia0Var = ia0Var3;
            i6 = i16;
            i7 = iIntValue2;
            i8 = 2;
            i9 = -1;
            iN = -1;
        }
        if (i7 == 0) {
            throw new xd2("Invalid output encoding (mode=" + i8 + ") for: " + String.valueOf(wVar), wVar);
        }
        if (iIntValue == 0) {
            throw new xd2("Invalid output channel config (mode=" + i8 + ") for: " + String.valueOf(wVar), wVar);
        }
        int i24 = wVar.f9974i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(wVar.f9978m) && i24 == -1) {
            i24 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i6, iIntValue, i7);
        y5.r(minBufferSize != -2);
        int i25 = iN != -1 ? iN : 1;
        int i26 = 250000;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i7 == 5) {
                    i26 = 500000;
                } else if (i7 == 8) {
                    i26 = 1000000;
                    i7 = 8;
                }
                if (i24 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    i15 = iq1.b(i24, 8);
                } else {
                    i15 = ih1.i(i7);
                }
                i10 = iIntValue;
                i14 = -1;
                iMax = ed0.l((i26 * i15) / 1000000);
            } else {
                i14 = -1;
                i10 = iIntValue;
                iMax = ed0.l((ih1.i(i7) * 50000000) / 1000000);
            }
            i13 = i7;
            i11 = i14;
            i12 = minBufferSize;
        } else {
            i10 = iIntValue;
            i11 = -1;
            i12 = minBufferSize;
            long j6 = i6;
            int i27 = i7;
            long j7 = i25;
            iMax = Math.max(ed0.l(((250000 * j6) * j7) / 1000000), Math.min(minBufferSize * 4, ed0.l(((750000 * j6) * j7) / 1000000)));
            i13 = i27;
        }
        int iMax2 = (((Math.max(i12, iMax) + i25) + i11) / i25) * i25;
        this.S = false;
        je2 je2Var = new je2(wVar, i9, i8, iN, i6, i10, i13, iMax2, ia0Var);
        if (k()) {
            this.f9251m = je2Var;
        } else {
            this.f9252n = je2Var;
        }
    }

    public final void p() throws IllegalStateException {
        me2 me2Var;
        if (k()) {
            this.f9262y = 0L;
            this.f9263z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0;
            this.f9259v = new ke2(this.f9260w, 0L, 0L);
            this.F = 0L;
            this.f9258u = null;
            this.f9246g.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.L = false;
            this.K = false;
            this.M = false;
            this.f9242c.f10946o = 0L;
            ia0 ia0Var = this.f9252n.f6049i;
            this.f9253o = ia0Var;
            ia0Var.a();
            AudioTrack audioTrack = this.f9245f.f3868c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f9254p.pause();
            }
            if (m(this.f9254p)) {
                re2 re2Var = this.h;
                re2Var.getClass();
                this.f9254p.unregisterStreamEventCallback(re2Var.f8619b);
                re2Var.f8618a.removeCallbacksAndMessages(null);
            }
            wd2 wd2VarA = this.f9252n.a();
            je2 je2Var = this.f9251m;
            if (je2Var != null) {
                this.f9252n = je2Var;
                this.f9251m = null;
            }
            de2 de2Var = this.f9245f;
            de2Var.f3875k = 0L;
            de2Var.f3886w = 0;
            de2Var.f3885v = 0;
            de2Var.f3876l = 0L;
            de2Var.C = 0L;
            de2Var.F = 0L;
            de2Var.f3874j = false;
            de2Var.f3868c = null;
            de2Var.f3870e = null;
            if (j31.f5914a >= 24 && (me2Var = this.s) != null) {
                le2 le2Var = me2Var.f7107c;
                le2Var.getClass();
                me2Var.f7105a.removeOnRoutingChangedListener(le2Var);
                me2Var.f7107c = null;
                this.s = null;
            }
            AudioTrack audioTrack2 = this.f9254p;
            xj1 xj1Var = this.f9250l;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (Z) {
                try {
                    if (f9238a0 == null) {
                        f9238a0 = Executors.newSingleThreadScheduledExecutor(new z11(1));
                    }
                    f9239b0++;
                    f9238a0.schedule(new cc2(audioTrack2, xj1Var, handler, wd2VarA, 1), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f9254p = null;
        }
        ne2 ne2Var = this.f9248j;
        ne2Var.f7432a = null;
        ne2Var.f7433b = -9223372036854775807L;
        ne2Var.f7434c = -9223372036854775807L;
        ne2 ne2Var2 = this.f9247i;
        ne2Var2.f7432a = null;
        ne2Var2.f7433b = -9223372036854775807L;
        ne2Var2.f7434c = -9223372036854775807L;
        this.U = 0L;
        this.V = 0L;
        Handler handler2 = this.W;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void q() throws IllegalStateException {
        this.N = true;
        if (k()) {
            de2 de2Var = this.f9245f;
            if (de2Var.f3887x != -9223372036854775807L) {
                de2Var.f3887x = j31.s(de2Var.G.zzb());
            }
            ce2 ce2Var = de2Var.f3870e;
            ce2Var.getClass();
            ce2Var.a(0);
            this.f9254p.play();
        }
    }

    public final void r() throws IllegalStateException {
        p();
        cp1 cp1Var = this.f9243d;
        int i6 = cp1Var.f3638v;
        for (int i7 = 0; i7 < i6; i7++) {
            ((jc0) cp1Var.get(i7)).zzf();
        }
        cp1 cp1Var2 = this.f9244e;
        int i8 = cp1Var2.f3638v;
        for (int i9 = 0; i9 < i8; i9++) {
            ((jc0) cp1Var2.get(i9)).zzf();
        }
        ia0 ia0Var = this.f9253o;
        if (ia0Var != null) {
            bo1 bo1Var = ia0Var.f5633a;
            for (int i10 = 0; i10 < bo1Var.size(); i10++) {
                jc0 jc0Var = (jc0) bo1Var.get(i10);
                jc0Var.zzc();
                jc0Var.zzf();
            }
            ia0Var.f5635c = new ByteBuffer[0];
            za0 za0Var = za0.f11240e;
            ia0Var.f5636d = false;
        }
        this.N = false;
        this.S = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ae A[PHI: r17
      0x02ae: PHI (r17v8 long) = (r17v7 long), (r17v7 long), (r17v11 long), (r17v14 long) binds: [B:216:0x03b1, B:218:0x03ba, B:177:0x0317, B:152:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0596 A[Catch: yd2 -> 0x00fb, TryCatch #1 {yd2 -> 0x00fb, blocks: (B:35:0x0075, B:66:0x00e5, B:68:0x00ed, B:70:0x00f3, B:73:0x00fe, B:74:0x0115, B:76:0x011b, B:78:0x011f, B:80:0x0131, B:81:0x0134, B:85:0x014a, B:87:0x0159, B:88:0x0160, B:92:0x016d, B:94:0x017a, B:97:0x0187, B:99:0x018b, B:100:0x0194, B:102:0x019b, B:104:0x01ab, B:60:0x00ab, B:62:0x00b4, B:299:0x058c, B:300:0x058f, B:302:0x0596, B:303:0x0598, B:38:0x007c, B:39:0x007e, B:47:0x008c, B:306:0x059b, B:64:0x00de, B:40:0x007f, B:44:0x0086, B:54:0x009e, B:56:0x00a2, B:59:0x00aa), top: B:314:0x0075, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[Catch: yd2 -> 0x00fb, SYNTHETIC, TRY_LEAVE, TryCatch #1 {yd2 -> 0x00fb, blocks: (B:35:0x0075, B:66:0x00e5, B:68:0x00ed, B:70:0x00f3, B:73:0x00fe, B:74:0x0115, B:76:0x011b, B:78:0x011f, B:80:0x0131, B:81:0x0134, B:85:0x014a, B:87:0x0159, B:88:0x0160, B:92:0x016d, B:94:0x017a, B:97:0x0187, B:99:0x018b, B:100:0x0194, B:102:0x019b, B:104:0x01ab, B:60:0x00ab, B:62:0x00b4, B:299:0x058c, B:300:0x058f, B:302:0x0596, B:303:0x0598, B:38:0x007c, B:39:0x007e, B:47:0x008c, B:306:0x059b, B:64:0x00de, B:40:0x007f, B:44:0x0086, B:54:0x009e, B:56:0x00a2, B:59:0x00aa), top: B:314:0x0075, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(ByteBuffer byteBuffer, long j6, int i6) throws Exception {
        boolean z6;
        Exception exc;
        boolean z7;
        AudioTrack audioTrackC;
        Exception exc2;
        pd2 pd2Var;
        hd2 hd2Var;
        je2 je2Var;
        long j7;
        long j8;
        int i7;
        int iR;
        int i8;
        int i9;
        byte b7;
        int i10;
        int i11;
        int i12;
        int i13;
        de2 de2Var = this.f9245f;
        ne2 ne2Var = this.f9247i;
        ByteBuffer byteBuffer2 = this.H;
        y5.n(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f9251m != null) {
            if (!j()) {
                return false;
            }
            je2 je2Var2 = this.f9251m;
            je2 je2Var3 = this.f9252n;
            if (je2Var3.f6044c == je2Var2.f6044c && je2Var3.f6048g == je2Var2.f6048g && je2Var3.f6046e == je2Var2.f6046e && je2Var3.f6047f == je2Var2.f6047f && je2Var3.f6045d == je2Var2.f6045d) {
                this.f9252n = je2Var2;
                this.f9251m = null;
                AudioTrack audioTrack = this.f9254p;
                if (audioTrack != null && m(audioTrack)) {
                    this.f9252n.getClass();
                }
            } else {
                g();
                if (t()) {
                    return false;
                }
                p();
            }
            d(j6);
        }
        if (k()) {
            exc2 = null;
        } else {
            try {
                if (ne2Var.f7432a == null) {
                    exc = null;
                } else {
                    synchronized (Z) {
                        z6 = f9239b0 > 0;
                    }
                    if (z6) {
                        exc = null;
                    } else {
                        exc = null;
                        if (SystemClock.elapsedRealtime() < ne2Var.f7434c) {
                        }
                        if (z7) {
                            return false;
                        }
                        try {
                            je2Var = this.f9252n;
                        } catch (yd2 e6) {
                            je2 je2Var4 = this.f9252n;
                            if (je2Var4.h > 1000000) {
                                je2 je2Var5 = new je2(je2Var4.f6042a, je2Var4.f6043b, je2Var4.f6044c, je2Var4.f6045d, je2Var4.f6046e, je2Var4.f6047f, je2Var4.f6048g, 1000000, je2Var4.f6049i);
                                try {
                                    AudioTrack audioTrackC2 = c(je2Var5);
                                    this.f9252n = je2Var5;
                                    audioTrackC = audioTrackC2;
                                } catch (yd2 e7) {
                                    e6.addSuppressed(e7);
                                    if (this.f9252n.f6044c == 1) {
                                        throw e6;
                                    }
                                    this.S = true;
                                    throw e6;
                                }
                            }
                            if (this.f9252n.f6044c == 1) {
                            }
                        }
                        if (je2Var == null) {
                            throw exc;
                        }
                        audioTrackC = c(je2Var);
                        this.f9254p = audioTrackC;
                        if (m(audioTrackC)) {
                            AudioTrack audioTrack2 = this.f9254p;
                            if (this.h == null) {
                                this.h = new re2(this);
                            }
                            re2 re2Var = this.h;
                            Handler handler = re2Var.f8618a;
                            Objects.requireNonNull(handler);
                            audioTrack2.registerStreamEventCallback(new pe2(handler, 0), re2Var.f8619b);
                            this.f9252n.getClass();
                        }
                        int i14 = j31.f5914a;
                        if (i14 >= 31 && (hd2Var = this.f9249k) != null) {
                            AudioTrack audioTrack3 = this.f9254p;
                            gd2 gd2Var = hd2Var.f5343b;
                            gd2Var.getClass();
                            LogSessionId logSessionId = gd2Var.f5002a;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                audioTrack3.setLogSessionId(logSessionId);
                            }
                        }
                        this.O = this.f9254p.getAudioSessionId();
                        de2 de2Var2 = this.f9245f;
                        AudioTrack audioTrack4 = this.f9254p;
                        je2 je2Var6 = this.f9252n;
                        de2Var2.b(audioTrack4, je2Var6.f6044c == 2, je2Var6.f6048g, je2Var6.f6045d, je2Var6.h);
                        if (k()) {
                            this.f9254p.setVolume(this.G);
                        }
                        this.P.getClass();
                        ck1 ck1Var = this.Q;
                        if (ck1Var != null && i14 >= 23) {
                            this.f9254p.setPreferredDevice((AudioDeviceInfo) ck1Var.f3613t);
                            pd2 pd2Var2 = this.f9256r;
                            if (pd2Var2 != null) {
                                pd2Var2.a((AudioDeviceInfo) this.Q.f3613t);
                            }
                        }
                        if (i14 >= 24 && (pd2Var = this.f9256r) != null) {
                            this.s = new me2(this.f9254p, pd2Var);
                        }
                        this.E = true;
                        xj1 xj1Var = this.f9250l;
                        if (xj1Var != null) {
                            wd2 wd2VarA = this.f9252n.a();
                            vd2 vd2Var = ((ve2) xj1Var.f10619t).R0;
                            Handler handler2 = vd2Var.f9835a;
                            if (handler2 != null) {
                                handler2.post(new ud2(vd2Var, wd2VarA, 0));
                            }
                        }
                        exc2 = exc;
                    }
                    z7 = true;
                    if (z7) {
                    }
                }
                z7 = false;
                if (z7) {
                }
            } catch (yd2 e8) {
                if (e8.f10933t) {
                    throw e8;
                }
                ne2Var.a(e8);
                return false;
            }
        }
        ne2Var.f7432a = exc2;
        ne2Var.f7433b = -9223372036854775807L;
        ne2Var.f7434c = -9223372036854775807L;
        if (this.E) {
            this.F = Math.max(0L, j6);
            this.D = false;
            this.E = false;
            d(j6);
            if (this.N) {
                q();
            }
        }
        long jB = b();
        AudioTrack audioTrack5 = de2Var.f3868c;
        audioTrack5.getClass();
        int playState = audioTrack5.getPlayState();
        if (de2Var.f3872g) {
            if (playState == 2) {
                de2Var.f3879o = false;
                return false;
            }
            if (playState == 1) {
                if (de2Var.d() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z8 = de2Var.f3879o;
        boolean zC = de2Var.c(jB);
        de2Var.f3879o = zC;
        if (!z8 || zC || playState == 1) {
            j7 = -9223372036854775807L;
        } else {
            oe2 oe2Var = de2Var.f3866a;
            int i15 = de2Var.f3869d;
            long jV = j31.v(de2Var.h);
            te2 te2Var = oe2Var.f7737a;
            if (te2Var.f9250l != null) {
                j7 = -9223372036854775807L;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - te2Var.R;
                vd2 vd2Var2 = ((ve2) te2Var.f9250l.f10619t).R0;
                Handler handler3 = vd2Var2.f9835a;
                if (handler3 != null) {
                    handler3.post(new td2(vd2Var2, i15, jV, jElapsedRealtime));
                }
            }
        }
        if (this.H == null) {
            y5.n(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            je2 je2Var7 = this.f9252n;
            if (je2Var7.f6044c == 0 || this.C != 0) {
                j8 = 0;
            } else {
                int i16 = je2Var7.f6048g;
                if (i16 == 20) {
                    j8 = 0;
                    if ((byteBuffer.get(5) & 2) == 0) {
                        i7 = 0;
                    } else {
                        byte b8 = byteBuffer.get(26);
                        int i17 = 28;
                        int i18 = 28;
                        for (int i19 = 0; i19 < b8; i19++) {
                            i18 += byteBuffer.get(i19 + 27);
                        }
                        byte b9 = byteBuffer.get(i18 + 26);
                        for (int i20 = 0; i20 < b9; i20++) {
                            i17 += byteBuffer.get(i18 + 27 + i20);
                        }
                        i7 = i18 + i17;
                    }
                    int i21 = byteBuffer.get(i7 + 26) + 27 + i7;
                    iR = (int) ((me0.r(byteBuffer.get(i21), byteBuffer.limit() - i21 > 1 ? byteBuffer.get(i21 + 1) : (byte) 0) * 48000) / 1000000);
                } else if (i16 != 30) {
                    switch (i16) {
                        case 5:
                        case 6:
                            j8 = 0;
                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
                                iR = d0.f3701t[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                break;
                            } else {
                                iR = 1536;
                                break;
                            }
                        case 7:
                        case 8:
                            j8 = 0;
                            if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                                if (byteBuffer.getInt(0) == 622876772) {
                                    iR = 4096;
                                    break;
                                } else {
                                    int iPosition = byteBuffer.position();
                                    byte b10 = byteBuffer.get(iPosition);
                                    if (b10 != -2) {
                                        if (b10 == -1) {
                                            i9 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b7 = byteBuffer.get(iPosition + 7);
                                        } else if (b10 != 31) {
                                            i9 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                            i10 = byteBuffer.get(iPosition + 5) & 252;
                                            i8 = (i10 >> 2) | i9;
                                        } else {
                                            i9 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                            b7 = byteBuffer.get(iPosition + 6);
                                        }
                                        i10 = b7 & 60;
                                        i8 = (i10 >> 2) | i9;
                                    } else {
                                        i8 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iR = (i8 + 1) * 32;
                                    break;
                                }
                            } else {
                                iR = 1024;
                                break;
                            }
                            break;
                        case 9:
                            j8 = 0;
                            int iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                iReverseBytes = Integer.reverseBytes(iReverseBytes);
                            }
                            if ((iReverseBytes & (-2097152)) != -2097152 || (i11 = (iReverseBytes >>> 19) & 3) == 1 || (i12 = (iReverseBytes >>> 17) & 3) == 0) {
                                iR = -1;
                                if (iR == -1) {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i22 = iReverseBytes >>> 12;
                                int i23 = (iReverseBytes >>> 10) & 3;
                                int i24 = i22 & 15;
                                if (i24 != 0 && i24 != 15 && i23 != 3) {
                                    iR = 1152;
                                    if (i12 != 1) {
                                        if (i12 != 2) {
                                            iR = 384;
                                        }
                                    } else if (i11 != 3) {
                                        iR = 576;
                                    }
                                }
                                if (iR == -1) {
                                }
                            }
                            break;
                        case 10:
                            j8 = 0;
                            iR = 1024;
                            break;
                        case 11:
                        case 12:
                            j8 = 0;
                            iR = 2048;
                            break;
                        default:
                            j8 = 0;
                            switch (i16) {
                                case 14:
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i25 = iPosition2;
                                    while (true) {
                                        if (i25 <= iLimit) {
                                            int iReverseBytes2 = byteBuffer.getInt(i25 + 4);
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                            }
                                            if ((iReverseBytes2 & (-2)) == -126718022) {
                                                i13 = i25 - iPosition2;
                                            } else {
                                                i25++;
                                            }
                                        } else {
                                            i13 = -1;
                                        }
                                    }
                                    if (i13 == -1) {
                                        iR = 0;
                                        break;
                                    } else {
                                        iR = (40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                        break;
                                    }
                                case 15:
                                    iR = AdRequest.MAX_CONTENT_URL_LENGTH;
                                    break;
                                case 16:
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iR = f0.c(new l42(16, bArr)).f4066c;
                                    break;
                                case 18:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(i16, "Unexpected audio encoding: "));
                            }
                    }
                }
                this.C = iR;
                if (iR == 0) {
                    return true;
                }
            }
            if (this.f9258u != null) {
                if (!j()) {
                    return false;
                }
                d(j6);
                this.f9258u = null;
            }
            long jT = j31.t(this.f9252n.f6042a.C, a() - this.f9242c.f10946o) + this.F;
            if (!this.D && Math.abs(jT - j6) > 200000) {
                xj1 xj1Var2 = this.f9250l;
                if (xj1Var2 != null) {
                    xj1Var2.e(new zd2("Unexpected audio track timestamp discontinuity: expected " + jT + ", got " + j6));
                }
                this.D = true;
            }
            if (this.D) {
                if (!j()) {
                    return false;
                }
                long j9 = j6 - jT;
                this.F += j9;
                this.D = false;
                d(j6);
                xj1 xj1Var3 = this.f9250l;
                if (xj1Var3 != null && j9 != j8) {
                    ((ve2) xj1Var3.f10619t).f9838a1 = true;
                }
            }
            if (this.f9252n.f6044c == 0) {
                this.f9262y += byteBuffer.remaining();
            } else {
                this.f9263z = (this.C * i6) + this.f9263z;
            }
            this.H = byteBuffer;
            this.I = i6;
        } else {
            j8 = 0;
        }
        h();
        if (!this.H.hasRemaining()) {
            this.H = null;
            this.I = 0;
            return true;
        }
        long jB2 = b();
        if (de2Var.f3888y == j7 || jB2 <= j8 || de2Var.G.zzb() - de2Var.f3888y < 200) {
            return false;
        }
        qs0.f("DefaultAudioSink", "Resetting stalled audio track");
        p();
        return true;
    }

    public final boolean t() {
        if (k()) {
            return !(j31.f5914a >= 29 && this.f9254p.isOffloadedPlayback() && this.M) && this.f9245f.c(b());
        }
        return false;
    }
}

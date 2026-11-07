package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class de2 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public el0 G;

    /* renamed from: a, reason: collision with root package name */
    public final oe2 f3866a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3867b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f3868c;

    /* renamed from: d, reason: collision with root package name */
    public int f3869d;

    /* renamed from: e, reason: collision with root package name */
    public ce2 f3870e;

    /* renamed from: f, reason: collision with root package name */
    public int f3871f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3872g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public float f3873i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3874j;

    /* renamed from: k, reason: collision with root package name */
    public long f3875k;

    /* renamed from: l, reason: collision with root package name */
    public long f3876l;

    /* renamed from: m, reason: collision with root package name */
    public Method f3877m;

    /* renamed from: n, reason: collision with root package name */
    public long f3878n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3880p;

    /* renamed from: q, reason: collision with root package name */
    public long f3881q;

    /* renamed from: r, reason: collision with root package name */
    public long f3882r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f3883t;

    /* renamed from: u, reason: collision with root package name */
    public long f3884u;

    /* renamed from: v, reason: collision with root package name */
    public int f3885v;

    /* renamed from: w, reason: collision with root package name */
    public int f3886w;

    /* renamed from: x, reason: collision with root package name */
    public long f3887x;

    /* renamed from: y, reason: collision with root package name */
    public long f3888y;

    /* renamed from: z, reason: collision with root package name */
    public long f3889z;

    public de2(oe2 oe2Var) {
        this.f3866a = oe2Var;
        try {
            this.f3877m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f3867b = new long[10];
        this.G = el0.f4333a;
    }

    public final long a(boolean z6) {
        oe2 oe2Var;
        boolean z7;
        long j6;
        float f6;
        long jT;
        vd2 vd2Var;
        Handler handler;
        boolean timestamp;
        long j7;
        long j8;
        Method method;
        AudioTrack audioTrack;
        de2 de2Var = this;
        AudioTrack audioTrack2 = de2Var.f3868c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        oe2 oe2Var2 = de2Var.f3866a;
        if (playState == 3) {
            long jZzc = de2Var.G.zzc() / 1000;
            if (jZzc - de2Var.f3876l >= 30000) {
                long jT2 = j31.t(de2Var.f3871f, de2Var.d());
                if (jT2 != 0) {
                    int i6 = de2Var.f3885v;
                    f6 = 1.0f;
                    float f7 = de2Var.f3873i;
                    if (f7 == 1.0f) {
                        j6 = 1000;
                    } else {
                        j6 = 1000;
                        jT2 = Math.round(jT2 / f7);
                    }
                    long[] jArr = de2Var.f3867b;
                    jArr[i6] = jT2 - jZzc;
                    de2Var.f3885v = (de2Var.f3885v + 1) % 10;
                    int i7 = de2Var.f3886w;
                    if (i7 < 10) {
                        de2Var.f3886w = i7 + 1;
                    }
                    de2Var.f3876l = jZzc;
                    de2Var.f3875k = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = de2Var.f3886w;
                        if (i8 >= i9) {
                            break;
                        }
                        de2Var.f3875k = (jArr[i8] / i9) + de2Var.f3875k;
                        i8++;
                    }
                }
                oe2Var = oe2Var2;
                z7 = false;
                j6 = 1000;
                f6 = 1.0f;
            } else {
                j6 = 1000;
                f6 = 1.0f;
            }
            if (de2Var.f3872g) {
                oe2Var = oe2Var2;
                z7 = false;
            } else {
                ce2 ce2Var = de2Var.f3870e;
                ce2Var.getClass();
                be2 be2Var = ce2Var.f3544a;
                if (jZzc - ce2Var.f3548e < ce2Var.f3547d) {
                    timestamp = false;
                    j7 = 500000;
                } else {
                    ce2Var.f3548e = jZzc;
                    AudioTrack audioTrack3 = be2Var.f3051a;
                    AudioTimestamp audioTimestamp = be2Var.f3052b;
                    timestamp = audioTrack3.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j7 = 500000;
                        long j9 = audioTimestamp.framePosition;
                        if (be2Var.f3054d > j9) {
                            be2Var.f3053c++;
                        }
                        be2Var.f3054d = j9;
                        be2Var.f3055e = j9 + (be2Var.f3053c << 32);
                    } else {
                        j7 = 500000;
                    }
                    int i10 = ce2Var.f3545b;
                    if (i10 == 0) {
                        if (timestamp) {
                            if (audioTimestamp.nanoTime / j6 >= ce2Var.f3546c) {
                                ce2Var.f3549f = be2Var.f3055e;
                                ce2Var.a(1);
                                timestamp = true;
                            }
                        } else if (jZzc - ce2Var.f3546c > j7) {
                            ce2Var.a(3);
                        }
                        timestamp = false;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            if (!timestamp) {
                                ce2Var.a(0);
                                timestamp = false;
                            }
                            timestamp = true;
                        } else if (i10 == 3) {
                            if (timestamp) {
                                ce2Var.a(0);
                                timestamp = true;
                            }
                            timestamp = false;
                        }
                    } else if (timestamp) {
                        if (be2Var.f3055e > ce2Var.f3549f) {
                            ce2Var.a(2);
                        }
                        timestamp = true;
                    } else {
                        ce2Var.a(0);
                        timestamp = false;
                    }
                }
                if (timestamp) {
                    long j10 = be2Var.f3052b.nanoTime / j6;
                    j8 = 5000000;
                    long j11 = be2Var.f3055e;
                    long jT3 = j31.t(de2Var.f3871f, de2Var.d());
                    if (Math.abs(j10 - jZzc) > 5000000) {
                        te2 te2Var = oe2Var2.f7737a;
                        oe2Var = oe2Var2;
                        qs0.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j11 + ", " + j10 + ", " + jZzc + ", " + jT3 + ", " + te2Var.a() + ", " + te2Var.b());
                        ce2Var.a(4);
                    } else {
                        oe2Var = oe2Var2;
                        if (Math.abs(j31.t(de2Var.f3871f, j11) - jT3) > 5000000) {
                            te2 te2Var2 = oe2Var.f7737a;
                            qs0.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j10 + ", " + jZzc + ", " + jT3 + ", " + te2Var2.a() + ", " + te2Var2.b());
                            ce2Var.a(4);
                        } else {
                            if (ce2Var.f3545b == 4) {
                                z7 = false;
                                ce2Var.a(0);
                            }
                            de2Var = this;
                        }
                    }
                    z7 = false;
                    de2Var = this;
                } else {
                    oe2Var = oe2Var2;
                    z7 = false;
                    j8 = 5000000;
                }
                if (de2Var.f3880p && (method = de2Var.f3877m) != null && jZzc - de2Var.f3881q >= j7) {
                    try {
                        audioTrack = de2Var.f3868c;
                    } catch (Exception unused) {
                        de2Var.f3877m = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i11 = j31.f5914a;
                    long jIntValue = (num.intValue() * j6) - de2Var.h;
                    de2Var.f3878n = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    de2Var.f3878n = jMax;
                    if (jMax > j8) {
                        qs0.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        de2Var.f3878n = 0L;
                    }
                    de2Var.f3881q = jZzc;
                }
            }
        } else {
            oe2Var = oe2Var2;
            z7 = false;
            j6 = 1000;
            f6 = 1.0f;
        }
        long jZzc2 = de2Var.G.zzc() / j6;
        ce2 ce2Var2 = de2Var.f3870e;
        ce2Var2.getClass();
        be2 be2Var2 = ce2Var2.f3544a;
        if (ce2Var2.f3545b == 2) {
            z7 = true;
        }
        if (z7) {
            jT = j31.r(jZzc2 - (be2Var2.f3052b.nanoTime / j6), de2Var.f3873i) + j31.t(de2Var.f3871f, be2Var2.f3055e);
        } else {
            jT = de2Var.f3886w == 0 ? j31.t(de2Var.f3871f, de2Var.d()) : j31.r(de2Var.f3875k + jZzc2, de2Var.f3873i);
            if (!z6) {
                jT = Math.max(0L, jT - de2Var.f3878n);
            }
        }
        if (de2Var.D != z7) {
            de2Var.F = de2Var.C;
            de2Var.E = de2Var.B;
        }
        long j12 = jZzc2 - de2Var.F;
        if (j12 < 1000000) {
            long jR = j31.r(j12, de2Var.f3873i) + de2Var.E;
            long j13 = (j12 * j6) / 1000000;
            jT = (((j6 - j13) * jR) + (jT * j13)) / j6;
        }
        if (!de2Var.f3874j) {
            long j14 = de2Var.B;
            if (jT > j14) {
                de2Var.f3874j = true;
                float f8 = de2Var.f3873i;
                long jV = j31.v(jT - j14);
                if (f8 != f6) {
                    jV = Math.round(jV / f8);
                }
                long jZza = de2Var.G.zza() - j31.v(jV);
                xj1 xj1Var = oe2Var.f7737a.f9250l;
                if (xj1Var != null && (handler = (vd2Var = ((ve2) xj1Var.f10619t).R0).f9835a) != null) {
                    handler.post(new cf(vd2Var, jZza));
                }
            }
        }
        de2Var.C = jZzc2;
        de2Var.B = jT;
        de2Var.D = z7;
        return jT;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AudioTrack audioTrack, boolean z6, int i6, int i7, int i8) {
        boolean z7;
        long jT;
        this.f3868c = audioTrack;
        this.f3869d = i8;
        this.f3870e = new ce2(audioTrack);
        this.f3871f = audioTrack.getSampleRate();
        if (!z6 || j31.f5914a >= 23) {
            z7 = false;
        } else {
            z7 = true;
            if (i6 != 5) {
                if (i6 == 6) {
                    i6 = 6;
                }
            }
        }
        this.f3872g = z7;
        boolean zC = j31.c(i6);
        this.f3880p = zC;
        if (zC) {
            jT = j31.t(this.f3871f, i8 / i7);
        } else {
            jT = -9223372036854775807L;
        }
        this.h = jT;
        this.s = 0L;
        this.f3883t = 0L;
        this.f3884u = 0L;
        this.f3879o = false;
        this.f3887x = -9223372036854775807L;
        this.f3888y = -9223372036854775807L;
        this.f3881q = 0L;
        this.f3878n = 0L;
        this.f3873i = 1.0f;
    }

    public final boolean c(long j6) {
        long jA = a(false);
        int i6 = this.f3871f;
        int i7 = j31.f5914a;
        if (j6 > j31.u(jA, i6, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f3872g) {
            AudioTrack audioTrack = this.f3868c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && d() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d() {
        long jZzb = this.G.zzb();
        int i6 = 2;
        if (this.f3887x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f3868c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f3889z;
            }
            return Math.min(this.A, this.f3889z + j31.u(j31.r(j31.s(jZzb) - this.f3887x, this.f3873i), this.f3871f, 1000000L, RoundingMode.UP));
        }
        if (jZzb - this.f3882r >= 5) {
            AudioTrack audioTrack2 = this.f3868c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j6 = 0;
                if (this.f3872g) {
                    if (playState != 2) {
                        i6 = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f3884u = this.s;
                    }
                    playbackHeadPosition += this.f3884u;
                    playState = i6;
                }
                if (j31.f5914a > 29) {
                    if (this.s > playbackHeadPosition) {
                        this.f3883t++;
                    }
                    this.s = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j6 = playbackHeadPosition;
                    } else if (this.s > 0 && playState == 3) {
                        if (this.f3888y == -9223372036854775807L) {
                            this.f3888y = jZzb;
                        }
                    }
                    this.f3888y = -9223372036854775807L;
                    playbackHeadPosition = j6;
                    if (this.s > playbackHeadPosition) {
                    }
                    this.s = playbackHeadPosition;
                }
            }
            this.f3882r = jZzb;
        }
        return this.s + (this.f3883t << 32);
    }
}

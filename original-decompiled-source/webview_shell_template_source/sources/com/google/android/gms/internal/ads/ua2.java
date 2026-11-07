package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ua2 implements rb2 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f9511a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9512b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9513c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9514d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9515e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9516f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f9517g;
    public long h;

    public ua2() {
        u1 u1Var = new u1();
        h("bufferForPlaybackMs", 2500, 0, "0");
        h("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        h("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        h("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        h("maxBufferMs", 50000, 50000, "minBufferMs");
        h("backBufferDurationMs", 0, 0, "0");
        this.f9511a = u1Var;
        long jS = j31.s(50000L);
        this.f9512b = jS;
        this.f9513c = jS;
        this.f9514d = j31.s(2500L);
        this.f9515e = j31.s(5000L);
        this.f9516f = j31.s(0L);
        this.f9517g = new HashMap();
        this.h = -1L;
    }

    public static void h(String str, int i6, int i7, String str2) {
        y5.p(androidx.activity.m.d(str, " cannot be less than ", str2), i6 >= i7);
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final boolean a(qb2 qb2Var) {
        int i6;
        long j6 = this.f9513c;
        ta2 ta2Var = (ta2) this.f9517g.get(qb2Var.f8299a);
        ta2Var.getClass();
        u1 u1Var = this.f9511a;
        synchronized (u1Var) {
            i6 = u1Var.f9422b * 65536;
        }
        int iG = g();
        long jMin = this.f9512b;
        float f6 = qb2Var.f8301c;
        if (f6 > 1.0f) {
            jMin = Math.min(j31.r(jMin, f6), j6);
        }
        long j7 = qb2Var.f8300b;
        if (j7 < Math.max(jMin, 500000L)) {
            boolean z6 = i6 < iG;
            ta2Var.f9169a = z6;
            if (!z6 && j7 < 500000) {
                qs0.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= j6 || i6 >= iG) {
            ta2Var.f9169a = false;
        }
        return ta2Var.f9169a;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void b(hd2 hd2Var) {
        long id = Thread.currentThread().getId();
        long j6 = this.h;
        boolean z6 = true;
        if (j6 != -1 && j6 != id) {
            z6 = false;
        }
        if (!z6) {
            throw new IllegalStateException("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        }
        this.h = id;
        HashMap map = this.f9517g;
        if (!map.containsKey(hd2Var)) {
            map.put(hd2Var, new ta2());
        }
        ta2 ta2Var = (ta2) map.get(hd2Var);
        ta2Var.getClass();
        ta2Var.f9170b = 13107200;
        ta2Var.f9169a = false;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void c(hd2 hd2Var) {
        if (this.f9517g.remove(hd2Var) != null) {
            u1 u1Var = this.f9511a;
            if (!this.f9517g.isEmpty()) {
                u1Var.d(g());
            } else {
                synchronized (u1Var) {
                    u1Var.d(0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void d(qb2 qb2Var, ak2[] ak2VarArr) {
        ta2 ta2Var = (ta2) this.f9517g.get(qb2Var.f8299a);
        ta2Var.getClass();
        int length = ak2VarArr.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 13107200;
            if (i6 >= length) {
                break;
            }
            ak2 ak2Var = ak2VarArr[i6];
            if (ak2Var != null) {
                int i9 = ak2Var.zzg().f2533c;
                if (i9 != -1) {
                    if (i9 == 0) {
                        i8 = 144310272;
                    } else if (i9 != 1) {
                        i8 = i9 != 2 ? 131072 : 131072000;
                    }
                }
                i7 += i8;
            }
            i6++;
        }
        ta2Var.f9170b = Math.max(13107200, i7);
        u1 u1Var = this.f9511a;
        if (!this.f9517g.isEmpty()) {
            u1Var.d(g());
        } else {
            synchronized (u1Var) {
                u1Var.d(0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final boolean e(qb2 qb2Var) {
        int i6;
        boolean z6 = qb2Var.f8302d;
        long jRound = qb2Var.f8300b;
        float f6 = qb2Var.f8301c;
        int i7 = j31.f5914a;
        if (f6 != 1.0f) {
            jRound = Math.round(jRound / f6);
        }
        long jMin = z6 ? this.f9515e : this.f9514d;
        long j6 = qb2Var.f8303e;
        if (j6 != -9223372036854775807L) {
            jMin = Math.min(j6 / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        u1 u1Var = this.f9511a;
        synchronized (u1Var) {
            i6 = u1Var.f9422b * 65536;
        }
        return i6 >= g();
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void f(hd2 hd2Var) {
        if (this.f9517g.remove(hd2Var) != null) {
            u1 u1Var = this.f9511a;
            if (this.f9517g.isEmpty()) {
                synchronized (u1Var) {
                    u1Var.d(0);
                }
            } else {
                u1Var.d(g());
            }
        }
        if (this.f9517g.isEmpty()) {
            this.h = -1L;
        }
    }

    public final int g() {
        Iterator it = this.f9517g.values().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((ta2) it.next()).f9170b;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final long zzb() {
        return this.f9516f;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final boolean zzi() {
        Iterator it = this.f9517g.values().iterator();
        while (it.hasNext()) {
            if (((ta2) it.next()).f9169a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final u1 zzk() {
        return this.f9511a;
    }
}

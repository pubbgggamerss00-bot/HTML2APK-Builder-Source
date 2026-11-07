package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class cc2 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3516t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3517u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3518v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3519w;

    public /* synthetic */ cc2(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.s = i6;
        this.f3516t = obj;
        this.f3517u = obj2;
        this.f3518v = obj3;
        this.f3519w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                Pair pair = (Pair) this.f3517u;
                ((dc2) this.f3516t).f3849b.h.d(((Integer) pair.first).intValue(), (oh2) pair.second, (fh2) this.f3518v, (lh2) this.f3519w);
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f3516t;
                xj1 xj1Var = (xj1) this.f3517u;
                Handler handler = (Handler) this.f3518v;
                wd2 wd2Var = (wd2) this.f3519w;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (xj1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new wx(13, xj1Var, wd2Var));
                    }
                    synchronized (te2.Z) {
                        try {
                            int i6 = te2.f9239b0 - 1;
                            te2.f9239b0 = i6;
                            if (i6 == 0) {
                                te2.f9238a0.shutdown();
                                te2.f9238a0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (xj1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new wx(13, xj1Var, wd2Var));
                    }
                    synchronized (te2.Z) {
                        try {
                            int i7 = te2.f9239b0 - 1;
                            te2.f9239b0 = i7;
                            if (i7 == 0) {
                                te2.f9238a0.shutdown();
                                te2.f9238a0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }
}

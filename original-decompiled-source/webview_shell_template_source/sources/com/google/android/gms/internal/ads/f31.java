package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f31 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4459t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4460u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4461v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4462w;

    public /* synthetic */ f31(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.s = i6;
        this.f4459t = obj;
        this.f4460u = obj2;
        this.f4461v = obj3;
        this.f4462w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                i31 i31Var = ((g31) this.f4459t).f4889d;
                i31.c((ac1) this.f4460u, (tb1) this.f4461v, (b01) this.f4462w);
                break;
            default:
                Pair pair = (Pair) this.f4460u;
                ((dc2) this.f4459t).f3849b.h.f(((Integer) pair.first).intValue(), (oh2) pair.second, (fh2) this.f4461v, (lh2) this.f4462w);
                break;
        }
    }
}

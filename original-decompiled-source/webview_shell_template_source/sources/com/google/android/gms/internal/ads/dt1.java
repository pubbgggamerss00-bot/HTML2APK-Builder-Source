package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dt1 implements zr1 {

    /* renamed from: u, reason: collision with root package name */
    public static final dt1 f4020u;

    /* renamed from: v, reason: collision with root package name */
    public static final dt1 f4021v;

    /* renamed from: w, reason: collision with root package name */
    public static final dt1 f4022w;

    /* renamed from: x, reason: collision with root package name */
    public static final dt1 f4023x;

    /* renamed from: y, reason: collision with root package name */
    public static final dt1 f4024y;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public String f4025t;

    static {
        int i6 = 0;
        f4020u = new dt1("ENABLED", i6);
        f4021v = new dt1("DISABLED", i6);
        f4022w = new dt1("DESTROYED", i6);
        int i7 = 1;
        f4023x = new dt1("TINK", i7);
        f4024y = new dt1("NO_PREFIX", i7);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zzv.zzp().h(this.f4025t, th);
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return this.f4025t;
            case 1:
                return this.f4025t;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dt1(String str, int i6) {
        this.s = i6;
        this.f4025t = str;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
    }
}

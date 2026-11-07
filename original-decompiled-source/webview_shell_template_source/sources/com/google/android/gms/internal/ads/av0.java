package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class av0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2856c;

    public /* synthetic */ av0(int i6, Object obj, Object obj2) {
        this.f2854a = i6;
        this.f2855b = obj;
        this.f2856c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o70 o70Var;
        switch (this.f2854a) {
            case 0:
                fv0 fv0Var = (fv0) this.f2855b;
                de1 de1Var = (de1) this.f2856c;
                fv0Var.f4791e.a(Boolean.TRUE);
                de1Var.s(true);
                fv0Var.f4801p.b(de1Var.zzm());
                return null;
            case 1:
                kw0 kw0Var = (kw0) this.f2855b;
                r30 r30Var = (r30) this.f2856c;
                yw0 yw0Var = kw0Var.f6514c;
                synchronized (yw0Var.f3318b) {
                    try {
                        if (yw0Var.f3319c) {
                            o70Var = yw0Var.f3317a;
                        } else {
                            yw0Var.f3319c = true;
                            yw0Var.f3321e = r30Var;
                            yw0Var.f3322f.checkAvailabilityAndConnect();
                            yw0Var.f3317a.s.addListener(new u(8, yw0Var), i70.f5592g);
                            bx0.b(yw0Var.f11097g, yw0Var.f3317a, yw0Var.h);
                            o70Var = yw0Var.f3317a;
                        }
                    } finally {
                    }
                }
                return (jx0) o70Var.s.get(((Integer) zzbe.zzc().a(zn.f11514y5)).intValue(), TimeUnit.SECONDS);
            default:
                return ((ye1) this.f2855b).f10937b.zza((String) this.f2856c);
        }
    }
}

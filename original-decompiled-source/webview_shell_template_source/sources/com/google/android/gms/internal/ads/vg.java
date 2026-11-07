package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vg implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9857a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9858b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9859c;

    public /* synthetic */ vg(int i6, Object obj, Object obj2) {
        this.f9857a = i6;
        this.f9858b = obj;
        this.f9859c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        switch (this.f9857a) {
            case 0:
                dg dgVar = (dg) this.f9858b;
                pf pfVar = dgVar.f3907l;
                if ((pfVar != null ? pfVar.f8054a : dgVar.f3906k) != null) {
                    (pfVar != null ? pfVar.f8054a : dgVar.f3906k).get();
                }
                yd ydVarB = ((dg) this.f9858b).b();
                if (ydVarB == null) {
                    return null;
                }
                try {
                    synchronized (((kd) this.f9859c)) {
                        kd kdVar = (kd) this.f9859c;
                        byte[] bArrI = ydVarB.i();
                        u42 u42Var = u42.f9458b;
                        u62 u62Var = u62.f9474c;
                        kdVar.e(bArrI, u42.f9459c);
                    }
                    return null;
                } catch (u52 | NullPointerException unused) {
                    return null;
                }
            default:
                return (jx0) ((o70) ((qw0) this.f9858b).f8470d.c((r30) this.f9859c)).s.get(((Integer) zzbe.zzc().a(zn.f11514y5)).intValue(), TimeUnit.SECONDS);
        }
    }
}

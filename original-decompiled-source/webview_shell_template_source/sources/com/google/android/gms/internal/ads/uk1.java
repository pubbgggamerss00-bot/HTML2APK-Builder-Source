package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9579t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9580u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9581v;

    public /* synthetic */ uk1(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f9579t = obj;
        this.f9580u = obj2;
        this.f9581v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                zk1 zk1Var = (zk1) this.f9579t;
                kk1 kk1Var = (kk1) this.f9580u;
                dl1 dl1Var = (dl1) this.f9581v;
                String str = zk1Var.f11329b;
                try {
                    hl1 hl1Var = zk1Var.f11328a;
                    if (hl1Var == null) {
                        throw null;
                    }
                    ik1 ik1Var = hl1Var.f5445j;
                    if (ik1Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    zk1.b(kk1Var.f6443a, new sk1(bundle, 1));
                    zk1.b(kk1Var.f6444b, new tk1(1, bundle));
                    ik1Var.w0(bundle, new yk1(zk1Var, dl1Var));
                    return;
                } catch (RemoteException e6) {
                    zk1.f11326c.b(e6, "dismiss overlay display from: %s", str);
                    return;
                }
            default:
                xb2 xb2Var = (xb2) this.f9579t;
                yn1 yn1Var = (yn1) this.f9580u;
                xb2Var.f10478c.c(yn1Var.t(), (oh2) this.f9581v);
                return;
        }
    }
}

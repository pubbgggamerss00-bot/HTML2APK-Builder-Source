package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x70 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10399t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10400u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10401v;

    public x70(z70 z70Var, String str, String str2) {
        this.s = 0;
        this.f10399t = str;
        this.f10400u = str2;
        this.f10401v = z70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                f80 f80Var = ((z70) this.f10401v).H;
                if (f80Var != null) {
                    f80Var.c("error", "what", (String) this.f10399t, "extra", (String) this.f10400u);
                    return;
                }
                return;
            case 1:
                zk1 zk1Var = (zk1) this.f10399t;
                al1 al1Var = (al1) this.f10400u;
                dl1 dl1Var = (dl1) this.f10401v;
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
                    bundle.putBinder("windowToken", al1Var.d());
                    zk1.b(al1Var.e(), new er0(2, bundle));
                    bundle.putInt("layoutGravity", al1Var.b());
                    bundle.putFloat("layoutVerticalMargin", al1Var.a());
                    bundle.putInt("displayMode", 0);
                    bundle.putInt("triggerMode", 0);
                    bundle.putInt("windowWidthPx", al1Var.c());
                    zk1.b(null, new sk1(bundle, 0));
                    zk1.b(null, new tk1(0, bundle));
                    zk1.b(al1Var.f(), new kf1(1, bundle));
                    zk1.b(null, new lf1(1, bundle));
                    bundle.putBoolean("stableSessionToken", true);
                    ik1Var.a1(str, bundle, new yk1(zk1Var, dl1Var));
                    return;
                } catch (RemoteException e6) {
                    zk1.f11326c.b(e6, "show overlay display from: %s", str);
                    return;
                }
            case 2:
                Pair pair = (Pair) this.f10400u;
                ((dc2) this.f10399t).f3849b.h.g(((Integer) pair.first).intValue(), (oh2) pair.second, (lh2) this.f10401v);
                return;
            default:
                r2.l lVarI = ((r2.s) ((WorkDatabase) this.f10400u).n()).i((String) this.f10399t);
                if (lVarI == null || !lVarI.b()) {
                    return;
                }
                synchronized (((q2.b) this.f10401v).f14106u) {
                    ((q2.b) this.f10401v).f14109x.put((String) this.f10399t, lVarI);
                    ((q2.b) this.f10401v).f14110y.add(lVarI);
                    q2.b bVar = (q2.b) this.f10401v;
                    bVar.f14111z.b(bVar.f14110y);
                }
                return;
        }
    }

    public /* synthetic */ x70(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f10399t = obj;
        this.f10400u = obj2;
        this.f10401v = obj3;
    }

    public x70(q2.b bVar, WorkDatabase workDatabase, String str) {
        this.s = 3;
        this.f10401v = bVar;
        this.f10400u = workDatabase;
        this.f10399t = str;
    }
}

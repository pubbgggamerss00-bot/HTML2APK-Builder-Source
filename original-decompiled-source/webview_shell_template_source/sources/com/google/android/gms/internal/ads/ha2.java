package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import p.e;
import p.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ha2 extends p.g {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f5313b;

    public ha2(xo xoVar) {
        this.f5313b = new WeakReference(xoVar);
    }

    @Override // p.g
    public final void a(g.a aVar) {
        xo xoVar = (xo) this.f5313b.get();
        if (xoVar != null) {
            xoVar.f10650b = aVar;
            try {
                aVar.f14041a.b2();
            } catch (RemoteException unused) {
            }
            com.google.android.gms.ads.internal.util.k kVar = xoVar.f10652d;
            if (kVar != null) {
                Context context = kVar.f2368b;
                xo xoVar2 = kVar.f2367a;
                g.a aVar2 = xoVar2.f10650b;
                if (aVar2 == null) {
                    xoVar2.f10649a = null;
                } else if (xoVar2.f10649a == null) {
                    xoVar2.f10649a = aVar2.b(null);
                }
                p.e eVarA = new e.d(xoVar2.f10649a).a();
                Intent intent = eVarA.f14043a;
                intent.setPackage(rj1.e(context));
                intent.setData(kVar.f2369c);
                context.startActivity(intent, eVarA.f14044b);
                Activity activity = (Activity) context;
                ha2 ha2Var = xoVar2.f10651c;
                if (ha2Var == null) {
                    return;
                }
                activity.unbindService(ha2Var);
                xoVar2.f10650b = null;
                xoVar2.f10649a = null;
                xoVar2.f10651c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xo xoVar = (xo) this.f5313b.get();
        if (xoVar != null) {
            xoVar.f10650b = null;
            xoVar.f10649a = null;
        }
    }
}

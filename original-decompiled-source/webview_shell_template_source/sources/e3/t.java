package e3;

import android.util.Log;
import d3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t implements Runnable {
    public final /* synthetic */ c3.b s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f12903t;

    public t(u uVar, c3.b bVar) {
        this.f12903t = uVar;
        this.s = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.h hVar;
        u uVar = this.f12903t;
        a.e eVar = uVar.f12904a;
        r rVar = (r) uVar.f12909f.B.get(uVar.f12905b);
        if (rVar == null) {
            return;
        }
        c3.b bVar = this.s;
        if (!bVar.l()) {
            rVar.m(bVar, null);
            return;
        }
        uVar.f12908e = true;
        if (eVar.requiresSignIn()) {
            if (!uVar.f12908e || (hVar = uVar.f12906c) == null) {
                return;
            }
            eVar.getRemoteService(hVar, uVar.f12907d);
            return;
        }
        try {
            eVar.getRemoteService(null, eVar.b());
        } catch (SecurityException e6) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
            eVar.disconnect("Failed to get service from broker.");
            rVar.m(new c3.b(10, null, null), null);
        }
    }
}

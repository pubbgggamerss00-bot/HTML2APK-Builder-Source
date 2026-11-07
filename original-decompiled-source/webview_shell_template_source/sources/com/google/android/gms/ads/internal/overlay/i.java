package com.google.android.gms.ads.internal.overlay;

import android.app.Application;
import com.google.android.gms.internal.ads.dl1;
import com.google.android.gms.internal.consent_sdk.j;
import com.google.android.gms.internal.consent_sdk.l0;
import com.google.android.gms.internal.consent_sdk.l2;
import com.google.android.gms.internal.consent_sdk.m0;
import com.google.android.gms.internal.consent_sdk.r;
import com.google.android.gms.internal.consent_sdk.z8;
import n3.l;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements dl1, z8, v3.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2343t;

    public /* synthetic */ i(int i6, Object obj) {
        this.s = i6;
        this.f2343t = obj;
    }

    @Override // v3.a
    public Object b(p pVar) {
        l lVar = (l) this.f2343t;
        if (pVar.h() || pVar.f()) {
            return pVar;
        }
        Exception excD = pVar.d();
        if (!(excD instanceof d3.b)) {
            return pVar;
        }
        int i6 = ((d3.b) excD).s.s;
        if (i6 == 43001 || i6 == 43002 || i6 == 43003 || i6 == 17) {
            return lVar.f13930b.a();
        }
        if (i6 == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            p pVar2 = new p();
            pVar2.i(exc);
            return pVar2;
        }
        if (i6 != 15) {
            return pVar;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        p pVar3 = new p();
        pVar3.i(exc2);
        return pVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        switch (this.s) {
            case 1:
                return new j((Application) ((com.google.android.gms.internal.consent_sdk.f) this.f2343t).f11718t);
            default:
                l0 l0Var = m0.f11820b;
                l2.a(l0Var);
                return new r((com.google.android.gms.ads.nonagon.signalgeneration.d) this.f2343t, l0Var);
        }
    }
}

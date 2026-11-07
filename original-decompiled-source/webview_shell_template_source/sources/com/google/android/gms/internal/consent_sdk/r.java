package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.gms.internal.ads.j00;
import com.google.android.gms.internal.ads.ni;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.nonagon.signalgeneration.d f11872a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11873b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f11874c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f11875d = new AtomicReference();

    public r(com.google.android.gms.ads.nonagon.signalgeneration.d dVar, Executor executor) {
        this.f11872a = dVar;
        this.f11873b = executor;
    }

    public final void a(UserMessagingPlatform.b bVar, UserMessagingPlatform.a aVar, boolean z6) {
        m0.a();
        s sVar = (s) this.f11874c.get();
        if (sVar == null) {
            aVar.c(new f2(3, "No available form can be built.").a());
            return;
        }
        j00 j00Var = (j00) this.f11872a.zzb();
        j00Var.b(sVar);
        n nVar = (n) ((o7) j00Var.d().f11718t).zzb();
        nVar.f11843n = z6;
        nVar.b(bVar, aVar);
    }

    public final void b() {
        s sVar = (s) this.f11874c.get();
        if (sVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        j00 j00Var = (j00) this.f11872a.zzb();
        j00Var.b(sVar);
        n nVar = (n) ((o7) j00Var.d().f11718t).zzb();
        nVar.f11842m = true;
        m0.f11819a.post(new ni(this, nVar, 6, false));
    }
}

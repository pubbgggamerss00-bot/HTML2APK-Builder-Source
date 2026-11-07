package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import b5.c;
import com.google.android.gms.ads.internal.client.v;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.consent_sdk.c9;
import com.google.android.gms.internal.consent_sdk.m0;
import com.google.android.gms.internal.consent_sdk.p;
import com.google.android.gms.internal.consent_sdk.r;
import com.google.android.gms.internal.consent_sdk.t3;
import com.google.android.gms.internal.consent_sdk.w2;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.a;
import i2.h;
import java.util.Objects;
import java.util.Queue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class UserMessagingPlatform {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void c(@RecentlyNonNull c cVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void b(@RecentlyNonNull com.google.android.ump.a aVar);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return com.google.android.gms.internal.consent_sdk.a.a(context).b();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull a.InterfaceC0040a interfaceC0040a) {
        com.google.android.gms.internal.consent_sdk.a aVarA = com.google.android.gms.internal.consent_sdk.a.a(activity);
        if (aVarA.b().canRequestAds()) {
            interfaceC0040a.a(null);
            return;
        }
        ((Queue) aVarA.d().f11753i.get()).add(Long.valueOf(System.currentTimeMillis()));
        r rVarC = aVarA.c();
        m0.a();
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(12, activity, interfaceC0040a);
        Objects.requireNonNull(interfaceC0040a);
        rVarC.a(aVar, new h(interfaceC0040a), true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        com.google.android.gms.internal.consent_sdk.a aVarA = com.google.android.gms.internal.consent_sdk.a.a(context);
        ((Queue) aVarA.d().f11752g.get()).add(Long.valueOf(System.currentTimeMillis()));
        aVarA.c().a(bVar, aVar, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull a.InterfaceC0040a interfaceC0040a) {
        boolean z6;
        boolean z7;
        final r rVarC = com.google.android.gms.internal.consent_sdk.a.a(activity).c();
        rVarC.getClass();
        ConsentInformation.c cVar = ConsentInformation.c.f12520t;
        m0.a();
        t3 t3VarB = com.google.android.gms.internal.consent_sdk.a.a(activity).b();
        if (t3VarB == null) {
            m0.f11819a.post(new p(0, interfaceC0040a));
            return;
        }
        if (t3VarB.isConsentFormAvailable() || t3VarB.getPrivacyOptionsRequirementStatus() == cVar) {
            if (t3VarB.getPrivacyOptionsRequirementStatus() == cVar) {
                m0.f11819a.post(new com.google.android.gms.ads.internal.util.a(2, interfaceC0040a));
                return;
            }
            com.google.android.ump.a aVar = (com.google.android.ump.a) rVarC.f11875d.get();
            if (aVar == null) {
                m0.f11819a.post(new x(1, interfaceC0040a));
                return;
            } else {
                aVar.a(activity, interfaceC0040a);
                rVarC.f11873b.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        rVarC.b();
                    }
                });
                return;
            }
        }
        m0.f11819a.post(new v(1, interfaceC0040a));
        if (t3VarB.a()) {
            synchronized (t3VarB.f11900e) {
                z7 = t3VarB.h;
            }
            if (!z7) {
                synchronized (t3VarB.f11900e) {
                    t3VarB.h = true;
                }
                c9 c9Var = t3VarB.f11897b;
                b5.b bVar = t3VarB.f11903i;
                w2 w2Var = new w2(t3VarB);
                w2 w2Var2 = new w2(t3VarB);
                c9Var.getClass();
                c9Var.f11664c.execute(new r90(c9Var, activity, bVar, w2Var, w2Var2));
                return;
            }
        }
        boolean zA = t3VarB.a();
        synchronized (t3VarB.f11900e) {
            z6 = t3VarB.h;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zA + ", retryRequestIsInProgress=" + z6);
    }
}

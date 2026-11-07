package com.htmltoapk.template;

import android.util.Log;
import androidx.lifecycle.h;
import b5.a;
import b5.b;
import com.google.android.ump.UserMessagingPlatform;
import com.google.android.ump.a;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConsentManager$backend$1 implements ConsentBackend {
    final /* synthetic */ ConsentManager this$0;

    public ConsentManager$backend$1(ConsentManager consentManager) {
        this.this$0 = consentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void privacyForm$lambda$5(p5.l lVar, b5.c cVar) {
        if (cVar != null) {
            Log.w("ConsentManager", "Privacy options " + cVar.f2010a + ": " + cVar.f2011b);
        }
        lVar.invoke(cVar == null ? null : "privacy_options_failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j requiredForm$lambda$4(ConsentManager consentManager, final p5.l lVar) {
        try {
            UserMessagingPlatform.loadAndShowConsentFormIfRequired(consentManager.activity, new a.InterfaceC0040a() { // from class: com.htmltoapk.template.o0
                @Override // com.google.android.ump.a.InterfaceC0040a
                public final void a(b5.c cVar) {
                    ConsentManager$backend$1.requiredForm$lambda$4$lambda$3(lVar, cVar);
                }
            });
        } catch (Exception e6) {
            Log.w("ConsentManager", "Could not present consent form", e6);
            lVar.invoke("consent_form_failed");
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requiredForm$lambda$4$lambda$3(p5.l lVar, b5.c cVar) {
        if (cVar != null) {
            Log.w("ConsentManager", "Consent form " + cVar.f2010a + ": " + cVar.f2011b);
        }
        lVar.invoke(cVar == null ? null : "consent_form_failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$2(p5.l lVar, b5.c cVar) {
        Log.w("ConsentManager", "Consent update " + cVar.f2010a + ": " + cVar.f2011b);
        lVar.invoke("consent_update_failed");
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public boolean getCanRequestAds() {
        return this.this$0.information.canRequestAds();
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public String getConsentStatus() {
        int consentStatus = this.this$0.information.getConsentStatus();
        return consentStatus != 1 ? consentStatus != 2 ? consentStatus != 3 ? "UNKNOWN" : "OBTAINED" : "REQUIRED" : "NOT_REQUIRED";
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public String getPrivacyOptionsStatus() {
        return this.this$0.information.getPrivacyOptionsRequirementStatus().name();
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public void privacyForm(final p5.l<? super String, d5.j> lVar) {
        kotlin.jvm.internal.j.e("done", lVar);
        UserMessagingPlatform.showPrivacyOptionsForm(this.this$0.activity, new a.InterfaceC0040a() { // from class: com.htmltoapk.template.p0
            @Override // com.google.android.ump.a.InterfaceC0040a
            public final void a(b5.c cVar) {
                ConsentManager$backend$1.privacyForm$lambda$5(lVar, cVar);
            }
        });
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public void requiredForm(p5.l<? super String, d5.j> lVar) {
        kotlin.jvm.internal.j.e("done", lVar);
        ConsentManager consentManager = this.this$0;
        c cVar = new c(2, consentManager, lVar);
        if (consentManager.activity.getLifecycle().b().compareTo(h.b.f1304w) >= 0) {
            cVar.a();
        } else {
            this.this$0.pendingForm = cVar;
        }
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public void reset() {
        this.this$0.information.reset();
    }

    @Override // com.htmltoapk.template.ConsentBackend
    public void update(p5.a<d5.j> aVar, p5.l<? super String, d5.j> lVar) {
        kotlin.jvm.internal.j.e("success", aVar);
        kotlin.jvm.internal.j.e("failure", lVar);
        b.a aVar2 = new b.a();
        int i6 = 0;
        aVar2.f2008a = this.this$0.config.getAdmobUnderAgeOfConsent() == 1;
        if (this.this$0.getDebugEnabled()) {
            a.C0024a c0024a = new a.C0024a(this.this$0.activity);
            Iterator<T> it = this.this$0.config.getUmpTestDeviceIds().iterator();
            while (it.hasNext()) {
                c0024a.f2003a.add((String) it.next());
            }
            String umpDebugGeography = this.this$0.config.getUmpDebugGeography();
            int iHashCode = umpDebugGeography.hashCode();
            if (iHashCode != -1828548366) {
                if (iHashCode != 68513) {
                    if (iHashCode == 75532016 && umpDebugGeography.equals("OTHER")) {
                        i6 = 4;
                    }
                } else if (umpDebugGeography.equals("EEA")) {
                    i6 = 1;
                }
            } else if (umpDebugGeography.equals("REGULATED_US_STATE")) {
                i6 = 3;
            }
            c0024a.f2005c = i6;
            aVar2.f2009b = c0024a.a();
        }
        this.this$0.information.requestConsentInfoUpdate(this.this$0.activity, new b5.b(aVar2), new androidx.camera.core.impl.e(3, aVar), new androidx.camera.camera2.interop.f(5, lVar));
    }
}

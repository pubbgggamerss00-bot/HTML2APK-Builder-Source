package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ConsentBackend {
    boolean getCanRequestAds();

    String getConsentStatus();

    String getPrivacyOptionsStatus();

    void privacyForm(p5.l<? super String, d5.j> lVar);

    void requiredForm(p5.l<? super String, d5.j> lVar);

    void reset();

    void update(p5.a<d5.j> aVar, p5.l<? super String, d5.j> lVar);
}

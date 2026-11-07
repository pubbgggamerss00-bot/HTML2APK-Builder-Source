package com.htmltoapk.template;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConsentFlow {
    private final ConsentBackend backend;
    private boolean blockForRequiredForm;
    private final p5.l<ConsentSnapshot, d5.j> changed;
    private int generation;
    private int phase;
    private volatile ConsentSnapshot snapshot;
    private boolean updateInvoked;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Phase {
        public static final int COMPLETE = 4;
        public static final int DESTROYED = 5;
        public static final int FORM = 2;
        public static final int IDLE = 0;
        public static final Phase INSTANCE = new Phase();
        public static final int OPTIONS = 3;
        public static final int UPDATING = 1;

        private Phase() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentFlow(ConsentBackend consentBackend, p5.l<? super ConsentSnapshot, d5.j> lVar) {
        kotlin.jvm.internal.j.e("backend", consentBackend);
        kotlin.jvm.internal.j.e("changed", lVar);
        this.backend = consentBackend;
        this.changed = lVar;
        this.snapshot = new ConsentSnapshot(false, null, null, false, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j privacyOptions$lambda$3(ConsentFlow consentFlow, int i6, p5.l lVar, String str) {
        if (consentFlow.generation == i6 && consentFlow.phase == 3) {
            consentFlow.phase = 4;
            consentFlow.publish(str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str);
            lVar.invoke(str);
        }
        return d5.j.f12745a;
    }

    private final void publish(String str) {
        int i6;
        boolean z6;
        String str2;
        boolean z7;
        int i7;
        int i8;
        boolean z8 = (!this.updateInvoked || (i8 = this.phase) == 0 || i8 == 5) ? false : true;
        if (!z8 || (((i7 = this.phase) == 2 && this.blockForRequiredForm) || i7 == 3 || !this.backend.getCanRequestAds())) {
            i6 = 3;
            z6 = false;
        } else {
            i6 = 3;
            z6 = true;
        }
        String consentStatus = z8 ? this.backend.getConsentStatus() : "UNKNOWN";
        String privacyOptionsStatus = z8 ? this.backend.getPrivacyOptionsStatus() : "UNKNOWN";
        int i9 = this.phase;
        if (i9 == 1 || i9 == 2 || i9 == i6) {
            str2 = privacyOptionsStatus;
            z7 = true;
        } else {
            str2 = privacyOptionsStatus;
            z7 = false;
        }
        ConsentSnapshot consentSnapshot = new ConsentSnapshot(z6, consentStatus, str2, z7, str);
        if (consentSnapshot.equals(this.snapshot)) {
            return;
        }
        this.snapshot = consentSnapshot;
        this.changed.invoke(consentSnapshot);
    }

    public static /* synthetic */ void publish$default(ConsentFlow consentFlow, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        consentFlow.publish(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j start$lambda$1(final ConsentFlow consentFlow, final int i6) {
        int i7 = consentFlow.generation;
        d5.j jVar = d5.j.f12745a;
        if (i7 == i6 && consentFlow.phase == 1) {
            consentFlow.updateInvoked = true;
            consentFlow.blockForRequiredForm = kotlin.jvm.internal.j.a(consentFlow.backend.getConsentStatus(), "REQUIRED") || !consentFlow.backend.getCanRequestAds();
            consentFlow.phase = 2;
            publish$default(consentFlow, null, 1, null);
            try {
                consentFlow.backend.requiredForm(new p5.l() { // from class: com.htmltoapk.template.m0
                    @Override // p5.l
                    public final Object invoke(Object obj) {
                        return ConsentFlow.start$lambda$1$lambda$0(this.s, i6, (String) obj);
                    }
                });
                return jVar;
            } catch (Exception unused) {
                if (consentFlow.generation == i6 && consentFlow.phase == 2) {
                    consentFlow.phase = 4;
                    consentFlow.publish("consent_form_failed");
                }
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j start$lambda$1$lambda$0(ConsentFlow consentFlow, int i6, String str) {
        if (consentFlow.generation == i6 && consentFlow.phase == 2) {
            consentFlow.phase = 4;
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            consentFlow.publish(str);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j start$lambda$2(ConsentFlow consentFlow, int i6, String str) {
        kotlin.jvm.internal.j.e("error", str);
        if (consentFlow.generation == i6 && consentFlow.phase == 1) {
            consentFlow.updateInvoked = true;
            consentFlow.phase = 4;
            consentFlow.publish(str);
        }
        return d5.j.f12745a;
    }

    public final void destroy() {
        this.generation++;
        this.phase = 5;
        this.snapshot = new ConsentSnapshot(false, null, null, false, "activity_destroyed", 15, null);
    }

    public final ConsentSnapshot getSnapshot() {
        return this.snapshot;
    }

    public final void privacyOptions(p5.l<? super String, d5.j> lVar) {
        kotlin.jvm.internal.j.e("done", lVar);
        int i6 = this.phase;
        if (i6 == 5) {
            lVar.invoke("activity_destroyed");
            return;
        }
        if (i6 != 4) {
            lVar.invoke("consent_in_progress");
            return;
        }
        if (!this.snapshot.getPrivacyOptionsRequired()) {
            lVar.invoke("privacy_options_not_required");
            return;
        }
        int i7 = this.generation + 1;
        this.generation = i7;
        this.phase = 3;
        publish$default(this, null, 1, null);
        try {
            this.backend.privacyForm(new j0(i7, 0, this, lVar));
        } catch (Exception unused) {
            this.phase = 4;
            publish("privacy_options_failed");
            lVar.invoke("privacy_options_failed");
        }
    }

    public final ConsentSnapshot refresh() {
        if (this.phase != 5) {
            publish(this.snapshot.getError());
        }
        return this.snapshot;
    }

    public final boolean reset() {
        if (this.phase != 4) {
            return false;
        }
        this.backend.reset();
        this.phase = 0;
        this.updateInvoked = false;
        this.generation++;
        publish$default(this, null, 1, null);
        start();
        return true;
    }

    public final void start() {
        if (this.phase != 0) {
            return;
        }
        this.phase = 1;
        final int i6 = this.generation + 1;
        this.generation = i6;
        publish$default(this, null, 1, null);
        try {
            this.backend.update(new p5.a() { // from class: com.htmltoapk.template.k0
                @Override // p5.a
                public final Object a() {
                    return ConsentFlow.start$lambda$1(this.s, i6);
                }
            }, new p5.l() { // from class: com.htmltoapk.template.l0
                @Override // p5.l
                public final Object invoke(Object obj) {
                    return ConsentFlow.start$lambda$2(this.s, i6, (String) obj);
                }
            });
            this.updateInvoked = true;
            if (this.generation == i6 && this.phase == 1) {
                publish$default(this, null, 1, null);
            }
        } catch (Exception unused) {
            if (this.generation == i6 && this.phase == 1) {
                this.phase = 4;
                publish("consent_update_failed");
            }
        }
    }
}

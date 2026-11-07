package com.htmltoapk.template;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConsentSnapshot {
    private final boolean canRequestAds;
    private final String consentStatus;
    private final String error;
    private final boolean inProgress;
    private final String privacyOptionsStatus;

    public ConsentSnapshot() {
        this(false, null, null, false, null, 31, null);
    }

    public static /* synthetic */ ConsentSnapshot copy$default(ConsentSnapshot consentSnapshot, boolean z6, String str, String str2, boolean z7, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = consentSnapshot.canRequestAds;
        }
        if ((i6 & 2) != 0) {
            str = consentSnapshot.consentStatus;
        }
        if ((i6 & 4) != 0) {
            str2 = consentSnapshot.privacyOptionsStatus;
        }
        if ((i6 & 8) != 0) {
            z7 = consentSnapshot.inProgress;
        }
        if ((i6 & 16) != 0) {
            str3 = consentSnapshot.error;
        }
        String str4 = str3;
        String str5 = str2;
        return consentSnapshot.copy(z6, str, str5, z7, str4);
    }

    public final boolean component1() {
        return this.canRequestAds;
    }

    public final String component2() {
        return this.consentStatus;
    }

    public final String component3() {
        return this.privacyOptionsStatus;
    }

    public final boolean component4() {
        return this.inProgress;
    }

    public final String component5() {
        return this.error;
    }

    public final ConsentSnapshot copy(boolean z6, String str, String str2, boolean z7, String str3) {
        kotlin.jvm.internal.j.e("consentStatus", str);
        kotlin.jvm.internal.j.e("privacyOptionsStatus", str2);
        kotlin.jvm.internal.j.e("error", str3);
        return new ConsentSnapshot(z6, str, str2, z7, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentSnapshot)) {
            return false;
        }
        ConsentSnapshot consentSnapshot = (ConsentSnapshot) obj;
        return this.canRequestAds == consentSnapshot.canRequestAds && kotlin.jvm.internal.j.a(this.consentStatus, consentSnapshot.consentStatus) && kotlin.jvm.internal.j.a(this.privacyOptionsStatus, consentSnapshot.privacyOptionsStatus) && this.inProgress == consentSnapshot.inProgress && kotlin.jvm.internal.j.a(this.error, consentSnapshot.error);
    }

    public final boolean getCanRequestAds() {
        return this.canRequestAds;
    }

    public final String getConsentStatus() {
        return this.consentStatus;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final boolean getPrivacyOptionsRequired() {
        return kotlin.jvm.internal.j.a(this.privacyOptionsStatus, "REQUIRED");
    }

    public final String getPrivacyOptionsStatus() {
        return this.privacyOptionsStatus;
    }

    public int hashCode() {
        return this.error.hashCode() + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(androidx.camera.view.g.d(Boolean.hashCode(this.canRequestAds) * 31, 31, this.consentStatus), 31, this.privacyOptionsStatus), 31, this.inProgress);
    }

    public String toString() {
        boolean z6 = this.canRequestAds;
        String str = this.consentStatus;
        String str2 = this.privacyOptionsStatus;
        boolean z7 = this.inProgress;
        String str3 = this.error;
        StringBuilder sb = new StringBuilder("ConsentSnapshot(canRequestAds=");
        sb.append(z6);
        sb.append(", consentStatus=");
        sb.append(str);
        sb.append(", privacyOptionsStatus=");
        sb.append(str2);
        sb.append(", inProgress=");
        sb.append(z7);
        sb.append(", error=");
        return androidx.activity.m.e(sb, str3, ")");
    }

    public ConsentSnapshot(boolean z6, String str, String str2, boolean z7, String str3) {
        kotlin.jvm.internal.j.e("consentStatus", str);
        kotlin.jvm.internal.j.e("privacyOptionsStatus", str2);
        kotlin.jvm.internal.j.e("error", str3);
        this.canRequestAds = z6;
        this.consentStatus = str;
        this.privacyOptionsStatus = str2;
        this.inProgress = z7;
        this.error = str3;
    }

    public /* synthetic */ ConsentSnapshot(boolean z6, String str, String str2, boolean z7, String str3, int i6, kotlin.jvm.internal.f fVar) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? "UNKNOWN" : str, (i6 & 4) != 0 ? "UNKNOWN" : str2, (i6 & 8) != 0 ? false : z7, (i6 & 16) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3);
    }
}

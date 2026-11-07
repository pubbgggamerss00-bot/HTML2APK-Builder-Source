package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import b5.b;
import com.google.android.gms.internal.ads.r90;
import com.google.android.ump.ConsentInformation;
import java.util.HashSet;
import java.util.Queue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t3 implements ConsentInformation {

    /* renamed from: a, reason: collision with root package name */
    public final j f11896a;

    /* renamed from: b, reason: collision with root package name */
    public final c9 f11897b;

    /* renamed from: c, reason: collision with root package name */
    public final r f11898c;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f11901f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11899d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final Object f11900e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f11902g = false;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public b5.b f11903i = new b5.b(new b.a());

    public t3(j jVar, c9 c9Var, r rVar, g0 g0Var) {
        this.f11896a = jVar;
        this.f11897b = c9Var;
        this.f11898c = rVar;
        this.f11901f = g0Var;
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f11899d) {
            z6 = this.f11902g;
        }
        return z6;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        j jVar = this.f11896a;
        if (!jVar.f11784b.getBoolean("is_pub_misconfigured", false)) {
            int i6 = !a() ? 0 : jVar.f11784b.getInt("consent_status", 0);
            if (i6 != 1 && i6 != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (a()) {
            return this.f11896a.f11784b.getInt("consent_status", 0);
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final ConsentInformation.c getPrivacyOptionsRequirementStatus() {
        return !a() ? ConsentInformation.c.s : ConsentInformation.c.valueOf(this.f11896a.f11784b.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.f11898c.f11874c.get() != null;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, b5.b bVar, ConsentInformation.b bVar2, ConsentInformation.a aVar) {
        synchronized (this.f11899d) {
            this.f11902g = true;
        }
        this.f11903i = bVar;
        ((Queue) this.f11901f.f11751f.get()).add(Long.valueOf(System.currentTimeMillis()));
        c9 c9Var = this.f11897b;
        c9Var.getClass();
        c9Var.f11664c.execute(new r90(c9Var, activity, bVar, bVar2, aVar));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.f11898c.f11874c.set(null);
        j jVar = this.f11896a;
        Application application = jVar.f11783a;
        HashSet hashSet = jVar.f11785c;
        j0.b(application, hashSet);
        hashSet.clear();
        jVar.f11784b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
        synchronized (this.f11899d) {
            this.f11902g = false;
        }
    }
}

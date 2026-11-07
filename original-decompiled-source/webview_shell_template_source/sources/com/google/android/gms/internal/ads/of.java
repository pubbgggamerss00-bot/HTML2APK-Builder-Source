package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7739b;

    public /* synthetic */ of(int i6, Object obj) {
        this.f7738a = i6;
        this.f7739b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7738a) {
            case 0:
                Context context = (Context) this.f7739b;
                try {
                    return ed0.h(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                ContentResolver contentResolver = (ContentResolver) this.f7739b;
                return new p51(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 2:
                Context context2 = ((x61) this.f7739b).f10392a;
                zzv.zzq();
                boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.U5)).booleanValue();
                String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                String string2 = !zBooleanValue ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : context2.getSharedPreferences("mobileads_consent", 0).getString("consent_string", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                if (((Boolean) zzbe.zzc().a(zn.W5)).booleanValue()) {
                    string = context2.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                zzv.zzq();
                Bundle bundle = null;
                if (((Boolean) zzbe.zzc().a(zn.V5)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i6 = 0; i6 < 4; i6++) {
                        String str = strArr[i6];
                        if (defaultSharedPreferences.contains(str)) {
                            bundle2.putString(str, defaultSharedPreferences.getString(str, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new w61(string2, bundle, string);
            default:
                Context context3 = ((hi1) this.f7739b).f5416a;
                return ed0.h(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
        }
    }
}

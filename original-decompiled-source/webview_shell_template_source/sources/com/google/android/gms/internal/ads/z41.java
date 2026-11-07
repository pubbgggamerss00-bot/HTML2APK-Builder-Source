package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z41 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final ec1 f11172a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11173b;

    public z41(ec1 ec1Var, long j6) {
        this.f11172a = ec1Var;
        this.f11173b = j6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        ec1 ec1Var = this.f11172a;
        zzm zzmVar = ec1Var.f4209d;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", ec1Var.f4211f);
        int i6 = ec1Var.f4219o.f2239a;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i6 - 1;
        if (i7 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i7 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f11173b);
        lc1.f(bundle, "is_sdk_preload", true, zzmVar.zzb());
        lc1.e(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzmVar.zzb)), zzmVar.zzb != -1);
        Bundle bundle2 = zzmVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i8 = zzmVar.zzd;
        lc1.d(bundle, "cust_gender", i8, i8 != -1);
        lc1.c(bundle, "kw", zzmVar.zze);
        int i9 = zzmVar.zzg;
        lc1.d(bundle, "tag_for_child_directed_treatment", i9, i9 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        lc1.d(bundle, "d_imp_hdr", 1, zzmVar.zza >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        lc1.e(bundle, "ppid", str, zzmVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        lc1.b("url", bundle, zzmVar.zzl);
        lc1.c(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle4 = zzmVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        lc1.c(bundle, "category_exclusions", zzmVar.zzo);
        lc1.b("request_agent", bundle, zzmVar.zzp);
        lc1.b("request_pkg", bundle, zzmVar.zzq);
        lc1.f(bundle, "is_designed_for_families", zzmVar.zzr, zzmVar.zza >= 7);
        if (zzmVar.zza >= 8) {
            int i10 = zzmVar.zzt;
            lc1.d(bundle, "tag_for_under_age_of_consent", i10, i10 != -1);
            lc1.b("max_ad_content_rating", bundle, zzmVar.zzu);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void zza(Object obj) {
        Bundle bundle = ((ck0) obj).f3611b;
        ec1 ec1Var = this.f11172a;
        bundle.putString("slotname", ec1Var.f4211f);
        zzm zzmVar = ec1Var.f4209d;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i6 = zzmVar.zzg;
        lc1.d(bundle, "tag_for_child_directed_treatment", i6, i6 != -1);
        if (zzmVar.zza >= 8) {
            int i7 = zzmVar.zzt;
            lc1.d(bundle, "tag_for_under_age_of_consent", i7, i7 != -1);
        }
        lc1.b("url", bundle, zzmVar.zzl);
        lc1.c(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = (Bundle) zzmVar.zzc.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) zzbe.zzc().a(zn.s7)).split(",", -1)));
        for (String str : zzmVar.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
    }
}

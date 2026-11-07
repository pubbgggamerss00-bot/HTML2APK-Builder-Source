package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzm;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e21 implements yz0 {
    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        return !TextUtils.isEmpty(tb1Var.f9210v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        JSONObject jSONObject = tb1Var.f9210v;
        JSONObject jSONObject2 = tb1Var.D;
        l40 l40Var = tb1Var.f9192l;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        dc1 dc1Var = new dc1();
        dc1Var.f3842o.f10916a = ec1Var.f4219o.f2239a;
        zzm zzmVar = ec1Var.f4209d;
        dc1Var.f3829a = zzmVar;
        dc1Var.f3830b = ec1Var.f4210e;
        dc1Var.f3847u = ec1Var.f4223t;
        dc1Var.f3831c = ec1Var.f4211f;
        dc1Var.f3832d = ec1Var.f4206a;
        dc1Var.f3834f = ec1Var.f4212g;
        dc1Var.f3835g = ec1Var.h;
        dc1Var.h = ec1Var.f4213i;
        dc1Var.f3836i = ec1Var.f4214j;
        AdManagerAdViewOptions adManagerAdViewOptions = ec1Var.f4216l;
        dc1Var.f3837j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            dc1Var.f3833e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        PublisherAdViewOptions publisherAdViewOptions = ec1Var.f4217m;
        dc1Var.f3838k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            dc1Var.f3833e = publisherAdViewOptions.zzc();
            dc1Var.f3839l = publisherAdViewOptions.zza();
        }
        dc1Var.f3843p = ec1Var.f4220p;
        dc1Var.f3844q = ec1Var.f4221q;
        dc1Var.f3845r = ec1Var.f4208c;
        dc1Var.s = ec1Var.f4222r;
        dc1Var.f3846t = ec1Var.s;
        dc1Var.f3831c = strOptString;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        dc1Var.f3829a = new zzm(zzmVar.zza, zzmVar.zzb, bundle4, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundle2, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz);
        ec1 ec1VarA = dc1Var.a();
        Bundle bundle5 = new Bundle();
        vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(vb1Var.f9773a));
        bundle6.putInt("refresh_interval", vb1Var.f9775c);
        bundle6.putString("gws_query_id", vb1Var.f9774b);
        bundle5.putBundle("parent_common_config", bundle6);
        ec1 ec1Var2 = (ec1) ac1Var.f2647a.f9702t;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", ec1Var2.f4211f);
        bundle7.putString("allocation_id", tb1Var.f9212w);
        bundle7.putString("ad_source_name", tb1Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(tb1Var.f9175c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(tb1Var.f9177d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(tb1Var.f9200p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(tb1Var.f9194m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(tb1Var.f9183g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(tb1Var.h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(tb1Var.f9186i));
        bundle7.putString("transaction_id", tb1Var.f9188j);
        bundle7.putString("valid_from_timestamp", tb1Var.f9190k);
        bundle7.putBoolean("is_closable_area_disabled", tb1Var.P);
        bundle7.putString("recursive_server_response_data", tb1Var.f9199o0);
        bundle7.putBoolean("is_analytics_logging_enabled", tb1Var.W);
        if (l40Var != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", l40Var.f6572t);
            bundle8.putString("rb_type", l40Var.s);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(ec1VarA, bundle5, tb1Var, ac1Var);
    }

    public abstract vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var);
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class et implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4382t;

    public /* synthetic */ et(int i6, Object obj) {
        this.s = i6;
        this.f4382t = obj;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        switch (this.s) {
            case 0:
                ft ftVar = (ft) this.f4382t;
                if (ftVar != null) {
                    String str = (String) map.get("name");
                    if (str == null) {
                        zzo.zzi("Ad metadata with no name parameter.");
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    Bundle bundleZza = null;
                    if (map.containsKey("info")) {
                        try {
                            bundleZza = zzbs.zza(new JSONObject((String) map.get("info")));
                        } catch (JSONException e6) {
                            zzo.zzh("Failed to convert ad metadata to JSON.", e6);
                        }
                    }
                    if (bundleZza != null) {
                        ftVar.n(str, bundleZza);
                        break;
                    } else {
                        zzo.zzg("Failed to convert ad metadata to Bundle.");
                        break;
                    }
                }
                break;
            default:
                bq0 bq0Var = (bq0) this.f4382t;
                zzo.zzi("Showing native ads overlay.");
                ((xa0) obj).zzF().setVisibility(0);
                bq0Var.f3253c.f8926x = true;
                break;
        }
    }
}

package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.hq;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CsiUrlBuilder {
    private final String zza;

    public CsiUrlBuilder() {
        fq fqVar = (fq) hq.f5455a.get();
        String strA = "https://csi.gstatic.com/csi";
        if (fqVar != null) {
            strA = fqVar.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        } else if (hq.a() != null) {
            hq.a().zza();
        }
        this.zza = strA;
    }

    public String generateUrl(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.zn;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbk {
    public final String zza;
    public String zzb;
    public r30 zzd;
    public Bundle zze;
    private long zzg;
    private long zzh;
    public String zzc = null;
    public Bundle zzf = new Bundle();

    public zzbk(JsonReader jsonReader, r30 r30Var) throws IOException {
        Bundle bundle;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = r30Var;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.zzg = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.zzh = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11424k2)).booleanValue() || r30Var == null || (bundle = r30Var.E) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.zzg);
        bundle.putLong("get-signals-sdkcore-end", this.zzh);
    }
}

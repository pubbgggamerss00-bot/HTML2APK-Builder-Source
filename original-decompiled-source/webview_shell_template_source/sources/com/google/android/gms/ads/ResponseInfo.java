package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final zzdy zza;
    private final List zzb = new ArrayList();
    private AdapterResponseInfo zzc;

    private ResponseInfo(zzdy zzdyVar) {
        this.zza = zzdyVar;
        if (zzdyVar != null) {
            try {
                List listZzj = zzdyVar.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza((zzw) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.zzb.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (RemoteException e6) {
                zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e6);
            }
        }
        zzdy zzdyVar2 = this.zza;
        if (zzdyVar2 == null) {
            return;
        }
        try {
            zzw zzwVarZzf = zzdyVar2.zzf();
            if (zzwVarZzf != null) {
                this.zzc = AdapterResponseInfo.zza(zzwVarZzf);
            }
        } catch (RemoteException e7) {
            zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e7);
        }
    }

    public static ResponseInfo zza(zzdy zzdyVar) {
        if (zzdyVar != null) {
            return new ResponseInfo(zzdyVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdy zzdyVar) {
        return new ResponseInfo(zzdyVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zzg();
            }
            return null;
        } catch (RemoteException e6) {
            zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e6);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zze();
            }
        } catch (RemoteException e6) {
            zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e6);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zzi();
            }
            return null;
        } catch (RemoteException e6) {
            zzo.zzh("Could not forward getResponseId to ResponseInfo.", e6);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzdy zzc() {
        return this.zza;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzbc.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zt0;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzv {
    private final fu0 zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.K6)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.L6)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.P6)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.O6)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new f(this));

    public zzv(fu0 fu0Var) {
        this.zzh = fu0Var;
    }

    private final synchronized void zzi(final zt0 zt0Var) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            i70.f5586a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.zze(zt0Var, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzj(zt0 zt0Var, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zt0Var.f11575a);
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.b(this.zzi, false);
        }
    }

    private final synchronized void zzk() {
        long jA = com.google.android.gms.ads.internal.zzv.zzC().a();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("QueryJsonMap.removeExpiredEntries", e6);
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zt0 zt0Var) {
        zzu zzuVar = (zzu) this.zze.get(str);
        zt0Var.f11575a.put("request_id", str);
        if (zzuVar == null) {
            zt0Var.f11575a.put("mhit", "false");
            return null;
        }
        zt0Var.f11575a.put("mhit", "true");
        return zzuVar.zzb;
    }

    public final synchronized void zzd(String str, String str2, zt0 zt0Var) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()), str2, new HashSet()));
        zzk();
        zzi(zt0Var);
    }

    public final /* synthetic */ void zze(zt0 zt0Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        zzj(zt0Var, arrayDeque, "to");
        zzj(zt0Var, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i6) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar == null) {
            return false;
        }
        zzuVar.zzc.add(str2);
        return zzuVar.zzc.size() < i6;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar != null) {
            if (zzuVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}

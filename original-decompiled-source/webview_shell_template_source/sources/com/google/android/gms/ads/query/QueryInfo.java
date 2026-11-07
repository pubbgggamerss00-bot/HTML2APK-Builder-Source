package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.g20;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.zn;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzfa zza;

    public QueryInfo(zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzm zzmVarZza;
        zn.a(context);
        if (((Boolean) pp.f8123j.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm zzmVarZza2;
                        AdRequest adRequest2 = adRequest;
                        zzei zzeiVarZza = adRequest2 == null ? null : adRequest2.zza();
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        h20 h20Var = new h20(context, adFormat, zzeiVarZza, str);
                        zzei zzeiVar = (zzei) h20Var.f5218v;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Context context2 = (Context) h20Var.f5216t;
                        l60 l60VarA = h20.a(context2);
                        if (l60VarA == null) {
                            queryInfoGenerationCallback2.onFailure("Internal Error, query info generator is null.");
                            return;
                        }
                        b bVar = new b(context2);
                        if (zzeiVar == null) {
                            zzn zznVar = new zzn();
                            zznVar.zzg(jCurrentTimeMillis);
                            zzmVarZza2 = zznVar.zza();
                        } else {
                            zzeiVar.zzq(jCurrentTimeMillis);
                            zzmVarZza2 = zzr.zza.zza(context2, zzeiVar);
                        }
                        try {
                            l60VarA.zzf(bVar, new p60((String) h20Var.s, ((AdFormat) h20Var.f5217u).name(), null, zzmVarZza2, 0, null), new g20(queryInfoGenerationCallback2));
                        } catch (RemoteException unused) {
                            queryInfoGenerationCallback2.onFailure("Internal Error.");
                        }
                    }
                });
                return;
            }
        }
        zzei zzeiVarZza = adRequest == null ? null : adRequest.zza();
        long jCurrentTimeMillis = System.currentTimeMillis();
        l60 l60VarA = h20.a(context);
        if (l60VarA == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        b bVar = new b(context);
        if (zzeiVarZza == null) {
            zzn zznVar = new zzn();
            zznVar.zzg(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzeiVarZza.zzq(jCurrentTimeMillis);
            zzmVarZza = zzr.zza.zza(context, zzeiVarZza);
        }
        try {
            l60VarA.zzf(bVar, new p60(str, adFormat.name(), null, zzmVarZza, 0, null), new g20(queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        l.g("AdUnitId cannot be null.", str);
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}

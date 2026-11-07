package com.google.android.gms.ads.query;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.j20;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.n20;
import com.google.android.gms.internal.ads.o20;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final o20 zza;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Deprecated
    public static final class Builder {
        private final n20 zza;

        @Deprecated
        public Builder(View view) {
            n20 n20Var = new n20();
            this.zza = n20Var;
            n20Var.f7295a = view;
        }

        @Deprecated
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @Deprecated
        public Builder setAssetViews(Map<String, View> map) {
            HashMap map2 = this.zza.f7296b;
            map2.clear();
            for (Map.Entry<String, View> entry : map.entrySet()) {
                View value = entry.getValue();
                if (value != null) {
                    map2.put(entry.getKey(), new WeakReference(value));
                }
            }
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new o20(builder.zza);
    }

    @Deprecated
    public void recordClick(List<Uri> list) {
        o20 o20Var = this.zza;
        l60 l60Var = o20Var.f7581b;
        if (list == null || list.isEmpty()) {
            zzo.zzj("No click urls were passed to recordClick");
            return;
        }
        if (l60Var == null) {
            zzo.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            l60Var.zzh(list, new b(o20Var.f7580a), new l20(list));
        } catch (RemoteException e6) {
            zzo.zzg("RemoteException recording click: ".concat(e6.toString()));
        }
    }

    @Deprecated
    public void recordImpression(List<Uri> list) {
        o20 o20Var = this.zza;
        o20Var.getClass();
        if (list == null || list.isEmpty()) {
            zzo.zzj("No impression urls were passed to recordImpression");
            return;
        }
        l60 l60Var = o20Var.f7581b;
        if (l60Var == null) {
            zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            l60Var.zzi(list, new b(o20Var.f7580a), new k20(list));
        } catch (RemoteException e6) {
            zzo.zzg("RemoteException recording impression urls: ".concat(e6.toString()));
        }
    }

    @Deprecated
    public void reportTouchEvent(MotionEvent motionEvent) {
        l60 l60Var = this.zza.f7581b;
        if (l60Var == null) {
            zzo.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            l60Var.zzk(new b(motionEvent));
        } catch (RemoteException unused) {
            zzo.zzg("Failed to call remote method.");
        }
    }

    @Deprecated
    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        o20 o20Var = this.zza;
        l60 l60Var = o20Var.f7581b;
        if (l60Var == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            l60Var.zzl(new ArrayList(Arrays.asList(uri)), new b(o20Var.f7580a), new j20(updateClickUrlCallback));
        } catch (RemoteException e6) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e6.toString()));
        }
    }

    @Deprecated
    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        o20 o20Var = this.zza;
        l60 l60Var = o20Var.f7581b;
        if (l60Var == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            l60Var.zzm(list, new b(o20Var.f7580a), new i20(updateImpressionUrlsCallback));
        } catch (RemoteException e6) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e6.toString()));
        }
    }
}

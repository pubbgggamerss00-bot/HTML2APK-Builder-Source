package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.mf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzu f2322a;

    public /* synthetic */ d(zzu zzuVar) {
        this.f2322a = zzuVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzu zzuVar = this.f2322a;
        try {
            zzuVar.zzh = (mf) zzuVar.zzc.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            e = e6;
            zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (ExecutionException e7) {
            e = e7;
            zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (TimeoutException e8) {
            zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
        }
        return zzuVar.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzu zzuVar = this.f2322a;
        if (zzuVar.zzf == null || str == null) {
            return;
        }
        zzuVar.zzf.loadUrl(str);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qw implements nw, mw {
    public final xa0 s;

    public qw(Context context, VersionInfoParcel versionInfoParcel) {
        zzv.zzA();
        xa0 xa0VarA = ib0.a(context, new cc0(0, 0, 0), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, versionInfoParcel, null, null, new kk(), null, null, null, null);
        this.s = xa0VarA;
        xa0VarA.zzF().setWillNotDraw(true);
    }

    public static final void f(Runnable runnable) {
        zzbc.zzb();
        if (zzf.zzu()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (zzs.zza.post(runnable)) {
                return;
            }
            zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void G(String str, Map map) {
        try {
            j(str, zzbc.zzb().zzj((HashMap) map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void M(String str, yt ytVar) {
        this.s.Z(str, new pw(this, ytVar));
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void Q(String str, yt ytVar) {
        this.s.y(str, new l2(5, ytVar));
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void a(String str, String str2) {
        zza(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
        fo.i(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void l0(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        f(new ow(0, this, str));
    }

    @Override // com.google.android.gms.internal.ads.nw
    public final void zzc() {
        this.s.destroy();
    }

    @Override // com.google.android.gms.internal.ads.nw
    public final boolean zzi() {
        return this.s.o();
    }

    @Override // com.google.android.gms.internal.ads.nw
    public final ex zzj() {
        return new ex(this);
    }
}

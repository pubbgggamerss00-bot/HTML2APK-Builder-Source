package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ex implements mw, dx {
    public final qw s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f4412t = new HashSet();

    public ex(qw qwVar) {
        this.s = qwVar;
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
        this.s.M(str, ytVar);
        this.f4412t.add(new AbstractMap.SimpleEntry(str, ytVar));
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void Q(String str, yt ytVar) {
        this.s.Q(str, ytVar);
        this.f4412t.remove(new AbstractMap.SimpleEntry(str, ytVar));
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

    @Override // com.google.android.gms.internal.ads.mw, com.google.android.gms.internal.ads.rw
    public final void zza(String str) {
        this.s.zza(str);
    }
}

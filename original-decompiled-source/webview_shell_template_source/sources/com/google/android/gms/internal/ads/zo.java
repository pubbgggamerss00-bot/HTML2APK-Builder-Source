package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zo extends QueryInfoGenerationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap f11529b;

    public zo(ap apVar, String str) {
        this.f11528a = str;
        this.f11529b = apVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            ap apVar = this.f11529b;
            apVar.f2812g.a(apVar.a(this.f11528a, str).toString());
        } catch (JSONException e6) {
            zzo.zzh("Error creating PACT Error Response JSON: ", e6);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            ap apVar = this.f11529b;
            apVar.f2812g.a(apVar.b(this.f11528a, query).toString());
        } catch (JSONException e6) {
            zzo.zzh("Error creating PACT Signal Response JSON: ", e6);
        }
    }
}

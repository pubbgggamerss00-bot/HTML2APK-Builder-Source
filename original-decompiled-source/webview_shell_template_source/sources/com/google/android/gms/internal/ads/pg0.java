package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pg0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8061a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8062b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8063c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f8064d;

    public pg0(bd0 bd0Var, w92 w92Var, x92 x92Var) {
        this.f8063c = bd0Var;
        this.f8062b = w92Var;
        this.f8064d = x92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f8061a) {
            case 0:
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f8063c).a();
                JSONObject jSONObject = (JSONObject) this.f8062b.zzb();
                String str = (String) this.f8064d.zzb();
                boolean zEquals = "native".equals(str);
                zzv.zzq();
                return new xh(UUID.randomUUID().toString(), versionInfoParcelA, str, jSONObject, zEquals);
            case 1:
                return new wj0((Context) this.f8062b.zzb(), ((bd0) this.f8063c).a(), ((lk0) this.f8064d).a(), 0);
            default:
                return new wt0((zt0) this.f8063c.zzb(), (fu0) this.f8064d.zzb(), ((Integer) this.f8062b.zzb()).intValue());
        }
    }

    public pg0(w92 w92Var, bd0 bd0Var, lk0 lk0Var) {
        this.f8062b = w92Var;
        this.f8063c = bd0Var;
        this.f8064d = lk0Var;
    }

    public pg0(w92 w92Var, w92 w92Var2, w92 w92Var3) {
        this.f8063c = w92Var;
        this.f8064d = w92Var2;
        this.f8062b = w92Var3;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11181a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11183c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11184d;

    /* renamed from: e, reason: collision with root package name */
    public final zzg f11185e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11186f;

    /* renamed from: g, reason: collision with root package name */
    public final mj0 f11187g;

    public z51(Context context, Bundle bundle, String str, String str2, zzj zzjVar, String str3, mj0 mj0Var) {
        this.f11181a = context;
        this.f11182b = bundle;
        this.f11183c = str;
        this.f11184d = str2;
        this.f11185e = zzjVar;
        this.f11186f = str3;
        this.f11187g = mj0Var;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        bundle.putBundle("quality_signals", this.f11182b);
        bundle.putString("seq_num", this.f11183c);
        if (!this.f11185e.zzN()) {
            bundle.putString("session_id", this.f11184d);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzN());
        b(bundle);
        String str = this.f11186f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            mj0 mj0Var = this.f11187g;
            Long l4 = (Long) mj0Var.f7166d.get(str);
            bundle2.putLong("dload", l4 == null ? -1L : l4.longValue());
            Integer num = (Integer) mj0Var.f7164b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) zzbe.zzc().a(zn.D9)).booleanValue() || zzv.zzp().f2955k.get() <= 0) {
            return;
        }
        bundle.putInt("nrwv", zzv.zzp().f2955k.get());
    }

    public final void b(Bundle bundle) {
        if (((Boolean) zzbe.zzc().a(zn.A5)).booleanValue()) {
            try {
                zzv.zzq();
                bundle.putString("_app_id", zzs.zzq(this.f11181a));
            } catch (RemoteException | RuntimeException e6) {
                zzv.zzp().h("AppStatsSignal_AppId", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ck0 ck0Var = (ck0) obj;
        ck0Var.f3611b.putBundle("quality_signals", this.f11182b);
        b(ck0Var.f3611b);
    }
}

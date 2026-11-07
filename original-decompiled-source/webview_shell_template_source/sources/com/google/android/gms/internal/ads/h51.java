package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final zzs f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5260b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5261c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5262d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5263e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5264f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5265g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5266i;

    public h51(zzs zzsVar, String str, boolean z6, String str2, float f6, int i6, int i7, String str3, boolean z7) {
        com.google.android.gms.common.internal.l.g("the adSize must not be null", zzsVar);
        this.f5259a = zzsVar;
        this.f5260b = str;
        this.f5261c = z6;
        this.f5262d = str2;
        this.f5263e = f6;
        this.f5264f = i6;
        this.f5265g = i7;
        this.h = str3;
        this.f5266i = z7;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void a(Object obj) {
        b(((ck0) obj).f3610a);
    }

    public final void b(Bundle bundle) {
        zzs zzsVar = this.f5259a;
        lc1.e(bundle, "smart_w", "full", zzsVar.zze == -1);
        lc1.e(bundle, "smart_h", "auto", zzsVar.zzb == -2);
        lc1.f(bundle, "ene", true, zzsVar.zzj);
        lc1.e(bundle, "rafmt", "102", zzsVar.zzm);
        lc1.e(bundle, "rafmt", "103", zzsVar.zzn);
        lc1.e(bundle, "rafmt", "105", zzsVar.zzo);
        lc1.f(bundle, "inline_adaptive_slot", true, this.f5266i);
        lc1.f(bundle, "interscroller_slot", true, zzsVar.zzo);
        lc1.b("format", bundle, this.f5260b);
        lc1.e(bundle, "fluid", "height", this.f5261c);
        lc1.e(bundle, "sz", this.f5262d, !TextUtils.isEmpty(r1));
        bundle.putFloat("u_sd", this.f5263e);
        bundle.putInt("sw", this.f5264f);
        bundle.putInt("sh", this.f5265g);
        lc1.e(bundle, "sc", this.h, !TextUtils.isEmpty(r1));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", zzsVar.zzb);
            bundle2.putInt("width", zzsVar.zze);
            bundle2.putBoolean("is_fluid_height", zzsVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzs zzsVar2 : zzsVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar2.zzi);
                bundle3.putInt("height", zzsVar2.zzb);
                bundle3.putInt("width", zzsVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        b(((ck0) obj).f3611b);
    }
}

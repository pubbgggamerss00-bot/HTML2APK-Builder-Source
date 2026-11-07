package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d91 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3802a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3803b;

    public /* synthetic */ d91(String str, int i6) {
        this.f3802a = str;
        this.f3803b = i6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ck0 ck0Var = (ck0) obj;
        if (((Boolean) zzbe.zzc().a(zn.ma)).booleanValue()) {
            String str = this.f3802a;
            if (!TextUtils.isEmpty(str)) {
                ck0Var.f3610a.putString("topics", str);
            }
            int i6 = this.f3803b;
            if (i6 != -1) {
                ck0Var.f3610a.putInt("atps", i6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}

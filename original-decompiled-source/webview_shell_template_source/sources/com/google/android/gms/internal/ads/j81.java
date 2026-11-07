package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5974c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5975d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f5976e;

    public j81(String str, String str2, String str3, String str4, Long l4) {
        this.f5972a = str;
        this.f5973b = str2;
        this.f5974c = str3;
        this.f5975d = str4;
        this.f5976e = l4;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        lc1.b("gmp_app_id", bundle, this.f5972a);
        lc1.b("fbs_aiid", bundle, this.f5973b);
        lc1.b("fbs_aeid", bundle, this.f5974c);
        lc1.b("apm_id_origin", bundle, this.f5975d);
        Long l4 = this.f5976e;
        if (l4 != null) {
            bundle.putLong("sai_timeout", l4.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        lc1.b("fbs_aeid", ((ck0) obj).f3611b, this.f5974c);
    }
}

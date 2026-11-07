package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10092a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10093b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10094c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10096e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10097f;

    public w71(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f10092a = str;
        this.f10093b = num;
        this.f10094c = str2;
        this.f10095d = str3;
        this.f10096e = str4;
        this.f10097f = str5;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        lc1.b("pn", bundle, this.f10092a);
        Integer num = this.f10093b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        lc1.b("vnm", bundle, this.f10094c);
        lc1.b("dl", bundle, this.f10095d);
        lc1.b("ins_pn", bundle, this.f10096e);
        lc1.b("ini_pn", bundle, this.f10097f);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((ck0) obj).f3611b;
        lc1.b("pn", bundle, this.f10092a);
        lc1.b("dl", bundle, this.f10095d);
    }
}

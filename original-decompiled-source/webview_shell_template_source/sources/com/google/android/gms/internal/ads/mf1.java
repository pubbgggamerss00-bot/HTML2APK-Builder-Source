package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Optional;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mf1 {

    /* renamed from: a, reason: collision with root package name */
    public final cu0 f7125a;

    public mf1(cu0 cu0Var) {
        this.f7125a = cu0Var;
    }

    public final void a(AdFormat adFormat, long j6, Optional optional, Optional optional2) {
        bu0 bu0VarA = this.f7125a.a();
        bu0VarA.a("plaac_ts", Long.toString(j6));
        bu0VarA.a("ad_format", adFormat.name());
        bu0VarA.a("action", "is_ad_available");
        optional.ifPresent(new tk1(2, bu0VarA));
        optional2.ifPresent(new kf1(0, bu0VarA));
        bu0VarA.c();
    }

    public final void b(EnumMap enumMap, long j6) {
        bu0 bu0VarA = this.f7125a.a();
        bu0VarA.a("action", "start_preload");
        bu0VarA.a("sp_ts", Long.toString(j6));
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            bu0VarA.a(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        bu0VarA.c();
    }

    public final void c(AdFormat adFormat, Optional optional, String str, long j6, Optional optional2) {
        bu0 bu0VarA = this.f7125a.a();
        bu0VarA.a(str, Long.toString(j6));
        bu0VarA.a("ad_format", adFormat == null ? "unknown" : adFormat.name());
        optional.ifPresent(new lf1(0, bu0VarA));
        optional2.ifPresent(new er0(1, bu0VarA));
        bu0VarA.c();
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cb0 implements zr1 {
    public final /* synthetic */ List s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3508t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f3509u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eb0 f3510v;

    public cb0(eb0 eb0Var, List list, String str, Uri uri) {
        this.s = list;
        this.f3508t = str;
        this.f3509u = uri;
        this.f3510v = eb0Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        String str = this.f3508t;
        this.f3510v.t((Map) obj, this.s, str);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        zzo.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.f3509u)));
    }
}

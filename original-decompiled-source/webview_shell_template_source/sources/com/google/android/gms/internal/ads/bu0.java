package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bu0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3291a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cu0 f3292b;

    public bu0(cu0 cu0Var) {
        this.f3292b = cu0Var;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f3291a.put(str, str2);
    }

    public final void b(tb1 tb1Var) {
        a("aai", tb1Var.f9212w);
        a("request_id", tb1Var.f9197n0);
        a("ad_format", tb1.a(tb1Var.f9173b));
    }

    public final void c() {
        this.f3292b.f3662b.execute(new b(15, this));
    }
}

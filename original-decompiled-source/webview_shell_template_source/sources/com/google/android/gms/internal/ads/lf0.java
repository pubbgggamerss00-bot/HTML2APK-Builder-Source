package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lf0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final sv0 f6703a;

    public lf0(sv0 sv0Var) {
        this.f6703a = sv0Var;
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6703a.e(str.equals("true"));
    }
}

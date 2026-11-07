package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hf0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final sb1 f5375a;

    public hf0(sb1 sb1Var) {
        this.f5375a = sb1Var;
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f5375a.a(Boolean.parseBoolean(str));
        } catch (Exception e6) {
            throw new IllegalStateException("Invalid render_in_browser state", e6);
        }
    }
}

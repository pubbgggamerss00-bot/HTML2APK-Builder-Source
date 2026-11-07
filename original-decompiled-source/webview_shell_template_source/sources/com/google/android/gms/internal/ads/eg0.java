package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eg0 implements yt {
    public final /* synthetic */ gg0 s;

    public eg0(gg0 gg0Var) {
        this.s = gg0Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        if (map == null) {
            return;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gg0 gg0Var = this.s;
        if (str.equals(gg0Var.f5033a)) {
            gg0Var.f5035c.execute(new cf(5, this));
        }
    }
}

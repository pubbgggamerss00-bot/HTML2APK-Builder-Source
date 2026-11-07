package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xe0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final sv0 f10546a;

    public xe0(sv0 sv0Var) {
        this.f10546a = sv0Var;
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        sv0 sv0Var = this.f10546a;
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                sv0Var.j(pv0.f8157t, true);
                return;
            }
        } else if (str.equals("flick")) {
            sv0Var.j(pv0.f8158u, true);
            return;
        }
        sv0Var.j(pv0.s, true);
    }
}

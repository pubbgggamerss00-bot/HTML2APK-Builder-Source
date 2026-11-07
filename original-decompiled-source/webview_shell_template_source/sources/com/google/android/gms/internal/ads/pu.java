package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pu implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f8149t;

    public /* synthetic */ pu(int i6, Object obj) {
        this.s = i6;
        this.f8149t = obj;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        switch (this.s) {
            case 0:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j6 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j6 = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                sv0 sv0Var = (sv0) this.f8149t;
                String str = (String) map.get("extras");
                synchronized (sv0Var) {
                    sv0Var.f9022o = str;
                    sv0Var.f9024q = j6;
                    sv0Var.i();
                }
                return;
            default:
                xa0 xa0Var = (xa0) obj;
                xa0Var.zzN().f4196y = new ro0((bq0) this.f8149t, map);
                String str2 = (String) map.get("overlayHtml");
                String str3 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str3)) {
                    xa0Var.loadData(str2, "text/html", "UTF-8");
                    return;
                } else {
                    xa0Var.loadDataWithBaseURL(str3, str2, "text/html", "UTF-8", null);
                    return;
                }
        }
    }
}

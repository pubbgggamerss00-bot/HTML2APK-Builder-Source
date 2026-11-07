package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gt implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f5155t;

    public /* synthetic */ gt(int i6, Object obj) {
        this.s = i6;
        this.f5155t = obj;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        switch (this.s) {
            case 0:
                String str = (String) map.get("name");
                if (str != null) {
                    ((ht) this.f5155t).a(str, (String) map.get("info"));
                    break;
                } else {
                    zzo.zzj("App event with no name parameter.");
                    break;
                }
            default:
                bq0 bq0Var = (bq0) this.f5155t;
                zzo.zzi("Hiding native ads overlay.");
                ((xa0) obj).zzF().setVisibility(8);
                bq0Var.f3253c.f8926x = false;
                break;
        }
    }
}

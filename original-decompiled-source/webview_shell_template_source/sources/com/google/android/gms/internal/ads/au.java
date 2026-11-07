package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class au implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2846t;

    public /* synthetic */ au(int i6, Object obj) {
        this.s = i6;
        this.f2846t = obj;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        switch (this.s) {
            case 0:
                xa0 xa0Var = (xa0) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f6 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f6 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e6) {
                    zzo.zzh("Fail to parse float", e6);
                }
                bu buVar = (bu) this.f2846t;
                synchronized (buVar) {
                    buVar.f3287a = zEquals;
                    buVar.f3290d.set(true);
                }
                bu buVar2 = (bu) this.f2846t;
                synchronized (buVar2) {
                    buVar2.f3288b = zEquals2;
                    buVar2.f3289c = f6;
                }
                xa0Var.N(zEquals);
                return;
            case 1:
                ((bq0) this.f2846t).f3252b.b(map);
                return;
            case 2:
                ((gq0) this.f2846t).f5121b.b(map);
                return;
            default:
                sg0 sg0Var = ((pr0) this.f2846t).f8136b;
                sg0Var.f8925w = true;
                sg0Var.a();
                return;
        }
    }
}

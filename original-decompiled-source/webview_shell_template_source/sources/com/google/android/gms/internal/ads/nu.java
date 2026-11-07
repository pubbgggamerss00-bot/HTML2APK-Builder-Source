package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nu implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f7510t;

    public /* synthetic */ nu(int i6, Object obj) {
        this.s = i6;
        this.f7510t = obj;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        switch (this.s) {
            case 0:
                mu muVar = (mu) this.f7510t;
                String str = (String) map.get("action");
                if (!"grant".equals(str)) {
                    if (!"video_start".equals(str)) {
                        if ("video_complete".equals(str)) {
                            muVar.zzb();
                            break;
                        }
                    } else {
                        muVar.zzc();
                        break;
                    }
                } else {
                    l40 l40Var = null;
                    try {
                        int i6 = Integer.parseInt((String) map.get("amount"));
                        String str2 = (String) map.get("type");
                        if (!TextUtils.isEmpty(str2)) {
                            l40Var = new l40(str2, i6);
                        }
                    } catch (NumberFormatException e6) {
                        zzo.zzk("Unable to parse reward amount.", e6);
                    }
                    muVar.Q(l40Var);
                    break;
                }
                break;
            case 1:
                ((bq0) this.f7510t).f3254d.w();
                break;
            default:
                ((pr0) this.f7510t).f8136b.f8925w = false;
                break;
        }
    }
}

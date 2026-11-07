package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cu implements yt {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f3660t;

    public cu(Context context, Map map) {
        this.s = context;
        this.f3660t = map;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b60 b60VarZzo = zzv.zzo();
        Context context = this.s;
        if (b60VarZzo.e(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                Map map2 = this.f3660t;
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b60 b60VarZzo2 = zzv.zzo();
                        Map map3 = (Map) map2.get("_ai");
                        b60VarZzo2.getClass();
                        b60VarZzo2.k(context, "_ai", str2, b60.f(map3));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    b60 b60VarZzo3 = zzv.zzo();
                    Map map4 = (Map) map2.get("_ac");
                    b60VarZzo3.getClass();
                    b60VarZzo3.k(context, "_ac", str2, b60.f(map4));
                    return;
                }
            } else if (str.equals("_aa")) {
                zzv.zzo().k(context, "_aa", str2, null);
                return;
            }
            zzo.zzg("logScionEvent gmsg contained unsupported eventName");
        }
    }
}

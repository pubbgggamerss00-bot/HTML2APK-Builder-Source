package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbu {
    final Map zza = new ConcurrentHashMap();

    public zzbu() {
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zza.get(num);
    }
}

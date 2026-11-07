package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class an1 extends dn1 implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public final transient Map f2801v;

    /* renamed from: w, reason: collision with root package name */
    public transient int f2802w;

    public an1(Map map) {
        sl1.d(map.isEmpty());
        this.f2801v = map;
    }

    public final void a() {
        Map map = this.f2801v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f2802w = 0;
    }
}

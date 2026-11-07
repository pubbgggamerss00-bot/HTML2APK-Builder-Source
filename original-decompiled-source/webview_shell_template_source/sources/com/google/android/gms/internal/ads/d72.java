package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d72 extends j72 {
    public d72() {
        Map map = Collections.EMPTY_MAP;
        this.f5964u = map;
        this.f5967x = map;
    }

    @Override // com.google.android.gms.internal.ads.j72
    public final void a() {
        if (!this.f5965v) {
            for (int i6 = 0; i6 < this.f5963t; i6++) {
                ((y42) d(i6).s).getClass();
            }
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((y42) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.a();
    }
}

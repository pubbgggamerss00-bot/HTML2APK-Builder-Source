package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g8 extends k8 {
    public g8() {
        Map map = Collections.EMPTY_MAP;
        this.f11803u = map;
        this.f11806x = map;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k8
    public final void a() {
        if (!this.f11804v) {
            if (this.f11802t > 0) {
                ((r6) d(0).s).zze();
                throw null;
            }
            Iterator it = b().iterator();
            if (it.hasNext()) {
                ((r6) ((Map.Entry) it.next()).getKey()).zze();
                throw null;
            }
        }
        super.a();
    }
}

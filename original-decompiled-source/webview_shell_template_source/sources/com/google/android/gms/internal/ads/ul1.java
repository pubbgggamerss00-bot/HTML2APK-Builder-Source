package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ul1 implements Serializable, tl1 {
    public final List s;

    public final boolean equals(Object obj) {
        if (obj instanceof ul1) {
            return this.s.equals(((ul1) obj).s);
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.s) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean zza(Object obj) {
        int i6 = 0;
        while (true) {
            List list = this.s;
            if (i6 >= list.size()) {
                return true;
            }
            if (!((tl1) list.get(i6)).zza(obj)) {
                return false;
            }
            i6++;
        }
    }
}

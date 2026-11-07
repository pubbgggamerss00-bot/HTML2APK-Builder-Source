package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import qg.o;
import qg.x;
import qg.z;

/* loaded from: classes2.dex */
public final class zzhy {
    private List zza = z.f22752a;

    public final long zza(long[] jArr) {
        Iterator it = x.O(o.A(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = o.A(jArr);
    }
}

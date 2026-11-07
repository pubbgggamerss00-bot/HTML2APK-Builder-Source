package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.p;
import ia.a;

/* loaded from: classes2.dex */
public final class zzbt {
    public final i<Object> getSpatulaHeader(h hVar) {
        p.f(hVar);
        return hVar.b(new zzbs(this, hVar));
    }

    public final i<Object> performProxyRequest(h hVar, a aVar) {
        p.f(hVar);
        p.f(aVar);
        return hVar.b(new zzbq(this, hVar, aVar));
    }
}

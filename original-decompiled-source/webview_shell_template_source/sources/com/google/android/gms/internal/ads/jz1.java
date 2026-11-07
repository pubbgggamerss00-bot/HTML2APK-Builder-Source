package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jz1 implements ny1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz1 f6196a = new jz1();

    @Override // com.google.android.gms.internal.ads.ny1
    public final Object a(eu euVar) throws GeneralSecurityException {
        if (((my1) euVar.f4396u) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((Map) euVar.f4395t).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new iz1();
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final Class zza() {
        return hz1.class;
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final Class zzb() {
        return hz1.class;
    }
}

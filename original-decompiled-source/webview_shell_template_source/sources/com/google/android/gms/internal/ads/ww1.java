package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ww1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10296a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10297b;

    public /* synthetic */ ww1(Map map, Map map2) {
        this.f10296a = map;
        this.f10297b = map2;
    }

    public final Enum a(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.f10297b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object b(Enum r32) throws GeneralSecurityException {
        Object obj = this.f10296a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}

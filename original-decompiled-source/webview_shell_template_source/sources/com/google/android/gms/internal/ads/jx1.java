package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jx1 {

    /* renamed from: b, reason: collision with root package name */
    public static final jx1 f6188b = new jx1(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f6189a;

    public /* synthetic */ jx1(Map map) {
        this.f6189a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jx1) {
            return this.f6189a.equals(((jx1) obj).f6189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6189a.hashCode();
    }

    public final String toString() {
        return this.f6189a.toString();
    }
}

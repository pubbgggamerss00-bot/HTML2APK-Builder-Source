package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    public final int f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f5939b;

    /* renamed from: c, reason: collision with root package name */
    public final a.d f5940c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5941d;

    public b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f5939b = aVar;
        this.f5940c = dVar;
        this.f5941d = str;
        this.f5938a = Arrays.hashCode(new Object[]{aVar, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.o.a(this.f5939b, bVar.f5939b) && com.google.android.gms.common.internal.o.a(this.f5940c, bVar.f5940c) && com.google.android.gms.common.internal.o.a(this.f5941d, bVar.f5941d);
    }

    public final int hashCode() {
        return this.f5938a;
    }
}

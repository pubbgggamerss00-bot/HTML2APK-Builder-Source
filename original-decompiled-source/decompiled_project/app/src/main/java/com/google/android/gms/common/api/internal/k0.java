package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f6006a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.c f6007b;

    public /* synthetic */ k0(b bVar, pa.c cVar) {
        this.f6006a = bVar;
        this.f6007b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k0)) {
            k0 k0Var = (k0) obj;
            if (com.google.android.gms.common.internal.o.a(this.f6006a, k0Var.f6006a) && com.google.android.gms.common.internal.o.a(this.f6007b, k0Var.f6007b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6006a, this.f6007b});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f6006a, "key");
        aVar.a(this.f6007b, "feature");
        return aVar.toString();
    }
}

package com.google.android.gms.common.internal;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2489c;

    public u0(String str, String str2, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f2487a = str;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f2488b = str2;
        this.f2489c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k.a(this.f2487a, u0Var.f2487a) && k.a(this.f2488b, u0Var.f2488b) && k.a(null, null) && this.f2489c == u0Var.f2489c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2487a, this.f2488b, null, 4225, Boolean.valueOf(this.f2489c)});
    }

    public final String toString() {
        String str = this.f2487a;
        if (str != null) {
            return str;
        }
        l.f(null);
        throw null;
    }
}

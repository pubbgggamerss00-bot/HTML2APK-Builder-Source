package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4073a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4074b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public e1(String str, String str2) {
        this.f4073a = j31.a(str);
        this.f4074b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (Objects.equals(this.f4073a, e1Var.f4073a) && Objects.equals(this.f4074b, e1Var.f4074b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4074b.hashCode() * 31;
        String str = this.f4073a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l40 extends f3.a {
    public static final Parcelable.Creator<l40> CREATOR = new m40();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6572t;

    public l40(String str, int i6) {
        this.s = str;
        this.f6572t = i6;
    }

    public static l40 l(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new l40(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l40)) {
            l40 l40Var = (l40) obj;
            if (com.google.android.gms.common.internal.k.a(this.s, l40Var.s)) {
                if (com.google.android.gms.common.internal.k.a(Integer.valueOf(this.f6572t), Integer.valueOf(l40Var.f6572t))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, Integer.valueOf(this.f6572t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 2, this.s);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f6572t);
        e5.i.t(iS, parcel);
    }
}

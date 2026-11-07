package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y30 extends sh {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10823t;

    public y30() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y30)) {
            y30 y30Var = (y30) obj;
            if (com.google.android.gms.common.internal.k.a(this.s, y30Var.s)) {
                if (com.google.android.gms.common.internal.k.a(Integer.valueOf(this.f10823t), Integer.valueOf(y30Var.f10823t))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.s);
        } else {
            if (i6 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f10823t);
        }
        return true;
    }

    public y30(String str, int i6) {
        this();
        this.s = str;
        this.f10823t = i6;
    }
}

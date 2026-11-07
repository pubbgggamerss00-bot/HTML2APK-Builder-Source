package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import qa.a;

/* loaded from: classes2.dex */
public final class zzaa extends a implements l {
    private final Status zzb;
    public static final zzaa zza = new zzaa(Status.f5905e);
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.zzb, i10, false);
        c1.r(iQ, parcel);
    }
}

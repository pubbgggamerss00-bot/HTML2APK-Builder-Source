package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class j extends qa.a implements com.google.android.gms.common.api.l {
    public static final Parcelable.Creator<j> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final Status f12949a;

    /* renamed from: b, reason: collision with root package name */
    public final k f12950b;

    public j(Status status, k kVar) {
        this.f12949a = status;
        this.f12950b = kVar;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.f12949a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f12949a, i10, false);
        c1.l(parcel, 2, this.f12950b, i10, false);
        c1.r(iQ, parcel);
    }
}

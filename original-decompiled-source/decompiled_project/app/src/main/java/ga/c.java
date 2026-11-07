package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

@Deprecated
/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f11881a;

    public c(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.p.f(pendingIntent);
        this.f11881a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f11881a, i10, false);
        c1.r(iQ, parcel);
    }
}

package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class j extends qa.a {
    public static final Parcelable.Creator<j> CREATOR = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f11893a;

    public j(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.p.f(pendingIntent);
        this.f11893a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return com.google.android.gms.common.internal.o.a(this.f11893a, ((j) obj).f11893a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11893a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f11893a, i10, false);
        c1.r(iQ, parcel);
    }
}

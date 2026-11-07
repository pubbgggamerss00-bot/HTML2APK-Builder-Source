package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f11889a;

    public h(PendingIntent pendingIntent) {
        this.f11889a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return com.google.android.gms.common.internal.o.a(this.f11889a, ((h) obj).f11889a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11889a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f11889a, i10, false);
        c1.r(iQ, parcel);
    }
}

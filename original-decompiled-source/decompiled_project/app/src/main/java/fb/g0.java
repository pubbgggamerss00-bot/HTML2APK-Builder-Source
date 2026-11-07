package fb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class g0 extends qa.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f11147a;

    public g0(PendingIntent pendingIntent) {
        kotlin.jvm.internal.r.e(pendingIntent, "pendingIntent");
        this.f11147a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.l(dest, 1, this.f11147a, i10, false);
        c1.r(iQ, dest);
    }
}

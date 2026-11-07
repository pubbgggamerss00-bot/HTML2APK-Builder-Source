package fb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f11149a;

    /* renamed from: b, reason: collision with root package name */
    public final o f11150b;

    public k(PendingIntent pendingIntent, o oVar) {
        this.f11149a = pendingIntent;
        this.f11150b = oVar;
        if (pendingIntent == null && oVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.l(dest, 1, this.f11149a, i10, false);
        c1.l(dest, 2, this.f11150b, i10, false);
        c1.r(iQ, dest);
    }
}

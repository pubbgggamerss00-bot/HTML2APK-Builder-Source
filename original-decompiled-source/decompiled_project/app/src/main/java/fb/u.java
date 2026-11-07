package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class u extends qa.a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11170a;

    public u(Bundle responseBundle) {
        kotlin.jvm.internal.r.e(responseBundle, "responseBundle");
        this.f11170a = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.e(dest, 1, this.f11170a, false);
        c1.r(iQ, dest);
    }
}

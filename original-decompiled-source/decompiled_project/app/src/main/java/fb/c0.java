package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class c0 extends qa.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11144a;

    public c0(Bundle responseBundle) {
        kotlin.jvm.internal.r.e(responseBundle, "responseBundle");
        this.f11144a = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.e(dest, 1, this.f11144a, false);
        c1.r(iQ, dest);
    }
}

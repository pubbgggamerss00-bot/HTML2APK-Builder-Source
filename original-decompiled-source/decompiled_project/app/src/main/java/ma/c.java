package ma;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f18023a;

    public c(Bundle requestBundle) {
        r.e(requestBundle, "requestBundle");
        this.f18023a = requestBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.e(dest, 1, this.f18023a, false);
        c1.r(iQ, dest);
    }
}

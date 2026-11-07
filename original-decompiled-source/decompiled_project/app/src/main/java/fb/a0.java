package fb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class a0 extends qa.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final q f11143a;

    public a0(q credential) {
        kotlin.jvm.internal.r.e(credential, "credential");
        this.f11143a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.l(dest, 1, this.f11143a, i10, false);
        c1.r(iQ, dest);
    }
}

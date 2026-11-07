package fb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11148a;

    public i(boolean z10) {
        this.f11148a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.s(dest, 1, 4);
        dest.writeInt(this.f11148a ? 1 : 0);
        c1.r(iQ, dest);
    }
}

package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public final int f11882a;

    public e(int i10) {
        this.f11882a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return com.google.android.gms.common.internal.o.a(Integer.valueOf(this.f11882a), Integer.valueOf(((e) obj).f11882a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11882a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f11882a);
        c1.r(iQ, parcel);
    }
}

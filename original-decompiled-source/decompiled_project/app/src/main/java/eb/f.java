package eb;

import android.os.Parcel;
import android.os.Parcelable;
import eb.a;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return a.d(parcel.readInt());
        } catch (a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.EnumC0088a[i10];
    }
}

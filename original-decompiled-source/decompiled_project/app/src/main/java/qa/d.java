package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;

/* loaded from: classes2.dex */
public final class d {
    public static <T extends c> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        p.f(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }
}

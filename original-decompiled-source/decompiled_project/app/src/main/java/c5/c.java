package c5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4816a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4817b;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        this.f4816a = parcel.createStringArrayList();
        this.f4817b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4816a);
        parcel.writeTypedList(this.f4817b);
    }
}

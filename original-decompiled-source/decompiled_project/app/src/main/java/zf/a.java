package zf;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0359a();

    /* renamed from: a, reason: collision with root package name */
    public final String f35056a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35057b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35058c;

    /* renamed from: zf.a$a, reason: collision with other inner class name */
    public class C0359a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel) {
        this.f35056a = parcel.readString();
        this.f35057b = parcel.readFloat();
        this.f35058c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f35056a);
        parcel.writeFloat(this.f35057b);
        parcel.writeFloat(this.f35058c);
    }
}

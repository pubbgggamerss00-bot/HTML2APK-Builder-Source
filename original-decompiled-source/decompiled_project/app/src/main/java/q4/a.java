package q4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f21914a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0246a f21913b = new C0246a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    public class C0246a extends a {
    }

    public a() {
        this.f21914a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f21914a, i10);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f21913b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f21913b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f21914a = parcelable == f21913b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f21914a = parcelable == null ? f21913b : parcelable;
    }
}

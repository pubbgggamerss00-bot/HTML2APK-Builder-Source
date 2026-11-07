package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x1<T> extends h3<T> implements Parcelable {
    public static final Parcelable.Creator<x1<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator<x1<Object>> {
        public static x1 a(Parcel parcel, ClassLoader classLoader) {
            i3 i3Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                i3Var = q1.f31878a;
            } else if (i10 == 1) {
                i3Var = u3.f31923a;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(ad.b.b(i10, "Unsupported MutableState policy ", " was restored"));
                }
                i3Var = s2.f31913a;
            }
            return new x1(value, i3Var);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ x1<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new x1[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        q1 q1Var = q1.f31878a;
        i3<T> i3Var = this.f31707b;
        if (kotlin.jvm.internal.r.a(i3Var, q1Var)) {
            i11 = 0;
        } else if (kotlin.jvm.internal.r.a(i3Var, u3.f31923a)) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.r.a(i3Var, s2.f31913a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}

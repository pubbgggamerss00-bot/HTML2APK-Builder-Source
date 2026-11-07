package x4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends b1.a {
    public static final Parcelable.Creator<a> CREATOR = new C0103a();

    /* renamed from: u, reason: collision with root package name */
    public final g<String, Bundle> f15156u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public class C0103a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i6) {
            return new a[i6];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i6 = parcel.readInt();
        String[] strArr = new String[i6];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i6];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f15156u = new g<>(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            this.f15156u.put(strArr[i7], bundleArr[i7]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f15156u + "}";
    }

    @Override // b1.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        g<String, Bundle> gVar = this.f15156u;
        int i7 = gVar.f14850u;
        parcel.writeInt(i7);
        String[] strArr = new String[i7];
        Bundle[] bundleArr = new Bundle[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            strArr[i8] = gVar.f(i8);
            bundleArr[i8] = gVar.i(i8);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}

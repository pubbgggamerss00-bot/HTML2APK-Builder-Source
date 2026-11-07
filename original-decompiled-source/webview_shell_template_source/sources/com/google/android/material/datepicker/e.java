package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final long s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i6) {
            return new e[i6];
        }
    }

    public e(long j6) {
        this.s = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.s == ((e) obj).s;
    }

    @Override // com.google.android.material.datepicker.a.c
    public final boolean f(long j6) {
        return j6 >= this.s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.s);
    }
}

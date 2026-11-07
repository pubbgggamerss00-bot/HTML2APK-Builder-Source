package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qh implements Parcelable {
    public static final Parcelable.Creator<qh> CREATOR = new bg();
    public final zg[] s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8385t;

    public qh(long j6, zg... zgVarArr) {
        this.f8385t = j6;
        this.s = zgVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qh.class == obj.getClass()) {
            qh qhVar = (qh) obj;
            if (Arrays.equals(this.s, qhVar.s) && this.f8385t == qhVar.f8385t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.s) * 31;
        long j6 = this.f8385t;
        return iHashCode + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final qh l(zg... zgVarArr) {
        int length = zgVarArr.length;
        if (length == 0) {
            return this;
        }
        int i6 = j31.f5914a;
        zg[] zgVarArr2 = this.s;
        int length2 = zgVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zgVarArr2, length2 + length);
        System.arraycopy(zgVarArr, 0, objArrCopyOf, length2, length);
        return new qh(this.f8385t, (zg[]) objArrCopyOf);
    }

    public final qh m(qh qhVar) {
        return qhVar == null ? this : l(qhVar.s);
    }

    public final String toString() {
        String str;
        long j6 = this.f8385t;
        String string = Arrays.toString(this.s);
        if (j6 == -9223372036854775807L) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            str = ", presentationTimeUs=" + j6;
        }
        return androidx.camera.camera2.internal.v0.b("entries=", string, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        zg[] zgVarArr = this.s;
        parcel.writeInt(zgVarArr.length);
        for (zg zgVar : zgVarArr) {
            parcel.writeParcelable(zgVar, 0);
        }
        parcel.writeLong(this.f8385t);
    }

    public qh(Parcel parcel) {
        this.s = new zg[parcel.readInt()];
        int i6 = 0;
        while (true) {
            zg[] zgVarArr = this.s;
            if (i6 >= zgVarArr.length) {
                this.f8385t = parcel.readLong();
                return;
            } else {
                zgVarArr[i6] = (zg) parcel.readParcelable(zg.class.getClassLoader());
                i6++;
            }
        }
    }

    public qh(List list) {
        this(-9223372036854775807L, (zg[]) list.toArray(new zg[0]));
    }
}

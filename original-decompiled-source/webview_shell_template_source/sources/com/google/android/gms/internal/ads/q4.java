package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q4 implements zg {
    public static final Parcelable.Creator<q4> CREATOR = new n4();
    public final ArrayList s;

    public q4(ArrayList arrayList) {
        this.s = arrayList;
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            long j6 = ((p4) arrayList.get(0)).f7931t;
            int i6 = 1;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                if (((p4) arrayList.get(i6)).s < j6) {
                    z6 = true;
                    break;
                } else {
                    j6 = ((p4) arrayList.get(i6)).f7931t;
                    i6++;
                }
            }
        }
        y5.n(!z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q4.class != obj.getClass()) {
            return false;
        }
        return this.s.equals(((q4) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.s.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeList(this.s);
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}

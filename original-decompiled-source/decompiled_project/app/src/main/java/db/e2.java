package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class e2 extends qa.a {
    public static final Parcelable.Creator<e2> CREATOR = new f2();

    /* renamed from: a, reason: collision with root package name */
    public final List f7713a;

    public e2(ArrayList arrayList) {
        com.google.android.gms.common.internal.p.f(arrayList);
        this.f7713a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        List list = ((e2) obj).f7713a;
        List list2 = this.f7713a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f7713a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.p(parcel, 1, this.f7713a, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}

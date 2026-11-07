package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import androidx.room.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new r0();

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f12928e = new q0(0);

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f12929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12930b;

    /* renamed from: c, reason: collision with root package name */
    public final List<com.google.android.gms.common.internal.c> f12931c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12932d;

    public c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        com.google.android.gms.common.internal.p.g(arrayList, "transitions can't be null");
        int i10 = 0;
        com.google.android.gms.common.internal.p.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f12928e);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            com.google.android.gms.common.internal.p.a("Found duplicated transition: " + bVar + ".", treeSet.add(bVar));
        }
        this.f12929a = Collections.unmodifiableList(arrayList);
        this.f12930b = str;
        this.f12931c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f12932d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (com.google.android.gms.common.internal.o.a(this.f12929a, cVar.f12929a) && com.google.android.gms.common.internal.o.a(this.f12930b, cVar.f12930b) && com.google.android.gms.common.internal.o.a(this.f12932d, cVar.f12932d) && com.google.android.gms.common.internal.o.a(this.f12931c, cVar.f12931c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12929a.hashCode() * 31;
        String str = this.f12930b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<com.google.android.gms.common.internal.c> list = this.f12931c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f12932d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12929a);
        String strValueOf2 = String.valueOf(this.f12931c);
        int length = strValueOf.length();
        String str = this.f12930b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.f12932d;
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        z0.a(sb, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        z0.a(sb, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.p.f(parcel);
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, this.f12929a, false);
        c1.m(parcel, 2, this.f12930b, false);
        c1.p(parcel, 3, this.f12931c, false);
        c1.m(parcel, 4, this.f12932d, false);
        c1.r(iQ, parcel);
    }
}

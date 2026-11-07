package ua;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.Map;
import ua.a;

/* loaded from: classes2.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f29681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29682b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f29683c;

    public f(int i10, String str, ArrayList arrayList) {
        this.f29681a = i10;
        this.f29682b = str;
        this.f29683c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f29681a);
        c1.m(parcel, 2, this.f29682b, false);
        c1.p(parcel, 3, this.f29683c, false);
        c1.r(iQ, parcel);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f29681a = 1;
        this.f29682b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a.C0303a) map.get(str2), str2));
            }
        }
        this.f29683c = arrayList;
    }
}

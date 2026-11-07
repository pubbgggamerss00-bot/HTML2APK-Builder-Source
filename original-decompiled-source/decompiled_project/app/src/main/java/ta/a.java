package ta;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.HashMap;
import ua.a;

/* loaded from: classes2.dex */
public final class a extends qa.a implements a.b<String, Integer> {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f28618a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28619b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f28620c;

    public a() {
        this.f28618a = 1;
        this.f28619b = new HashMap();
        this.f28620c = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f28618a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f28619b;
        for (String str : map.keySet()) {
            arrayList.add(new d(str, ((Integer) map.get(str)).intValue()));
        }
        c1.p(parcel, 2, arrayList, false);
        c1.r(iQ, parcel);
    }

    public a(ArrayList arrayList, int i10) {
        this.f28618a = i10;
        this.f28619b = new HashMap();
        this.f28620c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            String str = dVar.f28624b;
            int i12 = dVar.f28625c;
            this.f28619b.put(str, Integer.valueOf(i12));
            this.f28620c.put(i12, str);
        }
    }
}

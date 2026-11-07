package la;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16921a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16922b;

    public b(ArrayList arrayList, boolean z10) {
        int i10 = 0;
        if (z10) {
            boolean z11 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            }
            p.h("retrieveAll was set to true but other constraint(s) was also provided: keys", z11);
        }
        this.f16922b = z10;
        this.f16921a = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                p.e(str, "Element in keys cannot be null or empty");
                this.f16921a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.n(parcel, 1, Collections.unmodifiableList(this.f16921a));
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f16922b ? 1 : 0);
        c1.r(iQ, parcel);
    }
}

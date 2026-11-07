package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class g0 extends qa.a {
    public static final Parcelable.Creator<g0> CREATOR = new m1();

    /* renamed from: a, reason: collision with root package name */
    public final List f7722a;

    public g0(ArrayList arrayList) {
        this.f7722a = arrayList;
    }

    public final JSONArray d() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f7722a;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    h0 h0Var = (h0) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) h0Var.f7729c);
                    jSONArray2.put((int) h0Var.f7728b);
                    jSONArray2.put((int) h0Var.f7729c);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        List list = ((g0) obj).f7722a;
        List list2 = this.f7722a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f7722a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.p(parcel, 1, this.f7722a, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}

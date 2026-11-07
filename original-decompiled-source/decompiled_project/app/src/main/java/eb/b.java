package eb;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.lifecycle.c1;
import b.o;
import eb.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f8647a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8648b;

    /* renamed from: c, reason: collision with root package name */
    public final c f8649c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8650d;

    public b(int i10, byte[] bArr, String str, ArrayList arrayList) {
        this.f8647a = i10;
        this.f8648b = bArr;
        try {
            this.f8649c = c.a(str);
            this.f8650d = arrayList;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f8650d;
        if (!Arrays.equals(this.f8648b, bVar.f8648b) || !this.f8649c.equals(bVar.f8649c)) {
            return false;
        }
        List list2 = this.f8650d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8648b)), this.f8649c, this.f8650d});
    }

    public final String toString() {
        List list = this.f8650d;
        String string = list == null ? "null" : list.toString();
        byte[] bArr = this.f8648b;
        String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(strEncodeToString);
        sb.append(", version: ");
        sb.append(this.f8649c);
        sb.append(", transports: ");
        return o.a(sb, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f8647a);
        c1.f(parcel, 2, this.f8648b, false);
        c1.m(parcel, 3, this.f8649c.f8653a, false);
        c1.p(parcel, 4, this.f8650d, false);
        c1.r(iQ, parcel);
    }
}

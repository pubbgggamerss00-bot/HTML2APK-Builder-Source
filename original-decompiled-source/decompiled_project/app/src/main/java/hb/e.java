package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final List<zzbe> f12936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12938c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12939d;

    public e(ArrayList arrayList, int i10, String str, String str2) {
        this.f12936a = arrayList;
        this.f12937b = i10;
        this.f12938c = str;
        this.f12939d = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.f12936a);
        sb.append(", initialTrigger=");
        sb.append(this.f12937b);
        sb.append(", tag=");
        sb.append(this.f12938c);
        sb.append(", attributionTag=");
        return b.o.a(sb, this.f12939d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, this.f12936a, false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12937b);
        c1.m(parcel, 3, this.f12938c, false);
        c1.m(parcel, 4, this.f12939d, false);
        c1.r(iQ, parcel);
    }
}

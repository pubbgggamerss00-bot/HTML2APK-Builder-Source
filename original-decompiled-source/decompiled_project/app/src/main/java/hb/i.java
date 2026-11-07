package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final List<LocationRequest> f12941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12943c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f12944d;

    public i(ArrayList arrayList, boolean z10, boolean z11, d0 d0Var) {
        this.f12941a = arrayList;
        this.f12942b = z10;
        this.f12943c = z11;
        this.f12944d = d0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, Collections.unmodifiableList(this.f12941a), false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12942b ? 1 : 0);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f12943c ? 1 : 0);
        c1.l(parcel, 5, this.f12944d, i10, false);
        c1.r(iQ, parcel);
    }
}

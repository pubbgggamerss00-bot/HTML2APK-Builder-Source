package kb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends qa.a implements com.google.android.gms.common.api.l {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final List f16252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16253b;

    public g(String str, ArrayList arrayList) {
        this.f16252a = arrayList;
        this.f16253b = str;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.f16253b != null ? Status.f5905e : Status.f5909j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.n(parcel, 1, this.f16252a);
        c1.m(parcel, 2, this.f16253b, false);
        c1.r(iQ, parcel);
    }
}

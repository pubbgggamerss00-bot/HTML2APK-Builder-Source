package ca;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5349b;

    public c(ArrayList arrayList, int i10) {
        this.f5348a = i10;
        p.f(arrayList);
        this.f5349b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5348a);
        c1.p(parcel, 2, this.f5349b, false);
        c1.r(iQ, parcel);
    }
}

package kb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class b extends qa.a implements com.google.android.gms.common.api.l {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f16249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16250b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f16251c;

    public b() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.f16250b == 0 ? Status.f5905e : Status.f5909j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f16249a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f16250b);
        c1.l(parcel, 3, this.f16251c, i10, false);
        c1.r(iQ, parcel);
    }

    public b(int i10, int i11, Intent intent) {
        this.f16249a = i10;
        this.f16250b = i11;
        this.f16251c = intent;
    }
}

package hb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* loaded from: classes2.dex */
public final class k0 extends qa.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final zzbs f12957a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f12958b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12959c;

    public k0(List<String> list, PendingIntent pendingIntent, String str) {
        this.f12957a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f12958b = pendingIntent;
        this.f12959c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.n(parcel, 1, this.f12957a);
        c1.l(parcel, 2, this.f12958b, i10, false);
        c1.m(parcel, 3, this.f12959c, false);
        c1.r(iQ, parcel);
    }
}

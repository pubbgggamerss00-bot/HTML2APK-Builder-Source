package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class c0 extends c {
    public static final Parcelable.Creator<c0> CREATOR = new r0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22664a;

    public c0(String str) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22664a = str;
    }

    @Override // qd.c
    public final String d() {
        return "playgames.google.com";
    }

    @Override // qd.c
    public final c e() {
        return new c0(this.f22664a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22664a, false);
        c1.r(iQ, parcel);
    }
}

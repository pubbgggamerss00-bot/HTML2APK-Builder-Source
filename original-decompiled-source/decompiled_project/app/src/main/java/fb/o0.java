package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class o0 extends qa.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    public final String f11159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11160b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11161c;

    public o0(String type, String str, Bundle requestData) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(requestData, "requestData");
        this.f11159a = type;
        this.f11160b = str;
        this.f11161c = requestData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.m(dest, 1, this.f11159a, false);
        c1.m(dest, 2, this.f11160b, false);
        c1.e(dest, 3, this.f11161c, false);
        c1.r(iQ, dest);
    }
}

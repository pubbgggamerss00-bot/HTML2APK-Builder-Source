package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class q extends qa.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f11162a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11163b;

    public q(Bundle data, String type) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(data, "data");
        this.f11162a = type;
        this.f11163b = data;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.m(dest, 1, this.f11162a, false);
        c1.e(dest, 2, this.f11163b, false);
        c1.r(iQ, dest);
    }
}

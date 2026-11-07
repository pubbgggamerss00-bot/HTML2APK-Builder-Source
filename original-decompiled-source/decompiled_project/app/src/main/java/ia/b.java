package ia;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f14430a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f14431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14432c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14434e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f14435f;

    public b(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f14434e = i10;
        this.f14430a = i11;
        this.f14432c = i12;
        this.f14435f = bundle;
        this.f14433d = bArr;
        this.f14431b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f14430a);
        c1.l(parcel, 2, this.f14431b, i10, false);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f14432c);
        c1.e(parcel, 4, this.f14435f, false);
        c1.f(parcel, 5, this.f14433d, false);
        c1.s(parcel, DescriptorProtos.Edition.EDITION_2023_VALUE, 4);
        parcel.writeInt(this.f14434e);
        c1.r(iQ, parcel);
    }
}

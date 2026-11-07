package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.yalantis.ucrop.view.CropImageView;
import hb.z;
import java.util.Arrays;
import qa.a;

/* loaded from: classes2.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public int f6258a = 102;

    /* renamed from: b, reason: collision with root package name */
    public long f6259b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public long f6260c = SignalCredentialStateController.MAX_RETRY_TIME;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6261d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f6262e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f6263f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f6264g = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: h, reason: collision with root package name */
    public long f6265h = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6266j = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f6258a != locationRequest.f6258a) {
            return false;
        }
        long j10 = this.f6259b;
        long j11 = locationRequest.f6259b;
        if (j10 != j11 || this.f6260c != locationRequest.f6260c || this.f6261d != locationRequest.f6261d || this.f6262e != locationRequest.f6262e || this.f6263f != locationRequest.f6263f || this.f6264g != locationRequest.f6264g) {
            return false;
        }
        long j12 = this.f6265h;
        if (j12 >= j10) {
            j10 = j12;
        }
        long j13 = locationRequest.f6265h;
        if (j13 >= j11) {
            j11 = j13;
        }
        return j10 == j11 && this.f6266j == locationRequest.f6266j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6258a), Long.valueOf(this.f6259b), Float.valueOf(this.f6264g), Long.valueOf(this.f6265h)});
    }

    public final String toString() {
        int i10 = this.f6263f;
        float f10 = this.f6264g;
        long j10 = this.f6265h;
        long j11 = this.f6259b;
        StringBuilder sb = new StringBuilder("Request[");
        int i11 = this.f6258a;
        sb.append(i11 != 100 ? i11 != 102 ? i11 != 104 ? i11 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i11 != 105) {
            sb.append(" requested=");
            sb.append(j11);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f6260c);
        sb.append("ms");
        if (j10 > j11) {
            sb.append(" maxWait=");
            sb.append(j10);
            sb.append("ms");
        }
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
            sb.append(" smallestDisplacement=");
            sb.append(f10);
            sb.append("m");
        }
        long j12 = this.f6262e;
        if (j12 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j12 - jElapsedRealtime);
            sb.append("ms");
        }
        if (i10 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i10);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.f6258a;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.f6259b;
        c1.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f6260c;
        c1.s(parcel, 3, 8);
        parcel.writeLong(j11);
        boolean z10 = this.f6261d;
        c1.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        long j12 = this.f6262e;
        c1.s(parcel, 5, 8);
        parcel.writeLong(j12);
        int i12 = this.f6263f;
        c1.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f6264g;
        c1.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        long j13 = this.f6265h;
        c1.s(parcel, 8, 8);
        parcel.writeLong(j13);
        boolean z11 = this.f6266j;
        c1.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c1.r(iQ, parcel);
    }
}

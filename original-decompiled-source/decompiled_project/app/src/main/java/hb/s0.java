package hb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.lifecycle.c1;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s0 extends qa.a {
    public static final Parcelable.Creator<s0> CREATOR = new t0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12968b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12969c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12970d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12971e;

    public s0() {
        this(true, 50L, CropImageView.DEFAULT_ASPECT_RATIO, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f12967a == s0Var.f12967a && this.f12968b == s0Var.f12968b && Float.compare(this.f12969c, s0Var.f12969c) == 0 && this.f12970d == s0Var.f12970d && this.f12971e == s0Var.f12971e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12967a), Long.valueOf(this.f12968b), Float.valueOf(this.f12969c), Long.valueOf(this.f12970d), Integer.valueOf(this.f12971e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f12967a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f12968b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f12969c);
        long j10 = this.f12970d;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j10 - jElapsedRealtime);
            sb.append("ms");
        }
        int i10 = this.f12971e;
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
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f12967a ? 1 : 0);
        c1.s(parcel, 2, 8);
        parcel.writeLong(this.f12968b);
        c1.s(parcel, 3, 4);
        parcel.writeFloat(this.f12969c);
        c1.s(parcel, 4, 8);
        parcel.writeLong(this.f12970d);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f12971e);
        c1.r(iQ, parcel);
    }

    public s0(boolean z10, long j10, float f10, long j11, int i10) {
        this.f12967a = z10;
        this.f12968b = j10;
        this.f12969c = f10;
        this.f12970d = j11;
        this.f12971e = i10;
    }
}

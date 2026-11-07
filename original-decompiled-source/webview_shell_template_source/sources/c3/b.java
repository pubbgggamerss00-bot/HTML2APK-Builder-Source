package c3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.internal.ads.dn;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends f3.a {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2166t;

    /* renamed from: u, reason: collision with root package name */
    public final PendingIntent f2167u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2168v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f2169w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f2165x = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new q();

    public b(int i6, int i7, PendingIntent pendingIntent, String str, Integer num) {
        this.s = i6;
        this.f2166t = i7;
        this.f2167u = pendingIntent;
        this.f2168v = str;
        this.f2169w = num;
    }

    public static String m(int i6) {
        if (i6 == 99) {
            return "UNFINISHED";
        }
        if (i6 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i6) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i6) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case dn.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i6);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2166t == bVar.f2166t && com.google.android.gms.common.internal.k.a(this.f2167u, bVar.f2167u) && com.google.android.gms.common.internal.k.a(this.f2168v, bVar.f2168v) && com.google.android.gms.common.internal.k.a(this.f2169w, bVar.f2169w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2166t), this.f2167u, this.f2168v, this.f2169w});
    }

    public final boolean l() {
        return this.f2166t == 0;
    }

    public final String toString() {
        k.a aVar = new k.a(this);
        aVar.a("statusCode", m(this.f2166t));
        aVar.a("resolution", this.f2167u);
        aVar.a("message", this.f2168v);
        aVar.a("clientMethodKey", this.f2169w);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f2166t);
        e5.i.l(parcel, 3, this.f2167u, i6);
        e5.i.m(parcel, 4, this.f2168v);
        Integer num = this.f2169w;
        if (num != null) {
            e5.i.r(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        e5.i.t(iS, parcel);
    }

    public b(int i6, PendingIntent pendingIntent, String str) {
        this(1, i6, pendingIntent, str, null);
    }
}

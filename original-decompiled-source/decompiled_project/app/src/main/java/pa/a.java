package pa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a extends qa.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21376a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21377b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f21378c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21379d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f21375e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new m();

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f21376a = i10;
        this.f21377b = i11;
        this.f21378c = pendingIntent;
        this.f21379d = str;
    }

    public static String d(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
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
                switch (i10) {
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
                    case 21:
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
                        return ad.b.b(i10, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21377b == aVar.f21377b && com.google.android.gms.common.internal.o.a(this.f21378c, aVar.f21378c) && com.google.android.gms.common.internal.o.a(this.f21379d, aVar.f21379d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21377b), this.f21378c, this.f21379d});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(d(this.f21377b), "statusCode");
        aVar.a(this.f21378c, "resolution");
        aVar.a(this.f21379d, "message");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f21376a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f21377b);
        c1.l(parcel, 3, this.f21378c, i10, false);
        c1.m(parcel, 4, this.f21379d, false);
        c1.r(iQ, parcel);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}

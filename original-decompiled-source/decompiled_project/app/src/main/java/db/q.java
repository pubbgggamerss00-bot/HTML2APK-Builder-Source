package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<q> CREATOR = new i2();

    /* renamed from: a, reason: collision with root package name */
    public final int f7763a;

    public static class a extends Exception {
    }

    q(int i10) {
        this.f7763a = i10;
    }

    public static q a(int i10) throws a {
        for (q qVar : values()) {
            if (i10 == qVar.f7763a) {
                return qVar;
            }
        }
        Locale locale = Locale.US;
        throw new a(ad.b.b(i10, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7763a);
    }
}

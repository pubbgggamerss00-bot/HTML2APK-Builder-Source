package rd;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i implements qa.c {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final long f23379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23380b;

    public i(long j10, long j11) {
        this.f23379a = j10;
        this.f23380b = j11;
    }

    public static i a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new i(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 8);
        parcel.writeLong(this.f23379a);
        androidx.lifecycle.c1.s(parcel, 2, 8);
        parcel.writeLong(this.f23380b);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}

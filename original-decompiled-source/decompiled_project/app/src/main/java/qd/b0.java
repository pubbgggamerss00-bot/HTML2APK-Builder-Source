package qd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b0 extends u {
    public static final Parcelable.Creator<b0> CREATOR = new q0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22660b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22661c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22662d;

    public b0(String str, String str2, long j10, String str3) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22659a = str;
        this.f22660b = str2;
        this.f22661c = j10;
        com.google.android.gms.common.internal.p.d(str3);
        this.f22662d = str3;
    }

    public static b0 f(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new b0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // qd.u
    public final String d() {
        return "phone";
    }

    @Override // qd.u
    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f22659a);
            jSONObject.putOpt("displayName", this.f22660b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f22661c));
            jSONObject.putOpt("phoneNumber", this.f22662d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22659a, false);
        c1.m(parcel, 2, this.f22660b, false);
        c1.s(parcel, 3, 8);
        parcel.writeLong(this.f22661c);
        c1.m(parcel, 4, this.f22662d, false);
        c1.r(iQ, parcel);
    }
}

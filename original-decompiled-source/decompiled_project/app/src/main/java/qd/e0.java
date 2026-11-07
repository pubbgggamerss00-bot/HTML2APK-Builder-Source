package qd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e0 extends u {
    public static final Parcelable.Creator<e0> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22672b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22673c;

    /* renamed from: d, reason: collision with root package name */
    public final zzair f22674d;

    public e0(String str, String str2, long j10, zzair zzairVar) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22671a = str;
        this.f22672b = str2;
        this.f22673c = j10;
        com.google.android.gms.common.internal.p.g(zzairVar, "totpInfo cannot be null.");
        this.f22674d = zzairVar;
    }

    public static e0 f(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new e0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzair());
    }

    @Override // qd.u
    public final String d() {
        return "totp";
    }

    @Override // qd.u
    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f22671a);
            jSONObject.putOpt("displayName", this.f22672b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f22673c));
            jSONObject.putOpt("totpInfo", this.f22674d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22671a, false);
        c1.m(parcel, 2, this.f22672b, false);
        c1.s(parcel, 3, 8);
        parcel.writeLong(this.f22673c);
        c1.l(parcel, 4, this.f22674d, i10, false);
        c1.r(iQ, parcel);
    }
}

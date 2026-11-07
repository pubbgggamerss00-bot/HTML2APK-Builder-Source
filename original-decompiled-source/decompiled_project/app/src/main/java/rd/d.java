package rd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends qa.a implements qd.g0 {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public String f23349a;

    /* renamed from: b, reason: collision with root package name */
    public String f23350b;

    /* renamed from: c, reason: collision with root package name */
    public String f23351c;

    /* renamed from: d, reason: collision with root package name */
    public String f23352d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f23353e;

    /* renamed from: f, reason: collision with root package name */
    public String f23354f;

    /* renamed from: g, reason: collision with root package name */
    public String f23355g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23356h;

    /* renamed from: j, reason: collision with root package name */
    public String f23357j;

    public d(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f23349a = str;
        this.f23350b = str2;
        this.f23354f = str3;
        this.f23355g = str4;
        this.f23351c = str5;
        this.f23352d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f23353e = Uri.parse(str6);
        }
        this.f23356h = z10;
        this.f23357j = str7;
    }

    public static d d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new d(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaag(e10);
        }
    }

    @Override // qd.g0
    public final String a() {
        return this.f23350b;
    }

    public final String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f23349a);
            jSONObject.putOpt("providerId", this.f23350b);
            jSONObject.putOpt("displayName", this.f23351c);
            jSONObject.putOpt("photoUrl", this.f23352d);
            jSONObject.putOpt("email", this.f23354f);
            jSONObject.putOpt("phoneNumber", this.f23355g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f23356h));
            jSONObject.putOpt("rawUserInfo", this.f23357j);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaag(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f23349a, false);
        androidx.lifecycle.c1.m(parcel, 2, this.f23350b, false);
        androidx.lifecycle.c1.m(parcel, 3, this.f23351c, false);
        androidx.lifecycle.c1.m(parcel, 4, this.f23352d, false);
        androidx.lifecycle.c1.m(parcel, 5, this.f23354f, false);
        androidx.lifecycle.c1.m(parcel, 6, this.f23355g, false);
        boolean z10 = this.f23356h;
        androidx.lifecycle.c1.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        androidx.lifecycle.c1.m(parcel, 8, this.f23357j, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}

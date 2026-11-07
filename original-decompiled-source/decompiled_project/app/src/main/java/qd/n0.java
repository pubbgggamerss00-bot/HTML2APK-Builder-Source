package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n0 extends qa.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22690c;

    public n0(String str, String str2, String str3) {
        this.f22688a = str;
        this.f22689b = str2;
        this.f22690c = str3;
    }

    public static zzaj<n0> d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzamVarZzg = zzaj.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzamVarZzg.zza(new n0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzamVarZzg.zza();
    }

    public static final n0 e(JSONObject jSONObject) throws JSONException {
        return new n0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22688a, false);
        c1.m(parcel, 2, this.f22689b, false);
        c1.m(parcel, 3, this.f22690c, false);
        c1.r(iQ, parcel);
    }
}

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.view.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e5.i;
import f3.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a3.a();
    public final String A;
    public final List<Scope> B;
    public final String C;
    public final String D;
    public final HashSet E = new HashSet();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2386t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2387u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2388v;

    /* renamed from: w, reason: collision with root package name */
    public final String f2389w;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f2390x;

    /* renamed from: y, reason: collision with root package name */
    public String f2391y;

    /* renamed from: z, reason: collision with root package name */
    public final long f2392z;

    public GoogleSignInAccount(int i6, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.s = i6;
        this.f2386t = str;
        this.f2387u = str2;
        this.f2388v = str3;
        this.f2389w = str4;
        this.f2390x = uri;
        this.f2391y = str5;
        this.f2392z = j6;
        this.A = str6;
        this.B = arrayList;
        this.C = str7;
        this.D = str8;
    }

    public static GoogleSignInAccount m(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j6 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new Scope(1, jSONArray.getString(i6)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j6, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2391y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.A.equals(this.A) && googleSignInAccount.l().equals(l());
    }

    public final int hashCode() {
        return l().hashCode() + g.d(527, 31, this.A);
    }

    public final HashSet l() {
        HashSet hashSet = new HashSet(this.B);
        hashSet.addAll(this.E);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        i.m(parcel, 2, this.f2386t);
        i.m(parcel, 3, this.f2387u);
        i.m(parcel, 4, this.f2388v);
        i.m(parcel, 5, this.f2389w);
        i.l(parcel, 6, this.f2390x, i6);
        i.m(parcel, 7, this.f2391y);
        i.r(parcel, 8, 8);
        parcel.writeLong(this.f2392z);
        i.m(parcel, 9, this.A);
        i.q(parcel, 10, this.B);
        i.m(parcel, 11, this.C);
        i.m(parcel, 12, this.D);
        i.t(iS, parcel);
    }
}

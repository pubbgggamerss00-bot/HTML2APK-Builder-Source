package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import ja.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qa.a;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f5853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5855c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5856d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5857e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f5858f;

    /* renamed from: g, reason: collision with root package name */
    public String f5859g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5860h;

    /* renamed from: j, reason: collision with root package name */
    public final String f5861j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5862k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5863l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5864m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f5865n = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5853a = i10;
        this.f5854b = str;
        this.f5855c = str2;
        this.f5856d = str3;
        this.f5857e = str4;
        this.f5858f = uri;
        this.f5859g = str5;
        this.f5860h = j10;
        this.f5861j = str6;
        this.f5862k = arrayList;
        this.f5863l = str7;
        this.f5864m = str8;
    }

    public static GoogleSignInAccount e(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        p.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j10, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5859g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final HashSet d() {
        HashSet hashSet = new HashSet(this.f5862k);
        hashSet.addAll(this.f5865n);
        return hashSet;
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
        return googleSignInAccount.f5861j.equals(this.f5861j) && googleSignInAccount.d().equals(d());
    }

    public final int hashCode() {
        return ((this.f5861j.hashCode() + 527) * 31) + d().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5853a);
        c1.m(parcel, 2, this.f5854b, false);
        c1.m(parcel, 3, this.f5855c, false);
        c1.m(parcel, 4, this.f5856d, false);
        c1.m(parcel, 5, this.f5857e, false);
        c1.l(parcel, 6, this.f5858f, i10, false);
        c1.m(parcel, 7, this.f5859g, false);
        c1.s(parcel, 8, 8);
        parcel.writeLong(this.f5860h);
        c1.m(parcel, 9, this.f5861j, false);
        c1.p(parcel, 10, this.f5862k, false);
        c1.m(parcel, 11, this.f5863l, false);
        c1.m(parcel, 12, this.f5864m, false);
        c1.r(iQ, parcel);
    }
}

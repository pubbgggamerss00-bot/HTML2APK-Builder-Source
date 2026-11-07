package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.c1;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ja.d;
import ja.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends qa.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f5866l;

    /* renamed from: m, reason: collision with root package name */
    public static final Scope f5867m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f5868n;

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f5869p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f5870q;

    /* renamed from: a, reason: collision with root package name */
    public final int f5871a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5872b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f5873c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5874d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5875e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5876f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5877g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5878h;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5879j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5880k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public HashSet f5881a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5882b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5883c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5884d;

        /* renamed from: e, reason: collision with root package name */
        public String f5885e;

        /* renamed from: f, reason: collision with root package name */
        public Account f5886f;

        /* renamed from: g, reason: collision with root package name */
        public String f5887g;

        /* renamed from: h, reason: collision with root package name */
        public HashMap f5888h;

        /* renamed from: i, reason: collision with root package name */
        public String f5889i;
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f5867m = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f5868n = scope3;
        f5869p = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f5869p)) {
            Scope scope4 = f5868n;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f5866l = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f5869p)) {
            Scope scope5 = f5868n;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new e();
        f5870q = new d();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap map, String str3) {
        this.f5871a = i10;
        this.f5872b = arrayList;
        this.f5873c = account;
        this.f5874d = z10;
        this.f5875e = z11;
        this.f5876f = z12;
        this.f5877g = str;
        this.f5878h = str2;
        this.f5879j = new ArrayList(map.values());
        this.f5880k = str3;
    }

    public static GoogleSignInOptions d(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap e(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ka.a aVar = (ka.a) obj;
                map.put(Integer.valueOf(aVar.f16226b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f5877g;
        ArrayList arrayList = this.f5872b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f5872b;
            String str2 = googleSignInOptions.f5877g;
            Account account = googleSignInOptions.f5873c;
            if (this.f5879j.isEmpty() && googleSignInOptions.f5879j.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f5873c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.f5876f == googleSignInOptions.f5876f && this.f5874d == googleSignInOptions.f5874d && this.f5875e == googleSignInOptions.f5875e) {
                    return TextUtils.equals(this.f5880k, googleSignInOptions.f5880k);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5872b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f5904b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f5873c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f5877g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f5876f ? 1 : 0)) * 31) + (this.f5874d ? 1 : 0)) * 31) + (this.f5875e ? 1 : 0)) * 31;
        String str2 = this.f5880k;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5871a);
        c1.p(parcel, 2, new ArrayList(this.f5872b), false);
        c1.l(parcel, 3, this.f5873c, i10, false);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f5874d ? 1 : 0);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f5875e ? 1 : 0);
        c1.s(parcel, 6, 4);
        parcel.writeInt(this.f5876f ? 1 : 0);
        c1.m(parcel, 7, this.f5877g, false);
        c1.m(parcel, 8, this.f5878h, false);
        c1.p(parcel, 9, this.f5879j, false);
        c1.m(parcel, 10, this.f5880k, false);
        c1.r(iQ, parcel);
    }
}

package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f5603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5604b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f5605c;

    public Purchase(String str, String str2) throws JSONException {
        this.f5603a = str;
        this.f5604b = str2;
        this.f5605c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f5605c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final int b() {
        return this.f5605c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final String c() {
        JSONObject jSONObject = this.f5605c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f5603a, purchase.f5603a) && TextUtils.equals(this.f5604b, purchase.f5604b);
    }

    public final int hashCode() {
        return this.f5603a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5603a));
    }
}

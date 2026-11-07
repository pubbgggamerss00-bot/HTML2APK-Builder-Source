package d8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f7542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7543b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7544c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7545d;

    public q(String str) throws JSONException {
        this.f7542a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7543b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f7544c = strOptString;
        this.f7545d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return TextUtils.equals(this.f7542a, ((q) obj).f7542a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7542a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f7543b);
        sb.append("', productType='");
        sb.append(this.f7544c);
        sb.append("', statusCode=");
        return x0.a.a(sb, this.f7545d, "}");
    }
}

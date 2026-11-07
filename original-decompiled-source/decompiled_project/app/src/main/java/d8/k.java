package d8;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f7503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7504c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7505d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7506e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7507f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7508g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7509h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7510i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f7511a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7512b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f7513c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7514d;

        /* renamed from: e, reason: collision with root package name */
        public final v0 f7515e;

        public a(JSONObject jSONObject) throws JSONException {
            this.f7511a = jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            v0 v0Var = null;
            this.f7512b = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f7513c = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f7513c.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                    jSONObjectOptJSONObject.optInt("percentageDiscount");
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                    jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                    jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject3 != null) {
                if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("startTimeMillis");
                }
                if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("endTimeMillis");
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getInt("maximumQuantity");
                jSONObjectOptJSONObject4.getInt("remainingQuantity");
            }
            this.f7514d = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject6 != null) {
                jSONObjectOptJSONObject6.getString("rentalPeriod");
                jSONObjectOptJSONObject6.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject7 != null) {
                v0Var = new v0();
                jSONObjectOptJSONObject7.getString("type");
            }
            this.f7515e = v0Var;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject8 != null) {
                    arrayList.add(new b(jSONObjectOptJSONObject8));
                }
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f7516a;

        public b(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            jSONObject.optString("priceCurrencyCode");
            this.f7516a = jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7517a;

        public c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new b(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f7517a = arrayList;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f7518a;

        /* renamed from: b, reason: collision with root package name */
        public final c f7519b;

        public d(JSONObject jSONObject) throws JSONException {
            jSONObject.optString("basePlanId");
            jSONObject.optString("offerId").getClass();
            this.f7518a = jSONObject.getString("offerIdToken");
            this.f7519b = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
                jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.optString("billingPeriod");
                    jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                    jSONObjectOptJSONObject3.optString("formattedPrice");
                    jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                    jSONObjectOptJSONObject3.optInt("recurrenceMode");
                    jSONObjectOptJSONObject3.optInt("billingCycleCount");
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
        }
    }

    public k(String str) throws JSONException {
        this.f7502a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7503b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f7504c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f7505d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f7506e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f7507f = jSONObject.optString("skuDetailsToken");
        this.f7508g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new d(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f7509h = arrayList;
        } else {
            this.f7509h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f7503b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f7503b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new a(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f7510i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f7510i = null;
        } else {
            arrayList2.add(new a(jSONObjectOptJSONObject));
            this.f7510i = arrayList2;
        }
    }

    public final a a() {
        ArrayList arrayList = this.f7510i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (a) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return TextUtils.equals(this.f7502a, ((k) obj).f7502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7502a.hashCode();
    }

    public final String toString() {
        String string = this.f7503b.toString();
        String strValueOf = String.valueOf(this.f7509h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        androidx.room.z0.a(sb, this.f7502a, "', parsedJson=", string, ", productId='");
        sb.append(this.f7504c);
        sb.append("', productType='");
        sb.append(this.f7505d);
        sb.append("', title='");
        sb.append(this.f7506e);
        sb.append("', productDetailsToken='");
        sb.append(this.f7507f);
        sb.append("', subscriptionOfferDetails=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}

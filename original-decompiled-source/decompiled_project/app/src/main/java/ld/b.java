package ld;

import android.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends kd.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16977d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f16978a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16979b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16980c;

    public b(String str, long j10, long j11) {
        com.google.android.gms.common.internal.p.d(str);
        this.f16978a = str;
        this.f16980c = j10;
        this.f16979b = j11;
    }

    public static b c(String str) {
        com.google.android.gms.common.internal.p.f(str);
        Map<String, Object> mapA = md.b.a(str);
        long jE = e("iat", mapA);
        return new b(str, (e("exp", mapA) - jE) * 1000, jE * 1000);
    }

    public static b d(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            Log.e("ld.b", "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    public static long e(String str, Map map) {
        com.google.android.gms.common.internal.p.f(map);
        com.google.android.gms.common.internal.p.d(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // kd.b
    public final long a() {
        return this.f16979b + this.f16980c;
    }

    @Override // kd.b
    public final String b() {
        return this.f16978a;
    }
}

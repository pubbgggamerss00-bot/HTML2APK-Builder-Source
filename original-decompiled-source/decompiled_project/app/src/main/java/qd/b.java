package qd;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22656c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f22657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22658b;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        zzan.zza(map);
    }

    public b(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        com.google.android.gms.common.internal.p.d(strA);
        com.google.android.gms.common.internal.p.d(strA2);
        this.f22657a = strA2;
        com.google.android.gms.common.internal.p.d(strA3);
        a(str, "continueUrl");
        a(str, "lang");
        this.f22658b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            com.google.android.gms.common.internal.p.d(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}

package d4;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {
        public static c a(Bundle data, String type) throws i4.b {
            kotlin.jvm.internal.r.e(type, "type");
            kotlin.jvm.internal.r.e(data, "data");
            try {
                int iHashCode = type.hashCode();
                if (iHashCode != -1678407252) {
                    if (iHashCode != -543568185) {
                        if (iHashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            try {
                                String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                                kotlin.jvm.internal.r.b(string);
                                return new j(data, string);
                            } catch (Exception unused) {
                                throw new i4.b();
                            }
                        }
                    } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        return new h(data);
                    }
                } else if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                    try {
                        String string2 = data.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                        kotlin.jvm.internal.r.b(string2);
                        Bundle bundle = new Bundle();
                        bundle.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                        f fVar = new f(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return fVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused3) {
                        throw new i4.b();
                    }
                }
                throw new i4.b();
            } catch (i4.b unused4) {
                d dVar = new d(data, type);
                if (type.length() > 0) {
                    return dVar;
                }
                throw new IllegalArgumentException("type should not be empty");
            }
        }
    }

    public c(Bundle data, String type) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(data, "data");
    }
}

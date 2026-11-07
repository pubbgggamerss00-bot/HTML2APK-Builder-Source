package d4;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f7352a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7353b;

    public static final class a {
        public static m a(Bundle data, String type) throws e4.t, i4.b {
            kotlin.jvm.internal.r.e(type, "type");
            kotlin.jvm.internal.r.e(data, "data");
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                            try {
                                Object obj = data.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                                kotlin.jvm.internal.r.b(obj);
                                return obj instanceof byte[] ? new w0(data, new String((byte[]) obj, mh.a.f18238b)) : new w0(data, (String) obj);
                            } catch (Exception unused) {
                                throw new i4.b();
                            }
                        }
                        throw new i4.b();
                    case -1072734346:
                        if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                            if (string == null) {
                                throw new e4.t("The device does not contain a restore credential.");
                            }
                            g1 g1Var = new g1(data, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return g1Var;
                                } catch (Exception unused2) {
                                }
                            }
                            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                        }
                        throw new i4.b();
                    case -543568185:
                        if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                            try {
                                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                                String string3 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                                kotlin.jvm.internal.r.b(string2);
                                kotlin.jvm.internal.r.b(string3);
                                return new d1(data, string3);
                            } catch (Exception unused3) {
                                throw new i4.b();
                            }
                        }
                        throw new i4.b();
                    case -95037569:
                        if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            try {
                                String string4 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                                kotlin.jvm.internal.r.b(string4);
                                return new f1(data, string4);
                            } catch (Exception unused4) {
                                throw new i4.b();
                            }
                        }
                        throw new i4.b();
                    default:
                        throw new i4.b();
                }
            } catch (i4.b unused5) {
                return new v0(data, type);
            }
        }
    }

    public m(Bundle data, String type) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(data, "data");
        this.f7352a = type;
        this.f7353b = data;
    }
}

package d4;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends c {
    public j(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}

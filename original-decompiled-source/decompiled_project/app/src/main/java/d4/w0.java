package d4;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w0 extends m {
    public w0(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
    }
}

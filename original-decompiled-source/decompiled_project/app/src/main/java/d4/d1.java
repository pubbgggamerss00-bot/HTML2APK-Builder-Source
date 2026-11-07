package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d1 extends m {
    public d1(Bundle bundle, String str) {
        super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }
}

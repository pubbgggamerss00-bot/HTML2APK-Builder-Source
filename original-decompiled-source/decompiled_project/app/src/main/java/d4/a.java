package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7350a = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7351b;

    public a() {
        Bundle bundle = new Bundle();
        this.f7351b = bundle;
        if (!"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE") && !"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            throw new IllegalArgumentException(i8.n.d("The request type ", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", " is not supported."));
        }
        if ("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
        }
    }
}

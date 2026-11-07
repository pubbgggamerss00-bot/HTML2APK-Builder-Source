package n4;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import d4.c;
import d4.m;
import d4.y0;
import e4.g;
import e4.o;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class a {
    public static g a(Intent intent) {
        CreateCredentialException createCredentialException = (CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
        if (createCredentialException == null) {
            return null;
        }
        String type = createCredentialException.getType();
        r.d(type, "getType(...)");
        return i4.a.a(createCredentialException.getMessage(), type);
    }

    public static c b(Intent intent, String str) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        r.d(data, "getData(...)");
        return c.a.a(data, str);
    }

    public static o c(Intent intent) {
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        r.d(type, "getType(...)");
        return i4.a.b(getCredentialException.getMessage(), type);
    }

    public static y0 d(Intent intent) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        r.d(credential, "getCredential(...)");
        String type = credential.getType();
        r.d(type, "getType(...)");
        Bundle data = credential.getData();
        r.d(data, "getData(...)");
        return new y0(m.a.a(data, type));
    }
}

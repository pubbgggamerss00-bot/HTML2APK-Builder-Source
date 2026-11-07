package kc;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f16288a = new b0("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) throws NoSuchAlgorithmException {
        String strEncodeToString;
        if (signatureArr == null || (signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            b0 b0Var = f16288a;
            b0Var.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", b0.c(b0Var.f16263a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
        } else {
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    strEncodeToString = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                    return true;
                }
                String str = Build.TAGS;
                if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                    return true;
                }
            }
        }
        return false;
    }
}

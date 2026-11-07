package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f11762a;

    public static synchronized String a(Context context) {
        String str;
        try {
            if (f11762a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || p0.a()) {
                    string = "emulator";
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                f11762a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11762a;
    }
}

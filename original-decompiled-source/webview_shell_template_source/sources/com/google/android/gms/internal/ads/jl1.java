package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final il1 f6105a = new il1("PhoneskyVerificationUtils");

    public static boolean a(Context context) throws NoSuchAlgorithmException {
        Signature[] signatureArr;
        String strEncodeToString;
        il1 il1Var = f6105a;
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            il1Var.d("Play Store package is not found.", new Object[0]);
        }
        if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            il1Var.d("Play Store package is disabled.", new Object[0]);
            return false;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused2) {
            il1Var.d("Play Store package is not found.", new Object[0]);
        }
        if (signatureArr == null || (signatureArr.length) == 0) {
            il1Var.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused3) {
                strEncodeToString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            arrayList.add(strEncodeToString);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        il1Var.d(androidx.camera.camera2.internal.v0.b("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
        return false;
    }
}

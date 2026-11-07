package com.basitce.htmltoapk.data.apkgenerator;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.room.w0;
import com.android.apksig.ApkVerifier;
import java.io.File;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.r;
import pg.p;
import pg.q;
import qg.o;
import qg.p;
import qg.t;

/* loaded from: classes.dex */
public final class BuildHost {
    private static volatile Boolean cached;
    public static final BuildHost INSTANCE = new BuildHost();
    private static final Set<String> known = o.C(new String[]{"67e9ba0a08e1cfdedac26b20c17c0e1717a502e4fce3137b358f055c9d50aa51", "1cf8497b42acd2a8224cb4f355e4acc4f813cb07403a346cd12691753c11d64b", "0a6477f0c5a093d6c4249c47a062dc1a8085a76beed62d50b91873c0a1caef39", "a72870645d641e45a1ec264461bf054d648107c7c820e63d7098a280af6da068"});
    public static final int $stable = 8;

    private BuildHost() {
    }

    private final String sha256(String str) {
        byte[] bytes = str.getBytes(mh.a.f18238b);
        r.d(bytes, "getBytes(...)");
        return sha256(bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256$lambda$10(byte b10) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
    }

    private final List<String> systemSigners(Context context) {
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
        if (signingInfo != null) {
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null) {
                t.q(arrayList, apkContentsSigners);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory != null) {
                t.q(arrayList, signingCertificateHistory);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            BuildHost buildHost = INSTANCE;
            byte[] byteArray = ((Signature) obj).toByteArray();
            r.d(byteArray, "toByteArray(...)");
            arrayList2.add(buildHost.sha256(byteArray));
        }
        return arrayList2;
    }

    public final boolean decide$app_release(List<String> fileSigners, List<String> systemSigners) {
        boolean z10;
        boolean z11;
        r.e(fileSigners, "fileSigners");
        r.e(systemSigners, "systemSigners");
        if (fileSigners.isEmpty()) {
            return true;
        }
        if (!fileSigners.isEmpty()) {
            Iterator<T> it = fileSigners.iterator();
            while (it.hasNext()) {
                if (matchesDigest$app_release((String) it.next())) {
                    return true;
                }
            }
        }
        if (fileSigners.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it2 = fileSigners.iterator();
            while (it2.hasNext()) {
                if (systemSigners.contains((String) it2.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (systemSigners.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it3 = systemSigners.iterator();
            while (it3.hasNext()) {
                if (matchesDigest$app_release((String) it3.next())) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        return z10 && z11;
    }

    public final boolean genuine(Context context) {
        Object objA;
        r.e(context, "context");
        Boolean bool = cached;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            List<X509Certificate> signerCertificates = new ApkVerifier.Builder(new File(context.getApplicationInfo().sourceDir)).build().verify().getSignerCertificates();
            r.b(signerCertificates);
            ArrayList arrayList = new ArrayList(p.h(signerCertificates, 10));
            Iterator<T> it = signerCertificates.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((X509Certificate) it.next()).getEncoded();
                r.d(encoded, "getEncoded(...)");
                arrayList.add(sha256(encoded));
            }
            objA = Boolean.valueOf(decide$app_release(arrayList, systemSigners(context)));
        } catch (Throwable th2) {
            objA = q.a(th2);
        }
        Object obj = Boolean.TRUE;
        if (objA instanceof p.a) {
            objA = obj;
        }
        Boolean bool2 = (Boolean) objA;
        boolean zBooleanValue = bool2.booleanValue();
        cached = bool2;
        return zBooleanValue;
    }

    public final boolean matches$app_release(byte[] certificate) {
        r.e(certificate, "certificate");
        return matchesDigest$app_release(sha256(certificate));
    }

    public final boolean matchesDigest$app_release(String certificateSha256) {
        r.e(certificateSha256, "certificateSha256");
        Set<String> set = known;
        String lowerCase = certificateSha256.toLowerCase(Locale.ROOT);
        r.d(lowerCase, "toLowerCase(...)");
        return set.contains(sha256("htmltoapk-shell:".concat(lowerCase)));
    }

    private final String sha256(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        r.d(bArrDigest, "digest(...)");
        return o.y(bArrDigest, "", new w0(1), 30);
    }
}

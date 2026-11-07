package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class se {

    /* renamed from: a, reason: collision with root package name */
    public final vs1 f8911a;

    /* renamed from: b, reason: collision with root package name */
    public final pf f8912b;

    /* renamed from: c, reason: collision with root package name */
    public final gd f8913c;

    public se(Context context, Executor executor, gd gdVar, pf pfVar) {
        this.f8912b = pfVar;
        this.f8913c = gdVar;
        vs1 vs1Var = new vs1(new oe(this, context, 0));
        executor.execute(vs1Var);
        this.f8911a = vs1Var;
    }

    public static String a(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i6 = fileInputStream.read(bArr); i6 != -1; i6 = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i6);
                }
                aq1 aq1VarG = aq1.f2828a.g();
                byte[] bArrDigest = messageDigest.digest();
                String strD = aq1VarG.d(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strD;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }
}

package ie;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import id.e;
import id.l;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f14513c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14515b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(e eVar) {
        eVar.a();
        this.f14514a = eVar.f14480a.getSharedPreferences("com.google.android.gms.appid", 0);
        eVar.a();
        l lVar = eVar.f14482c;
        String str = lVar.f14496e;
        if (str == null) {
            eVar.a();
            str = lVar.f14493b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                    }
                }
            }
        }
        this.f14515b = str;
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f14514a) {
            String strEncodeToString = null;
            String string = this.f14514a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & RegisterType.DOUBLE_HI) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}

package l9;

import android.util.Base64;
import com.android.billingclient.api.Purchase;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f16879a = {new int[]{3, 3, 112, 117, 117, 3, 112, 117, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 2, 117, 2, 3, CertificateBody.profileType, 118, 114, 4, 6, 126, 118, CertificateBody.profileType, 126, 115, 119, 2, 118, 117, 1, 114, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 115, 112, 115, 113, 4, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 1, 6, 117, 117, 5, 3, 115, 6, 4, CertificateBody.profileType, 3, 112, 118, CertificateBody.profileType, 4, 4, 119, 4, 114, 114, 5, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 5, 118, 2, 3, 115, 6}, new int[]{112, 114, 119, 118, 4, 5, 112, 115, 118, 119, 119, 4, 126, 3, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 4, 119, 115, 126, 117, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 3, 115, 6, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 118, 112, 126, 119, 6, 118, 113, 126, 2, 117, 1, 126, 3, 6, 117, 2, 4, 126, 5, 2, 118, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 1, 1, 6, 119, 6, 114, 119, 6, 6, 114, 115, 126, 6, 114, 112, 1, CertificateBody.profileType}, new int[]{2, 2, 2, 113, 6, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 3, 119, 6, 114, 4, 5, 6, 115, 4, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 5, 117, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 117, 112, 114, 2, 4, 2, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 4, 126, 112, 6, 1, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 1, 114, 5, 126, 113, 119, 3, 115, 119, CertificateBody.profileType, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 119, 3, 2, 113, 113, 112, 119, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 115, 2, CertificateBody.profileType, 2, CertificateBody.profileType, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 126, 2, 115, 4, CertificateBody.profileType, 113, 117}, new int[]{CertificateBody.profileType, 126, 117, 119, 114, 118, 2, 117, 119, 6, 117, 113, 4, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, CertificateBody.profileType, 119, 2, 118, 112, 114, 113, 115, CertificateBody.profileType, 115, 4, 117, 119, 5, 1, 117, 115, 113, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 126, 112, 6, 115, 5, 112, 113, 113, 113, CertificateBody.profileType, 113, 115, 4, 2, 119, 2, 2, 114, 4, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 3, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 126, 5, 2, 4, 118, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, CertificateBody.profileType, 2, 113}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16880b = {22, 18, 18, 25, 18, 49, 26, 21, 25, 60, 48, 42, 51, 48, 50, 28, 98, 44, 107, 25, 26, 10, 30, 29, 26, 26, 20, 24, 26, 10, 99, 26, 22, 18, 18, 25, 24, 60, 16, 24, 26, 10, 30, 26, HeaderItem.DATA_SIZE_OFFSET, 58, 14, 21, 48, 14, 13, 30, 45, 17, 99, 56, 35, 105, 19, 42, 15, 51, 25, 26, 63, HeaderItem.DATA_START_OFFSET, 53, 44, 20, 50, HeaderItem.DATA_SIZE_OFFSET, 1, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 45, 33, 30, 47, 24, 8, 43, 2, 17, 33, 61, 3, 8, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 61, 111, 54, 11, 111, 56, 21, 58, 8, 50, 60, HeaderItem.DATA_SIZE_OFFSET, 99, 9, 43, 54, 35, 24, 52, 1, 111, 14, 24, 54, 52, 23, 17, 41, 17, 25, 34, 106, 63, 24, 31, 99, 26, HeaderItem.DATA_SIZE_OFFSET, 47, 46, 8, 63, 43, 43, 42, 35, 107, 53, 98, 12, 49, 56, HeaderItem.DATA_SIZE_OFFSET, 22, 41, 48, 106, 30, 19, 13, 33, 111, 23, 13, 3, 11, 3, 61, 42, 2, 8, 53, 45, 62, 2, 45, 45, 28, 44, 20, 9, 111, 26, 25, 28, 107, 14, 18, 57, 52, 19, 51, 43, 20, 34, 30, 107, 41, 41, 19, 61, 25, 17, 17, 107, 19, 17, 2, 16, 56, 10, 34, 112, 24, 11, 46, 17, 109, 61, 21, 22, 47, 98, 56, 12, 48, 56, 58, 99, 99, 22, 20, 12, HeaderItem.DATA_SIZE_OFFSET, 53, 106, 57, 19, 9, 9, 2, 52, 11, 21, 107, 61, 35, 106, 14, 44, 25, 22, 25, 9, 10, 17, 52, 111, 25, 63, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 18, 50, 99, 26, 10, 48, 14, 51, 62, 41, 54, 15, 23, 44, 106, 20, 40, 61, 61, 24, 48, 105, 46, 10, 99, 11, 28, 35, 22, 107, 50, 62, 16, 25, 99, 56, 41, 112, 26, 41, 53, 15, 11, 61, 62, 43, 53, 61, 62, 17, 45, 109, 46, 98, 35, 45, 44, 42, 106, 54, 54, 24, 109, 63, 12, 43, 16, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 99, 15, 41, 112, 62, 16, 28, 31, 26, 110, 51, 109, 50, 26, HeaderItem.DATA_START_OFFSET, 51, 12, 34, 11, 98, 57, 111, 106, 17, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 28, 63, 111, 56, 1, 2, 1, 30, 21, 28, 45, 33, 109, 107, 15, 14, 16, 3, 16, 53, 63, 44, 51, 16, 29, 25, 106, 49, 54, 48, 23, 30, 56, 17, 24, 19, 2, 56, 18, 16, 17, 47, 99, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 44, 18, 31, 26, 10, 26, 25};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f16881c = {72, 84, 77, 76, 95, 84, 79, 95, 65, 80, 75, 95, 83, 69, 67, 85, 82, 73, 84, 89, 95, 50, 48, 50, 54, 95, 72, 77, 65, 67, 95, 33};

    public static String a(String payload) throws NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.r.e(payload, "payload");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f16881c, "HmacSHA256"));
            byte[] bytes = payload.getBytes(mh.a.f18238b);
            kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
            return Base64.encodeToString(mac.doFinal(bytes), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str, String installationSalt) {
        kotlin.jvm.internal.r.e(installationSalt, "installationSalt");
        return str + "_PREMIUM_ACTIVE_v2_" + installationSalt;
    }

    public static boolean c(Purchase purchase) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (purchase.b() == 1) {
            String str = purchase.f5603a;
            kotlin.jvm.internal.r.d(str, "getOriginalJson(...)");
            String str2 = purchase.f5604b;
            kotlin.jvm.internal.r.d(str2, "getSignature(...)");
            if (!mh.x.A(str) && !mh.x.A(str2)) {
                char[] cArr = new char[392];
                for (int i10 = 0; i10 < 392; i10++) {
                    cArr[i10] = (char) (f16880b[i10] ^ 91);
                }
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new String(cArr), 0)));
                    kotlin.jvm.internal.r.d(publicKeyGeneratePublic, "generatePublic(...)");
                    Signature signature = Signature.getInstance("SHA1withRSA");
                    signature.initVerify(publicKeyGeneratePublic);
                    Charset charset = mh.a.f18238b;
                    byte[] bytes = str.getBytes(charset);
                    kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                    signature.update(bytes);
                    byte[] bArrDecode = Base64.decode(str2, 0);
                    if (signature.verify(bArrDecode)) {
                        return true;
                    }
                    Signature signature2 = Signature.getInstance("SHA256withRSA");
                    signature2.initVerify(publicKeyGeneratePublic);
                    byte[] bytes2 = str.getBytes(charset);
                    kotlin.jvm.internal.r.d(bytes2, "getBytes(...)");
                    signature2.update(bytes2);
                    return signature2.verify(bArrDecode);
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}

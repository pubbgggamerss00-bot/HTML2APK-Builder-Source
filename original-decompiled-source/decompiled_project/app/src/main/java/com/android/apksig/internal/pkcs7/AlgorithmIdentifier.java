package com.android.apksig.internal.pkcs7;

import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.util.Pair;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import k3.b;
import m3.a;

@Asn1Class(type = Asn1Type.SEQUENCE)
/* loaded from: classes.dex */
public class AlgorithmIdentifier {

    @Asn1Field(index = 0, type = Asn1Type.OBJECT_IDENTIFIER)
    public String algorithm;

    @Asn1Field(index = 1, optional = true, type = Asn1Type.ANY)
    public Asn1OpaqueObject parameters;

    /* renamed from: com.android.apksig.internal.pkcs7.AlgorithmIdentifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;

        static {
            int[] iArr = new int[DigestAlgorithm.values().length];
            $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm = iArr;
            try {
                iArr[DigestAlgorithm.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[DigestAlgorithm.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AlgorithmIdentifier() {
    }

    public static String getJcaDigestAlgorithm(String str) throws SignatureException {
        String str2 = OidConstants.OID_TO_JCA_DIGEST_ALG.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(a.a("Unsupported digest algorithm: ", str));
    }

    public static String getJcaSignatureAlgorithm(String str, String str2) throws SignatureException {
        String str3;
        String str4 = OidConstants.OID_TO_JCA_SIGNATURE_ALG.get(str2);
        if (str4 != null) {
            return str4;
        }
        if ("1.2.840.113549.1.1.1".equals(str2)) {
            str3 = "RSA";
        } else if (OidConstants.OID_SIG_DSA.equals(str2)) {
            str3 = "DSA";
        } else {
            if (!OidConstants.OID_SIG_EC_PUBLIC_KEY.equals(str2)) {
                throw new SignatureException(b6.a.b("Unsupported JCA Signature algorithm . Digest algorithm: ", str, ", signature algorithm: ", str2));
            }
            str3 = "ECDSA";
        }
        String jcaDigestAlgorithm = getJcaDigestAlgorithm(str);
        if (jcaDigestAlgorithm.startsWith("SHA-")) {
            jcaDigestAlgorithm = "SHA" + jcaDigestAlgorithm.substring(4);
        }
        return b.a(jcaDigestAlgorithm, "with", str3);
    }

    public static AlgorithmIdentifier getSignerInfoDigestAlgorithmOid(DigestAlgorithm digestAlgorithm) {
        int i10 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[digestAlgorithm.ordinal()];
        if (i10 == 1) {
            return new AlgorithmIdentifier(OidConstants.OID_DIGEST_SHA1, Asn1DerEncoder.ASN1_DER_NULL);
        }
        if (i10 == 2) {
            return new AlgorithmIdentifier(OidConstants.OID_DIGEST_SHA256, Asn1DerEncoder.ASN1_DER_NULL);
        }
        throw new IllegalArgumentException("Unsupported digest algorithm: " + digestAlgorithm);
    }

    public static Pair<String, AlgorithmIdentifier> getSignerInfoSignatureAlgorithm(PublicKey publicKey, DigestAlgorithm digestAlgorithm, boolean z10) throws InvalidKeyException {
        String str;
        AlgorithmIdentifier algorithmIdentifier;
        String algorithm = publicKey.getAlgorithm();
        int[] iArr = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
        int i10 = iArr[digestAlgorithm.ordinal()];
        if (i10 == 1) {
            str = "SHA1";
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + digestAlgorithm);
            }
            str = "SHA256";
        }
        if ("RSA".equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return Pair.of(str.concat("withRSA"), new AlgorithmIdentifier("1.2.840.113549.1.1.1", Asn1DerEncoder.ASN1_DER_NULL));
        }
        if (!"DSA".equalsIgnoreCase(algorithm)) {
            if ("EC".equalsIgnoreCase(algorithm)) {
                return Pair.of(str.concat("withECDSA"), new AlgorithmIdentifier(OidConstants.OID_SIG_EC_PUBLIC_KEY, Asn1DerEncoder.ASN1_DER_NULL));
            }
            throw new InvalidKeyException(a.a("Unsupported key algorithm: ", algorithm));
        }
        int i11 = iArr[digestAlgorithm.ordinal()];
        if (i11 == 1) {
            algorithmIdentifier = new AlgorithmIdentifier(OidConstants.OID_SIG_DSA, Asn1DerEncoder.ASN1_DER_NULL);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + digestAlgorithm);
            }
            algorithmIdentifier = new AlgorithmIdentifier(OidConstants.OID_SIG_SHA256_WITH_DSA, Asn1DerEncoder.ASN1_DER_NULL);
        }
        return Pair.of(str.concat(z10 ? "withDetDSA" : "withDSA"), algorithmIdentifier);
    }

    public AlgorithmIdentifier(String str, Asn1OpaqueObject asn1OpaqueObject) {
        this.algorithm = str;
        this.parameters = asn1OpaqueObject;
    }
}

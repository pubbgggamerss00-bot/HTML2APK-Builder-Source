package org.bouncycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformation;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class TSPUtil {
    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private static final Map digestLengths;
    private static final Map digestNames;

    static {
        HashMap map = new HashMap();
        digestLengths = map;
        HashMap map2 = new HashMap();
        digestNames = map2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md5;
        map.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        map.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha224;
        map.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(28));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha256;
        map.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha384;
        map.put(aSN1ObjectIdentifier5.getId(), Integers.valueOf(48));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512;
        map.put(aSN1ObjectIdentifier6.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_sha3_224;
        map.put(aSN1ObjectIdentifier7.getId(), Integers.valueOf(28));
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha3_256;
        map.put(aSN1ObjectIdentifier8.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_sha3_384;
        map.put(aSN1ObjectIdentifier9.getId(), Integers.valueOf(48));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha3_512;
        map.put(aSN1ObjectIdentifier10.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = TeleTrusTObjectIdentifiers.ripemd128;
        map.put(aSN1ObjectIdentifier11.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = TeleTrusTObjectIdentifiers.ripemd160;
        map.put(aSN1ObjectIdentifier12.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = TeleTrusTObjectIdentifiers.ripemd256;
        map.put(aSN1ObjectIdentifier13.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = CryptoProObjectIdentifiers.gostR3411;
        map.put(aSN1ObjectIdentifier14.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256;
        map.put(aSN1ObjectIdentifier15.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512;
        map.put(aSN1ObjectIdentifier16.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = GMObjectIdentifiers.sm3;
        map.put(aSN1ObjectIdentifier17.getId(), Integers.valueOf(32));
        map2.put(aSN1ObjectIdentifier.getId(), "MD5");
        map2.put(aSN1ObjectIdentifier2.getId(), "SHA1");
        map2.put(aSN1ObjectIdentifier3.getId(), "SHA224");
        map2.put(aSN1ObjectIdentifier4.getId(), "SHA256");
        map2.put(aSN1ObjectIdentifier5.getId(), "SHA384");
        map2.put(aSN1ObjectIdentifier6.getId(), "SHA512");
        map2.put(aSN1ObjectIdentifier7.getId(), "SHA3-224");
        map2.put(aSN1ObjectIdentifier8.getId(), "SHA3-256");
        map2.put(aSN1ObjectIdentifier9.getId(), "SHA3-384");
        map2.put(aSN1ObjectIdentifier10.getId(), "SHA3-512");
        map2.put(PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "SHA1");
        map2.put(PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), "SHA224");
        map2.put(PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), "SHA256");
        map2.put(PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), "SHA384");
        map2.put(PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), "SHA512");
        map2.put(aSN1ObjectIdentifier11.getId(), "RIPEMD128");
        map2.put(aSN1ObjectIdentifier12.getId(), "RIPEMD160");
        map2.put(aSN1ObjectIdentifier13.getId(), "RIPEMD256");
        map2.put(aSN1ObjectIdentifier14.getId(), "GOST3411");
        map2.put(aSN1ObjectIdentifier15.getId(), "GOST3411-2012-256");
        map2.put(aSN1ObjectIdentifier16.getId(), "GOST3411-2012-512");
        map2.put(aSN1ObjectIdentifier17.getId(), "SM3");
    }

    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws TSPIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable);
        } catch (IOException e10) {
            throw new TSPIOException(b.a(e10, new StringBuilder("cannot encode extension: ")), e10);
        }
    }

    public static int getDigestLength(String str) throws TSPException {
        Integer num = (Integer) digestLengths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TSPException("digest algorithm cannot be found.");
    }

    public static List getExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_LIST : Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    public static Collection getSignatureTimestamps(SignerInformation signerInformation, DigestCalculatorProvider digestCalculatorProvider) throws TSPValidationException, IOException {
        ArrayList arrayList = new ArrayList();
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            ASN1EncodableVector all = unsignedAttributes.getAll(PKCSObjectIdentifiers.id_aa_signatureTimeStampToken);
            for (int i10 = 0; i10 < all.size(); i10++) {
                ASN1Set attrValues = ((Attribute) all.get(i10)).getAttrValues();
                for (int i11 = 0; i11 < attrValues.size(); i11++) {
                    try {
                        TimeStampToken timeStampToken = new TimeStampToken(ContentInfo.getInstance(attrValues.getObjectAt(i11)));
                        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampInfo.getHashAlgorithm());
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(signerInformation.getSignature());
                        outputStream.close();
                        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(digestCalculator.getDigest(), timeStampInfo.getMessageImprintDigest())) {
                            throw new TSPValidationException("Incorrect digest in message imprint");
                        }
                        arrayList.add(timeStampToken);
                    } catch (OperatorCreationException unused) {
                        throw new TSPValidationException("Unknown hash algorithm specified in timestamp");
                    } catch (Exception unused2) {
                        throw new TSPValidationException("Timestamp could not be parsed");
                    }
                }
            }
        }
        return arrayList;
    }

    public static void validateCertificate(X509CertificateHolder x509CertificateHolder) throws TSPValidationException {
        if (x509CertificateHolder.toASN1Structure().getVersionNumber() != 3) {
            throw new IllegalArgumentException("Certificate must have an ExtendedKeyUsage extension.");
        }
        Extension extension = x509CertificateHolder.getExtension(Extension.extendedKeyUsage);
        if (extension == null) {
            throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension.");
        }
        if (!extension.isCritical()) {
            throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension marked as critical.");
        }
        ExtendedKeyUsage extendedKeyUsage = ExtendedKeyUsage.getInstance(extension.getParsedValue());
        if (!extendedKeyUsage.hasKeyPurposeId(KeyPurposeId.id_kp_timeStamping) || extendedKeyUsage.size() != 1) {
            throw new TSPValidationException("ExtendedKeyUsage not solely time stamping.");
        }
    }
}

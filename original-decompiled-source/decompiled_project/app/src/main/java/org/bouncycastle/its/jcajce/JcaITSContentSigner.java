package org.bouncycastle.its.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class JcaITSContentSigner implements ITSContentSigner {
    private final ASN1ObjectIdentifier curveID;
    private final DigestCalculator digest;
    private final AlgorithmIdentifier digestAlgo;
    private final JcaJceHelper helper;
    private final byte[] parentData;
    private final byte[] parentDigest;
    private final ECPrivateKey privateKey;
    private final String signer;
    private final ITSCertificate signerCert;

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        /* JADX WARN: Multi-variable type inference failed */
        public JcaITSContentSigner build(PrivateKey privateKey) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, null, this.helper);
        }

        public Builder setProvider(String str) {
            this.helper = new NamedJcaJceHelper(str);
            return this;
        }

        public JcaITSContentSigner build(PrivateKey privateKey, ITSCertificate iTSCertificate) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, iTSCertificate, this.helper);
        }

        public Builder setProvider(Provider provider) {
            this.helper = new ProviderJcaJceHelper(provider);
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JcaITSContentSigner(ECPrivateKey eCPrivateKey, ITSCertificate iTSCertificate, JcaJceHelper jcaJceHelper) throws IOException {
        this.privateKey = eCPrivateKey;
        this.signerCert = iTSCertificate;
        this.helper = jcaJceHelper;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(PrivateKeyInfo.getInstance(eCPrivateKey.getEncoded()).getPrivateKeyAlgorithm().getParameters());
        this.curveID = aSN1ObjectIdentifier;
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) SECObjectIdentifiers.secp256r1) && !aSN1ObjectIdentifier.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                throw new IllegalArgumentException("unknown key type");
            }
            this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
            this.signer = "SHA384withECDSA";
            try {
                try {
                    DigestCalculator digestCalculator = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
                    this.digest = digestCalculator;
                    if (iTSCertificate != null) {
                        this.parentData = null;
                        this.parentDigest = digestCalculator.getDigest();
                        return;
                    }
                    try {
                        byte[] encoded = iTSCertificate.getEncoded();
                        this.parentData = encoded;
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(encoded, 0, encoded.length);
                        outputStream.close();
                        this.parentDigest = digestCalculator.getDigest();
                        return;
                    } catch (IOException e10) {
                        throw new IllegalStateException(b.a(e10, new StringBuilder("signer certificate encoding failed: ")));
                    }
                } catch (OperatorCreationException e11) {
                    throw new IllegalStateException("cannot recognise digest type: " + this.digestAlgo.getAlgorithm(), e11);
                }
            } catch (Exception e12) {
                throw new IllegalStateException(e12.getMessage(), e12);
            }
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        this.digestAlgo = algorithmIdentifier;
        this.signer = "SHA256withECDSA";
        DigestCalculator digestCalculator2 = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
        this.digest = digestCalculator2;
        if (iTSCertificate != null) {
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public ITSCertificate getAssociatedCertificate() {
        return this.signerCert;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getAssociatedCertificateDigest() {
        return Arrays.clone(this.parentDigest);
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public ASN1ObjectIdentifier getCurveID() {
        return this.curveID;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgo;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public OutputStream getOutputStream() {
        return this.digest.getOutputStream();
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getSignature() throws SignatureException, InvalidKeyException {
        byte[] digest = this.digest.getDigest();
        try {
            Signature signatureCreateSignature = this.helper.createSignature(this.signer);
            signatureCreateSignature.initSign(this.privateKey);
            signatureCreateSignature.update(digest, 0, digest.length);
            byte[] bArr = this.parentDigest;
            signatureCreateSignature.update(bArr, 0, bArr.length);
            return signatureCreateSignature.sign();
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public boolean isForSelfSigning() {
        return this.parentData == null;
    }
}

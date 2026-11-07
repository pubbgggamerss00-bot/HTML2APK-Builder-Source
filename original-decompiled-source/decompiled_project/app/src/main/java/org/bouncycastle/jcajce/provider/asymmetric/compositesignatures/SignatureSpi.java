package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private byte[] OIDBytes;
    private final CompositeSignaturesConstants.CompositeName algorithmIdentifier;
    private final ASN1ObjectIdentifier algorithmIdentifierASN1;
    private final List<Signature> componentSignatures;
    private final Digest digest;

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName;

        static {
            int[] iArr = new int[CompositeSignaturesConstants.CompositeName.values().length];
            $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName = iArr;
            try {
                iArr[CompositeSignaturesConstants.CompositeName.MLDSA44_Ed25519_SHA512.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_Ed25519_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_Ed448_SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PSS_SHA256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PSS_SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PKCS15_SHA256.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PKCS15_SHA512.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_P256_SHA256.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_P256_SHA512.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_P384_SHA512.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_P256_SHA256.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_Ed25519_SHA512.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static final class Falcon512_ECDSA_P256_SHA256 extends SignatureSpi {
        public Falcon512_ECDSA_P256_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_P256_SHA256);
        }
    }

    public static final class Falcon512_ECDSA_brainpoolP256r1_SHA256 extends SignatureSpi {
        public Falcon512_ECDSA_brainpoolP256r1_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256);
        }
    }

    public static final class Falcon512_Ed25519_SHA512 extends SignatureSpi {
        public Falcon512_Ed25519_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.Falcon512_Ed25519_SHA512);
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_P256_SHA256);
        }
    }

    public static final class MLDSA44_ECDSA_brainpoolP256r1_SHA256 extends SignatureSpi {
        public MLDSA44_ECDSA_brainpoolP256r1_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA44_Ed25519_SHA512);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PSS_SHA256);
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_P256_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_P256_SHA512);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA65_Ed25519_SHA512);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PKCS15_SHA512);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PSS_SHA512);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_P384_SHA512);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512);
        }
    }

    public static final class MLDSA87_Ed448_SHA512 extends SignatureSpi {
        public MLDSA87_Ed448_SHA512() {
            super(CompositeSignaturesConstants.CompositeName.MLDSA87_Ed448_SHA512);
        }
    }

    public SignatureSpi(CompositeSignaturesConstants.CompositeName compositeName) {
        Digest digestCreateSHA256;
        this.algorithmIdentifier = compositeName;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CompositeSignaturesConstants.compositeNameASN1IdentifierMap.get(compositeName);
        this.algorithmIdentifierASN1 = aSN1ObjectIdentifier;
        ArrayList arrayList = new ArrayList();
        try {
            switch (AnonymousClass1.$SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[compositeName.ordinal()]) {
                case 1:
                case 2:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance(EdDSAParameterSpec.Ed25519, BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 3:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance(EdDSAParameterSpec.Ed448, BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 4:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA256withRSA/PSS", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA256();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 5:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA512withRSA/PSS", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 6:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA256withRSA", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA256();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 7:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA512withRSA", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 8:
                case 9:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA256withECDSA", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA256();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 10:
                case 11:
                case 12:
                case 13:
                    arrayList.add(Signature.getInstance("Dilithium", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA512withECDSA", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 14:
                case 15:
                    arrayList.add(Signature.getInstance("Falcon", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance("SHA256withECDSA", BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA256();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                case 16:
                    arrayList.add(Signature.getInstance("Falcon", BouncyCastleProvider.PROVIDER_NAME));
                    arrayList.add(Signature.getInstance(EdDSAParameterSpec.Ed25519, BouncyCastleProvider.PROVIDER_NAME));
                    digestCreateSHA256 = DigestFactory.createSHA512();
                    this.digest = digestCreateSHA256;
                    this.OIDBytes = aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER);
                    this.componentSignatures = Collections.unmodifiableList(arrayList);
                    return;
                default:
                    throw new IllegalArgumentException("unknown composite algorithm");
            }
        } catch (IOException e10) {
            throw Exceptions.illegalStateException(e10.getMessage(), e10);
        } catch (GeneralSecurityException e11) {
            throw Exceptions.illegalStateException(e11.getMessage(), e11);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof CompositePrivateKey)) {
            throw new InvalidKeyException("Private key is not composite.");
        }
        CompositePrivateKey compositePrivateKey = (CompositePrivateKey) privateKey;
        if (!compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithmIdentifierASN1)) {
            throw new InvalidKeyException("Provided composite private key cannot be used with the composite signature algorithm.");
        }
        for (int i10 = 0; i10 < this.componentSignatures.size(); i10++) {
            this.componentSignatures.get(i10).initSign(compositePrivateKey.getPrivateKeys().get(i10));
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof CompositePublicKey)) {
            throw new InvalidKeyException("Public key is not composite.");
        }
        CompositePublicKey compositePublicKey = (CompositePublicKey) publicKey;
        if (!compositePublicKey.getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithmIdentifierASN1)) {
            throw new InvalidKeyException("Provided composite public key cannot be used with the composite signature algorithm.");
        }
        for (int i10 = 0; i10 < this.componentSignatures.size(); i10++) {
            this.componentSignatures.get(i10).initVerify(compositePublicKey.getPublicKeys().get(i10));
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        try {
            byte[] bArr = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr, 0);
            for (int i10 = 0; i10 < this.componentSignatures.size(); i10++) {
                this.componentSignatures.get(i10).update(this.OIDBytes);
                this.componentSignatures.get(i10).update(bArr);
                aSN1EncodableVector.add(new DERBitString(this.componentSignatures.get(i10).sign()));
            }
            return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
        } catch (IOException e10) {
            throw new SignatureException(e10.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.digest.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        if (aSN1Sequence.size() != this.componentSignatures.size()) {
            return false;
        }
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        boolean z10 = false;
        for (int i10 = 0; i10 < this.componentSignatures.size(); i10++) {
            this.componentSignatures.get(i10).update(this.OIDBytes);
            this.componentSignatures.get(i10).update(bArr2);
            if (!this.componentSignatures.get(i10).verify(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets())) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.digest.update(bArr, i10, i11);
    }
}

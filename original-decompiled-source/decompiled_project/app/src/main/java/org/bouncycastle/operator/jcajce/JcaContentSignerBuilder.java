package org.bouncycastle.operator.jcajce;

import androidx.security.crypto.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: classes3.dex */
public class JcaContentSignerBuilder {
    private static final Set isAlgIdFromPrivate;
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private SecureRandom random;
    private AlgorithmIdentifier sigAlgId;
    private AlgorithmParameterSpec sigAlgSpec;
    private final String signatureAlgorithm;

    static {
        HashSet hashSet = new HashSet();
        isAlgIdFromPrivate = hashSet;
        hashSet.add("DILITHIUM");
        hashSet.add("SPHINCS+");
        hashSet.add("SPHINCSPlus");
    }

    public JcaContentSignerBuilder(String str) {
        this.signatureAlgorithm = str;
    }

    private ContentSigner buildComposite(CompositePrivateKey compositePrivateKey) throws OperatorCreationException, IOException, InvalidKeyException {
        try {
            List<PrivateKey> privateKeys = compositePrivateKey.getPrivateKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.sigAlgId.getParameters());
            int size = aSN1Sequence.size();
            Signature[] signatureArr = new Signature[size];
            for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
                Signature signatureCreateSignature = this.helper.createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10)));
                signatureArr[i10] = signatureCreateSignature;
                if (this.random != null) {
                    signatureCreateSignature.initSign(privateKeys.get(i10), this.random);
                } else {
                    signatureCreateSignature.initSign(privateKeys.get(i10));
                }
            }
            OutputStream outputStreamCreateStream = OutputStreamFactory.createStream(signatureArr[0]);
            int i11 = 1;
            while (i11 != size) {
                TeeOutputStream teeOutputStream = new TeeOutputStream(outputStreamCreateStream, OutputStreamFactory.createStream(signatureArr[i11]));
                i11++;
                outputStreamCreateStream = teeOutputStream;
            }
            return new ContentSigner(outputStreamCreateStream, signatureArr) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.2
                OutputStream stream;
                final /* synthetic */ OutputStream val$sigStream;
                final /* synthetic */ Signature[] val$sigs;

                {
                    this.val$sigStream = outputStreamCreateStream;
                    this.val$sigs = signatureArr;
                    this.stream = outputStreamCreateStream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return JcaContentSignerBuilder.this.sigAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        for (int i12 = 0; i12 != this.val$sigs.length; i12++) {
                            aSN1EncodableVector.add(new DERBitString(this.val$sigs[i12].sign()));
                        }
                        return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                    } catch (IOException e10) {
                        throw new RuntimeOperatorException(b.a(e10, new StringBuilder("exception encoding signature: ")), e10);
                    } catch (SignatureException e11) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e11.getMessage(), e11);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create signer: ")), e10);
        }
    }

    private static ASN1Sequence createCompParams(CompositeAlgorithmSpec compositeAlgorithmSpec) {
        DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new DefaultSignatureAlgorithmIdentifierFinder();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        List<String> algorithmNames = compositeAlgorithmSpec.getAlgorithmNames();
        List<AlgorithmParameterSpec> parameterSpecs = compositeAlgorithmSpec.getParameterSpecs();
        for (int i10 = 0; i10 != algorithmNames.size(); i10++) {
            AlgorithmParameterSpec algorithmParameterSpec = parameterSpecs.get(i10);
            if (algorithmParameterSpec == null) {
                aSN1EncodableVector.add(defaultSignatureAlgorithmIdentifierFinder.find(algorithmNames.get(i10)));
            } else {
                if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                    throw new IllegalArgumentException("unrecognized parameterSpec");
                }
                aSN1EncodableVector.add(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams((PSSParameterSpec) algorithmParameterSpec)));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private static RSASSAPSSparams createPSSParams(PSSParameterSpec pSSParameterSpec) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        AlgorithmIdentifier algorithmIdentifierFind = defaultDigestAlgorithmIdentifierFinder.find(pSSParameterSpec.getDigestAlgorithm());
        if (algorithmIdentifierFind.getParameters() == null) {
            algorithmIdentifierFind = new AlgorithmIdentifier(algorithmIdentifierFind.getAlgorithm(), DERNull.INSTANCE);
        }
        AlgorithmIdentifier algorithmIdentifierFind2 = defaultDigestAlgorithmIdentifierFinder.find(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (algorithmIdentifierFind2.getParameters() == null) {
            algorithmIdentifierFind2 = new AlgorithmIdentifier(algorithmIdentifierFind2.getAlgorithm(), DERNull.INSTANCE);
        }
        return new RSASSAPSSparams(algorithmIdentifierFind, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifierFind2), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField()));
    }

    public ContentSigner build(PrivateKey privateKey) throws OperatorCreationException {
        if (privateKey instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) privateKey;
            if (compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
                return buildComposite(compositePrivateKey);
            }
        }
        try {
            if (this.sigAlgSpec == null) {
                this.sigAlgId = isAlgIdFromPrivate.contains(Strings.toUpperCase(this.signatureAlgorithm)) ? PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm() : new DefaultSignatureAlgorithmIdentifierFinder().find(this.signatureAlgorithm);
                this.sigAlgSpec = null;
            }
            AlgorithmIdentifier algorithmIdentifier = this.sigAlgId;
            Signature signatureCreateSignature = this.helper.createSignature(algorithmIdentifier);
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                signatureCreateSignature.initSign(privateKey, secureRandom);
            } else {
                signatureCreateSignature.initSign(privateKey);
            }
            return new ContentSigner(signatureCreateSignature, algorithmIdentifier) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.1
                private OutputStream stream;
                final /* synthetic */ Signature val$sig;
                final /* synthetic */ AlgorithmIdentifier val$signatureAlgId;

                {
                    this.val$sig = signatureCreateSignature;
                    this.val$signatureAlgId = algorithmIdentifier;
                    this.stream = OutputStreamFactory.createStream(signatureCreateSignature);
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.val$signatureAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.val$sig.sign();
                    } catch (SignatureException e10) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e10.getMessage(), e10);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create signer: ")), e10);
        }
    }

    public JcaContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcaContentSignerBuilder(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        AlgorithmIdentifier algorithmIdentifier;
        this.signatureAlgorithm = str;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            this.sigAlgSpec = pSSParameterSpec;
            algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams(pSSParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof CompositeAlgorithmSpec)) {
                throw new IllegalArgumentException("unknown sigParamSpec: ".concat(algorithmParameterSpec == null ? "null" : algorithmParameterSpec.getClass().getName()));
            }
            CompositeAlgorithmSpec compositeAlgorithmSpec = (CompositeAlgorithmSpec) algorithmParameterSpec;
            this.sigAlgSpec = compositeAlgorithmSpec;
            algorithmIdentifier = new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite, createCompParams(compositeAlgorithmSpec));
        }
        this.sigAlgId = algorithmIdentifier;
    }

    public JcaContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}

package org.bouncycastle.cert.crmf;

import com.google.protobuf.DescriptorProtos;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.PBEMacCalculatorProvider;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import p.i0;
import x0.a;

/* loaded from: classes2.dex */
public class PKMACBuilder implements PBEMacCalculatorProvider {
    private PKMACValuesCalculator calculator;
    private int iterationCount;
    private AlgorithmIdentifier mac;
    private int maxIterations;
    private AlgorithmIdentifier owf;
    private PBMParameter parameters;
    private SecureRandom random;
    private int saltLength;

    private PKMACBuilder(AlgorithmIdentifier algorithmIdentifier, int i10, AlgorithmIdentifier algorithmIdentifier2, PKMACValuesCalculator pKMACValuesCalculator) {
        this.saltLength = 20;
        this.owf = algorithmIdentifier;
        this.iterationCount = i10;
        this.mac = algorithmIdentifier2;
        this.calculator = pKMACValuesCalculator;
    }

    private void checkIterationCountCeiling(int i10) {
        int i11 = this.maxIterations;
        if (i11 > 0 && i10 > i11) {
            throw new IllegalArgumentException(a.a(i0.b(i10, "iteration count exceeds limit (", " > "), this.maxIterations, ")"));
        }
    }

    private MacCalculator genCalculator(final PBMParameter pBMParameter, char[] cArr) throws CRMFException {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        final byte[] bArrCalculateDigest = new byte[uTF8ByteArray.length + octets.length];
        System.arraycopy(uTF8ByteArray, 0, bArrCalculateDigest, 0, uTF8ByteArray.length);
        System.arraycopy(octets, 0, bArrCalculateDigest, uTF8ByteArray.length, octets.length);
        this.calculator.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int iIntValueExact = pBMParameter.getIterationCount().intValueExact();
        do {
            bArrCalculateDigest = this.calculator.calculateDigest(bArrCalculateDigest);
            iIntValueExact--;
        } while (iIntValueExact > 0);
        return new MacCalculator() { // from class: org.bouncycastle.cert.crmf.PKMACBuilder.1
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();

            @Override // org.bouncycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), bArrCalculateDigest);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return PKMACBuilder.this.calculator.calculateMac(bArrCalculateDigest, this.bOut.toByteArray());
                } catch (CRMFException e10) {
                    throw new RuntimeOperatorException("exception calculating mac: " + e10.getMessage(), e10);
                }
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return this.bOut;
            }
        };
    }

    private PBMParameter genParameters() {
        byte[] bArr = new byte[this.saltLength];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        return new PBMParameter(bArr, this.owf, this.iterationCount, this.mac);
    }

    public MacCalculator build(char[] cArr) throws CRMFException {
        PBMParameter pBMParameterGenParameters = this.parameters;
        if (pBMParameterGenParameters == null) {
            pBMParameterGenParameters = genParameters();
        }
        return genCalculator(pBMParameterGenParameters, cArr);
    }

    @Override // org.bouncycastle.operator.PBEMacCalculatorProvider
    public MacCalculator get(AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws OperatorCreationException {
        if (!CMPObjectIdentifiers.passwordBasedMac.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm())) {
            throw new OperatorCreationException("protection algorithm not mac based");
        }
        setParameters(PBMParameter.getInstance(algorithmIdentifier.getParameters()));
        try {
            return build(cArr);
        } catch (CRMFException e10) {
            throw new OperatorCreationException(e10.getMessage(), e10.getCause());
        }
    }

    public PKMACBuilder setIterationCount(int i10) {
        if (i10 < 100) {
            throw new IllegalArgumentException("iteration count must be at least 100");
        }
        checkIterationCountCeiling(i10);
        this.iterationCount = i10;
        return this;
    }

    public PKMACBuilder setParameters(PBMParameter pBMParameter) {
        checkIterationCountCeiling(pBMParameter.getIterationCount().intValueExact());
        this.parameters = pBMParameter;
        return this;
    }

    public PKMACBuilder setSaltLength(int i10) {
        if (i10 < 8) {
            throw new IllegalArgumentException("salt length must be at least 8 bytes");
        }
        this.saltLength = i10;
        return this;
    }

    public PKMACBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator) {
        this(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1), DescriptorProtos.Edition.EDITION_2023_VALUE, new AlgorithmIdentifier(IANAObjectIdentifiers.hmacSHA1, DERNull.INSTANCE), pKMACValuesCalculator);
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator, int i10) {
        this.saltLength = 20;
        this.maxIterations = i10;
        this.calculator = pKMACValuesCalculator;
    }
}

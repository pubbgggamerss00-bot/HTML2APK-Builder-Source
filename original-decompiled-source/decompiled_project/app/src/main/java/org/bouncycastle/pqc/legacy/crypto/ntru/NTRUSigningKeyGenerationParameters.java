package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* loaded from: classes3.dex */
public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public static final int BASIS_TYPE_STANDARD = 0;
    public static final int BASIS_TYPE_TRANSPOSE = 1;
    public static final int KEY_GEN_ALG_FLOAT = 1;
    public static final int KEY_GEN_ALG_RESULTANT = 0;
    public int B;
    public int N;
    public int basisType;
    double beta;
    public double betaSq;
    int bitsF;

    /* renamed from: d, reason: collision with root package name */
    public int f20512d;

    /* renamed from: d1, reason: collision with root package name */
    public int f20513d1;

    /* renamed from: d2, reason: collision with root package name */
    public int f20514d2;

    /* renamed from: d3, reason: collision with root package name */
    public int f20515d3;
    public Digest hashAlg;
    public int keyGenAlg;
    double keyNormBound;
    public double keyNormBoundSq;
    double normBound;
    public double normBoundSq;
    public int polyType;
    public boolean primeCheck;

    /* renamed from: q, reason: collision with root package name */
    public int f20516q;
    public int signFailTolerance;
    public boolean sparse;
    public static final NTRUSigningKeyGenerationParameters APR2011_439 = new NTRUSigningKeyGenerationParameters(439, 2048, 146, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_439_PROD = new NTRUSigningKeyGenerationParameters(439, 2048, 9, 8, 5, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743 = new NTRUSigningKeyGenerationParameters(743, 2048, 248, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743_PROD = new NTRUSigningKeyGenerationParameters(743, 2048, 11, 11, 15, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157 = new NTRUSigningKeyGenerationParameters(157, 256, 29, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157_PROD = new NTRUSigningKeyGenerationParameters(157, 256, 5, 5, 8, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());

    public NTRUSigningKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, double d10, double d11, double d12, boolean z10, boolean z11, int i15, Digest digest) {
        super(CryptoServicesRegistrar.getSecureRandom(), i10);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i10;
        this.f20516q = i11;
        this.f20512d = i12;
        this.B = i13;
        this.basisType = i14;
        this.beta = d10;
        this.normBound = d11;
        this.keyNormBound = d12;
        this.primeCheck = z10;
        this.sparse = z11;
        this.keyGenAlg = i15;
        this.hashAlg = digest;
        this.polyType = 0;
        init();
    }

    private void init() {
        double d10 = this.beta;
        this.betaSq = d10 * d10;
        double d11 = this.normBound;
        this.normBoundSq = d11 * d11;
        double d12 = this.keyNormBound;
        this.keyNormBoundSq = d12 * d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningKeyGenerationParameters)) {
            return false;
        }
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = (NTRUSigningKeyGenerationParameters) obj;
        if (this.B != nTRUSigningKeyGenerationParameters.B || this.N != nTRUSigningKeyGenerationParameters.N || this.basisType != nTRUSigningKeyGenerationParameters.basisType || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.betaSq) || this.bitsF != nTRUSigningKeyGenerationParameters.bitsF || this.f20512d != nTRUSigningKeyGenerationParameters.f20512d || this.f20513d1 != nTRUSigningKeyGenerationParameters.f20513d1 || this.f20514d2 != nTRUSigningKeyGenerationParameters.f20514d2 || this.f20515d3 != nTRUSigningKeyGenerationParameters.f20515d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.keyGenAlg == nTRUSigningKeyGenerationParameters.keyGenAlg && Double.doubleToLongBits(this.keyNormBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBound) && Double.doubleToLongBits(this.keyNormBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBoundSq) && Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBoundSq) && this.polyType == nTRUSigningKeyGenerationParameters.polyType && this.primeCheck == nTRUSigningKeyGenerationParameters.primeCheck && this.f20516q == nTRUSigningKeyGenerationParameters.f20516q && this.signFailTolerance == nTRUSigningKeyGenerationParameters.signFailTolerance && this.sparse == nTRUSigningKeyGenerationParameters.sparse;
    }

    public NTRUSigningParameters getSigningParameters() {
        return new NTRUSigningParameters(this.N, this.f20516q, this.f20512d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public int hashCode() {
        int i10 = ((((this.B + 31) * 31) + this.N) * 31) + this.basisType;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i12 = ((((((((((((i11 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f20512d) * 31) + this.f20513d1) * 31) + this.f20514d2) * 31) + this.f20515d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = ((i12 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + this.keyGenAlg;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.keyNormBound);
        int i13 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.keyNormBoundSq);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.normBound);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.normBoundSq);
        return (((((((((((i15 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31) + this.polyType) * 31) + (this.primeCheck ? 1231 : 1237)) * 31) + this.f20516q) * 31) + this.signFailTolerance) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb2 = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f20516q);
        if (this.polyType == 0) {
            sb = new StringBuilder(" polyType=SIMPLE d=");
            i10 = this.f20512d;
        } else {
            sb = new StringBuilder(" polyType=PRODUCT d1=");
            sb.append(this.f20513d1);
            sb.append(" d2=");
            sb.append(this.f20514d2);
            sb.append(" d3=");
            i10 = this.f20515d3;
        }
        sb.append(i10);
        sb2.append(sb.toString());
        sb2.append(" B=" + this.B + " basisType=" + this.basisType + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " keyNormBound=" + decimalFormat.format(this.keyNormBound) + " prime=" + this.primeCheck + " sparse=" + this.sparse + " keyGenAlg=" + this.keyGenAlg + " hashAlg=" + this.hashAlg + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f20516q);
        dataOutputStream.writeInt(this.f20512d);
        dataOutputStream.writeInt(this.f20513d1);
        dataOutputStream.writeInt(this.f20514d2);
        dataOutputStream.writeInt(this.f20515d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeInt(this.basisType);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeDouble(this.keyNormBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeBoolean(this.primeCheck);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.write(this.keyGenAlg);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
        dataOutputStream.write(this.polyType);
    }

    public NTRUSigningKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, double d10, double d11, double d12, boolean z10, boolean z11, int i17, Digest digest) {
        super(CryptoServicesRegistrar.getSecureRandom(), i10);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i10;
        this.f20516q = i11;
        this.f20513d1 = i12;
        this.f20514d2 = i13;
        this.f20515d3 = i14;
        this.B = i15;
        this.basisType = i16;
        this.beta = d10;
        this.normBound = d11;
        this.keyNormBound = d12;
        this.primeCheck = z10;
        this.sparse = z11;
        this.keyGenAlg = i17;
        this.hashAlg = digest;
        this.polyType = 1;
        init();
    }

    public NTRUSigningKeyGenerationParameters clone() {
        return this.polyType == 0 ? new NTRUSigningKeyGenerationParameters(this.N, this.f20516q, this.f20512d, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg) : new NTRUSigningKeyGenerationParameters(this.N, this.f20516q, this.f20513d1, this.f20514d2, this.f20515d3, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
    }

    public NTRUSigningKeyGenerationParameters(InputStream inputStream) throws IOException {
        Digest sHA256Digest;
        super(CryptoServicesRegistrar.getSecureRandom(), 0);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f20516q = dataInputStream.readInt();
        this.f20512d = dataInputStream.readInt();
        this.f20513d1 = dataInputStream.readInt();
        this.f20514d2 = dataInputStream.readInt();
        this.f20515d3 = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.basisType = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.keyNormBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.primeCheck = dataInputStream.readBoolean();
        this.sparse = dataInputStream.readBoolean();
        this.bitsF = dataInputStream.readInt();
        this.keyGenAlg = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        if (!"SHA-512".equals(utf)) {
            sHA256Digest = "SHA-256".equals(utf) ? new SHA256Digest() : sHA256Digest;
            this.polyType = dataInputStream.read();
            init();
        }
        sHA256Digest = new SHA512Digest();
        this.hashAlg = sHA256Digest;
        this.polyType = dataInputStream.read();
        init();
    }
}

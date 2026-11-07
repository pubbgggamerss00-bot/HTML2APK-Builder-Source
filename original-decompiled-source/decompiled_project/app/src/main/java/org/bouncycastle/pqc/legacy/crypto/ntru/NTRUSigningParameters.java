package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* loaded from: classes3.dex */
public class NTRUSigningParameters implements Cloneable {
    public int B;
    public int N;
    double beta;
    public double betaSq;
    int bitsF;

    /* renamed from: d, reason: collision with root package name */
    public int f20517d;

    /* renamed from: d1, reason: collision with root package name */
    public int f20518d1;

    /* renamed from: d2, reason: collision with root package name */
    public int f20519d2;

    /* renamed from: d3, reason: collision with root package name */
    public int f20520d3;
    public Digest hashAlg;
    double normBound;
    public double normBoundSq;

    /* renamed from: q, reason: collision with root package name */
    public int f20521q;
    public int signFailTolerance;

    public NTRUSigningParameters(int i10, int i11, int i12, int i13, double d10, double d11, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i10;
        this.f20521q = i11;
        this.f20517d = i12;
        this.B = i13;
        this.beta = d10;
        this.normBound = d11;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        double d10 = this.beta;
        this.betaSq = d10 * d10;
        double d11 = this.normBound;
        this.normBoundSq = d11 * d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningParameters)) {
            return false;
        }
        NTRUSigningParameters nTRUSigningParameters = (NTRUSigningParameters) obj;
        if (this.B != nTRUSigningParameters.B || this.N != nTRUSigningParameters.N || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningParameters.betaSq) || this.bitsF != nTRUSigningParameters.bitsF || this.f20517d != nTRUSigningParameters.f20517d || this.f20518d1 != nTRUSigningParameters.f20518d1 || this.f20519d2 != nTRUSigningParameters.f20519d2 || this.f20520d3 != nTRUSigningParameters.f20520d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningParameters.normBoundSq) && this.f20521q == nTRUSigningParameters.f20521q && this.signFailTolerance == nTRUSigningParameters.signFailTolerance;
    }

    public int hashCode() {
        int i10 = ((this.B + 31) * 31) + this.N;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i12 = ((((((((((((i11 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f20517d) * 31) + this.f20518d1) * 31) + this.f20519d2) * 31) + this.f20520d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = i12 + (digest == null ? 0 : digest.getAlgorithmName().hashCode());
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.normBound);
        int i13 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.normBoundSq);
        return (((((i13 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f20521q) * 31) + this.signFailTolerance;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f20521q);
        sb.append(" B=" + this.B + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " hashAlg=" + this.hashAlg + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f20521q);
        dataOutputStream.writeInt(this.f20517d);
        dataOutputStream.writeInt(this.f20518d1);
        dataOutputStream.writeInt(this.f20519d2);
        dataOutputStream.writeInt(this.f20520d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUSigningParameters(int i10, int i11, int i12, int i13, int i14, int i15, double d10, double d11, double d12, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i10;
        this.f20521q = i11;
        this.f20518d1 = i12;
        this.f20519d2 = i13;
        this.f20520d3 = i14;
        this.B = i15;
        this.beta = d10;
        this.normBound = d11;
        this.hashAlg = digest;
        init();
    }

    public NTRUSigningParameters clone() {
        return new NTRUSigningParameters(this.N, this.f20521q, this.f20517d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public NTRUSigningParameters(InputStream inputStream) throws IOException {
        Digest sHA256Digest;
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f20521q = dataInputStream.readInt();
        this.f20517d = dataInputStream.readInt();
        this.f20518d1 = dataInputStream.readInt();
        this.f20519d2 = dataInputStream.readInt();
        this.f20520d3 = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.bitsF = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (!"SHA-512".equals(utf)) {
            sHA256Digest = "SHA-256".equals(utf) ? new SHA256Digest() : sHA256Digest;
            init();
        }
        sHA256Digest = new SHA512Digest();
        this.hashAlg = sHA256Digest;
        init();
    }
}

package org.bouncycastle.pqc.crypto.lms;

import androidx.datastore.preferences.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
class LMSSignature implements Encodable {
    private final LMOtsSignature otsSignature;
    private final LMSigParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f20388q;

    /* renamed from: y, reason: collision with root package name */
    private final byte[][] f20389y;

    public LMSSignature(int i10, LMOtsSignature lMOtsSignature, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f20388q = i10;
        this.otsSignature = lMOtsSignature;
        this.parameter = lMSigParameters;
        this.f20389y = bArr;
    }

    public static LMSSignature getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSSignature) {
            return (LMSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i10 = dataInputStream.readInt();
            LMOtsSignature lMOtsSignature = LMOtsSignature.getInstance(obj);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h10 = parametersForType.getH();
            byte[][] bArr = new byte[h10][];
            for (int i11 = 0; i11 < h10; i11++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i11] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new LMSSignature(i10, lMOtsSignature, parametersForType, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(z0.a(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSSignature lMSSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSSignature;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSSignature lMSSignature = (LMSSignature) obj;
        if (this.f20388q != lMSSignature.f20388q) {
            return false;
        }
        LMOtsSignature lMOtsSignature = this.otsSignature;
        if (lMOtsSignature == null ? lMSSignature.otsSignature != null : !lMOtsSignature.equals(lMSSignature.otsSignature)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        if (lMSigParameters == null ? lMSSignature.parameter == null : lMSigParameters.equals(lMSSignature.parameter)) {
            return Arrays.deepEquals(this.f20389y, lMSSignature.f20389y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f20388q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.f20389y).build();
    }

    public LMOtsSignature getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f20388q;
    }

    public byte[][] getY() {
        return this.f20389y;
    }

    public int hashCode() {
        int i10 = this.f20388q * 31;
        LMOtsSignature lMOtsSignature = this.otsSignature;
        int iHashCode = (i10 + (lMOtsSignature != null ? lMOtsSignature.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return Arrays.deepHashCode(this.f20389y) + ((iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }
}

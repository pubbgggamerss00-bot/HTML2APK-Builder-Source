package org.bouncycastle.pqc.crypto.lms;

import androidx.datastore.preferences.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
class LMOtsPublicKey implements Encodable {
    private final byte[] I;
    private final byte[] K;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f20385q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i10, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.f20385q = i10;
        this.K = bArr2;
    }

    public static LMOtsPublicKey getInstance(Object obj) throws Exception {
        if (obj instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, i10, bArr2);
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
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
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

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.f20385q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj;
            if (this.f20385q == lMOtsPublicKey.f20385q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.I, lMOtsPublicKey.I) && Arrays.areEqual(this.K, lMOtsPublicKey.K)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.I).u32str(this.f20385q).bytes(this.K).build();
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getK() {
        return this.K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f20385q;
    }

    public int hashCode() {
        return Arrays.hashCode(this.K) + ((Arrays.hashCode(this.I) + ((Objects.hashCode(this.parameter) + (this.f20385q * 31)) * 31)) * 31);
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.f20385q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }
}

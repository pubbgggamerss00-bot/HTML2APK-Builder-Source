package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes2.dex */
public final class Ed25519PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    private final Ed25519.PublicPoint publicPoint;

    public Ed25519PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[32];
        if (32 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of Ed25519 public key");
        }
        this.publicPoint = parse(bArr, 0);
    }

    private static Ed25519.PublicPoint parse(byte[] bArr, int i10) {
        Ed25519.PublicPoint publicPointValidatePublicKeyPartialExport = Ed25519.validatePublicKeyPartialExport(bArr, i10);
        if (publicPointValidatePublicKeyPartialExport != null) {
            return publicPointValidatePublicKeyPartialExport;
        }
        throw new IllegalArgumentException("invalid public key");
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public void encode(byte[] bArr, int i10) {
        Ed25519.encodePublicPoint(this.publicPoint, bArr, i10);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[32];
        encode(bArr, 0);
        return bArr;
    }

    public boolean verify(int i10, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        if (i10 == 0) {
            if (bArr == null) {
                return Ed25519.verify(bArr3, i13, this.publicPoint, bArr2, i11, i12);
            }
            throw new IllegalArgumentException("ctx");
        }
        if (i10 == 1) {
            if (bArr == null) {
                throw new NullPointerException("'ctx' cannot be null");
            }
            if (bArr.length <= 255) {
                return Ed25519.verify(bArr3, i13, this.publicPoint, bArr, bArr2, i11, i12);
            }
            throw new IllegalArgumentException("ctx");
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("algorithm");
        }
        if (bArr == null) {
            throw new NullPointerException("'ctx' cannot be null");
        }
        if (bArr.length > 255) {
            throw new IllegalArgumentException("ctx");
        }
        if (64 == i12) {
            return Ed25519.verifyPrehash(bArr3, i13, this.publicPoint, bArr, bArr2, i11);
        }
        throw new IllegalArgumentException("msgLen");
    }

    public Ed25519PublicKeyParameters(Ed25519.PublicPoint publicPoint) {
        super(false);
        if (publicPoint == null) {
            throw new NullPointerException("'publicPoint' cannot be null");
        }
        this.publicPoint = publicPoint;
    }

    public Ed25519PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed25519PublicKeyParameters(byte[] bArr, int i10) {
        super(false);
        this.publicPoint = parse(bArr, i10);
    }
}

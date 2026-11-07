package org.bouncycastle.jcajce.provider.symmetric.util;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    String algorithm;
    int digest;
    private final AtomicBoolean hasBeenDestroyed;
    private final int iterationCount;
    int ivSize;
    int keySize;
    ASN1ObjectIdentifier oid;
    private final CipherParameters param;
    private final char[] password;
    private final byte[] salt;
    boolean tryWrong;
    int type;

    public BCPBEKey(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10, int i11, int i12, int i13, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.oid = aSN1ObjectIdentifier;
        this.type = i10;
        this.digest = i11;
        this.keySize = i12;
        this.ivSize = i13;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = cipherParameters;
    }

    public static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        char[] cArr = this.password;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        String str = this.algorithm;
        checkDestroyed(this);
        return str;
    }

    public int getDigest() {
        int i10 = this.digest;
        checkDestroyed(this);
        return i10;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArrPKCS12PasswordToBytes;
        CipherParameters parameters = this.param;
        if (parameters != null) {
            if (parameters instanceof ParametersWithIV) {
                parameters = ((ParametersWithIV) parameters).getParameters();
            }
            bArrPKCS12PasswordToBytes = ((KeyParameter) parameters).getKey();
        } else {
            int i10 = this.type;
            bArrPKCS12PasswordToBytes = i10 == 2 ? PBEParametersGenerator.PKCS12PasswordToBytes(this.password) : i10 == 5 ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.password) : PBEParametersGenerator.PKCS5PasswordToBytes(this.password);
        }
        checkDestroyed(this);
        return bArrPKCS12PasswordToBytes;
    }

    @Override // java.security.Key
    public String getFormat() {
        checkDestroyed(this);
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        int i10 = this.iterationCount;
        checkDestroyed(this);
        return i10;
    }

    public int getIvSize() {
        int i10 = this.ivSize;
        checkDestroyed(this);
        return i10;
    }

    public int getKeySize() {
        int i10 = this.keySize;
        checkDestroyed(this);
        return i10;
    }

    public ASN1ObjectIdentifier getOID() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.oid;
        checkDestroyed(this);
        return aSN1ObjectIdentifier;
    }

    public CipherParameters getParam() {
        CipherParameters cipherParameters = this.param;
        checkDestroyed(this);
        return cipherParameters;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        char[] cArrClone = Arrays.clone(this.password);
        checkDestroyed(this);
        if (cArrClone != null) {
            return cArrClone;
        }
        throw new IllegalStateException("no password available");
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        byte[] bArrClone = Arrays.clone(this.salt);
        checkDestroyed(this);
        return bArrClone;
    }

    public int getType() {
        int i10 = this.type;
        checkDestroyed(this);
        return i10;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z10) {
        this.tryWrong = z10;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    public BCPBEKey(String str, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.param = cipherParameters;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }
}

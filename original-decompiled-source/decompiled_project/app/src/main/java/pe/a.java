package pe;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ECFieldFp f21433d;

    /* renamed from: e, reason: collision with root package name */
    public static final EllipticCurve f21434e;

    /* renamed from: f, reason: collision with root package name */
    public static final ECParameterSpec f21435f;

    /* renamed from: g, reason: collision with root package name */
    public static final SecureRandom f21436g;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21437a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21438b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f21439c;

    static {
        BigInteger bigInteger = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger bigInteger2 = new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369");
        BigInteger bigIntegerSubtract = bigInteger.subtract(new BigInteger("3"));
        BigInteger bigInteger3 = new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16);
        ECPoint eCPoint = new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16));
        ECFieldFp eCFieldFp = new ECFieldFp(bigInteger);
        f21433d = eCFieldFp;
        EllipticCurve ellipticCurve = new EllipticCurve(eCFieldFp, bigIntegerSubtract, bigInteger3);
        f21434e = ellipticCurve;
        f21435f = new ECParameterSpec(ellipticCurve, eCPoint, bigInteger2, 1);
        f21436g = new SecureRandom();
    }

    public a(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        byte[] bArr2 = new byte[4];
        this.f21437a = bArr2;
        if (bArr == null) {
            throw new IllegalArgumentException("publicKey is null");
        }
        if (bArr.length != 68) {
            throw new IllegalArgumentException("publicKey should be 68 bytes");
        }
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 4, 36)), new BigInteger(1, Arrays.copyOfRange(bArr, 36, 68)));
        BigInteger p10 = f21433d.getP();
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(p10) != -1) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(p10) != -1) {
            throw new GeneralSecurityException("y is out of range");
        }
        BigInteger bigIntegerMod = affineY.multiply(affineY).mod(p10);
        BigInteger bigIntegerMultiply = affineX.multiply(affineX);
        EllipticCurve ellipticCurve = f21434e;
        if (!bigIntegerMod.equals(bigIntegerMultiply.add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(p10))) {
            throw new GeneralSecurityException("point is not on the curve");
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        ECParameterSpec eCParameterSpec = f21435f;
        keyPairGenerator.initialize(eCParameterSpec);
        KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
        ECPoint w4 = ((ECPublicKey) keyPairGenKeyPair.getPublic()).getW();
        byte[] bArr3 = new byte[64];
        b(w4.getAffineX(), bArr3, 0);
        b(w4.getAffineY(), bArr3, 32);
        this.f21438b = bArr3;
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(eCPrivateKey);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        byte[] bArr4 = new byte[bArrGenerateSecret.length + 64];
        System.arraycopy(bArr3, 0, bArr4, 0, 64);
        System.arraycopy(bArrGenerateSecret, 0, bArr4, 64, bArrGenerateSecret.length);
        byte[] bytes = "GOOGLE_KEYMASTER".getBytes(StandardCharsets.UTF_8);
        Mac mac = Mac.getInstance("HMACSHA256");
        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], mac.getAlgorithm()));
        mac.init(new SecretKeySpec(mac.doFinal(bArr4), mac.getAlgorithm()));
        int macLength = mac.getMacLength();
        int i10 = 16 / macLength;
        i10 = i10 * macLength != 16 ? i10 + 1 : i10;
        if (i10 > 255) {
            throw new IllegalArgumentException("extracting too many bytes at once");
        }
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[0];
        int i11 = 0;
        while (i11 < i10) {
            mac.update(bArr6);
            mac.update(bytes);
            int i12 = i11 + 1;
            mac.update((byte) i12);
            byte[] bArrDoFinal = mac.doFinal();
            int i13 = i10 - 1;
            if (i11 < i13) {
                System.arraycopy(bArrDoFinal, 0, bArr5, i11 * macLength, macLength);
            } else {
                System.arraycopy(bArrDoFinal, 0, bArr5, i11 * macLength, 16 - (i13 * macLength));
            }
            i11 = i12;
            bArr6 = bArrDoFinal;
        }
        this.f21439c = bArr5;
    }

    public static void b(BigInteger bigInteger, byte[] bArr, int i10) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > 33) {
            throw new IllegalArgumentException("Array is too small to hold this BigInteger");
        }
        if (byteArray.length > 32) {
            System.arraycopy(byteArray, byteArray.length - 32, bArr, i10, 32);
        } else {
            System.arraycopy(byteArray, 0, bArr, (i10 + 32) - byteArray.length, byteArray.length);
        }
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[12];
        f21436g.nextBytes(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 97);
        byteArrayOutputStream.write(0);
        byte[] bArr3 = this.f21437a;
        byteArrayOutputStream.write(bArr3, 0, bArr3.length);
        byte[] bArr4 = this.f21438b;
        byteArrayOutputStream.write(bArr4, 0, bArr4.length);
        byteArrayOutputStream.write(bArr2, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(this.f21439c, "AES"), new GCMParameterSpec(128, bArr2));
        int length = bArr.length + 16;
        byte[] bArr5 = new byte[length];
        if (cipher.doFinal(bArr, 0, bArr.length, bArr5) != length) {
            throw new GeneralSecurityException("Length mismatch");
        }
        byteArrayOutputStream.write(bArr5, 0, length);
        return byteArrayOutputStream.toByteArray();
    }
}

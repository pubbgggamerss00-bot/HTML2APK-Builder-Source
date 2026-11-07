package lf;

import android.util.Log;
import cf.u;
import j2.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public final class p extends l {

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f17055l = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f17056m = {"SHA-256", McElieceCCA2KeyGenParameterSpec.SHA384, "SHA-512"};

    public p() {
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10, byte[] bArr6, int i11, int i12, boolean z10, boolean z11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        byte[] bArrL;
        if (i11 == 6 || i11 == 5) {
            if (z11) {
                if (bArr4 == null) {
                    throw new IOException("/Encrypt/OE entry is missing");
                }
                byte[] bArr7 = new byte[8];
                System.arraycopy(bArr2, 40, bArr7, 0, 8);
                bArrL = i11 == 5 ? l(bArr, bArr7, bArr3) : k(bArr, bArr7, bArr3);
            } else {
                if (bArr5 == null) {
                    throw new IOException("/Encrypt/UE entry is missing");
                }
                byte[] bArr8 = new byte[8];
                System.arraycopy(bArr3, 40, bArr8, 0, 8);
                bArrL = i11 == 5 ? l(bArr, bArr8, null) : k(bArr, bArr8, null);
                bArr4 = bArr5;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(2, new SecretKeySpec(bArrL, "AES"), new IvParameterSpec(new byte[16]));
                return cipher.doFinal(bArr4);
            } catch (GeneralSecurityException e10) {
                o();
                throw new IOException(e10);
            }
        }
        byte[] bArr9 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr9, 0, iMin);
        System.arraycopy(f17055l, 0, bArr9, iMin, 32 - iMin);
        MessageDigest messageDigestB = c.b();
        messageDigestB.update(bArr9);
        messageDigestB.update(bArr2);
        messageDigestB.update((byte) i10);
        messageDigestB.update((byte) (i10 >>> 8));
        messageDigestB.update((byte) (i10 >>> 16));
        messageDigestB.update((byte) (i10 >>> 24));
        messageDigestB.update(bArr6);
        if (i11 == 4 && !z10) {
            messageDigestB.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] bArrDigest = messageDigestB.digest();
        if (i11 == 3 || i11 == 4) {
            for (int i13 = 0; i13 < 50; i13++) {
                messageDigestB.update(bArrDigest, 0, i12);
                bArrDigest = messageDigestB.digest();
            }
        }
        byte[] bArr10 = new byte[i12];
        System.arraycopy(bArrDigest, 0, bArr10, 0, i12);
        return bArr10;
    }

    public static byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else {
            if (bArr3.length < 48) {
                throw new IOException("Bad U length");
            }
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        }
        if (bArr.length > 127) {
            byte[] bArr5 = new byte[CertificateBody.profileType];
            System.arraycopy(bArr, 0, bArr5, 0, CertificateBody.profileType);
            bArr = bArr5;
        }
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
        try {
            byte[] bArrDigest = c.d().digest(bArr6);
            byte[] bArrDoFinal = null;
            int i10 = 0;
            while (true) {
                if (i10 >= 64 && (bArrDoFinal[bArrDoFinal.length - 1] & 255) <= i10 - 32) {
                    break;
                }
                byte[] bArr7 = bArr3.length >= 48 ? new byte[(bArr.length + bArrDigest.length + 48) * 64] : new byte[(bArr.length + bArrDigest.length) * 64];
                int length = 0;
                for (int i11 = 0; i11 < 64; i11++) {
                    System.arraycopy(bArr, 0, bArr7, length, bArr.length);
                    int length2 = length + bArr.length;
                    System.arraycopy(bArrDigest, 0, bArr7, length2, bArrDigest.length);
                    length = length2 + bArrDigest.length;
                    if (bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr7, length, 48);
                        length += 48;
                    }
                }
                byte[] bArr8 = new byte[16];
                byte[] bArr9 = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr8, 0, 16);
                System.arraycopy(bArrDigest, 16, bArr9, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr8, "AES"), new IvParameterSpec(bArr9));
                bArrDoFinal = cipher.doFinal(bArr7);
                byte[] bArr10 = new byte[16];
                System.arraycopy(bArrDoFinal, 0, bArr10, 0, 16);
                bArrDigest = MessageDigest.getInstance(f17056m[new BigInteger(1, bArr10).mod(new BigInteger("3")).intValue()]).digest(bArrDoFinal);
                i10++;
            }
            if (bArrDigest.length <= 32) {
                return bArrDigest;
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(bArrDigest, 0, bArr11, 0, 32);
            return bArr11;
        } catch (GeneralSecurityException e10) {
            o();
            throw new IOException(e10);
        }
    }

    public static byte[] l(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest messageDigestD = c.d();
        messageDigestD.update(bArr);
        messageDigestD.update(bArr2);
        return bArr3 == null ? messageDigestD.digest() : messageDigestD.digest(bArr3);
    }

    public static void o() {
        try {
            if (Cipher.getMaxAllowedKeyLength("AES") != Integer.MAX_VALUE) {
                Log.w("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    @Override // lf.l
    public final void h(hf.b bVar) throws IOException {
        int i10;
        int i11;
        e eVarL = bVar.l();
        if (eVarL == null) {
            eVarL = new e();
        }
        cf.d dVar = eVarL.f17035a;
        short s10 = this.f17042a;
        if (s10 == 40) {
            i10 = 1;
        } else {
            if (s10 == 128) {
                this.f17048g.getClass();
            }
            i10 = this.f17042a == 256 ? 5 : 2;
        }
        ((o) this.f17048g).getClass();
        if (i10 < 2) {
            throw null;
        }
        if (i10 == 5) {
            i11 = 6;
        } else if (i10 == 4) {
            i11 = 4;
        } else {
            if (i10 != 2 && i10 != 3) {
                throw null;
            }
            i11 = 3;
        }
        dVar.O0(cf.l.B0, cf.l.g0("Standard"));
        dVar.N0(cf.l.A2, i10);
        if (i10 != 4 && i10 != 5) {
            dVar.L0(cf.l.I);
            dVar.L0(cf.l.f5490l2);
            dVar.L0(cf.l.f5494m2);
        }
        dVar.N0(cf.l.T1, i11);
        dVar.N0(cf.l.f5485k1, this.f17042a);
        ((o) this.f17048g).getClass();
        throw null;
    }

    @Override // lf.l
    public final void i(e eVar, cf.a aVar, c5.p pVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        d dVarA;
        int i10;
        byte[] bArr;
        int i11;
        byte[] bArr2;
        byte[] bArr3;
        int i12;
        byte[] bArr4;
        int i13;
        int i14;
        boolean zEquals;
        char c10;
        char c11;
        int i15;
        char c12;
        int i16;
        char c13;
        int i17;
        byte[] bytes;
        if (!(pVar instanceof n)) {
            throw new IOException("Decryption material is not compatible with the document");
        }
        int iD = eVar.d();
        cf.d dVar = eVar.f17035a;
        if (iD >= 4) {
            cf.l lVar = (cf.l) dVar.v0(cf.l.f5490l2);
            if (lVar == null) {
                lVar = cf.l.X0;
            }
            this.f17050i = lVar;
            cf.l lVar2 = (cf.l) dVar.v0(cf.l.f5494m2);
            if (lVar2 == null) {
                lVar2 = cf.l.X0;
            }
            this.f17051j = lVar2;
        }
        this.f17045d = eVar.e();
        String strNormalize = ((n) pVar).f17054a;
        if (strNormalize == null) {
            strNormalize = "";
        }
        int iG0 = dVar.G0(cf.l.G1, null, 0);
        int iG02 = dVar.G0(cf.l.T1, null, 0);
        int iB = eVar.d() == 1 ? 5 : eVar.b() / 8;
        if ((eVar.d() == 4 || eVar.d() == 5) && (dVarA = eVar.a(cf.l.f5482j2)) != null) {
            cf.l lVar3 = (cf.l) dVarA.f17034a.v0(cf.l.K);
            i10 = 8;
            if (cf.l.f5472h.equals(lVar3)) {
                this.f17047f = true;
                if (!dVar.f5423b.containsKey(cf.l.f5485k1) || (iB = eVar.b() / 8) >= 16) {
                    iB = 16;
                } else {
                    Log.w("PdfBox-Android", "Using " + iB + " bytes key length instead of 16 in AESV2 encryption?!");
                }
            }
            if (cf.l.f5479j.equals(lVar3)) {
                this.f17047f = true;
                if (!dVar.f5423b.containsKey(cf.l.f5485k1) || (iB = eVar.b() / 8) >= 32) {
                    iB = 32;
                } else {
                    Log.w("PdfBox-Android", "Using " + iB + " bytes key length instead of 32 in AESV3 encryption?!");
                }
            }
        } else {
            i10 = 8;
        }
        byte[] bArr5 = (aVar == null || aVar.f5416b.size() < 1) ? new byte[0] : ((u) aVar.l0(0)).f5565b;
        boolean zE = eVar.e();
        u uVar = (u) dVar.v0(cf.l.f5540y2);
        byte[] bArr6 = uVar != null ? uVar.f5565b : null;
        u uVar2 = (u) dVar.v0(cf.l.f5539y1);
        byte[] bArr7 = uVar2 != null ? uVar2.f5565b : null;
        Charset charset = wf.a.f31523d;
        if (iG02 == 6 || iG02 == 5) {
            charset = wf.a.f31525f;
            u uVar3 = (u) dVar.v0(cf.l.f5544z2);
            byte[] bArr8 = uVar3 != null ? uVar3.f5565b : null;
            u uVar4 = (u) dVar.v0(cf.l.D1);
            bArr = bArr8;
            i11 = i10;
            bArr2 = uVar4 != null ? uVar4.f5565b : null;
        } else {
            i11 = i10;
            bArr2 = null;
            bArr = null;
        }
        Charset charset2 = charset;
        if (iG02 == 6) {
            char[] charArray = strNormalize.toCharArray();
            for (int i18 = 0; i18 < strNormalize.length(); i18++) {
                if (k.a(strNormalize.charAt(i18))) {
                    charArray[i18] = ' ';
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < strNormalize.length(); i20++) {
                char c14 = charArray[i20];
                if (c14 != 173 && c14 != 847 && c14 != 6150 && c14 != 6155 && c14 != 6156 && c14 != 6157 && c14 != 8203 && c14 != 8204 && c14 != 8205 && c14 != 8288 && ((65024 > c14 || c14 > 65039) && c14 != 65279)) {
                    charArray[i19] = c14;
                    i19++;
                }
            }
            strNormalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i19), Normalizer.Form.NFKC);
            int iCharCount = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (iCharCount < strNormalize.length()) {
                int iCodePointAt = strNormalize.codePointAt(iCharCount);
                char c15 = (char) iCodePointAt;
                if (k.a(c15) || ((c15 >= 0 && c15 <= 31) || c15 == 127 || ((128 <= iCodePointAt && iCodePointAt <= 159) || iCodePointAt == 1757 || iCodePointAt == 1807 || iCodePointAt == 6158 || iCodePointAt == 8204 || iCodePointAt == 8205 || iCodePointAt == 8232 || iCodePointAt == 8233 || iCodePointAt == 8288 || iCodePointAt == 8289 || iCodePointAt == 8290 || iCodePointAt == 8291 || ((8298 <= iCodePointAt && iCodePointAt <= 8303) || iCodePointAt == 65279 || ((65529 <= iCodePointAt && iCodePointAt <= 65532) || ((119155 <= iCodePointAt && iCodePointAt <= 119162) || ((57344 <= iCodePointAt && iCodePointAt <= 63743) || ((983040 <= iCodePointAt && iCodePointAt <= 1048573) || ((1048576 <= iCodePointAt && iCodePointAt <= 1114109) || ((64976 <= iCodePointAt && iCodePointAt <= 65007) || ((65534 <= iCodePointAt && iCodePointAt <= 65535) || ((131070 <= iCodePointAt && iCodePointAt <= 131071) || ((196606 <= iCodePointAt && iCodePointAt <= 196607) || ((262142 <= iCodePointAt && iCodePointAt <= 262143) || ((327678 <= iCodePointAt && iCodePointAt <= 327679) || ((393214 <= iCodePointAt && iCodePointAt <= 393215) || ((458750 <= iCodePointAt && iCodePointAt <= 458751) || ((524286 <= iCodePointAt && iCodePointAt <= 524287) || ((589822 <= iCodePointAt && iCodePointAt <= 589823) || ((655358 <= iCodePointAt && iCodePointAt <= 655359) || ((720894 <= iCodePointAt && iCodePointAt <= 720895) || ((786430 <= iCodePointAt && iCodePointAt <= 786431) || ((851966 <= iCodePointAt && iCodePointAt <= 851967) || ((917502 <= iCodePointAt && iCodePointAt <= 917503) || ((983038 <= iCodePointAt && iCodePointAt <= 983039) || ((1048574 <= iCodePointAt && iCodePointAt <= 1048575) || ((1114110 <= iCodePointAt && iCodePointAt <= 1114111) || ((55296 <= iCodePointAt && iCodePointAt <= 57343) || iCodePointAt == 65529 || iCodePointAt == 65530 || iCodePointAt == 65531 || iCodePointAt == 65532 || iCodePointAt == 65533 || ((12272 <= iCodePointAt && iCodePointAt <= 12283) || iCodePointAt == 832 || iCodePointAt == 833 || iCodePointAt == 8206 || iCodePointAt == 8207 || iCodePointAt == 8234 || iCodePointAt == 8235 || iCodePointAt == 8236 || iCodePointAt == 8237 || iCodePointAt == 8238 || iCodePointAt == 8298 || iCodePointAt == 8299 || iCodePointAt == 8300 || iCodePointAt == 8301 || iCodePointAt == 8302 || iCodePointAt == 8303 || iCodePointAt == 917505 || (917536 <= iCodePointAt && iCodePointAt <= 917631)))))))))))))))))))))))))))))) {
                    throw new IllegalArgumentException(e1.c.a(iCodePointAt, iCharCount, "Prohibited character ", " at position "));
                }
                byte directionality = Character.getDirectionality(iCodePointAt);
                boolean z13 = directionality == 1 || directionality == 2;
                z10 |= z13;
                z11 |= directionality == 0;
                z12 |= iCharCount == 0 && z13;
                iCharCount += Character.charCount(iCodePointAt);
                if (z12 && iCharCount >= strNormalize.length() && !z13) {
                    throw new IllegalArgumentException("First character is RandALCat, but last character is not");
                }
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Contains both RandALCat characters and LCat characters");
            }
        }
        String str = strNormalize;
        byte[] bytes2 = str.getBytes(charset2);
        if (iG02 == 6 || iG02 == 5) {
            bArr3 = bArr7;
            i12 = iB;
            bArr4 = bArr6;
            if (bytes2.length <= 127) {
                i13 = 0;
            } else {
                byte[] bArr9 = new byte[CertificateBody.profileType];
                i13 = 0;
                System.arraycopy(bytes2, 0, bArr9, 0, CertificateBody.profileType);
                bytes2 = bArr9;
            }
            byte[] bArr10 = new byte[32];
            byte[] bArr11 = new byte[i11];
            if (bArr3.length < 40) {
                throw new IOException("Owner password is too short");
            }
            System.arraycopy(bArr3, i13, bArr10, i13, 32);
            i14 = 8;
            System.arraycopy(bArr3, 32, bArr11, i13, 8);
            zEquals = Arrays.equals(iG02 == 5 ? l(bytes2, bArr11, bArr4) : k(bytes2, bArr11, bArr4), bArr10);
        } else {
            byte[] bArr12 = bArr7;
            byte[] bArrM = m(bytes2, bArr12, iG02, iB);
            byte[] bArr13 = bArr6;
            i12 = iB;
            zEquals = n(bArrM, bArr13, bArr12, iG0, bArr5, iG02, i12, zE);
            bArr3 = bArr12;
            bArr4 = bArr13;
            i14 = i11;
        }
        if (zEquals) {
            a aVar2 = new a();
            aVar2.f17033b = false;
            aVar2.f17032a = -4;
            aVar2.a(11, true);
            if (!aVar2.f17033b) {
                aVar2.a(5, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(10, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(9, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(4, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(6, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(3, true);
            }
            if (!aVar2.f17033b) {
                aVar2.a(12, true);
            }
            this.f17049h = aVar2;
            if (iG02 != 6) {
                i17 = 5;
                if (iG02 != 5) {
                    bytes = m(str.getBytes(charset2), bArr3, iG02, i12);
                }
                byte[] bArr14 = bytes;
                i16 = i17;
                i14 = 8;
                this.f17043b = j(bArr14, bArr3, bArr4, bArr2, bArr, iG0, bArr5, iG02, i12, zE, true);
                c12 = '\t';
                c13 = 1;
                c10 = '\n';
                c11 = 11;
                i15 = iG0;
            } else {
                i17 = 5;
            }
            bytes = str.getBytes(charset2);
            byte[] bArr142 = bytes;
            i16 = i17;
            i14 = 8;
            this.f17043b = j(bArr142, bArr3, bArr4, bArr2, bArr, iG0, bArr5, iG02, i12, zE, true);
            c12 = '\t';
            c13 = 1;
            c10 = '\n';
            c11 = 11;
            i15 = iG0;
        } else {
            byte[] bArr15 = bArr4;
            byte[] bArr16 = bArr3;
            c10 = '\n';
            c11 = 11;
            i15 = iG0;
            c12 = '\t';
            if (!n(str.getBytes(charset2), bArr15, bArr16, i15, bArr5, iG02, i12, zE)) {
                throw new b("Cannot decrypt PDF, the password is incorrect");
            }
            a aVar3 = new a();
            aVar3.f17032a = i15;
            aVar3.f17033b = true;
            this.f17049h = aVar3;
            i16 = 5;
            c13 = 1;
            this.f17043b = j(str.getBytes(charset2), bArr16, bArr15, bArr2, bArr, i15, bArr5, iG02, i12, zE, false);
        }
        if (iG02 == 6 || iG02 == i16) {
            try {
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
                cipher.init(2, new SecretKeySpec(this.f17043b, "AES"));
                u uVar5 = (u) dVar.v0(cf.l.N1);
                byte[] bArrDoFinal = cipher.doFinal(uVar5 != null ? uVar5.f5565b : null);
                if (bArrDoFinal[c12] != 97 || bArrDoFinal[c10] != 100 || bArrDoFinal[c11] != 98) {
                    Log.w("PdfBox-Android", "Verification of permissions failed (constant)");
                }
                int i21 = ((bArrDoFinal[c13] & 255) << i14) | (bArrDoFinal[0] & 255) | ((bArrDoFinal[2] & 255) << 16) | ((bArrDoFinal[3] & 255) << 24);
                if (i21 != i15) {
                    Log.w("PdfBox-Android", "Verification of permissions failed (" + String.format("%08X", Integer.valueOf(i21)) + " != " + String.format("%08X", Integer.valueOf(i15)) + ")");
                }
                if ((!zE || bArrDoFinal[i14] == 84) && (zE || bArrDoFinal[i14] == 70)) {
                    return;
                }
                Log.w("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
            } catch (GeneralSecurityException e10) {
                o();
                throw new IOException(e10);
            }
        }
    }

    public final byte[] m(byte[] bArr, byte[] bArr2, int i10, int i11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigestB = c.b();
        byte[] bArr3 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        System.arraycopy(f17055l, 0, bArr3, iMin, 32 - iMin);
        byte[] bArrDigest = messageDigestB.digest(bArr3);
        if (i10 == 3 || i10 == 4) {
            for (int i12 = 0; i12 < 50; i12++) {
                messageDigestB.update(bArrDigest, 0, i11);
                bArrDigest = messageDigestB.digest();
            }
        }
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArrDigest, 0, bArr4, 0, i11);
        if (i10 == 2) {
            f(bArr4, bArr2, byteArrayOutputStream);
        } else if (i10 == 3 || i10 == 4) {
            byte[] bArr5 = new byte[i11];
            byte[] byteArray = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, byteArray, 0, bArr2.length);
            for (int i13 = 19; i13 >= 0; i13--) {
                System.arraycopy(bArr4, 0, bArr5, 0, i11);
                for (int i14 = 0; i14 < i11; i14++) {
                    bArr5[i14] = (byte) (bArr5[i14] ^ ((byte) i13));
                }
                byteArrayOutputStream.reset();
                f(bArr5, byteArray, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean n(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, int i12, boolean z10) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr5 = bArr;
        if (i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 != 5 && i11 != 6) {
                throw new IOException(y.a(i11, "Unknown Encryption Revision "));
            }
            if (bArr5.length > 127) {
                byte[] bArr6 = new byte[CertificateBody.profileType];
                System.arraycopy(bArr5, 0, bArr6, 0, CertificateBody.profileType);
                bArr5 = bArr6;
            }
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr2, 0, bArr7, 0, 32);
            System.arraycopy(bArr2, 32, bArr8, 0, 8);
            return Arrays.equals(i11 == 5 ? l(bArr5, bArr8, null) : k(bArr5, bArr8, null), bArr7);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrJ = j(bArr5, bArr3, null, null, null, i10, bArr4, i11, i12, z10, true);
        byte[] bArr9 = f17055l;
        if (i11 == 2) {
            f(bArrJ, bArr9, byteArrayOutputStream);
        } else if (i11 == 3 || i11 == 4) {
            MessageDigest messageDigestB = c.b();
            messageDigestB.update(bArr9);
            messageDigestB.update(bArr4);
            byteArrayOutputStream.write(messageDigestB.digest());
            int length = bArrJ.length;
            byte[] bArr10 = new byte[length];
            for (int i13 = 0; i13 < 20; i13++) {
                System.arraycopy(bArrJ, 0, bArr10, 0, length);
                for (int i14 = 0; i14 < length; i14++) {
                    bArr10[i14] = (byte) (bArr10[i14] ^ i13);
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                e(bArr10, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr11, 0, 16);
            System.arraycopy(bArr9, 0, bArr11, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return i11 == 2 ? Arrays.equals(bArr2, byteArray) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(byteArray, 16));
    }

    public p(o oVar) {
        this.f17048g = oVar;
        oVar.getClass();
        this.f17042a = (short) 40;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wa {
    public static X509Certificate[][] a(String str) {
        Pair pairA;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairA = null;
            } else {
                pairA = xa.a(randomAccessFile, 0);
                if (pairA == null) {
                    pairA = xa.a(randomAccessFile, 65535);
                }
            }
            if (pairA == null) {
                throw new ua("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j6 = jLongValue - 20;
            if (j6 >= 0) {
                randomAccessFile.seek(j6);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new ua("ZIP64 APK not supported");
                }
            }
            xa.b(byteBuffer);
            long j7 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j7 >= jLongValue) {
                throw new ua("ZIP Central Directory offset out of range: " + j7 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            xa.b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j7 != jLongValue) {
                throw new ua("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j7 < 32) {
                throw new ua("APK too small for APK Signing Block. ZIP Central Directory offset: " + j7);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j7 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new ua("No APK Signing Block before ZIP Central Directory");
            }
            long j8 = byteBufferAllocate.getLong(0);
            long j9 = j7;
            if (j8 < byteBufferAllocate.capacity() || j8 > 2147483639) {
                throw new ua("APK Signing Block size out of range: " + j8);
            }
            int i6 = (int) (8 + j8);
            long j10 = j9 - i6;
            if (j10 < 0) {
                throw new ua("APK Signing Block offset out of range: " + j10);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j10);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j11 = byteBufferAllocate2.getLong(0);
            if (j11 != j8) {
                throw new ua("APK Signing Block sizes in header and footer do not match: " + j11 + " vs " + j8);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j10));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i7 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i7++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new ua("Insufficient data to read size of APK Signing Block entry #" + i7);
                    }
                    long j12 = byteBufferSlice.getLong();
                    if (j12 < 4 || j12 > 2147483647L) {
                        throw new ua("APK Signing Block entry #" + i7 + " size out of range: " + j12);
                    }
                    int i8 = (int) j12;
                    int iPosition2 = byteBufferSlice.position() + i8;
                    if (i8 > byteBufferSlice.remaining()) {
                        throw new ua("APK Signing Block entry #" + i7 + " size out of range: " + i8 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrK = k(randomAccessFile.getChannel(), new ta(e(i8 - 4, byteBufferSlice), jLongValue2, j9, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrK;
                    }
                    long j13 = jLongValue2;
                    long j14 = jLongValue;
                    long j15 = j9;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j14;
                    byteBuffer = byteBuffer3;
                    j9 = j15;
                    jLongValue2 = j13;
                }
                throw new ua("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i6) {
        if (i6 == 1) {
            return 32;
        }
        if (i6 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Unknown content digest algorthm: "));
    }

    public static int c(int i6) {
        if (i6 == 513) {
            return 1;
        }
        if (i6 == 514) {
            return 2;
        }
        if (i6 == 769) {
            return 1;
        }
        switch (i6) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i6))));
        }
    }

    public static String d(int i6) {
        if (i6 == 1) {
            return "SHA-256";
        }
        if (i6 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Unknown content digest algorthm: "));
    }

    public static ByteBuffer e(int i6, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i7 = i6 + iPosition;
        if (i7 < iPosition || i7 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i7);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i7);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i6 = byteBuffer.getInt();
        if (i6 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i6 <= byteBuffer.remaining()) {
            return e(i6, byteBuffer);
        }
        throw new IOException(androidx.camera.view.g.e("Length-prefixed field longer than remaining buffer. Field length: ", i6, byteBuffer.remaining(), ", remaining: "));
    }

    public static void g(int i6, byte[] bArr) {
        bArr[1] = (byte) (i6 & 255);
        bArr[2] = (byte) ((i6 >>> 8) & 255);
        bArr[3] = (byte) ((i6 >>> 16) & 255);
        bArr[4] = (byte) (i6 >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) throws IOException {
        int i6 = byteBuffer.getInt();
        if (i6 < 0) {
            throw new IOException("Negative length");
        }
        if (i6 > byteBuffer.remaining()) {
            throw new IOException(androidx.camera.view.g.e("Underflow while reading length-prefixed value. Length: ", i6, byteBuffer.remaining(), ", available: "));
        }
        byte[] bArr = new byte[i6];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrH = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrH2 = null;
        byte[] bArrH3 = null;
        int i6 = -1;
        int i7 = 0;
        while (byteBufferF2.hasRemaining()) {
            i7++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i8 = byteBufferF3.getInt();
                arrayList.add(Integer.valueOf(i8));
                if (i8 != 513 && i8 != 514 && i8 != 769) {
                    switch (i8) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i6 != -1) {
                    int iC = c(i8);
                    int iC2 = c(i6);
                    if (iC != 1 && iC2 == 1) {
                    }
                }
                bArrH3 = h(byteBufferF3);
                i6 = i8;
            } catch (IOException e6) {
                e = e6;
                throw new SecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(i7, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(i7, "Failed to parse signature record #"), e);
            }
        }
        if (i6 == -1) {
            if (i7 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i6 == 513 || i6 == 514) {
            str = "EC";
        } else if (i6 != 769) {
            switch (i6) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i6))));
            }
        } else {
            str = "DSA";
        }
        if (i6 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i6 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i6 != 769) {
            switch (i6) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i6))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrH));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrH3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            while (byteBufferF4.hasRemaining()) {
                i9++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i10 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i10));
                    if (i10 == i6) {
                        bArrH2 = h(byteBufferF5);
                    }
                } catch (IOException e8) {
                    e = e8;
                    throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(i9, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e9) {
                    e = e9;
                    throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(i9, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iC3 = c(i6);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC3), bArrH2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrH2)) {
                throw new SecurityException(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            while (byteBufferF6.hasRemaining()) {
                i11++;
                byte[] bArrH4 = h(byteBufferF6);
                try {
                    arrayList3.add(new va((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH4)), bArrH4));
                } catch (CertificateException e10) {
                    throw new SecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(i11, "Failed to decode certificate #"), e10);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrH, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new SecurityException(androidx.camera.camera2.internal.v0.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new SecurityException(androidx.camera.camera2.internal.v0.b("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new SecurityException(androidx.camera.camera2.internal.v0.b("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e14) {
            e = e14;
            throw new SecurityException(androidx.camera.camera2.internal.v0.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e15) {
            e = e15;
            throw new SecurityException(androidx.camera.camera2.internal.v0.b("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] j(int[] iArr, ra[] raVarArr) throws DigestException {
        long j6;
        int i6;
        int length;
        char c7;
        int i7 = 0;
        long jZza = 0;
        while (true) {
            j6 = 1048576;
            if (i7 >= 3) {
                break;
            }
            jZza += (raVarArr[i7].zza() + 1048575) / 1048576;
            i7++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i8 = 0;
        while (true) {
            length = iArr.length;
            c7 = 5;
            if (i8 >= length) {
                break;
            }
            int i9 = (int) jZza;
            byte[] bArr2 = new byte[(b(iArr[i8]) * i9) + 5];
            bArr2[0] = 90;
            g(i9, bArr2);
            bArr[i8] = bArr2;
            i8++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            String strD = d(iArr[i10]);
            try {
                messageDigestArr[i10] = MessageDigest.getInstance(strD);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(strD.concat(" digest not supported"), e6);
            }
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (i6 = 3; i11 < i6; i6 = 3) {
            ra raVar = raVarArr[i11];
            int i14 = i11;
            long jZza2 = raVar.zza();
            long j7 = 0;
            while (jZza2 > 0) {
                char c8 = c7;
                int i15 = i12;
                int iMin = (int) Math.min(jZza2, j6);
                g(iMin, bArr3);
                for (int i16 = 0; i16 < length; i16++) {
                    messageDigestArr[i16].update(bArr3);
                }
                try {
                    raVar.a(messageDigestArr, j7, iMin);
                    int i17 = 0;
                    while (i17 < iArr.length) {
                        int i18 = iArr[i17];
                        byte[] bArr4 = bArr[i17];
                        int iB = b(i18);
                        ra raVar2 = raVar;
                        MessageDigest messageDigest = messageDigestArr[i17];
                        long j8 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i15 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i17++;
                        raVar = raVar2;
                        jZza2 = j8;
                    }
                    ra raVar3 = raVar;
                    long j9 = iMin;
                    j7 += j9;
                    jZza2 -= j9;
                    i12 = i15 + 1;
                    c7 = c8;
                    raVar = raVar3;
                    j6 = 1048576;
                } catch (IOException e7) {
                    throw new DigestException(androidx.camera.view.g.e("Failed to digest chunk #", i15, i13, " of section #"), e7);
                }
            }
            i13++;
            i11 = i14 + 1;
            j6 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr6 = bArr[i19];
            String strD2 = d(i20);
            try {
                bArr5[i19] = MessageDigest.getInstance(strD2).digest(bArr6);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(strD2.concat(" digest not supported"), e8);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] k(FileChannel fileChannel, ta taVar) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(taVar.f9162a);
                int i6 = 0;
                while (byteBufferF.hasRemaining()) {
                    i6++;
                    try {
                        arrayList.add(i(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e6) {
                        throw new SecurityException(androidx.camera.camera2.internal.s0.a(i6, "Failed to parse/verify signer #", " block"), e6);
                    }
                }
                if (i6 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j6 = taVar.f9163b;
                long j7 = taVar.f9164c;
                long j8 = taVar.f9165d;
                ByteBuffer byteBuffer = taVar.f9166e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                sa saVar = new sa(fileChannel, 0L, j6);
                sa saVar2 = new sa(fileChannel, j7, j8 - j7);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                xa.b(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j6 < 0 || j6 > 4294967295L) {
                    throw new IllegalArgumentException("uint32 value of out range: " + j6);
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j6);
                l2 l2Var = new l2(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    iArr[i7] = ((Integer) it.next()).intValue();
                    i7++;
                }
                try {
                    byte[][] bArrJ = j(iArr, new ra[]{saVar, saVar2, l2Var});
                    for (int i8 = 0; i8 < size; i8++) {
                        int i9 = iArr[i8];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i9)), bArrJ[i8])) {
                            throw new SecurityException(d(i9).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e7) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e7);
                }
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }
}

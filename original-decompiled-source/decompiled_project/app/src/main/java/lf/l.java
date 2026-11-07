package lf;

import android.util.Log;
import cf.s;
import cf.t;
import cf.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p.i0;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f17041k = {115, 65, 108, 84};

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17043b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17045d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17047f;

    /* renamed from: i, reason: collision with root package name */
    public cf.l f17050i;

    /* renamed from: j, reason: collision with root package name */
    public cf.l f17051j;

    /* renamed from: a, reason: collision with root package name */
    public short f17042a = 40;

    /* renamed from: c, reason: collision with root package name */
    public final j f17044c = new j();

    /* renamed from: e, reason: collision with root package name */
    public final Set<cf.b> f17046e = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: g, reason: collision with root package name */
    public ci.a f17048g = null;

    /* renamed from: h, reason: collision with root package name */
    public a f17049h = null;

    public static boolean g(boolean z10, byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        if (!z10) {
            new SecureRandom().nextBytes(bArr);
            outputStream.write(bArr);
            return true;
        }
        int length = bArr.length;
        while (length > 0) {
            int i10 = byteArrayInputStream.read(bArr, bArr.length - length, length);
            if (i10 < 0) {
                break;
            }
            length -= i10;
        }
        if (length == 0) {
            return false;
        }
        if (length == bArr.length) {
            return true;
        }
        StringBuilder sbB = i0.b(length, "AES initialization vector not fully read: only ", " bytes read instead of ");
        sbB.append(bArr.length);
        throw new IOException(sbB.toString());
    }

    public final void a(cf.b bVar, long j10, long j11) throws IOException {
        boolean z10 = bVar instanceof u;
        Set<cf.b> set = this.f17046e;
        if (!z10) {
            if (bVar instanceof t) {
                if (set.contains(bVar)) {
                    return;
                }
                set.add(bVar);
                c((t) bVar, j10, j11);
                return;
            }
            if (bVar instanceof cf.d) {
                b((cf.d) bVar, j10, j11);
                return;
            }
            if (bVar instanceof cf.a) {
                cf.a aVar = (cf.a) bVar;
                for (int i10 = 0; i10 < aVar.f5416b.size(); i10++) {
                    a(aVar.i0(i10), j10, j11);
                }
                return;
            }
            return;
        }
        if (set.contains(bVar)) {
            return;
        }
        set.add(bVar);
        u uVar = (u) bVar;
        if (cf.l.X0.equals(this.f17051j)) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(uVar.f5565b);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d(j10, j11, byteArrayInputStream, byteArrayOutputStream, true);
            uVar.f5565b = (byte[]) byteArrayOutputStream.toByteArray().clone();
        } catch (IOException e10) {
            Log.e("PdfBox-Android", "Failed to decrypt COSString of length " + uVar.f5565b.length + " in object " + j10 + ": " + e10.getMessage());
        }
    }

    public final void b(cf.d dVar, long j10, long j11) throws IOException {
        long j12;
        long j13;
        if (dVar.H0(cf.l.I) != null) {
            return;
        }
        cf.b bVarV0 = dVar.v0(cf.l.f5532w2);
        boolean z10 = cf.l.f5471g2.equals(bVarV0) || cf.l.f5503p0.equals(bVarV0) || ((dVar.v0(cf.l.W) instanceof u) && (dVar.v0(cf.l.B) instanceof cf.a));
        for (Map.Entry<cf.l, cf.b> entry : dVar.f5423b.entrySet()) {
            if (!z10 || !cf.l.W.equals(entry.getKey())) {
                cf.b value = entry.getValue();
                if ((value instanceof u) || (value instanceof cf.a) || (value instanceof cf.d)) {
                    j12 = j10;
                    j13 = j11;
                    a(value, j12, j13);
                } else {
                    j12 = j10;
                    j13 = j11;
                }
                j10 = j12;
                j11 = j13;
            }
        }
    }

    public final void c(t tVar, long j10, long j11) throws IOException {
        if (cf.l.X0.equals(this.f17050i)) {
            return;
        }
        cf.l lVarQ0 = tVar.q0(cf.l.f5532w2);
        if ((this.f17045d || !cf.l.f5516s1.equals(lVarQ0)) && !cf.l.H2.equals(lVarQ0)) {
            if (cf.l.f5516s1.equals(lVarQ0)) {
                ef.d dVarW0 = tVar.W0();
                int i10 = 10;
                byte[] bArr = new byte[10];
                while (i10 > 0) {
                    int i11 = dVarW0.read(bArr, 10 - i10, i10);
                    if (i11 < 0) {
                        break;
                    } else {
                        i10 -= i11;
                    }
                }
                dVarW0.close();
                if (Arrays.equals(bArr, "<?xpacket ".getBytes(wf.a.f31523d))) {
                    Log.w("PdfBox-Android", "Metadata is not encrypted, but was expected to be");
                    Log.w("PdfBox-Android", "Read PDF specification about EncryptMetadata (default value: true)");
                    return;
                }
            }
            b(tVar, j10, j11);
            ef.d dVarW02 = tVar.W0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ef.a.c(dVarW02, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            s sVarX0 = tVar.X0();
            try {
                try {
                    d(j10, j11, byteArrayInputStream, sVarX0, true);
                    sVarX0.close();
                } catch (IOException e10) {
                    Log.e("PdfBox-Android", e10.getClass().getSimpleName() + " thrown when decrypting object " + j10 + " " + j11 + " obj");
                    throw e10;
                }
            } catch (Throwable th2) {
                sVarX0.close();
                throw th2;
            }
        }
    }

    public final void d(long j10, long j11, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream, boolean z10) throws IOException {
        if (this.f17047f && this.f17043b.length == 32) {
            byte[] bArr = new byte[16];
            if (g(z10, bArr, byteArrayInputStream, outputStream)) {
                try {
                    byte[] bArr2 = this.f17043b;
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(z10 ? 2 : 1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
                    try {
                        try {
                            ef.a.c(cipherInputStream, outputStream);
                        } catch (IOException e10) {
                            if (!(e10.getCause() instanceof GeneralSecurityException)) {
                                throw e10;
                            }
                            Log.d("PdfBox-Android", "A GeneralSecurityException occurred when decrypting some stream data", e10);
                        }
                    } finally {
                        cipherInputStream.close();
                    }
                } catch (GeneralSecurityException e11) {
                    throw new IOException(e11);
                }
            }
        } else {
            byte[] bArr3 = this.f17043b;
            int length = bArr3.length;
            int i10 = length + 5;
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[length] = (byte) (j10 & 255);
            bArr4[length + 1] = (byte) ((j10 >> 8) & 255);
            bArr4[length + 2] = (byte) ((j10 >> 16) & 255);
            bArr4[length + 3] = (byte) (j11 & 255);
            bArr4[length + 4] = (byte) ((j11 >> 8) & 255);
            MessageDigest messageDigestB = c.b();
            messageDigestB.update(bArr4);
            if (this.f17047f) {
                messageDigestB.update(f17041k);
            }
            byte[] bArrDigest = messageDigestB.digest();
            int iMin = Math.min(i10, 16);
            byte[] bArr5 = new byte[iMin];
            System.arraycopy(bArrDigest, 0, bArr5, 0, iMin);
            if (this.f17047f) {
                byte[] bArr6 = new byte[16];
                if (g(z10, bArr6, byteArrayInputStream, outputStream)) {
                    try {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher2.init(z10 ? 2 : 1, new SecretKeySpec(bArr5, "AES"), new IvParameterSpec(bArr6));
                        byte[] bArr7 = new byte[256];
                        while (true) {
                            int i11 = byteArrayInputStream.read(bArr7);
                            if (i11 == -1) {
                                break;
                            }
                            byte[] bArrUpdate = cipher2.update(bArr7, 0, i11);
                            if (bArrUpdate != null) {
                                outputStream.write(bArrUpdate);
                            }
                        }
                        outputStream.write(cipher2.doFinal());
                    } catch (GeneralSecurityException e12) {
                        throw new IOException(e12);
                    }
                }
            } else {
                e(bArr5, byteArrayInputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    public final void e(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        j jVar = this.f17044c;
        jVar.a(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = byteArrayInputStream.read(bArr2);
            if (i10 == -1) {
                return;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                jVar.b(bArr2[i11], outputStream);
            }
        }
    }

    public final void f(byte[] bArr, byte[] bArr2, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        j jVar = this.f17044c;
        jVar.a(bArr);
        for (byte b10 : bArr2) {
            jVar.b(b10, byteArrayOutputStream);
        }
    }

    public abstract void h(hf.b bVar) throws IOException;

    public abstract void i(e eVar, cf.a aVar, c5.p pVar) throws IOException;
}

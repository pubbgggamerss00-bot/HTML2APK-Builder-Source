package gd;

import gd.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import wc.a;

/* loaded from: classes2.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f11916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11920e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11921f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f11922g;

    /* renamed from: gd.a$a, reason: collision with other inner class name */
    public class C0107a implements u {

        /* renamed from: a, reason: collision with root package name */
        public SecretKeySpec f11923a;

        /* renamed from: b, reason: collision with root package name */
        public SecretKeySpec f11924b;

        /* renamed from: c, reason: collision with root package name */
        public Cipher f11925c;

        /* renamed from: d, reason: collision with root package name */
        public Mac f11926d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f11927e;

        public C0107a() {
        }

        @Override // gd.u
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != a.this.e()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != a.this.e()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f11927e = new byte[7];
            byte[] bArr2 = new byte[a.this.f11916a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f11927e);
            a aVar = a.this;
            int i10 = aVar.f11916a + 32;
            byte[] bArrA = n.a(aVar.f11922g, bArr2, aVar.f11921f, bArr, i10);
            this.f11923a = new SecretKeySpec(bArrA, 0, a.this.f11916a, "AES");
            a aVar2 = a.this;
            this.f11924b = new SecretKeySpec(bArrA, aVar2.f11916a, 32, aVar2.f11917b);
            this.f11925c = k.f11974b.f11976a.a("AES/CTR/NoPadding");
            a aVar3 = a.this;
            k<l.e, Mac> kVar = k.f11975c;
            this.f11926d = kVar.f11976a.a(aVar3.f11917b);
        }

        @Override // gd.u
        public final synchronized void b(ByteBuffer byteBuffer, int i10, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int iPosition = byteBuffer.position();
            byte[] bArrI = a.i(a.this, this.f11927e, i10, z10);
            int iRemaining = byteBuffer.remaining();
            int i11 = a.this.f11918c;
            if (iRemaining < i11) {
                throw new GeneralSecurityException("Ciphertext too short");
            }
            int i12 = (iRemaining - i11) + iPosition;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(i12);
            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
            byteBufferDuplicate2.position(i12);
            this.f11926d.init(this.f11924b);
            this.f11926d.update(bArrI);
            this.f11926d.update(byteBufferDuplicate);
            byte[] bArrCopyOf = Arrays.copyOf(this.f11926d.doFinal(), a.this.f11918c);
            byte[] bArr = new byte[a.this.f11918c];
            byteBufferDuplicate2.get(bArr);
            if (!MessageDigest.isEqual(bArr, bArrCopyOf)) {
                throw new GeneralSecurityException("Tag mismatch");
            }
            byteBuffer.limit(i12);
            this.f11925c.init(1, this.f11923a, new IvParameterSpec(bArrI));
            this.f11925c.doFinal(byteBuffer, byteBuffer2);
        }
    }

    public class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final SecretKeySpec f11929a;

        /* renamed from: b, reason: collision with root package name */
        public final SecretKeySpec f11930b;

        /* renamed from: c, reason: collision with root package name */
        public final Cipher f11931c = k.f11974b.f11976a.a("AES/CTR/NoPadding");

        /* renamed from: d, reason: collision with root package name */
        public final Mac f11932d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f11933e;

        /* renamed from: f, reason: collision with root package name */
        public final ByteBuffer f11934f;

        /* renamed from: g, reason: collision with root package name */
        public long f11935g;

        public b(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
            this.f11935g = 0L;
            k<l.e, Mac> kVar = k.f11975c;
            String str = a.this.f11917b;
            this.f11932d = kVar.f11976a.a(str);
            this.f11935g = 0L;
            int i10 = a.this.f11916a;
            byte[] bArrA = t.a(i10);
            byte[] bArrA2 = t.a(7);
            this.f11933e = bArrA2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(a.this.e());
            this.f11934f = byteBufferAllocate;
            byteBufferAllocate.put((byte) a.this.e());
            byteBufferAllocate.put(bArrA);
            byteBufferAllocate.put(bArrA2);
            byteBufferAllocate.flip();
            String str2 = a.this.f11921f;
            byte[] bArrA3 = n.a(a.this.f11922g, bArrA, str2, bArr, i10 + 32);
            this.f11929a = new SecretKeySpec(bArrA3, 0, i10, "AES");
            this.f11930b = new SecretKeySpec(bArrA3, i10, 32, str);
        }

        @Override // gd.v
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            int iPosition = byteBuffer3.position();
            byte[] bArrI = a.i(a.this, this.f11933e, this.f11935g, false);
            this.f11931c.init(1, this.f11929a, new IvParameterSpec(bArrI));
            this.f11935g++;
            this.f11931c.update(byteBuffer, byteBuffer3);
            this.f11931c.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.f11932d.init(this.f11930b);
            this.f11932d.update(bArrI);
            this.f11932d.update(byteBufferDuplicate);
            byteBuffer3.put(this.f11932d.doFinal(), 0, a.this.f11918c);
        }

        @Override // gd.v
        public final ByteBuffer b() {
            return this.f11934f.asReadOnlyBuffer();
        }

        @Override // gd.v
        public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int iPosition = byteBuffer2.position();
            byte[] bArrI = a.i(a.this, this.f11933e, this.f11935g, true);
            this.f11931c.init(1, this.f11929a, new IvParameterSpec(bArrI));
            this.f11935g++;
            this.f11931c.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.f11932d.init(this.f11930b);
            this.f11932d.update(bArrI);
            this.f11932d.update(byteBufferDuplicate);
            byteBuffer2.put(this.f11932d.doFinal(), 0, a.this.f11918c);
        }
    }

    public a(byte[] bArr, String str, int i10, String str2, int i11, int i12) throws GeneralSecurityException {
        if (!a.EnumC0318a.f31490a.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        int length = bArr.length;
        if (length < 16 || length < i10) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i10));
        }
        y.a(i10);
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException(j2.y.a(i11, "tag size too small "));
        }
        if ((str2.equals("HmacSha1") && i11 > 20) || ((str2.equals("HmacSha256") && i11 > 32) || (str2.equals("HmacSha512") && i11 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if (((i12 - i11) - i10) - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f11922g = Arrays.copyOf(bArr, bArr.length);
        this.f11921f = str;
        this.f11916a = i10;
        this.f11917b = str2;
        this.f11918c = i11;
        this.f11919d = i12;
        this.f11920e = i12 - i11;
    }

    public static byte[] i(a aVar, byte[] bArr, long j10, boolean z10) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j10 || j10 >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBufferAllocate.putInt((int) j10);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // gd.p
    public final int c() {
        return e();
    }

    @Override // gd.p
    public final int d() {
        return this.f11919d;
    }

    @Override // gd.p
    public final int e() {
        return this.f11916a + 8;
    }

    @Override // gd.p
    public final int f() {
        return this.f11920e;
    }

    @Override // gd.p
    public final u g() throws GeneralSecurityException {
        return new C0107a();
    }

    @Override // gd.p
    public final v h(byte[] bArr) throws GeneralSecurityException {
        return new b(bArr);
    }
}

package gd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f11947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11949c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11950d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11951e;

    public class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public SecretKeySpec f11952a;

        /* renamed from: b, reason: collision with root package name */
        public Cipher f11953b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f11954c;

        public a() {
        }

        @Override // gd.u
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != d.this.e()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != d.this.e()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f11954c = new byte[7];
            byte[] bArr2 = new byte[d.this.f11947a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f11954c);
            d dVar = d.this;
            this.f11952a = new SecretKeySpec(n.a(dVar.f11951e, bArr2, dVar.f11950d, bArr, dVar.f11947a), "AES");
            this.f11953b = k.f11974b.f11976a.a("AES/GCM/NoPadding");
        }

        @Override // gd.u
        public final synchronized void b(ByteBuffer byteBuffer, int i10, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f11953b.init(2, this.f11952a, d.i(this.f11954c, i10, z10));
            this.f11953b.doFinal(byteBuffer, byteBuffer2);
        }
    }

    public class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final SecretKeySpec f11956a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f11957b = k.f11974b.f11976a.a("AES/GCM/NoPadding");

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f11958c;

        /* renamed from: d, reason: collision with root package name */
        public final ByteBuffer f11959d;

        /* renamed from: e, reason: collision with root package name */
        public long f11960e;

        public b(d dVar, byte[] bArr) throws GeneralSecurityException {
            this.f11960e = 0L;
            this.f11960e = 0L;
            int i10 = dVar.f11947a;
            byte[] bArrA = t.a(i10);
            byte[] bArrA2 = t.a(7);
            this.f11958c = bArrA2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dVar.e());
            this.f11959d = byteBufferAllocate;
            byteBufferAllocate.put((byte) dVar.e());
            byteBufferAllocate.put(bArrA);
            byteBufferAllocate.put(bArrA2);
            byteBufferAllocate.flip();
            this.f11956a = new SecretKeySpec(n.a(dVar.f11951e, bArrA, dVar.f11950d, bArr, i10), "AES");
        }

        @Override // gd.v
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            try {
                this.f11957b.init(1, this.f11956a, d.i(this.f11958c, this.f11960e, false));
                this.f11960e++;
                if (byteBuffer2.hasRemaining()) {
                    this.f11957b.update(byteBuffer, byteBuffer3);
                    this.f11957b.doFinal(byteBuffer2, byteBuffer3);
                } else {
                    this.f11957b.doFinal(byteBuffer, byteBuffer3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // gd.v
        public final ByteBuffer b() {
            return this.f11959d.asReadOnlyBuffer();
        }

        @Override // gd.v
        public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f11957b.init(1, this.f11956a, d.i(this.f11958c, this.f11960e, true));
            this.f11960e++;
            this.f11957b.doFinal(byteBuffer, byteBuffer2);
        }
    }

    public d(String str, byte[] bArr, int i10, int i11) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i10) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i10));
        }
        y.a(i10);
        if (i11 <= e() + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f11951e = Arrays.copyOf(bArr, bArr.length);
        this.f11950d = str;
        this.f11947a = i10;
        this.f11948b = i11;
        this.f11949c = i11 - 16;
    }

    public static GCMParameterSpec i(byte[] bArr, long j10, boolean z10) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j10 || j10 >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBufferAllocate.putInt((int) j10);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // gd.p
    public final int c() {
        return e();
    }

    @Override // gd.p
    public final int d() {
        return this.f11948b;
    }

    @Override // gd.p
    public final int e() {
        return this.f11947a + 8;
    }

    @Override // gd.p
    public final int f() {
        return this.f11949c;
    }

    @Override // gd.p
    public final u g() throws GeneralSecurityException {
        return new a();
    }

    @Override // gd.p
    public final v h(byte[] bArr) throws GeneralSecurityException {
        return new b(this, bArr);
    }
}

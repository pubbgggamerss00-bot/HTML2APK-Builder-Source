package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import zc.e;

/* loaded from: classes2.dex */
public final class g0 implements sc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28642c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final ed.g0 f28643a;

    /* renamed from: b, reason: collision with root package name */
    public final sc.a f28644b;

    public g0(ed.g0 g0Var, sc.a aVar) {
        this.f28643a = g0Var;
        this.f28644b = aVar;
    }

    @Override // sc.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        p0 p0VarA;
        ed.g0 g0Var = this.f28643a;
        AtomicReference<sc.f> atomicReference = sc.r.f24831a;
        synchronized (sc.r.class) {
            try {
                sc.d dVarB = sc.r.f24831a.get().a(g0Var.B()).b();
                if (!((Boolean) sc.r.f24833c.get(g0Var.B())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + g0Var.B());
                }
                com.google.crypto.tink.shaded.protobuf.h hVarC = g0Var.C();
                try {
                    e.a aVarD = dVarB.f24796a.d();
                    p0 p0VarC = aVarD.c(hVarC);
                    aVarD.d(p0VarC);
                    p0VarA = aVarD.a(p0VarC);
                } catch (com.google.crypto.tink.shaded.protobuf.z e10) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(dVarB.f24796a.d().f35006a.getName()), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byte[] byteArray = ((com.google.crypto.tink.shaded.protobuf.a) p0VarA).toByteArray();
        byte[] bArrA = this.f28644b.a(byteArray, f28642c);
        byte[] bArrA2 = ((sc.a) sc.r.c(this.f28643a.B(), com.google.crypto.tink.shaded.protobuf.h.c(0, byteArray.length, byteArray), sc.a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // sc.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrDecrypt = this.f28644b.decrypt(bArr3, f28642c);
            String strB = this.f28643a.B();
            AtomicReference<sc.f> atomicReference = sc.r.f24831a;
            h.f fVar = com.google.crypto.tink.shaded.protobuf.h.f6665b;
            return ((sc.a) sc.r.c(strB, com.google.crypto.tink.shaded.protobuf.h.c(0, bArrDecrypt.length, bArrDecrypt), sc.a.class)).decrypt(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}

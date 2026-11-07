package gd;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class n {
    public static byte[] a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) throws IllegalStateException, GeneralSecurityException {
        Mac macA = k.f11975c.f11976a.a(str);
        if (i10 > macA.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            macA.init(new SecretKeySpec(new byte[macA.getMacLength()], str));
        } else {
            macA.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i10];
        macA.init(new SecretKeySpec(macA.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int length = 0;
        while (true) {
            macA.update(bArrDoFinal);
            macA.update(bArr3);
            macA.update((byte) i11);
            bArrDoFinal = macA.doFinal();
            if (bArrDoFinal.length + length >= i10) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i10 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i11++;
        }
    }
}

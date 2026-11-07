package cf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5564c = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5565b;

    public u(byte[] bArr) {
        this.f5565b = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return getString().equals(((u) obj).getString());
        }
        return false;
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        if (bVar.f12068r) {
            lf.l lVarC = bVar.f12067q.l().c();
            p pVar = bVar.f12066p;
            long j10 = pVar.f5553a;
            int i10 = pVar.f5554b;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f5565b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            lVarC.d(j10, i10, byteArrayInputStream, byteArrayOutputStream, false);
            this.f5565b = (byte[]) byteArrayOutputStream.toByteArray().clone();
        }
        gf.b.d0(this.f5565b, bVar.f12056d);
        return null;
    }

    public final String getString() {
        byte[] bArr = this.f5565b;
        if (bArr.length >= 2) {
            byte b10 = bArr[0];
            if ((b10 & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, wf.a.f31521b);
            }
            if ((b10 & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, wf.a.f31522c);
            }
        }
        int[] iArr = w.f5566a;
        StringBuilder sb = new StringBuilder();
        for (byte b11 : bArr) {
            int i10 = b11 & 255;
            int[] iArr2 = w.f5566a;
            if (i10 >= 256) {
                sb.append('?');
            } else {
                sb.append((char) iArr2[i10]);
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5565b);
    }

    public final String toString() {
        return "COSString{" + getString() + "}";
    }

    public u(String str) {
        for (char c10 : str.toCharArray()) {
            if (!w.f5567b.containsKey(Character.valueOf(c10))) {
                byte[] bytes = str.getBytes(wf.a.f31521b);
                byte[] bArr = new byte[bytes.length + 2];
                this.f5565b = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        int[] iArr = w.f5566a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c11 : str.toCharArray()) {
            Integer num = (Integer) w.f5567b.get(Character.valueOf(c11));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        this.f5565b = byteArrayOutputStream.toByteArray();
    }
}

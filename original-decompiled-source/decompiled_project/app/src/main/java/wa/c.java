package wa;

import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f31483a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f31483a;
            sb.append(cArr[i11]);
            sb.append(cArr[bArr[i10] & RegisterType.DOUBLE_HI]);
        }
        return sb.toString();
    }
}

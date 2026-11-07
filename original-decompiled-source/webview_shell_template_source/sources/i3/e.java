package i3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13370a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i6 = 0;
        for (byte b7 : bArr) {
            char[] cArr2 = f13370a;
            cArr[i6] = cArr2[(b7 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b7 & 15];
            i6 += 2;
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i6 = 0;
        while (i6 < length) {
            int i7 = i6 + 2;
            bArr[i6 / 2] = (byte) Integer.parseInt(str.substring(i6, i7), 16);
            i6 = i7;
        }
        return bArr;
    }
}

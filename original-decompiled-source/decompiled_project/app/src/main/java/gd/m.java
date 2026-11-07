package gd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import q1.b0;
import q1.e0;
import q6.i;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static e0 f11980a;

    /* renamed from: b, reason: collision with root package name */
    public static b0 f11981b;

    /* renamed from: c, reason: collision with root package name */
    public static s1.a f11982c;

    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 / 16));
            sb.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb.toString();
    }

    public static boolean c(String str) {
        i.a aVar = q6.i.f22068a;
        Set<q6.d> setUnmodifiableSet = Collections.unmodifiableSet(q6.a.f22059c);
        HashSet hashSet = new HashSet();
        for (q6.d dVar : setUnmodifiableSet) {
            if (dVar.b().equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((q6.d) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}

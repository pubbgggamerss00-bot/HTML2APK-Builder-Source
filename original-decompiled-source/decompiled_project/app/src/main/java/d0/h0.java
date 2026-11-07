package d0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7135a = 0;

    public static final int a(int i10, g0 g0Var, Object obj) {
        int iC;
        return (obj == null || g0Var.getItemCount() == 0 || (i10 < g0Var.getItemCount() && obj.equals(g0Var.d(i10))) || (iC = g0Var.c(obj)) == -1) ? i10 : iC;
    }

    public static String b(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            try {
                string = String.valueOf(obj);
            } catch (Exception e10) {
                String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                StringBuilder sbA = e.e.a("<", str2, " threw ");
                sbA.append(e10.getClass().getName());
                sbA.append(">");
                string = sbA.toString();
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String c(int i10, String str) {
        if (i10 <= 1) {
            if (i10 >= 0) {
                return i10 == 0 ? "" : str;
            }
            throw new IllegalArgumentException(b("invalid count: %s", Integer.valueOf(i10)));
        }
        int length = str.length();
        long j10 = length * i10;
        int i11 = (int) j10;
        if (i11 != j10) {
            throw new ArrayIndexOutOfBoundsException(m0.r.a("Required array size too large: ", j10));
        }
        char[] cArr = new char[i11];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i12 = i11 - length;
            if (length >= i12) {
                System.arraycopy(cArr, 0, cArr, length, i12);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }
}

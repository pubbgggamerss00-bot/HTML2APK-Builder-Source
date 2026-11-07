package p3;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m {
    public static String a(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length || (iIndexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, iIndexOf);
            sb.append(b(objArr[i6]));
            i7 = iIndexOf + 2;
            i6++;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i6 < length) {
            String str2 = " [";
            while (i6 < objArr.length) {
                sb.append(str2);
                sb.append(b(objArr[i6]));
                i6++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e6);
            String name2 = e6.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}

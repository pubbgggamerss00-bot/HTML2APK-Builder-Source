package r9;

import android.util.Base64;

/* loaded from: classes.dex */
public abstract class r {
    public abstract String a();

    public abstract byte[] b();

    public abstract o9.c c();

    public final String toString() {
        String strA = a();
        o9.c cVarC = c();
        String strEncodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strA);
        sb.append(", ");
        sb.append(cVarC);
        sb.append(", ");
        return b.o.a(sb, strEncodeToString, ")");
    }
}

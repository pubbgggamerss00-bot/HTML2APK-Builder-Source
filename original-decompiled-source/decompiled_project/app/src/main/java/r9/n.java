package r9;

import java.util.HashMap;
import java.util.Map;
import r9.h;

/* loaded from: classes.dex */
public abstract class n {

    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((h.a) this).f23285f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract m d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final h.a i() {
        h.a aVar = new h.a();
        String strG = g();
        if (strG == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.f23280a = strG;
        aVar.f23281b = c();
        m mVarD = d();
        if (mVarD == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        aVar.f23282c = mVarD;
        aVar.f23283d = Long.valueOf(e());
        aVar.f23284e = Long.valueOf(h());
        aVar.f23285f = new HashMap(b());
        return aVar;
    }
}

package y5;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.r;
import mh.x;
import y5.e;

/* loaded from: classes.dex */
public final class a implements h6.b {

    /* renamed from: a, reason: collision with root package name */
    public final i6.b f33939a;

    public a(i6.b db2) {
        r.e(db2, "db");
        this.f33939a = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33939a.close();
    }

    @Override // h6.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final e B0(String sql) {
        r.e(sql, "sql");
        i6.b db2 = this.f33939a;
        r.e(db2, "db");
        String string = x.W(sql).toString();
        if (string.length() >= 3) {
            String strSubstring = string.substring(0, 3);
            r.d(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            r.d(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                e.a aVar = new e.a(db2, sql);
                aVar.f33951d = new int[0];
                aVar.f33952e = new long[0];
                aVar.f33953f = new double[0];
                aVar.f33954g = new String[0];
                aVar.f33955h = new byte[0][];
                return aVar;
            }
        }
        return new e.b(db2, sql);
    }
}

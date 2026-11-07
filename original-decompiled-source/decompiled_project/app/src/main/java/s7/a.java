package s7;

import hi.d0;
import hi.f0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mh.x;
import qg.k0;
import s7.o;

/* loaded from: classes.dex */
public final class a {
    public static r a(f0 f0Var) throws NumberFormatException, EOFException {
        int i10 = Integer.parseInt(f0Var.F(Long.MAX_VALUE));
        long j10 = Long.parseLong(f0Var.F(Long.MAX_VALUE));
        long j11 = Long.parseLong(f0Var.F(Long.MAX_VALUE));
        o.a aVar = new o.a();
        int i11 = Integer.parseInt(f0Var.F(Long.MAX_VALUE));
        for (int i12 = 0; i12 < i11; i12++) {
            String strF = f0Var.F(Long.MAX_VALUE);
            int iX = x.x(strF, ':', 0, 6);
            if (iX == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strF).toString());
            }
            String strSubstring = strF.substring(0, iX);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            String string = x.W(strSubstring).toString();
            String strSubstring2 = strF.substring(iX + 1);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            aVar.a(string, strSubstring2);
        }
        return new r(i10, j10, j11, new o(k0.j(aVar.f24579a)), 48);
    }

    public static void b(r rVar, d0 d0Var) throws IOException {
        d0Var.l(rVar.f24585a);
        d0Var.writeByte(10);
        d0Var.l(rVar.f24586b);
        d0Var.writeByte(10);
        d0Var.l(rVar.f24587c);
        d0Var.writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = rVar.f24588d.f24578a.entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        d0Var.l(size);
        d0Var.writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            for (String str : entry.getValue()) {
                d0Var.O(entry.getKey());
                d0Var.O(":");
                d0Var.O(str);
                d0Var.writeByte(10);
            }
        }
    }
}

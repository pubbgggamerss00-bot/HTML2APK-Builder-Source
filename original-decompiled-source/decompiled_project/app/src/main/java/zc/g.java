package zc;

import cd.b;
import cd.c;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sc.o;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35009a = new a();

    public static class a implements b.a {
    }

    public static <P> cd.c a(sc.o<P> oVar) throws GeneralSecurityException {
        sc.g gVar;
        ArrayList arrayList = new ArrayList();
        cd.a aVar = cd.a.f5394b;
        cd.a aVar2 = oVar.f24817c;
        Iterator<List<o.b<P>>> it = oVar.f24815a.values().iterator();
        while (it.hasNext()) {
            for (o.b<P> bVar : it.next()) {
                int iOrdinal = bVar.f24825d.ordinal();
                if (iOrdinal == 1) {
                    gVar = sc.g.f24801b;
                } else if (iOrdinal == 2) {
                    gVar = sc.g.f24802c;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    gVar = sc.g.f24803d;
                }
                int i10 = bVar.f24827f;
                String strSubstring = bVar.f24828g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new c.a(gVar, i10, strSubstring, bVar.f24826e.name()));
            }
        }
        o.b<P> bVar2 = oVar.f24816b;
        Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f24827f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((c.a) obj).f5400b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return new cd.c(aVar2, Collections.unmodifiableList(arrayList), numValueOf);
    }
}

package ne;

import android.content.Context;
import sd.a;
import sd.l;
import sd.z;

/* loaded from: classes2.dex */
public final class g {

    public interface a<T> {
        String a(Context context);
    }

    public static sd.a<?> a(String str, String str2) {
        ne.a aVar = new ne.a(str, str2);
        a.C0274a c0274aA = sd.a.a(e.class);
        c0274aA.f24847e = 1;
        c0274aA.f24848f = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h(aVar);
        return c0274aA.b();
    }

    public static sd.a<?> b(final String str, final a<Context> aVar) {
        a.C0274a c0274aA = sd.a.a(e.class);
        c0274aA.f24847e = 1;
        c0274aA.a(l.b(Context.class));
        c0274aA.f24848f = new sd.d() { // from class: ne.f
            @Override // sd.d
            public final Object b(z zVar) {
                return new a(str, aVar.a((Context) zVar.a(Context.class)));
            }
        };
        return c0274aA.b();
    }
}

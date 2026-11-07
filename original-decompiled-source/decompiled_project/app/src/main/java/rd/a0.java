package rd;

import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sa.a f23343a = new sa.a("GetTokenResultFactory", new String[0]);

    public static qd.q a(String str) {
        Map<String, Object> map;
        try {
            map = z.b(str);
        } catch (zzaag e10) {
            f23343a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap<>();
        }
        qd.q qVar = new qd.q();
        qVar.f22691a = str;
        qVar.f22692b = map;
        return qVar;
    }
}

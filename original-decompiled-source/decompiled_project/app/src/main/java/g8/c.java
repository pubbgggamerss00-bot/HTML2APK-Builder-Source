package g8;

import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {
    public static final Object a(Task task, vg.c cVar) {
        ph.m mVar = new ph.m(1, ah.p.c(cVar));
        mVar.p();
        task.addOnCompleteListener(new b(mVar));
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        return objO;
    }

    public static final a b(Throwable th2) {
        if (th2 instanceof a) {
            return (a) th2;
        }
        String str = "ai_unavailable";
        if (!(th2 instanceof ae.n)) {
            return th2 instanceof IOException ? new a("ai_unavailable", th2.getMessage(), th2) : new a("ai_unavailable", th2.getMessage(), th2);
        }
        ae.n nVar = (ae.n) th2;
        Object obj = nVar.f487b;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("code") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            int iOrdinal = nVar.f486a.ordinal();
            if (iOrdinal != 4 && iOrdinal != 14 && iOrdinal == 16) {
                str = "not_signed_in";
            }
        } else {
            str = str2;
        }
        return new a(str, th2.getMessage(), th2);
    }
}

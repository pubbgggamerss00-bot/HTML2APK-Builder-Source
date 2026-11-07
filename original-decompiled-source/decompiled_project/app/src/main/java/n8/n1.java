package n8;

import android.content.Context;
import java.util.List;
import ph.n2;
import tg.h;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kh.i<Object>[] f18551a;

    /* renamed from: b, reason: collision with root package name */
    public static final u4.b f18552b;

    static {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z(n1.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        kotlin.jvm.internal.h0.f16332a.getClass();
        f18551a = new kh.i[]{zVar};
        wh.c cVar = ph.z0.f21632a;
        wh.b bVar = wh.b.f31563c;
        n2 n2VarA = ah.l.a();
        bVar.getClass();
        uh.c cVarA = ph.j0.a(h.a.C0291a.c(bVar, n2VarA));
        u4.a produceMigrations = u4.a.f29249a;
        kotlin.jvm.internal.r.e(produceMigrations, "produceMigrations");
        f18552b = new u4.b(produceMigrations, cVarA);
    }

    public static final v4.c a(Context context) {
        v4.c cVar;
        kotlin.jvm.internal.r.e(context, "<this>");
        u4.b bVar = f18552b;
        kh.i<Object> property = f18551a[0];
        bVar.getClass();
        kotlin.jvm.internal.r.e(property, "property");
        v4.c cVar2 = bVar.f29253d;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (bVar.f29252c) {
            try {
                if (bVar.f29253d == null) {
                    Context applicationContext = context.getApplicationContext();
                    eh.l<Context, List<s4.e<v4.e>>> lVar = bVar.f29250a;
                    kotlin.jvm.internal.r.d(applicationContext, "applicationContext");
                    List<s4.e<v4.e>> migrations = lVar.invoke(applicationContext);
                    ph.i0 i0Var = bVar.f29251b;
                    n2.b bVar2 = new n2.b(1, applicationContext, bVar);
                    kotlin.jvm.internal.r.e(migrations, "migrations");
                    bVar.f29253d = new v4.c(new v4.c(new s4.m(new s4.n0(new v4.d(bVar2)), c0.g0.c(new s4.f(migrations, null)), new t4.a(), i0Var)));
                }
                cVar = bVar.f29253d;
                kotlin.jvm.internal.r.b(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}

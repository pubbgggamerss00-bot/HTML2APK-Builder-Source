package s2;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import com.google.android.gms.internal.ads.ni0;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d implements Runnable {
    public final j2.c s = new j2.c();

    public static void a(j2.k kVar, String str) throws SQLException {
        WorkDatabase workDatabase = kVar.f13476c;
        r2.m mVarN = workDatabase.n();
        ni0 ni0VarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            r2.s sVar = (r2.s) mVarN;
            androidx.work.p pVarF = sVar.f(str2);
            if (pVarF != androidx.work.p.f1844u && pVarF != androidx.work.p.f1845v) {
                sVar.p(androidx.work.p.f1847x, str2);
            }
            linkedList.addAll(ni0VarI.e(str2));
        }
        j2.d dVar = kVar.f13479f;
        synchronized (dVar.C) {
            try {
                androidx.work.k.c().a(j2.d.D, "Processor cancelling " + str, new Throwable[0]);
                dVar.A.add(str);
                j2.m mVar = (j2.m) dVar.f13455x.remove(str);
                boolean z6 = mVar != null;
                if (mVar == null) {
                    mVar = (j2.m) dVar.f13456y.remove(str);
                }
                j2.d.b(str, mVar);
                if (z6) {
                    dVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<j2.e> it = kVar.f13478e.iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        j2.c cVar = this.s;
        try {
            b();
            cVar.a(androidx.work.n.f1838a);
        } catch (Throwable th) {
            cVar.a(new n.a.C0022a(th));
        }
    }
}

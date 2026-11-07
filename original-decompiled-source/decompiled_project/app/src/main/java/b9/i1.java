package b9;

import androidx.work.impl.WorkDatabase;
import com.basitce.htmltoapk.ui.crop.CropActivity;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3881b;

    public /* synthetic */ i1(Object obj, int i10) {
        this.f3880a = i10;
        this.f3881b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        boolean z10;
        int i10 = this.f3880a;
        Object obj = this.f3881b;
        switch (i10) {
            case 0:
                ((x0.n1) obj).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            case 1:
                ((CropActivity) obj).finish();
                return pg.f0.f21461a;
            default:
                u6.d0 d0Var = (u6.d0) obj;
                String str = d7.d.f7386a;
                u6.t0 t0Var = d0Var.f29275a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(d0Var.f29278d);
                HashSet hashSetA = u6.d0.a(d0Var);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(d0Var.f29278d);
                        z10 = false;
                    } else if (hashSetA.contains((String) it.next())) {
                        z10 = true;
                    }
                }
                if (z10) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + d0Var + ")");
                }
                WorkDatabase workDatabase = t0Var.f29338c;
                androidx.work.a aVar = t0Var.f29337b;
                workDatabase.beginTransaction();
                try {
                    d7.e.a(workDatabase, aVar, d0Var);
                    boolean zA = d7.d.a(d0Var);
                    workDatabase.setTransactionSuccessful();
                    if (zA) {
                        u6.w.b(aVar, t0Var.f29338c, t0Var.f29340e);
                    }
                    return pg.f0.f21461a;
                } finally {
                    workDatabase.endTransaction();
                }
        }
    }
}

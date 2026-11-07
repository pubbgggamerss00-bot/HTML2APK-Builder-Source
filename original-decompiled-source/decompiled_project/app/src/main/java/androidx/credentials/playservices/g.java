package androidx.credentials.playservices;

import android.content.Context;
import com.basitce.htmltoapk.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1718d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f1715a = i10;
        this.f1716b = obj;
        this.f1717c = obj2;
        this.f1718d = obj3;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1715a;
        Object obj = this.f1718d;
        Object obj2 = this.f1717c;
        Object obj3 = this.f1716b;
        switch (i10) {
            case 0:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) obj3, (Executor) obj2, (d4.t) obj);
            default:
                Context context = (Context) obj3;
                n1 n1Var = (n1) obj2;
                n1 n1Var2 = (n1) obj;
                Iterator it = ((List) n1Var.getValue()).iterator();
                while (it.hasNext()) {
                    try {
                        ((File) it.next()).delete();
                    } catch (Exception unused) {
                    }
                }
                n1Var.setValue(qg.z.f22752a);
                org.bouncycastle.crypto.engines.a.b(context, R.string.output_deleted_success, context, 0);
                n1Var2.setValue(Boolean.FALSE);
                return f0.f21461a;
        }
    }
}

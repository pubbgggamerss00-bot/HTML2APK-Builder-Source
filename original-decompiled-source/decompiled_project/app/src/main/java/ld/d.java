package ld;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import r1.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Continuation, r1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16983a;

    public /* synthetic */ d(Object obj) {
        this.f16983a = obj;
    }

    @Override // r1.n
    public double b(double d10) {
        return jh.j.k(((z) this.f16983a).f23133k.b(d10), r0.f23127e, r0.f23128f);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        i iVar = (i) this.f16983a;
        if (iVar.e()) {
            return Tasks.forResult(iVar.f17000m);
        }
        if (iVar.f16999l == null) {
            return Tasks.forException(new id.j("No AppCheckProvider installed."));
        }
        Task<kd.b> task2 = iVar.f17001n;
        if (task2 == null || task2.isComplete() || iVar.f17001n.isCanceled()) {
            iVar.f17001n = iVar.f16999l.a().onSuccessTask(iVar.f16994g, new h(iVar));
        }
        return iVar.f17001n;
    }
}

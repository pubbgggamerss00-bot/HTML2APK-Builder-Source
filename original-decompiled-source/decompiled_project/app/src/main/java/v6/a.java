package v6;

import androidx.work.impl.model.WorkSpec;
import t6.s;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WorkSpec f30621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f30622b;

    public a(b bVar, WorkSpec workSpec) {
        this.f30622b = bVar;
        this.f30621a = workSpec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVarD = s.d();
        String str = b.f30623e;
        StringBuilder sb = new StringBuilder("Scheduling work ");
        WorkSpec workSpec = this.f30621a;
        sb.append(workSpec.f3167a);
        sVarD.a(str, sb.toString());
        this.f30622b.f30624a.c(workSpec);
    }
}

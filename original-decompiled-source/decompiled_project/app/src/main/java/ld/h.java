package ld;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import kd.d;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16987a;

    public /* synthetic */ h(i iVar) {
        this.f16987a = iVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        i iVar = this.f16987a;
        kd.b bVar = (kd.b) obj;
        iVar.f16996i.execute(new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.r(1, iVar, bVar));
        iVar.f17000m = bVar;
        r rVar = iVar.f16993f;
        rVar.getClass();
        b bVarC = bVar instanceof b ? (b) bVar : b.c(bVar.b());
        rVar.f17027e = bVarC.f16979b + ((long) (bVarC.f16980c * 0.5d)) + 300000;
        if (rVar.f17027e > bVarC.a()) {
            rVar.f17027e = bVarC.a() - 60000;
        }
        if (rVar.a()) {
            l lVar = rVar.f17023a;
            long j10 = rVar.f17027e;
            rVar.f17024b.getClass();
            lVar.b(j10 - System.currentTimeMillis());
        }
        ArrayList arrayList = iVar.f16991d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ((d.a) obj2).a();
        }
        c cVarC = c.c(bVar);
        ArrayList arrayList2 = iVar.f16990c;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ((nd.a) obj3).a(cVarC);
        }
        return Tasks.forResult(bVar);
    }
}

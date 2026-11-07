package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import java.util.ArrayList;
import java.util.List;
import l7.k;
import qg.t;
import qg.z;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1480b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f1479a = i10;
        this.f1480b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1479a) {
            case 0:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0((CredentialProviderBeginSignInController) this.f1480b);
            default:
                g7.f fVar = (g7.f) this.f1480b;
                List<? extends eh.a<? extends List<? extends pg.n<? extends k.a<? extends Object>, ? extends kh.c<? extends Object>>>>> list = fVar.f11490d;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t.p(list.get(i10).invoke(), arrayList);
                }
                fVar.f11490d = z.f22752a;
                return arrayList;
        }
    }
}

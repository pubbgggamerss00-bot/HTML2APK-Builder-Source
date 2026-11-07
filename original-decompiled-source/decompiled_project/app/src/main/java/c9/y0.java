package c9;

import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5328d;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i10) {
        this.f5325a = i10;
        this.f5326b = obj;
        this.f5327c = obj2;
        this.f5328d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f5325a) {
            case 0:
                eh.l lVar = (eh.l) this.f5326b;
                s1 s1Var = (s1) this.f5327c;
                List list = (List) this.f5328d;
                Long l10 = (Long) s1Var.f5278j.getValue();
                lVar.invoke(Long.valueOf(l10 != null ? l10.longValue() : ((b) qg.x.B(list)).f5057a));
                return pg.f0.f21461a;
            default:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$0((Executor) this.f5326b, (d4.t) this.f5327c, (d4.c) this.f5328d);
        }
    }
}

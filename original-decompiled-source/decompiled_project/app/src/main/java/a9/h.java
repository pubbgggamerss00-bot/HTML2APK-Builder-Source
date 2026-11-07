package a9;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f218d;

    public /* synthetic */ h(Object obj, Object obj2, Serializable serializable, int i10) {
        this.f215a = i10;
        this.f216b = obj;
        this.f217c = obj2;
        this.f218d = serializable;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f215a) {
            case 0:
                Context context = (Context) this.f216b;
                v vVar = (v) this.f217c;
                String productId = (String) this.f218d;
                Activity activityB = k9.j.b(context);
                if (activityB != null) {
                    vVar.getClass();
                    kotlin.jvm.internal.r.e(productId, "productId");
                    j8.a aVar = vVar.f332b;
                    aVar.getClass();
                    aVar.f15262a.e(activityB, productId, aVar.f15263b.j());
                }
                return pg.f0.f21461a;
            default:
                return CreateDigitalCredentialController.invokePlayServices$lambda$2$0((Executor) this.f216b, (d4.t) this.f217c, (Exception) this.f218d);
        }
    }
}

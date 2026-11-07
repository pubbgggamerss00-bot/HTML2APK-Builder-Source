package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import kotlin.jvm.internal.g0;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1455c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f1453a = i10;
        this.f1454b = obj;
        this.f1455c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1453a) {
            case 0:
                return CredentialProviderBeginSignInController.handleResponse$lambda$3((CredentialProviderBeginSignInController) this.f1454b, (g0) this.f1455c);
            default:
                ((eh.l) this.f1454b).invoke(Long.valueOf(((FolderEntity) this.f1455c).getId()));
                return f0.f21461a;
        }
    }
}

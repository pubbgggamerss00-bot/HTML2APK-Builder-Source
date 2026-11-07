package j4;

import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.g0;
import pg.f0;
import x0.n1;
import x8.g5;
import x8.j6;
import x8.u6;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15140c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f15138a = i10;
        this.f15139b = obj;
        this.f15140c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f15138a;
        Object obj = this.f15140c;
        Object obj2 = this.f15139b;
        switch (i10) {
            case 0:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeCreate$lambda$0((eh.l) obj2, (g0) obj);
            default:
                j6 j6Var = (j6) obj2;
                boolean z10 = g5.f32665a;
                ((n1) obj).setValue(Boolean.TRUE);
                ph.h.c(x0.a(j6Var), null, null, new u6(j6Var, null), 3);
                return f0.f21461a;
        }
    }
}

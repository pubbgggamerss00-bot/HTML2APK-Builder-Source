package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import android.content.Context;
import android.view.Window;
import e9.p0;
import f9.fg;
import kotlin.jvm.internal.r;
import kotlinx.serialization.SealedClassSerializer;
import pg.f0;
import sh.z0;
import x0.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1638b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f1637a = i10;
        this.f1638b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f1637a) {
            case 0:
                return CreatePasswordCredentialController.handleResponse$lambda$1((CreatePasswordCredentialController) this.f1638b, (e4.g) obj);
            case 1:
                Context context = (Context) this.f1638b;
                l0 DisposableEffect = (l0) obj;
                r.e(DisposableEffect, "$this$DisposableEffect");
                b.k kVar = context instanceof b.k ? (b.k) context : null;
                Window window = kVar != null ? kVar.getWindow() : null;
                if (window != null) {
                    window.addFlags(128);
                }
                return new p0(window);
            case 2:
                fg fgVar = (fg) this.f1638b;
                String it = (String) obj;
                r.e(it, "it");
                z0 z0Var = fgVar.N0;
                z0Var.getClass();
                z0Var.j(null, it);
                return f0.f21461a;
            default:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2$lambda$1((SealedClassSerializer) this.f1638b, (bi.a) obj);
        }
    }
}

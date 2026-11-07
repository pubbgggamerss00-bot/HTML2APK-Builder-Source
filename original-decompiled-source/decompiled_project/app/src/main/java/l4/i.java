package l4;

import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import d4.t;
import m9.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16724c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f16722a = i10;
        this.f16723b = obj;
        this.f16724c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16722a) {
            case 0:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1$0((t) this.f16723b, (Exception) this.f16724c);
                break;
            default:
                s1 s1Var = (s1) this.f16723b;
                LinearLayout linearLayout = (LinearLayout) this.f16724c;
                if (!s1Var.f17909m) {
                    linearLayout.setVisibility(4);
                    break;
                }
                break;
        }
    }
}

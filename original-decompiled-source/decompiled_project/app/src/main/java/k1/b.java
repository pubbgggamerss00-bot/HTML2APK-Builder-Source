package k1;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15914a;

    /* renamed from: b, reason: collision with root package name */
    public final l f15915b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f15916c;

    /* renamed from: d, reason: collision with root package name */
    public final AutofillId f15917d;

    public b(AndroidComposeView androidComposeView, l lVar) {
        this.f15914a = androidComposeView;
        this.f15915b = lVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f15916c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw a.a("Required value was null.");
        }
        this.f15917d = autofillId;
    }
}

package pa;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public class k extends c5.g {

    /* renamed from: k0, reason: collision with root package name */
    public Dialog f21399k0;

    /* renamed from: l0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21400l0;

    /* renamed from: m0, reason: collision with root package name */
    public AlertDialog f21401m0;

    @Override // c5.g
    public final Dialog C() {
        Dialog dialog = this.f21399k0;
        if (dialog != null) {
            return dialog;
        }
        this.f4845b0 = false;
        if (this.f21401m0 == null) {
            c5.t<?> tVar = this.f4890v;
            c5.n nVar = tVar == null ? null : tVar.f4980b;
            com.google.android.gms.common.internal.p.f(nVar);
            this.f21401m0 = new AlertDialog.Builder(nVar).create();
        }
        return this.f21401m0;
    }

    @Override // c5.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21400l0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

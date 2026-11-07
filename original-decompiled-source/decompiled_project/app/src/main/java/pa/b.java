package pa;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f21380a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21381b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f21382c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21381b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21380a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f21382c == null) {
            Activity activity = getActivity();
            com.google.android.gms.common.internal.p.f(activity);
            this.f21382c = new AlertDialog.Builder(activity).create();
        }
        return this.f21382c;
    }
}

package c3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c extends DialogFragment {
    public Dialog s;

    /* renamed from: t, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2173t;

    /* renamed from: u, reason: collision with root package name */
    public AlertDialog f2174u;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2173t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.s;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2174u == null) {
            Activity activity = getActivity();
            com.google.android.gms.common.internal.l.f(activity);
            this.f2174u = new AlertDialog.Builder(activity).create();
        }
        return this.f2174u;
    }
}

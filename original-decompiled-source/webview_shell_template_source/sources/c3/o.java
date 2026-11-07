package c3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o extends androidx.fragment.app.j {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // androidx.fragment.app.j
    public final Dialog D() {
        Dialog dialog = this.B0;
        if (dialog != null) {
            return dialog;
        }
        this.f1150s0 = false;
        if (this.D0 == null) {
            Context contextD = d();
            com.google.android.gms.common.internal.l.f(contextD);
            this.D0 = new AlertDialog.Builder(contextD).create();
        }
        return this.D0;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

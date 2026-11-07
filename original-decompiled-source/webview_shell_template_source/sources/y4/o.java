package y4;

import android.view.View;
import android.widget.AdapterView;
import l.m0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ p s;

    public o(p pVar) {
        this.s = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
        p pVar = this.s;
        m0 m0Var = pVar.f15303w;
        pVar.setText(pVar.convertSelectionToString(i6 < 0 ? !m0Var.R.isShowing() ? null : m0Var.f13699u.getSelectedItem() : pVar.getAdapter().getItem(i6)), false);
        AdapterView.OnItemClickListener onItemClickListener = pVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i6 < 0) {
                view = !m0Var.R.isShowing() ? null : m0Var.f13699u.getSelectedView();
                i6 = !m0Var.R.isShowing() ? -1 : m0Var.f13699u.getSelectedItemPosition();
                j6 = !m0Var.R.isShowing() ? Long.MIN_VALUE : m0Var.f13699u.getSelectedItemId();
            }
            onItemClickListener.onItemClick(m0Var.f13699u, view, i6, j6);
        }
        m0Var.dismiss();
    }
}

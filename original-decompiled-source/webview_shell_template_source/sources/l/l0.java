package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ m0 s;

    public l0(m0 m0Var) {
        this.s = m0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j6) {
        i0 i0Var;
        if (i6 == -1 || (i0Var = this.s.f13699u) == null) {
            return;
        }
        i0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

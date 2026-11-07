package m;

import android.view.View;
import android.widget.AdapterView;
import m.a0;

/* loaded from: classes.dex */
public final class x implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f17215a;

    public x(y yVar) {
        this.f17215a = yVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        a0.c cVar;
        if (i10 == -1 || (cVar = this.f17215a.f17219c) == null) {
            return;
        }
        cVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

package s0;

import android.content.Context;
import android.view.ViewGroup;
import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f24119a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24120b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24121c;

    /* renamed from: d, reason: collision with root package name */
    public final l f24122d;

    /* renamed from: e, reason: collision with root package name */
    public int f24123e;

    public j(Context context) {
        super(context);
        this.f24119a = 5;
        ArrayList arrayList = new ArrayList();
        this.f24120b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f24121c = arrayList2;
        this.f24122d = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f24123e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final n a(k kVar) {
        l lVar = this.f24122d;
        LinkedHashMap linkedHashMap = lVar.f24124a;
        LinkedHashMap linkedHashMap2 = lVar.f24124a;
        LinkedHashMap linkedHashMap3 = lVar.f24125b;
        n nVar = (n) linkedHashMap.get(kVar);
        if (nVar != null) {
            return nVar;
        }
        ArrayList arrayList = this.f24121c;
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        n nVar2 = (n) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (nVar2 == null) {
            int i10 = this.f24123e;
            ArrayList arrayList2 = this.f24120b;
            if (i10 > qg.p.i(arrayList2)) {
                nVar2 = new n(getContext());
                addView(nVar2);
                arrayList2.add(nVar2);
            } else {
                nVar2 = (n) arrayList2.get(this.f24123e);
                k kVar2 = (k) linkedHashMap3.get(nVar2);
                if (kVar2 != null) {
                    kVar2.u0();
                    n nVar3 = (n) linkedHashMap2.get(kVar2);
                    if (nVar3 != null) {
                    }
                    linkedHashMap2.remove(kVar2);
                    nVar2.c();
                }
            }
            int i11 = this.f24123e;
            if (i11 < this.f24119a - 1) {
                this.f24123e = i11 + 1;
            } else {
                this.f24123e = 0;
            }
        }
        linkedHashMap2.put(kVar, nVar2);
        linkedHashMap3.put(nVar2, kVar);
        return nVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
